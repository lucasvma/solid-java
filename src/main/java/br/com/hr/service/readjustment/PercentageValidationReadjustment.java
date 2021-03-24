package br.com.hr.service.readjustment;

import br.com.hr.ValidacaoException;
import br.com.hr.interfaces.ValidationReadjustments;
import br.com.hr.model.Employee;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PercentageValidationReadjustment implements ValidationReadjustments {

    public void validate(Employee employee, BigDecimal increase) {
        BigDecimal actualSalary = employee.getSalary();
        BigDecimal readjustmentPercentage = increase.divide(actualSalary, RoundingMode.HALF_UP);
        if (readjustmentPercentage.compareTo(new BigDecimal("0.4")) > 0) {
            throw new ValidacaoException("Adjustment cannot exceed 40% of salary!");
        }

        BigDecimal readjustedSalary = actualSalary.add(increase);
        employee.updateSalary(readjustedSalary);

    }
}
