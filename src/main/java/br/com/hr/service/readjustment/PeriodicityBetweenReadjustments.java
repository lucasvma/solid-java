package br.com.hr.service.readjustment;

import br.com.hr.ValidacaoException;
import br.com.hr.interfaces.ValidationReadjustments;
import br.com.hr.model.Employee;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PeriodicityBetweenReadjustments implements ValidationReadjustments {

    public void validate(Employee employee, BigDecimal increase) {
        BigDecimal actualSalary = employee.getSalary();
        long monthsLastReadjustment = ChronoUnit.MONTHS.between(employee.getDateLastReadjustment(), LocalDate.now());
        if (monthsLastReadjustment < 6) {
            throw new ValidacaoException("Interval between readjustment should not be less than 6 months!");
        }

    }
}
