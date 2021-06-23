package oop.day_three.models.firm;

import oop.day_three.models.people.Client;
import oop.day_three.models.people.Employee;
import oop.day_three.models.people.Person;

import java.util.ArrayList;
import java.util.Arrays;

public class Brand {
    private int code;
    private String name, slogan;
    private final ArrayList<Employee> employees;
    private final ArrayList<Client> clients;
    private final ArrayList<Branch> branches;
    private Company parentCompany;

    private Brand() {
        code = 0;
        name = Person.EMPTY;
        slogan = Person.EMPTY;
        employees = new ArrayList<>();
        clients = new ArrayList<>();
        branches = new ArrayList<>();
        parentCompany = Company.getInstance();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void addEmployees(Employee... employees) {
        this.employees.addAll(Arrays.asList(employees));
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void addClients(Client... clients) {
        this.clients.addAll(Arrays.asList(clients));
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public void addBranches(Branch... branches) {
        this.branches.addAll(Arrays.asList(branches));
    }

    public Company getParentCompany() {
        return parentCompany;
    }

    public void setParentCompany(Company parentCompany) {
        this.parentCompany = parentCompany;
    }

    public static class BrandBuilder {
        private Brand instance;

        public BrandBuilder() {
            instance = new Brand();
        }

        public BrandBuilder setCode(int code) {
            instance.setCode(code);
            return this;
        }

        public BrandBuilder setName(String name) {
            instance.setName(name);
            return this;
        }

        public BrandBuilder setSlogan(String slogan) {
            instance.setSlogan(slogan);
            return this;
        }

        public BrandBuilder addEmployees(Employee... employees) {
            instance.addEmployees(employees);
            return this;
        }

        public BrandBuilder addClients(Client... clients) {
            instance.addClients(clients);
            return this;
        }

        public BrandBuilder addBranches(Branch... branches) {
            instance.addBranches(branches);
            return this;
        }

        public BrandBuilder setParentCompany(Company parentCompany) {
            instance.setParentCompany(parentCompany);
            return this;
        }


        public Brand build() {
            return instance;
        }
    }
}