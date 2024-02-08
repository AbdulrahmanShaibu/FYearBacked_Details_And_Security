package Project.Spring.Boot.Project.UniversityServices;

import Project.Spring.Boot.Project.University.Models.ParticipantUsers;
import Project.Spring.Boot.Project.UniversityRepository.EventsRepository;
import Project.Spring.Boot.Project.UniversityRepository.ParticipantsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class ParticipantsEventService {

    @Autowired
    private EventsRepository eventsRepository;
    @Autowired
    private ParticipantsRepository participantsRepository;

    //Participants Services
    public ParticipantUsers postParticipants(@PathVariable ParticipantUsers participantUsers) {
        return participantsRepository.save(participantUsers);
    }

    public List<ParticipantUsers> participantUsersList() {
        return participantsRepository.findAll();
    }

    public void deleteParticipants() {
        ResponseEntity.ok("To be Implemented");
    }

    public ResponseEntity<String> updateParticipants(@PathVariable ParticipantUsers editUsers, @PathVariable Integer userID) {
        return ResponseEntity.ok("To be implemented");
    }
}
