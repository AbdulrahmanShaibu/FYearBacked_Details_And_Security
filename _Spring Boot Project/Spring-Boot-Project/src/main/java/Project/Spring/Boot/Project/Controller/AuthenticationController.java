//package Project.Spring.Boot.Project.Controller;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@CrossOrigin("*")
//@RestController
//@RequestMapping("/api/v1/auth")
//@RequiredArgsConstructor
//public class AuthenticationController {
//
//    private final AuthenticationService service;
//    @PostMapping("/register")
//    public ResponseEntity<AuthenticationResponse>register(@RequestBody RegisterRequest request){
//           return ResponseEntity.ok(service.register(request));
//    }
//
//    @PostMapping("/authenticate")
//    public ResponseEntity<AuthenticationResponse>SignAuthenticateUser(@RequestBody AuthenticattionRequest request){
//        // Log the request details for debugging
//        System.out.println("Received request: " + request);
//        return ResponseEntity.ok(service.authenticate(request));
//    }
//}
