package oop.day_three.models.info_models;

import java.util.ArrayList;

public class FinancialRecords {
    private final ArrayList<FinancialRecord> records;

    public FinancialRecords() {
        records = new ArrayList<>();
    }

    public ArrayList<FinancialRecord> getRecords() {
        return records;
    }

    public void addRecord(FinancialRecord record) {
        records.add(record);
    }
}