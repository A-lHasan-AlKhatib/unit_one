package day_three.models.firm;

import day_three.models.people.Employee;

import java.security.SecureRandom;

public abstract class Branch {
    private Employee manager;
    private double lat, lon;
    private String cityName, contactPhone;
    private Brand brand;

    //TODO: factory for subclasses

}
