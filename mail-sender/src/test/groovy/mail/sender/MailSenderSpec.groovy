package mail.sender

import org.springframework.mail.SimpleMailMessage
import spock.lang.Specification

/**
 * Created by binayrai on 7/15/16.
 */
class MailSenderSpec extends Specification {

    void "Test that we can send mail" (){
        given: "a test mailer"
        def test = new TestMailer()
        def mock = Mock(MailSystem)
        test.mailSystem = mock

        when: "sentMail is called"
        test.sendMail(to: "Binay",from: "Raj")

        then:" A mail is sent"
        1 * mock.mainSend(new SimpleMailMessage(to:"Binay",from: "Raj"))



    }

}


class TestMailer implements MailSender{

}
