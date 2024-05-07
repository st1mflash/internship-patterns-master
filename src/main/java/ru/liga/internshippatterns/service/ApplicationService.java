package ru.liga.internshippatterns.service;

import ru.liga.internshippatterns.model.Application;
import ru.liga.internshippatterns.model.factory.ManagerFactory;
import ru.liga.internshippatterns.model.role.Director;
import ru.liga.internshippatterns.model.role.Manager;
import ru.liga.internshippatterns.model.role.ManagerRole;
import ru.liga.internshippatterns.model.role.VipManager;

import java.math.BigDecimal;

public class ApplicationService {

    /**
     * Отправляем заявку на одобрение менеджером/вип-менеджером или директором и происходит процесс работы сотрудником с заявкой
     * @param application - заявка
     */
    public void sendOnApprove(Application application) {
        ManagerRole employee = new ManagerFactory().createManager(application.getCreditAmount());
        employee.review(application);
        employee.approve(application);
        employee.sign(application);

        System.out.println("Заявка на кредит была обработана, одобрена и подписана. ");
        System.out.println("Должность/подпись");
        System.out.println(application.getApprovedBy());
        System.out.println("________________________________________________________");
    }

    public void createAgreement(Application application) {
        System.out.println("Создаем договор по заявке " + application.getName());
    }
}