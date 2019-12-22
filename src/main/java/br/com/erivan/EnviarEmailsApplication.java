package br.com.erivan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

@SpringBootApplication
public class EnviarEmailsApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(EnviarEmailsApplication.class, args);
	}
	
	@Autowired
	JavaMailSender sender;
	
	@Override
	public void run(String... args) throws Exception {
		//utilizado para teste	verifica se o email estar sendo enviado
		SimpleMailMessage simple = new SimpleMailMessage();
		simple.setTo("erivancled@hotmail.com"); //enviar para
		simple.setSubject("Desenvolvido por");
		simple.setText("Erivan Cledson. www.erivancosta.com.br");
		sender.send(simple);
		
	}

}
