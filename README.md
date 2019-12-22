# enviar-emails
enviando e-mails com spring email.

adicionar a dependencia:

  <dependency>
	        <groupId>org.springframework.boot</groupId>
	        <artifactId>spring-boot-starter-mail</artifactId>
	    </dependency>
      
 no application.properties:
 
 #JAVAMAIL
spring.mail.host = smtp.gmail.com
spring.mail.port=587
spring.mail.username= (aqui adiciona o email que será enviado as mensagens)
spring.mail.password= (aqui a senha do email)
spring.mail.properties.mail.smtp.auth = true
spring.mail.properties.mail.smtp.starttls.enable=true
spring.mail.test-connection=true
 
 
      
