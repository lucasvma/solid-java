package br.com.hr.model;

import br.com.hr.enums.Position;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Employee {

    private PersonalData personalData;
    private LocalDate dateLastReadjustment;

    public Employee(String name, String cpf, Position position, BigDecimal salary) {
        this.personalData = new PersonalData(name, cpf, position, salary);
    }

    public void updateSalary(BigDecimal newSalary) {
        this.personalData.setSalary(newSalary);
        this.dateLastReadjustment = LocalDate.now();
    }

    public LocalDate getDateLastReadjustment() {
        return dateLastReadjustment;
    }

    public void setDateLastReadjustment(LocalDate dateLastReadjustment) {
        this.dateLastReadjustment = dateLastReadjustment;
    }

    public void promote(Position newPostition) {
        this.personalData.setPosition(newPostition);
    }

    public BigDecimal getSalary() {
        return this.personalData.getSalary();
    }
}
