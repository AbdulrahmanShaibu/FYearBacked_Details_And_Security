package Project.Spring.Boot.Project.University.Models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "RegisteredParticipants")
public class ParticipantUsers {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int RegistrationId; // student reg number

    public String Email;
    public int ContactInfo;
    public Date RegistrationDate;

    @ManyToOne  // many participants to one event
    public Events events;

}
