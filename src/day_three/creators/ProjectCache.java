package day_three.creators;

import day_three.models.info_models.Project;

import java.util.HashMap;

public class ProjectCache {
    private static final HashMap<Integer, Project> projects = new HashMap<>();

    public static Project getProject(int projectId) {
        return projects.get(projectId);
    }

    public static void addProject(Project project) {
        projects.put(project.getId(), project);
    }

}
