package com.codigorupestre.spacetravels.mail;

import java.util.Properties;

import javax.mail.Message;

import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/*
 */
public class MailSpaceTravels {
	
	
	 public void sendMail(String name, String apellidos, String email) {
	      
		  //provide sender's email ID
	      String from = "ecm3198@example.com";
 
	      //provide Mailtrap's username
	      final String username = "ecm3198@gmail.com";
	      //provide Mailtrap's password
	      final String password = "$/$Castillo1990.$/$";

	      String host = "smtp.gmail.com";


	      Properties props = new Properties();
	      props.put("mail.smtp.auth", "true");
	      props.put("mail.smtp.starttls.enable", "true");
	      props.put("mail.smtp.host", host);
	      props.put("mail.smtp.port", "587");
	      
	      Session session = Session.getInstance(props,
	         new javax.mail.Authenticator() {
	            protected PasswordAuthentication getPasswordAuthentication() {
	               return new PasswordAuthentication(username, password);
	    }
	         });

	      try {
	    	  
	    Message message = new MimeMessage(session);

	    //set From email field
	    message.setFrom(new InternetAddress(from));

	    //set To email field
	    message.setRecipients(Message.RecipientType.TO,
	               InternetAddress.parse(email));

	    //set email subject field
	    message.setSubject("Welcome to Space Travels!");

	    //set the content of the email message
	    message.setText("Welcome " + name + " " + apellidos + " to space travels " + new MailSpaceTravels().toString());

	    //send the email message
	    Transport.send(message);

	    System.out.println("Email Message Sent Successfully");

	      } catch (MessagingException e) {
	         throw new RuntimeException(e);
	      }
	   }

}







//$/$Castillo1990.$/$