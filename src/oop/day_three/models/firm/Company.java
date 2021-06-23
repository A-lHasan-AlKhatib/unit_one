package oop.day_three.models.firm;

import oop.day_three.models.people.Employee;
import oop.day_three.models.people.Person;

import java.util.ArrayList;
import java.util.Arrays;

public class Company {
    private String companyCode, name, logoURL;
    private final ArrayList<Brand> companyBrands;
    private final ArrayList<Employee> board;
    private static Company instance;

    // with the assumption that there will be only 1 company I used singleton
    public static Company getInstance() {
        if (instance == null)
            instance = new Company();
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return getInstance();
    }

    private Company() {
        this.companyCode = Person.EMPTY;
        this.name = Person.EMPTY;
        this.logoURL = Person.EMPTY;
        companyBrands = new ArrayList<>();
        board = new ArrayList<>();
    }


    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogoURL() {
        return logoURL;
    }

    public void setLogoURL(String logoURL) {
        this.logoURL = logoURL;
    }

    public ArrayList<Brand> getCompanyBrands() {
        return companyBrands;
    }

    public void addCompanyBrands(Brand... companyBrands) {
        this.companyBrands.addAll(Arrays.asList(companyBrands));
    }

    public ArrayList<Employee> getBoard() {
        return board;
    }

    public void addBoard(Employee... board) {
        this.board.addAll(Arrays.asList(board));
    }
}