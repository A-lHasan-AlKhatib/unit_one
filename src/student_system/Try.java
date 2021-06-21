package student_system;

import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;

public class Try {
    int choices;
    static LinkedList<Student> students;

    public static void main(String[] args) throws IOException {

        students = new LinkedList<>();

//        students.add(new Student(1, "ss", "23", "male",
//                "m", 22, "22", "ewew"));
//
//        writeList();
//
//        readList();
//
//        System.out.println(students.getFirst().getAge());


    }


    private static final File datafile = new File("data.txt");

    private static void readList() {
        if (datafile.exists()) {
            try {
                FileInputStream fis = new FileInputStream(datafile);
                ObjectInputStream ois = new ObjectInputStream(fis);
                students = (LinkedList<Student>) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    private static void writeList() {
        try {
            FileOutputStream fos = new FileOutputStream(datafile);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
