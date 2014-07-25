
import com.ryanberg.angrails.model.Book
import com.ryanberg.angrails.security.model.SecRole
import com.ryanberg.angrails.security.model.SecUser
import com.ryanberg.angrails.security.model.SecUserSecRole

class BootStrap {

    def init = { servletContext ->

        new Book(title: "Ryan's Cool Book").save()
        new Book(title: "The Stand").save()
        new Book(title: "The Shining").save()

        def adminRole = new SecRole(authority: 'ROLE_ADMIN').save(flush: true)
        def userRole = new SecRole(authority: 'ROLE_USER').save(flush: true)

        def testUser = new SecUser(username: 'admin', password: 'password')
        testUser.save(flush: true)

        SecUserSecRole.create testUser, adminRole, true

        assert SecUser.count() == 1
        assert SecRole.count() == 2
        assert SecUserSecRole.count() == 1

    }
    def destroy = {
    }
}
