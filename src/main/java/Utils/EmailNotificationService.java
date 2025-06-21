/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import jakarta.mail.PasswordAuthentication;
import java.util.Properties;

/**
 *
 * @author ushakeshravya
 */
public class EmailNotificationService {
    
    public static void sendBookingConfirmationEmail(
        String recipientEmail,
        String customerUsername,
        String showName,
        int seats
) throws MessagingException {
    final String senderEmail   = "shrakar607@gmail.com";
    final String senderPass    = "dagjuoemfovfmazy";

    Properties props = new Properties();
    props.put("mail.smtp.auth",            "true");
    props.put("mail.smtp.starttls.enable", "true");
    props.put("mail.smtp.host",            "smtp.gmail.com");
    props.put("mail.smtp.port",            "587");

    Session session = Session.getInstance(props, new jakarta.mail.Authenticator() {
        protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(senderEmail, senderPass);
        }
    });

    Message message = new MimeMessage(session);
    message.setFrom(new InternetAddress(senderEmail));
    message.setRecipients(
        Message.RecipientType.TO,
        InternetAddress.parse(recipientEmail)
    );
    message.setSubject("Your tickets are confirmed for “" + showName + "”");

    String body = String.format(
        "Hello %s,\n\n" +
        "Your booking has been CONFIRMED:\n" +
        "  Show: %s\n" +
        "  Seats: %d\n\n" +
        "Thank you for choosing us!\n\n" +
        "— Cinema Management System",
        customerUsername,
        showName,
        seats
    );
    message.setText(body);
    Transport.send(message);
}

    
    
}
