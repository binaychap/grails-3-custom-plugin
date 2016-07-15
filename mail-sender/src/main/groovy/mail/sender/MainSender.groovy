package mail.sender

import grails.artefact.Enhances
import org.grails.core.artefact.ControllerArtefactHandler
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.mail.SimpleMailMessage

/**
 * Created by binayrai on 7/15/16.
 */
@Enhances(ControllerArtefactHandler.TYPE)
trait MailSender {

 @Autowired(required = false)
  MailSystem mailSystem

    void sendMail(Map message){
        mailSystem.mainSend(new SimpleMailMessage(message))
    }

}
