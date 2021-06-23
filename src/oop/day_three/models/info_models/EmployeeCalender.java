package oop.day_three.models.info_models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class EmployeeCalender {
    ArrayList<Date> offDates;
    ArrayList<AttendanceLog> attLogs;

    public EmployeeCalender(){}

    public EmployeeCalender(ArrayList<Date> offDates, ArrayList<AttendanceLog> attLogs) {
        this.offDates = offDates;
        this.attLogs = attLogs;
    }

    public ArrayList<Date> getOffDates() {
        return offDates;
    }

    public void addOffDates(Date... offDates) {
        this.offDates.addAll(Arrays.asList(offDates));
    }

    public ArrayList<AttendanceLog> getAttLogs() {
        return attLogs;
    }

    public void addAttLogs(AttendanceLog... attLogs) {
        this.attLogs.addAll(Arrays.asList(attLogs));
    }
}
