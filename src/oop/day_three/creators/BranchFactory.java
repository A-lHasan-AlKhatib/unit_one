package oop.day_three.creators;

import oop.day_three.models.firm.Branch;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

public class BranchFactory {

    private final File branchesFile;
    private static HashMap<String, Class<? extends Branch>> classesMap;

    //This is the factory implementation that we learned with Dr. Iyad AlAgha, in this implementation you can add
    // a new class to the branches file without the need to modify the factory code and still access it when creating new instance

    public BranchFactory() {
        branchesFile = new File("C:\\Users\\playh\\IdeaProjects\\unit_one\\src\\oop\\day_three\\models\\firm\\brances");
        File[] files = branchesFile.listFiles();
        if (files != null && files.length > 0) {
            classesMap = new HashMap<>();
            for (File file : files) {
                String className = file.getName();
                if (className.contains(".java")) {
                    String name = className.split("\\.")[0];
                    Class<? extends Branch> c;
                    try {
                        c = Class.forName("oop.day_three.models.firm.brances." + name).asSubclass(Branch.class);
                        classesMap.put(c.getName(), c);
                    } catch (ClassNotFoundException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }
    }

    public static Branch createBranch(String className) {
        try {
            return classesMap.get(className).getConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            return null;
        }
    }

}
