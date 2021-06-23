package oop.day_three.models.people;

import oop.day_three.models.info_models.Project;
import oop.day_three.models.enums.Technology;

import java.util.ArrayList;
import java.util.Arrays;

public class Developer extends Employee {
    private Technology technology;
    private final ArrayList<Project> assignedProjects;

    private Developer() {
        super();
        this.technology = Technology.NONE;
        this.assignedProjects = new ArrayList<>();
    }

    public Technology getTechnology() {
        return technology;
    }

    public void setTechnology(Technology technology) {
        this.technology = technology;
    }

    public ArrayList<Project> getAssignedProjects() {
        return assignedProjects;
    }

    public void addProjects(Project... assignedProjects) {
        this.assignedProjects.addAll(Arrays.asList(assignedProjects));
    }

    public static class DeveloperBuilder extends EmployeeBuilder<DeveloperBuilder, Developer> {

        public DeveloperBuilder() {
            builderInstance = this;
            personInstance = new Developer();
        }

        public DeveloperBuilder setTechnology(Technology technology) {
            personInstance.setTechnology(technology);
            return builderInstance;
        }

        public DeveloperBuilder addProjects(Project... assignedProjects) {
            personInstance.addProjects(assignedProjects);
            return builderInstance;
        }

        @Override
        public Developer build() {
            return personInstance;
        }
    }
}