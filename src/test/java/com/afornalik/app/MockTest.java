package com.afornalik.app;

import org.junit.Test;

public class MockTest {

    @Test
    public void shouldSendEmail() {

        String userId = "123";
        String emailAddress ="sebastian.malaca@@gmail.com";
        String message =" this is your message";
        
        givenUserWithEmail(userId,emailAddress);

        new  CommunicationController().send(userId,message);

        thendEmailWasSent(emailAddress, message);
    }

    private void thendEmailWasSent(String emailAddress, String message) {
    }

    private void givenUserWithEmail(String userId, String emailAddress) {
    }
}
