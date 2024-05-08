package ru.liga.internshippatterns.model.factory;

import ru.liga.internshippatterns.model.role.Director;
import ru.liga.internshippatterns.model.role.Employee;
import ru.liga.internshippatterns.model.role.Manager;
import ru.liga.internshippatterns.model.role.Vip;

import java.math.BigDecimal;

public class EmployeeFactory {
    public Employee createEmployeeByCreditAmount(BigDecimal amountCredit) {
        if (amountCredit.compareTo(BigDecimal.valueOf(10000)) < 0) {
            return new Manager("Иван Иванович ОбычныйМенеджер");
        } else if (amountCredit.compareTo(BigDecimal.valueOf(50000)) < 0) {
            return new Vip("Василий Константинович Випов");
        } else {
            return new Director("Борис Алексеевич Директоров");
        }
    }
}
