




            <hr style="border:1; height:1px" />
            <div class="container">
                <label class="control-label">Select persons who attended the meeting<span class="required-indicator">*</span></label>
                <g:each var="member" in="${invitedPeople}" status="i">
                    <div class="row">
                        <div class="col-lg-10">
                            <div class="">
                                <div class="input-group">
                                    <span class="input-group-addon">
                                        <input type="checkbox" name="checkbox_person_${i}" value="${member?.id}"/>
                                    </span>
                                    <input type="text" class="form-control" value="${member}"/>
                                </div>
                            </div>
                        </div>
                    </div>
                    <p>
                    <p>
                </g:each>
            </div>