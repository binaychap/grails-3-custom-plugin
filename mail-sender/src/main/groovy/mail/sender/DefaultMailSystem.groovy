package mail.sender

import grails.events.Events
import org.springframework.mail.MailMessage

/**
 * Created by binayrai on 7/15/16.
 */
class DefaultMailSystem implements MailSystem, Events{
    @Override
    void mainSend(MailMessage message) {
        println("Mail Sending....... $message")
        notify(SEND_EVENT,eventFor(message))
    }
}
