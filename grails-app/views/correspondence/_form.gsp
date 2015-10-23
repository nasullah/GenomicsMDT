<%@ page import="genomicsmdt.Correspondence" %>



			<div class="row">
				<div class="col-lg-6">
					<div class="${hasErrors(bean: correspondenceInstance, field: 'applicationForSequencing', 'error')} required">
						<label for="applicationForSequencing" class="control-label"><g:message code="correspondence.applicationForSequencing.label" default="Application For Sequencing" /><span class="required-indicator">*</span></label>
						<div>
							<g:select class="form-control" id="applicationForSequencing" name="applicationForSequencing.id" from="${genomicsmdt.ApplicationForSequencing.list()}" optionKey="id" required="" value="${correspondenceInstance?.applicationForSequencing?.id}"/>
							<span class="help-inline">${hasErrors(bean: correspondenceInstance, field: 'applicationForSequencing', 'error')}</span>
						</div>
					</div>
				</div>
			</div>

			<div class="row">
				<div class="col-lg-6">
					<div class="${hasErrors(bean: correspondenceInstance, field: 'date', 'error')} required">
						<label for="date" class="control-label"><g:message code="correspondence.date.label" default="Date" /><span class="required-indicator">*</span></label>
						<div>
							<bs:datePicker name="date" precision="day"  value="${correspondenceInstance?.date}"  />
							<span class="help-inline">${hasErrors(bean: correspondenceInstance, field: 'date', 'error')}</span>
						</div>
					</div>
				</div>

				<div class="col-lg-6">
					<div class="${hasErrors(bean: correspondenceInstance, field: 'type', 'error')} required">
						<label for="type" class="control-label"><g:message code="correspondence.type.label" default="Type" /><span class="required-indicator">*</span></label>
						<div>
							<g:select class="form-control" id="type" name="type.id" from="${genomicsmdt.CorrespondenceType.list()}" optionKey="id" required="" value="${correspondenceInstance?.type?.id}"/>
							<span class="help-inline">${hasErrors(bean: correspondenceInstance, field: 'type', 'error')}</span>
						</div>
					</div>
				</div>

				<div class="col-lg-6">
					<div class="${hasErrors(bean: correspondenceInstance, field: 'document', 'error')} ">
						<label for="document" class="control-label"><g:message code="correspondence.document.label" default="Document" /></label>
						<div>
							<input id="inputField" type="file" name="document" />
							<span class="help-inline">${hasErrors(bean: correspondenceInstance, field: 'document', 'error')}</span>
						</div>
					</div>
				</div>
			</div>

