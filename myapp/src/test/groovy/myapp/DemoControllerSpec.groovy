package myapp

import grails.test.mixin.TestFor
import mail.sender.MailSystem
import org.springframework.mail.SimpleMailMessage
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(DemoController)
class DemoControllerSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        def mock = Mock(MailSystem)
        controller.mailSystem = mock

        when: "sentMail is called"
        controller.index()

        then:" A mail is sent"
        1 * mock.mainSend(new SimpleMailMessage(to:"Binay",from: "Raj"))
    }
}
