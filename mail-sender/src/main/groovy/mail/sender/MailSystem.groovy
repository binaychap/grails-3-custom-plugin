package mail.sender

import org.springframework.mail.MailMessage

/**
 * Created by binayrai on 7/15/16.
 */
interface MailSystem{
   String SEND_EVENT = "mail:send"
   void mainSend(MailMessage mailMessage)
}