//package Project.Spring.Boot.Project.SMS.Configurations;
//
//import com.twilio.rest.api.v2010.account.Message;
//import com.twilio.type.PhoneNumber;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Service;
//
//@Service
//public class SmsService {
//
//    @Value("${twilio.phoneNumber}")
//    private String twilioPhoneNumber;
//
//    public void sendSms(String to, String message) {
//        Message twilioMessage = Message.creator(
//                new PhoneNumber(to),
//                new PhoneNumber(twilioPhoneNumber),
//                message
//        ).create();
//
//        System.out.println("SMS sent with SID: " + twilioMessage.getSid());
//    }
//}
//
