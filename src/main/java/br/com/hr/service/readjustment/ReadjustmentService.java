package br.com.hr.service.readjustment;

import br.com.hr.interfaces.ValidationReadjustments;
import br.com.hr.model.Employee;

import java.math.BigDecimal;
import java.util.List;

public class ReadjustmentService {

    private final List<ValidationReadjustments> validations;

    public ReadjustmentService(List<ValidationReadjustments> validations) {
        this.validations = validations;
    }

    public void readjustmentSalary(Employee employee, BigDecimal increase) {
        this.validations.forEach(v -> v.validate(employee, increase));

        BigDecimal readjustedSalary = employee.getSalary().add(increase);
        employee.updateSalary(readjustedSalary);
    }
}
