package Project.Spring.Boot.Project.University.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UnUsedEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int AttendeeId;
    public String AttendeeName;
    public int AttendeeContact;
}
