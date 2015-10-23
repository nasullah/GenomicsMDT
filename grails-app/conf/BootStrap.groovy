import genomicsmdt.Role
import genomicsmdt.User
import genomicsmdt.UserRole
import org.springframework.jca.cci.CciOperationNotSupportedException
import org.springframework.web.context.support.WebApplicationContextUtils

class BootStrap {

    def init = { servletContext ->

        environments {
            test {
                createRoles()
                createAdminUser("admin", "password", "support@example.com")
            }
            development {
                createRoles()
                createAdminUser("admin", "password", "support@example.com")
            }

            production {
                createRoles()
                createAdminUser("admin", "password", "support@example.com")
            }
        }
    }

    def destroy = {
    }
    def createRoles(){
        Role.findByAuthority('ROLE_ADMIN') ?: new Role(authority: 'ROLE_ADMIN').save(failOnError: true)
        Role.findByAuthority('ROLE_USER') ?: new Role(authority: 'ROLE_USER').save(failOnError: true)
    }

    def createAdminUser(String username, String password, String email){
        if(!User.findByUsername(username) ){
            def user = new User(username: username, enabled: true, emailAddress: email, password: password).save(failOnError: true)
            UserRole.create user, Role.findByAuthority('ROLE_ADMIN')
        }
    }
}
