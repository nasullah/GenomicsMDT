




            <hr style="border:1; height:1px" />
            <div class="container">
                <label class="control-label">Select patients who were discussed in the meeting<span class="required-indicator">*</span></label>
                <g:each var="referralRecord" in="${agendaItems}" status="i">
                    <div class="row">
                        <div class="col-lg-10">
                            <div class="">
                                <div class="input-group">
                                    <span class="input-group-addon">
                                        <input type="checkbox" name="checkbox_referralRecord_${i}" value="${referralRecord?.id}"/>
                                    </span>
                                    <input type="text" class="form-control" value="${referralRecord}"/>
                                </div>
                            </div>
                        </div>
                    </div>
                    <p>
                    <p>
                </g:each>
            </div>