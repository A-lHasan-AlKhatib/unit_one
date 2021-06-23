package day_three.models.info_models;

import day_three.models.enums.DurationType;
import day_three.models.people.Client;
import day_three.models.people.Employee;

import java.util.ArrayList;

public class Project {
    private String title;
    private int duration;
    private DurationType durationType;
    private Client client;
    private final ArrayList<Employee> employees;

    public Project(String title, int duration, DurationType durationType, Client client, ArrayList<Employee> employees) {
        this.title = title;
        this.duration = duration;
        this.durationType = durationType;
        this.client = client;
        this.employees = employees;
    }

    //TODO: make prototype for different instances
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public DurationType getDurationType() {
        return durationType;
    }

    public void setDurationType(DurationType durationType) {
        this.durationType = durationType;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }
}
