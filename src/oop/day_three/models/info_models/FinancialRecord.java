package oop.day_three.models.info_models;

import oop.day_three.models.enums.Currency;
import oop.day_three.models.people.Person;

import java.util.Date;

public class FinancialRecord {
    Date paymentDate;
    float paymentAmount, deduction, additions;
    Currency currency;
    String deductionNotice, additionNotice;

    private FinancialRecord() {
        paymentDate = new Date();
        paymentAmount = 0;
        deduction = 0;
        additions = 0;
        currency = Currency.NONE;
        deductionNotice = Person.EMPTY;
        additionNotice = Person.EMPTY;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public float getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(float paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public float getDeduction() {
        return deduction;
    }

    public void setDeduction(float deduction) {
        this.deduction = deduction;
    }

    public float getAdditions() {
        return additions;
    }

    public void setAdditions(float additions) {
        this.additions = additions;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public String getDeductionNotice() {
        return deductionNotice;
    }

    public void setDeductionNotice(String deductionNotice) {
        this.deductionNotice = deductionNotice;
    }

    public String getAdditionNotice() {
        return additionNotice;
    }

    public void setAdditionNotice(String additionNotice) {
        this.additionNotice = additionNotice;
    }

    public static class FinicalRecordBuilder {
        private final FinancialRecord instance;

        public FinicalRecordBuilder() {
            instance = new FinancialRecord();
        }

        public FinicalRecordBuilder setPaymentDate(Date paymentDate) {
            instance.setPaymentDate(paymentDate);
            return this;
        }

        public FinicalRecordBuilder setPaymentAmount(float paymentAmount) {
            instance.setPaymentAmount(paymentAmount);
            return this;
        }

        public FinicalRecordBuilder setDeduction(float deduction) {
            instance.setDeduction(deduction);
            return this;
        }

        public FinicalRecordBuilder setAdditions(float additions) {
            instance.setAdditions(additions);
            return this;
        }

        public FinicalRecordBuilder setCurrency(Currency currency) {
            instance.setCurrency(currency);
            return this;
        }

        public FinicalRecordBuilder setDeductionNotice(String deductionNotice) {
            instance.setDeductionNotice(deductionNotice);
            return this;
        }

        public FinicalRecordBuilder setAdditionNotice(String additionNotice) {
            instance.setAdditionNotice(additionNotice);
            return this;
        }


        public FinancialRecord build() {
            return instance;
        }
    }
}
