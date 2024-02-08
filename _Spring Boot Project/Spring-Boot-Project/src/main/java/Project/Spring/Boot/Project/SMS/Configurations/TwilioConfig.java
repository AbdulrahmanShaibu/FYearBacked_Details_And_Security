//package Project.Spring.Boot.Project.SMS.Configurations;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import com.twilio.Twilio;
//
//@Configuration
//public class TwilioConfig {
//
//    @Value("${twilio.accountSid}")
//    private String accountSid;
//
//    @Value("${twilio.authToken}")
//    private String authToken;
//
//    @Bean
//    public void initTwilio() {
//        Twilio.init(accountSid, authToken);
//    }
//}
//
