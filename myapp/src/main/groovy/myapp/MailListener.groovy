package myapp

import grails.events.Events
import mail.sender.MailSystem
import org.springframework.mail.MailMessage
import reactor.bus.Event

import javax.annotation.PostConstruct

/**
 * Created by binayrai on 7/15/16.
 */
class MailListener implements Events{
    @PostConstruct
    void  init(){
        on(MailSystem.SEND_EVENT){
            Event<MailMessage> event ->
                println "Go EVENT! ${event.data}"
        }
    }
}
