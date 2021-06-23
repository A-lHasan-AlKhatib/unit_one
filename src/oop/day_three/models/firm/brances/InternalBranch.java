package oop.day_three.models.firm.brances;

import oop.day_three.models.firm.Branch;
import oop.day_three.models.people.Person;

public class InternalBranch extends Branch {
    private String fullAddress;


    public InternalBranch() {
        super();
        this.fullAddress = Person.EMPTY;
    }

    @Override
    public String getClassName() {
        return InternalBranch.class.getName();
    }


    public String getFullAddress() {
        return fullAddress;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }
}
