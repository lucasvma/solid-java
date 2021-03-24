package br.com.hr.interfaces;

import br.com.hr.model.Employee;

import java.math.BigDecimal;

public interface ValidationReadjustments {

    void validate(Employee employee, BigDecimal increase);

}