package Project.Spring.Boot.Project.University.Models;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "Event")
public class Events {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "eventId")
    public int EventId;
    public String EventName;
    public Date EventDate;
    public String EventDescription;

    @OneToMany// many organisers to one event
    public List<Organisers> organisers;

    @OneToMany // one vent to more than one venue
    public List<Venues> venues;

}














