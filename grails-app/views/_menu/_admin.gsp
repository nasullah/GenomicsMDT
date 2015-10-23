<sec:ifAnyGranted roles="ROLE_ADMIN">

	<li class="dropdown">
		<a class="dropdown-toggle" data-toggle="dropdown" href="#" style="color: white">
			<i class="glyphicon glyphicon-cog white"></i>
			Administration <b class="caret"></b>
		</a>

		<ul class="dropdown-menu" style="height: auto; max-height: 350px; overflow-x: hidden;">
			<li class="">
				<a tabindex="-1" href="#">
					<b>User Access Management</b></a>
			</li>

			<p>

			<li class="">
				<a href="${createLink(uri: '/role/create')}">
					<i class="glyphicon glyphicon-plus-sign"></i>
					Add Role
				</a>
			</li>

			<li class="">
				<a href="${createLink(uri: '/role')}">
					<i class="glyphicon glyphicon-search"></i>
					Search Role
				</a>
			</li>

			<li class="">
				<a href="${createLink(uri: '/user/create')}">
					<i class="glyphicon glyphicon-plus-sign"></i>
					Add User
				</a>
			</li>

			<li class="">
				<a href="${createLink(uri: '/user')}">
					<i class="glyphicon glyphicon-search"></i>
					Search User
				</a>
			</li>

			<hr />

			<li class="">
				<a tabindex="-1" href="#">
					<b>Dropdown Lists Management</b></a>
			</li>

			<p>

			<li class="">
				<a href="${createLink(uri: '/applicationStatus')}">
					<i class="glyphicon glyphicon-plus-sign"></i>
					Application Status
				</a>
			</li>

			<li class="">
				<a href="${createLink(uri: '/attendenceStatus')}">
					<i class="glyphicon glyphicon-plus-sign"></i>
					Attendence Status
				</a>
			</li>

			<li class="">
				<a href="${createLink(uri: '/caseStatus')}">
					<i class="glyphicon glyphicon-plus-sign"></i>
					Case Status
				</a>
			</li>

			<li class="">
				<a href="${createLink(uri: '/correspondenceType')}">
					<i class="glyphicon glyphicon-plus-sign"></i>
					Correspondence Type
				</a>
			</li>

			<li class="">
				<a href="${createLink(uri: '/discussionStatus')}">
					<i class="glyphicon glyphicon-plus-sign"></i>
					Discussion Status
				</a>
			</li>

			<li class="">
				<a href="${createLink(uri: '/ethnicity')}">
					<i class="glyphicon glyphicon-plus-sign"></i>
					Ethnicity
				</a>
			</li>

			<li class="">
				<a href="${createLink(uri: '/gender')}">
					<i class="glyphicon glyphicon-plus-sign"></i>
					Gender
				</a>
			</li>

			<li class="">
				<a href="${createLink(uri: '/meetingStatus')}">
					<i class="glyphicon glyphicon-plus-sign"></i>
					Meeting Status
				</a>
			</li>

			<li class="">
				<a href="${createLink(uri: '/membershipStatus')}">
					<i class="glyphicon glyphicon-plus-sign"></i>
					Membership Status
				</a>
			</li>

			<li class="">
				<a href="${createLink(uri: '/OMIM_Term')}">
					<i class="glyphicon glyphicon-plus-sign"></i>
					OMIM Term
				</a>
			</li>

			<li class="">
				<a href="${createLink(uri: '/outcomeStatus')}">
					<i class="glyphicon glyphicon-plus-sign"></i>
					Outcome Status
				</a>
			</li>

			<li class="">
				<a href="${createLink(uri: '/roleType')}">
					<i class="glyphicon glyphicon-plus-sign"></i>
					Role Type
				</a>
			</li>

			<li class="">
				<a href="${createLink(uri: '/timeInterval')}">
					<i class="glyphicon glyphicon-plus-sign"></i>
					Time Interval
				</a>
			</li>

			<li class="">
				<a href="${createLink(uri: '/yesNoUnknown')}">
					<i class="glyphicon glyphicon-plus-sign"></i>
					Yes No Unknown
				</a>
			</li>

		</ul>

	</li>

</sec:ifAnyGranted>
