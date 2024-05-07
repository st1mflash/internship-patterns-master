package ru.liga.internshippatterns.service;

import ru.liga.internshippatterns.model.Application;
import ru.liga.internshippatterns.model.factory.EmployeeFactory;
import ru.liga.internshippatterns.model.role.*;

public class ApplicationService {

    /**
     * Отправляем заявку на одобрение менеджером/вип-менеджером или директором и происходит процесс работы сотрудником с заявкой
     * @param application - заявка
     */
    public void sendOnApprove(Application application) {
        Employee employee = new EmployeeFactory().createEmployeeByCreditAmount(application.getCreditAmount());
        employee.handlingApplication(application);

        System.out.println("Заявка на кредит была обработана, одобрена и подписана. ");
        System.out.println("Должность/подпись");
        System.out.println(application.getApprovedBy());
        System.out.println("________________________________________________________");
    }

    public void createAgreement(Application application) {
        System.out.println("Создаем договор по заявке " + application.getName());
    }
}