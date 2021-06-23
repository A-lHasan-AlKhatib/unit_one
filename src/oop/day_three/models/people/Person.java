package oop.day_three.models.people;

import oop.day_three.models.enums.Gender;

import java.util.Date;

public abstract class Person {
    public static final String EMPTY = "EMPTY";

    private String firsName, lastName, nationality, idNumber;
    private Gender gender;
    Date dateOfBirth;

    protected Person() {
        firsName = EMPTY;
        lastName = EMPTY;
        nationality = EMPTY;
        idNumber = EMPTY;
        gender = Gender.NULL;
        dateOfBirth = new Date();
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "FirsName='" + firsName + '\'' +
                ", LastName='" + lastName + '\'' +
                ", Nationality='" + nationality + '\'' +
                ", IdNumber='" + idNumber + '\'' +
                ", Gender=" + gender +
                ", DateOfBirth=" + dateOfBirth;
    }

    public abstract static class PersonBuilder<B extends PersonBuilder, P extends Person> {

        //Must initialize the instances in the sub constructor.
        protected B builderInstance;
        protected P personInstance;

        public B setFirstName(String firstName) {
            personInstance.setFirsName(firstName);
            return builderInstance;
        }

        public B setLastName(String lastName) {
            personInstance.setLastName(lastName);
            return builderInstance;
        }

        public B setNationality(String nationality) {
            personInstance.setNationality(nationality);
            return builderInstance;
        }

        public B setIdNumber(String idNumber) {
            personInstance.setIdNumber(idNumber);
            return builderInstance;
        }

        public B setGender(Gender gender) {
            personInstance.setGender(gender);
            return builderInstance;
        }

        public B setDOB(Date DOB) {
            personInstance.setDateOfBirth(DOB);
            return builderInstance;
        }

        public abstract P build();
    }
}