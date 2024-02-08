package Project.Spring.Boot.Project.UniversityControllers;

import Project.Spring.Boot.Project.University.Models.ParticipantUsers;
import Project.Spring.Boot.Project.UniversityServices.ParticipantsEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ParticipantsEventsController {

    @Autowired
    private ParticipantsEventService participantsEventService;

    //Participants Services
    @PostMapping("/post/participants")
    public ParticipantUsers postParticipants(@PathVariable ParticipantUsers participantUsers){
        return participantsEventService.postParticipants(participantUsers);
    }

    @GetMapping("/list/participants")
    public List<ParticipantUsers>participantUsersList(){
        return participantsEventService.participantUsersList();
    }

    @DeleteMapping("/delete/participants/{userID}")
    public ResponseEntity<String>deleteParticipants(@PathVariable Integer userID){
        try {
            participantsEventService.deleteParticipants();
            return ResponseEntity.ok("Deleted success with ID"+" "+userID);
        }
        catch (Exception exception){
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("delete Operation failed to work!");
        }

    }

    @PutMapping("/update/participants/{userID}")
    public ResponseEntity<String>updateParticipants(@PathVariable Integer userID,@PathVariable ParticipantUsers participantUsers){
        try {
            participantsEventService.updateParticipants(participantUsers, userID);
            return ResponseEntity.ok("Updated successfully with ID"+" "+userID);
        }
        catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("update Operation failed to work!");
        }
    }

}
