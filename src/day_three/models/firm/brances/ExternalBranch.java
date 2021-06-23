package day_three.models.firm.brances;

import day_three.models.firm.Branch;
import day_three.models.people.Person;

public class ExternalBranch extends Branch {
    private String countryName, countryIso;

    public ExternalBranch() {
        super();
        this.countryName = Person.EMPTY;
        this.countryIso = Person.EMPTY;
    }

    @Override
    public String getClassName() {
        return ExternalBranch.class.getName();
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryIso() {
        return countryIso;
    }

    public void setCountryIso(String countryIso) {
        this.countryIso = countryIso;
    }
}
