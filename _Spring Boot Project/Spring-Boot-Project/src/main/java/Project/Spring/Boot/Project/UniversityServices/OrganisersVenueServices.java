package Project.Spring.Boot.Project.UniversityServices;

import Project.Spring.Boot.Project.University.Models.Organisers;
import Project.Spring.Boot.Project.University.Models.Venues;
import Project.Spring.Boot.Project.UniversityRepository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class OrganisersVenueServices {

    @Autowired
    OrganiserRepository organiserRepository;

    @Autowired
    VenueRepository venueRepository;

    //Organisers Services...
    public Organisers postOrganisers(@PathVariable Organisers organisers) {
        return organiserRepository.save(organisers);
    }

    public List<Organisers> listOrganisers() {
        return organiserRepository.findAll();
    }

    public void deleteOrganisers(Integer organiserId) {
        Optional<Organisers> optionalOrganiser;
        optionalOrganiser = organiserRepository.findById(organiserId);
        try {
            if (optionalOrganiser.isPresent()) {
                organiserRepository.delete(optionalOrganiser.get());
            } else {
                ResponseEntity
                        .ok("Data to delete does not exist");
            }
        } catch (Exception exception) {
            ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Delete Organisers Operation Failed");
        }
    }

    public Organisers updateOrganisers(Integer organiserId, @PathVariable Organisers editOrganisers) {

        try {
            Optional<Organisers> optionalOrganisers;
            optionalOrganisers = organiserRepository.findById(organiserId);
            if (optionalOrganisers.isPresent()) {
                Organisers existingOrganiser = optionalOrganisers.get();

                // Update the existing Organiser with the new details
                existingOrganiser.setOrganiserName(editOrganisers.getOrganiserName());
                existingOrganiser.setEmail(editOrganisers.getEmail());
                existingOrganiser.setContactInfo(editOrganisers.getContactInfo());
                return organiserRepository.save(existingOrganiser);
            } else {
                throw new NoSuchElementException("Organiser with ID " + organiserId + " not found");
            }
        } catch (Exception exception) {
            ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Update Organisers Operation Failed");
        }
        return editOrganisers;
    }


    // Venues Services...
    public Venues postVenues(@PathVariable Venues venues) {
        return venueRepository.save(venues);
    }
    public List<Venues> venuesList() {
        return venueRepository.findAll();
    }

    public void deleteVenues(@PathVariable Integer venueId) {
        try {
            Optional<Venues>optionalVenues;
            optionalVenues=venueRepository.findById(venueId);
              if(optionalVenues.isPresent()) {
                venueRepository.delete(optionalVenues.get());
              }
                  else {
                          ResponseEntity.ok("No venues details available with ID"+" "+venueId);
                       }
            }
        catch (Exception exception) {
                    ResponseEntity
                            .status(HttpStatus.INTERNAL_SERVER_ERROR)
                            .body("Failed to delete Venues");
        }
    }

    public Venues updateVenues(@PathVariable Integer venueId, @PathVariable Venues editVenues) {
        try {
            Optional<Venues>optionalVenues;
            optionalVenues=venueRepository.findById(venueId);
            if (optionalVenues.isPresent()){

                Venues existingVenues=optionalVenues.get();
                existingVenues.setVenueName(editVenues.getVenueName());
                existingVenues.setVenueCapacity(editVenues.getVenueCapacity());
                existingVenues.setLocation(editVenues.getLocation());
                return venueRepository.save(existingVenues);
          }
            else {
                throw new NoSuchElementException("Venue with ID " + venueId + " not found");
              }
            }
        catch (Exception exception){
            ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Failed to Update");
        }
        return editVenues;
    }
}
