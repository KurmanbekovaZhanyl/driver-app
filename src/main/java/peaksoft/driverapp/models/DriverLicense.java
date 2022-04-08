package peaksoft.driverapp.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name="driver-licenses")
public class DriverLicense {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ElementCollection
    private Set<Category> category;

    private LocalDate dataOfIssue;
    private LocalDate dataOfExpire;

}
