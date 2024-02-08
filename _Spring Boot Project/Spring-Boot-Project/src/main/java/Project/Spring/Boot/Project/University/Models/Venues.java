package Project.Spring.Boot.Project.University.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "Venues")
public class Venues {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int VenueId;

    public String VenueName;
    public String VenueCapacity;
    public String Location;
}
