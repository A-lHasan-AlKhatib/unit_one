package oop.day_one.student_system;

import java.io.*;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class StudentSystem {
    LinkedList<Student> students;
    Scanner scanner;
    private String password = "skm";

    public StudentSystem() {
        scanner = new Scanner(System.in);
        students = new LinkedList<>();
        checkPass();
        readList();
        int choice = 0;
        while (choice != 6) {
            choice = menu();
            process(choice);
        }
        writeList();
        System.out.println("Date and Time:");
        System.out.println(Calendar.getInstance().getTime().toString());
    }

    private void checkPass() {
        System.out.println("\n\t\t\t  SCHOOL OF COMPUTING & TECHNOLOGY.");
        System.out.println("\t\t\t  *********************************");
        System.out.println("\t\t\t  *********************************");
        int valid = 1;
        int retry = 1;

        do {
            System.out.println("Enter the password:");
            String enteredPassword = scanner.nextLine();
            retry++;
            if (enteredPassword.equals(password)) {
                valid = 0;
            } else {
                System.out.println("Incorrect Password!");
            }
        } while (valid != 1 && retry <= 3);

        if (retry > 3 && valid != 0) {
            System.out.println("Maximum 3 tries only. bye.");
            System.exit(0);
        } else {
            System.out.println("Access approved.");
        }
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private int menu() {
        int temp;
        System.out.println("Date and Time:");
        System.out.println(Calendar.getInstance().getTime().toString());

        System.out.println("\t\t\t[1]Add New Student Record");
        System.out.println("\t\t\t[2]Delete Student Record");
        System.out.println("\t\t\t[3]Display Student Record");
        System.out.println("\t\t\t[4]Modify Student Record");
        System.out.println("\t\t\t[5]Search Student Record");
        System.out.println("\t\t\t[6]Exit The Program\n");
        System.out.println("\t\t\tPlease Enter Your Choice:");
        temp = scanner.nextInt();
        return temp;
    }

    private int getID() {
        System.out.println("please enter ID:");
        return scanner.nextInt();
    }

    private void process(int choice) {
        switch (choice) {
            case 1:
                //TODO: getRecord = initiate new student object with validation.
                //TODO: add entry
                System.out.println("Record Inserted!");
                break;
            case 2:
                deleteEntry(getID());
                break;
            case 3:
                displayEntry();
                break;
            case 4:
                modifyEntry(getID());
                break;
            case 5:
                searchId(getID());
                break;
            case 6:
                System.out.println("\n\t\t\tTHANK YOU !! ********");
                System.out.println("\t\t\tDone by AlHasan");
                System.out.println("\t\t\tCredits to KAMRAN MEHDI");
                System.out.println("\t\t\tProgram terminated");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice, try again.");
        }
    }

    private boolean getCode(int id) {
        Iterator<Student> iterator = students.iterator();
        Student entry = null;
        while (iterator.hasNext()) {
            Student temp = iterator.next();
            if (temp.getStId() == id)
                entry = temp;
        }

        return entry == null && id >= 0 && id <= 9999;
    }

//    private String getString(String chars, int size, int status){
//        boolean ok = true;
//        System.out.println(chars);
//
//    }

    private Student getRecord() {
        Student temp = new Student();

        System.out.println("*************************************");
        System.out.println("\t\t\tADD New Student");
        System.out.println("*************************************");

        int enterId;
        boolean correctId;
        do {
            System.out.println("Enter Student ID");
            enterId = scanner.nextInt();
            correctId = getCode(enterId);
        } while (!correctId);


        temp.setStId(enterId);


        return temp;
    }

    private void searchId(int id) {
        Iterator<Student> iterator = students.iterator();
        Student entry = null;
        while (iterator.hasNext()) {
            Student temp = iterator.next();
            if (temp.getStId() == id)
                entry = temp;
        }

        if (entry == null)
            System.out.println("Student Entry is empty");
        else {
            System.out.println("*************************************");
            System.out.println("\t\t\tStudent Record Found");
            System.out.println("*************************************");
            System.out.println("\n" + entry);

            System.out.println("Enter any character then Press Enter to continue!");
            scanner.next();
        }
    }

    private void deleteEntry(int id) {
        students.removeIf(student -> student.getStId() == id);
    }

    private void displayEntry() {
        Iterator<Student> iterator = students.iterator();
        Student entry;

        System.out.println("*************************************");
        System.out.println("\t\t\tDisplay Student Record");
        System.out.println("*************************************");

        while (iterator.hasNext()) {
            entry = iterator.next();
            System.out.println("\n" + entry);
        }
    }

    private void modifyEntry(int id) {
        Iterator<Student> iterator = students.iterator();
        Student entry = null;
        while (iterator.hasNext()) {
            Student temp = iterator.next();
            if (temp.getStId() == id)
                entry = temp;
        }

        if (entry == null)
            System.out.println("Student Entry is empty");
        else {
            System.out.println("*************************************");
            System.out.println("\t\t\tStudent Record Found");
            System.out.println("*************************************");
            System.out.println("\n" + entry);
            update(entry);
        }
    }

    private void update(Student entry) {
        System.out.println("Update Address! [Y/N]");
        String answer = scanner.next();
        if (answer.equalsIgnoreCase("Y")) {
            System.out.println("enter new value");
            entry.setAddress(scanner.nextLine());
        }

        System.out.println("Update Contact! [Y/N]");
        answer = scanner.next();
        if (answer.equalsIgnoreCase("Y")) {
            System.out.println("enter new value");
            entry.setContactNum(scanner.nextLine());
        }
    }

    private final File datafile = new File("data.txt");

    private void readList() {
        if (datafile.exists()) {
            try {
                FileInputStream fis = new FileInputStream(datafile);
                ObjectInputStream ois = new ObjectInputStream(fis);
                students = (LinkedList<Student>) ois.readObject();
                ois.close();
                fis.close();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    private void writeList() {
        try {
            FileOutputStream fos = new FileOutputStream(datafile);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
