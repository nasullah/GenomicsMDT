package genomicsmdt

import groovy.json.JsonBuilder
import groovy.json.JsonSlurper

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

/**
 * AttachedEvidenceController
 * A controller class handles incoming web requests and performs actions such as redirects, rendering views and so on.
 */
@Transactional(readOnly = true)
class AttachedEvidenceController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond AttachedEvidence.list(params), model: [attachedEvidenceInstanceCount: AttachedEvidence.count()]
    }

    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond AttachedEvidence.list(params), model: [attachedEvidenceInstanceCount: AttachedEvidence.count()]
    }

    def show(AttachedEvidence attachedEvidenceInstance) {
        def slurper = new JsonSlurper()
        def result = slurper.parseText(attachedEvidenceInstance.content)
        respond attachedEvidenceInstance, model: [result: result]
    }

    def create() {
        respond new AttachedEvidence(params)
    }

    @Transactional
    def save() {
        def referralRecord = params.referralRecord
        def content = params.jsonContent
        if (referralRecord && content){
            def attachedEvidenceInstance = new AttachedEvidence(referralRecord: referralRecord, content: content)
            attachedEvidenceInstance.save flush: true
        }
    }

    def edit(AttachedEvidence attachedEvidenceInstance) {
        def slurper = new JsonSlurper()
        def result = slurper.parseText(attachedEvidenceInstance.content)
        respond attachedEvidenceInstance, model: [result: result]
    }

    @Transactional
    def update(AttachedEvidence attachedEvidenceInstance) {

        if (attachedEvidenceInstance == null) {
            notFound()
            return
        }

        if (attachedEvidenceInstance.hasErrors()) {
            respond attachedEvidenceInstance.errors, view: 'edit'
            return
        }

        def builder = new JsonBuilder()
        builder {
            familyHistory {
                addedOn params.addedOn
                anonymised params.anonymised
                // Named arguments are valid values for objects too
                anonymised(
                        key: '',
                        value: params.anonymised,
                )
                notes params.notes
                consanguinity (
                        key: '',
                        value: params.consanguinity,
                )
                consanguinityDetails params.consanguinityDetails
                historyDetails params.historyDetails
                ethnicityNotes params.ethnicityNotes
            }
            historyItem {
                relation(
                        key: '',
                        value: params.historyItemRelation
                )
                condition(
                        key: '',
                        value: params.condition
                )
                persent(
                        key: '',
                        value: params.persent
                )

            }
            pedigree {
                pedigree params.pedigree
                pedigreeType params.pedigreeType

            }
            familialEthnicity {
                relation(
                        key: '',
                        value: params.familialEthnicityRelation
                )
                ethnicity(
                        key: '',
                        value: params.ethnicity
                )
                otherEthnicity params.otherEthnicity
            }
        }
        attachedEvidenceInstance.content = builder.toString()
        attachedEvidenceInstance.save flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'AttachedEvidence.label', default: 'AttachedEvidence'), attachedEvidenceInstance.id])
                redirect attachedEvidenceInstance
            }
            '*' { respond attachedEvidenceInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(AttachedEvidence attachedEvidenceInstance) {

        if (attachedEvidenceInstance == null) {
            notFound()
            return
        }

        attachedEvidenceInstance.delete flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'AttachedEvidence.label', default: 'AttachedEvidence'), attachedEvidenceInstance.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'attachedEvidenceInstance.label', default: 'AttachedEvidence'), params.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NOT_FOUND }
        }
    }
}
