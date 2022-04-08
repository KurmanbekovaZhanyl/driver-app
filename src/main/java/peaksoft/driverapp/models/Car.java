package peaksoft.driverapp.models;

import javax.persistence.*;
import java.awt.*;

import static javax.persistence.CascadeType.*;

@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String brand;
    private String model;
    private String numberOfCar;

    @Enumerated(EnumType.STRING)
    private Color color;

    private int yearOfIssue;

    @Enumerated(EnumType.STRING)
    private Enginetype enginetype;

    @OneToOne(cascade = {DETACH,REFRESH})
    private Driver carOwner;
    

}
