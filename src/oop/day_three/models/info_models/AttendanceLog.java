package oop.day_three.models.info_models;

import java.util.Date;

public class AttendanceLog {
    Date checkIn, checkOut, optOut, optIn;

    public AttendanceLog(Date checkIn, Date checkOut, Date optOut, Date optIn) {
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.optOut = optOut;
        this.optIn = optIn;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    public Date getOptOut() {
        return optOut;
    }

    public void setOptOut(Date optOut) {
        this.optOut = optOut;
    }

    public Date getOptIn() {
        return optIn;
    }

    public void setOptIn(Date optIn) {
        this.optIn = optIn;
    }
}
