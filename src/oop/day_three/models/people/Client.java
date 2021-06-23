package oop.day_three.models.people;

import oop.day_three.models.info_models.Project;

import java.util.ArrayList;
import java.util.Arrays;

public class Client extends Person {
    private final ArrayList<Project> projects;

    private Client() {
        super();
        this.projects = new ArrayList<>();
    }

    public ArrayList<Project> getProjects() {
        return projects;
    }

    public void addProjects(Project... projects) {
        this.projects.addAll(Arrays.asList(projects));
    }

    public static class ClientBuilder extends PersonBuilder<ClientBuilder, Client> {

        public ClientBuilder() {
            builderInstance = this;
            personInstance = new Client();
        }

        public ClientBuilder addProjects(Project... projects) {
            personInstance.addProjects(projects);
            return builderInstance;
        }

        @Override
        public Client build() {
            return personInstance;
        }
    }
}
