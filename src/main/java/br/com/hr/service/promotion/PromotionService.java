package br.com.hr.service.promotion;

import br.com.hr.enums.Position;
import br.com.hr.model.Employee;

import javax.xml.bind.ValidationException;

public class PromotionService {

    public void promote(Employee employee, boolean beatGoal) throws ValidationException {
        Position actualPosition = employee.getPosition();
        if (Position.MANAGER == actualPosition) {
            throw new ValidationException("Manager couldn't be promoted!");
        }

        if (beatGoal) {
            Position newPostition = actualPosition.getNextPosition();
            employee.promote(newPostition);
        } else {
            throw new ValidationException("Employee didn't beat the Goal!");
        }
    }
}
