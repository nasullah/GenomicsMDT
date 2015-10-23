<sec:ifAnyGranted roles="ROLE_ADMIN, ROLE_USER">
	<ul class="nav nav-tabs">

		<li>
			<g:link controller="person" action="index">Person</g:link>
		</li>

		<li>
			<g:link controller="MDT" action="index">MDT</g:link>
		</li>

		<li>
			<g:link controller="patient" action="index">Patient</g:link>
		</li>

		<li>
			<g:link controller="meeting" action="index">Meeting</g:link>
		</li>

	</ul>
</sec:ifAnyGranted>