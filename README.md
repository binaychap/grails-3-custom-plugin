# Grails 3 custom plugin



 

####Open terminal and create plugin app
   

  To create mail-sender plugin:

    grails create-plugin mail-sender
    
  To create app:
     
     grails create-app myapp
     
  Create settings.gradle  
  
     include  'mail-sender' , 'myapp'
  
 Configure plugin at myapp 
     
     compile  project (':mail-sender')
     
  
###### At last, Open project in IDE
  
  
### Details

    create MailSystem interface has a SEND_EVENT for the events trait which help to send and receive events and mailSend(.) function for the sending message.
    
    Create the MailSender traits and inject MailSystem interface and used interface method with parameter MailMessage. Make the MailSender trait with @Enhances for automatically inject in controller and service. Meanwhile see the unit test code for this operation. 
    
    Used sendMail method to send the mail via controller.
    
    For receive and send event, we implment events and used notify method at plugin application and then we use on method at myapp side to listen this event using reactor event.
  
  