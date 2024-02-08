package Project.Spring.Boot.Project.University.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "Organisers")
public class Organisers {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "organiser_id")
    public int OrganiserId;

    public String OrganiserName;
    public int ContactInfo;
    public String Email;
}
