<%@ page import="genomicsmdt.AttendenceCapacity" %>




			<div class="row">
				<div class="col-lg-6">
					<div class="${hasErrors(bean: attendenceCapacityInstance, field: 'attendenceRecord', 'error')} required">
						<label for="attendenceRecord" class="control-label"><g:message code="attendenceCapacity.attendenceRecord.label" default="Attendence Record" /><span class="required-indicator">*</span></label>
						<div>
							<g:select class="form-control" id="attendenceRecord" name="attendenceRecord.id" from="${genomicsmdt.AttendenceRecord.list()}" optionKey="id" required="" value="${attendenceCapacityInstance?.attendenceRecord?.id}"/>
							<span class="help-inline">${hasErrors(bean: attendenceCapacityInstance, field: 'attendenceRecord', 'error')}</span>
						</div>
					</div>
				</div>
			</div>

			<div class="row">
			<div class="col-lg-6">
					<div class="${hasErrors(bean: attendenceCapacityInstance, field: 'attendenceCapacity', 'error')} required">
						<label for="attendenceCapacity" class="control-label"><g:message code="attendenceCapacity.attendenceCapacity.label" default="Attendence Capacity" /><span class="required-indicator">*</span></label>
						<div>
							<g:select class="form-control" id="attendenceCapacity" name="attendenceCapacity.id" from="${genomicsmdt.RoleType.list()}" optionKey="id" required="" value="${attendenceCapacityInstance?.attendenceCapacity?.id}" noSelection="['':'- Choose -']" />
							<span class="help-inline">${hasErrors(bean: attendenceCapacityInstance, field: 'attendenceCapacity', 'error')}</span>
						</div>
					</div>
				</div>
			</div>


