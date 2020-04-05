package com.balajiprabhu;

public class MailService {

    public String sendEmail() {
        connect();
        authenticate();
        disconnect();
        return "Email Sent !";
    }

    /**
     * Abstracting @connect @authenticate and @ disconnect bcoz user need not aware of the backend process
     **/
    private void connect() {
        System.out.println("Connect ");
    }

    private void authenticate() {
        System.out.println("Authenticate");
    }

    private void disconnect() {
        System.out.println("Disconnect");
    }
}
