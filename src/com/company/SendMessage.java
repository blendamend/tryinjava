package com.company;

import javax.mail.internet.MimeMessage;
import javax.mail.internet.InternetAddress;
import javax.mail.*;
import java.util.*;

public class SendMessage
{

    private String host ="smtp.rambler.ru";
    private Properties prop = new Properties();


    public SendMessage()
    {
        prop.put("mail.smtp.host",host);
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.socketFactory.port", "465");
        prop.put("mail.smtp.port", "465");
        prop.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocket.Factory");

    }

    public Session GetSession(User fromWho)
    {
        Session session = Session.getDefaultInstance(prop,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(fromWho.GetEmail(),fromWho.GetPassword());
                    }
                });

        return session;
    }

    public String Send(User fromWho, User toWho)
    {
        try {
                Message message = new MimeMessage(GetSession(fromWho));
                message.setFrom(new InternetAddress(fromWho.GetEmail()));
                message.addRecipient(Message.RecipientType.TO, new InternetAddress(toWho.GetEmail()));
                message.setSubject("spam");
                message.setText("wow_wow");

            //send the message
            Transport.send(message);

        } catch (MessagingException e) {e.printStackTrace();}

        return "message sent successfully...";
    }
}
