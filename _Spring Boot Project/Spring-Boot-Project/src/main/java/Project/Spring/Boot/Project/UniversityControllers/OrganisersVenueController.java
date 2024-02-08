package Project.Spring.Boot.Project.UniversityControllers;

import Project.Spring.Boot.Project.University.Models.Organisers;
import Project.Spring.Boot.Project.University.Models.Venues;
import Project.Spring.Boot.Project.UniversityServices.OrganisersVenueServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class OrganisersVenueController {

    @Autowired
    private OrganisersVenueServices universityServices;

    //Organisers APIs...
    @PostMapping("/post/organisers")
    public Organisers postOrganisers(@RequestBody Organisers organisers) {
        return universityServices.postOrganisers(organisers);
    }

    @GetMapping("/list/organisers")
    public List<Organisers> listOrganisers() {
        return universityServices.listOrganisers();
    }

    @DeleteMapping("/delete/organisers/{organiserId}")
    public ResponseEntity<String> deleteOrganisers(@PathVariable Integer organiserId) {
        try {
            universityServices.deleteOrganisers(organiserId);
            return ResponseEntity.ok("Organiser with ID " + organiserId + " deleted successfully");
        } catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Failed to delete Organiser with ID " + organiserId);
        }
    }

    @PutMapping("/update/organisers/{organiserId}")
    public ResponseEntity<String> updateOrganisers(@PathVariable Integer organiserId, @PathVariable Organisers organisers) {
        try {
             universityServices.updateOrganisers(organiserId,organisers);
             return ResponseEntity.ok("Organiser with ID " + organiserId+" successifully updated");
        } catch (Exception exception) {
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Failed to update Organiser with ID" + organiserId);
        }
    }


    //Venues APIs

    @PostMapping("/post/venues")
    public Venues postVenues(@RequestBody Venues venues){
        return universityServices.postVenues(venues);
    }

    @GetMapping("/list/venues")
    public List<Venues> venuesList(){
        return universityServices.venuesList();
    }

    @DeleteMapping("/delete/venues/{venueId}")
    public ResponseEntity<String>deleteVenues(@PathVariable Integer venueId){
        try{
            universityServices.deleteVenues(venueId);
            return ResponseEntity.ok("Venue details with ID"+venueId+" "+"is successifully deleted");
        }
        catch (Exception exception){
           return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Failed to delete venues details with ID" +venueId);
        }

    }

    @PutMapping("/update/venues/{venueId}")
    public ResponseEntity<String>updateVenues(@PathVariable Integer venueId, @PathVariable Venues venues){
        try {
             universityServices.updateVenues(venueId,venues);
             return ResponseEntity.ok("Venue details with ID"+venueId+" "+"is successifully updated");
        }
        catch (Exception exception) {
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Failed to update venues details with ID" +venueId);
        }
    }
}
