package br.com.hr.model;

import br.com.hr.enums.Position;

import java.math.BigDecimal;

public class Outsourced {

    private PersonalData personalData;
    private String company;

    public Outsourced(String name, String cpf, Position position, BigDecimal salary) {
        this.personalData = new PersonalData(name, cpf, position, salary);
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
