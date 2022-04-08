package peaksoft.driverapp.models;

import javax.persistence.*;

import static javax.persistence.CascadeType.ALL;

@Entity
@Table(name = "drivers")
public class Driver {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String driverName;
    private int experience;
    private int rating;

    @OneToOne(cascade = ALL, fetch = FetchType.EAGER)
    private DriverLicense driverLicense;

    @OneToOne(cascade = ALL)
    private Car car;

    @OneToOne(cascade = ALL)
    private BankAccount bankAccount;

}
