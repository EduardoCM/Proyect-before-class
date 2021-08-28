package com.codigorupestre.spacetravels.mail;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MailTest {

	@Test
	void test() {
	   MailSpaceTravels mail = new MailSpaceTravels();
	    mail.sendMail("Test", "Test Test", "ecm3198@gmail.com");
	
	}

}
