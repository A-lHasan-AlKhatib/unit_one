package oop.day_three.models.people;

import oop.day_three.models.enums.DurationType;
import oop.day_three.models.info_models.EmployeeCalender;
import oop.day_three.models.info_models.FinancialRecords;

import java.util.Date;

public abstract class Employee extends Person {
    private static int idCounter = 0;
    private final int employeeId;
    private int score;
    private int contractDuration;
    private float basicSalary, raise;
    private Date hireDate;
    private DurationType durationType;
    private EmployeeCalender employeeCalender;
    private String username, password;
    private FinancialRecords financialRecords;

    public int getEmployeeId() {
        return employeeId;
    }


    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getContractDuration() {
        return contractDuration;
    }

    public void setContractDuration(int contractDuration) {
        this.contractDuration = contractDuration;
    }

    public float getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(float basicSalary) {
        this.basicSalary = basicSalary;
    }

    public float getRaise() {
        return raise;
    }

    public void setRaise(float raise) {
        this.raise = raise;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public DurationType getDurationType() {
        return durationType;
    }

    public void setDurationType(DurationType durationType) {
        this.durationType = durationType;
    }

    public EmployeeCalender getEmployeeCalender() {
        return employeeCalender;
    }

    public void setEmployeeCalender(EmployeeCalender employeeCalender) {
        this.employeeCalender = employeeCalender;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public FinancialRecords getFinancialRecords() {
        return financialRecords;
    }

    public void setFinancialRecords(FinancialRecords financialRecords) {
        this.financialRecords = financialRecords;
    }


    protected Employee() {
        super();
        employeeId = idCounter++;
        score = 0;
        contractDuration = 0;
        basicSalary = 0;
        raise = 0;
        hireDate = new Date();
        durationType = DurationType.NONE;
        employeeCalender = new EmployeeCalender();
        username = "";
        password = "";
        financialRecords = new FinancialRecords();
    }

    public abstract static class EmployeeBuilder<B extends EmployeeBuilder, E extends Employee> extends PersonBuilder<B, E> {

        public B setScore(int score) {
            personInstance.setScore(score);
            return builderInstance;
        }

        public B setContractDuration(int contractDuration) {
            personInstance.setContractDuration(contractDuration);
            return builderInstance;
        }


        public B setBasicSalary(float basicSalary) {
            personInstance.setBasicSalary(basicSalary);
            return builderInstance;
        }


        public B setRaise(float raise) {
            personInstance.setRaise(raise);
            return builderInstance;
        }


        public B setHireDate(Date hireDate) {
            personInstance.setHireDate(hireDate);
            return builderInstance;
        }

        public B setDurationType(DurationType durationType) {
            personInstance.setDurationType(durationType);
            return builderInstance;
        }


        public B setEmployeeCalender(EmployeeCalender employeeCalender) {
            personInstance.setEmployeeCalender(employeeCalender);
            return builderInstance;
        }


        public B setUsername(String username) {
            personInstance.setUsername(username);
            return builderInstance;
        }


        public B setPassword(String password) {
            personInstance.setPassword(password);
            return builderInstance;
        }


        public B setFinancialRecords(FinancialRecords financialRecords) {
            personInstance.setFinancialRecords(financialRecords);
            return builderInstance;
        }

        @Override
        public abstract E build();
    }
}
