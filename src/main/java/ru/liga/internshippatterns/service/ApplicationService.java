package ru.liga.internshippatterns.service;

import ru.liga.internshippatterns.model.Application;
import ru.liga.internshippatterns.model.role.Director;
import ru.liga.internshippatterns.model.role.Manager;
import ru.liga.internshippatterns.model.role.VipManager;

import java.math.BigDecimal;

public class ApplicationService {

    /**
     * Отправляем заявку на одобрение менеджером/вип-менеджером или директором и происходит процесс работы сотрудником с заявкой
     * @param application - заявка
     */
    public void sendOnApprove(Application application) {
        if (application.getCreditAmount().compareTo(BigDecimal.valueOf(10000)) < 0) {
            Manager manager = new Manager("Иван Иванович ОбычныйМенеджер");
            manager.review(application);
            manager.approve(application);
            manager.sign(application);
        } else if (application.getCreditAmount().compareTo(BigDecimal.valueOf(50000)) < 0) {
            VipManager vipManager = new VipManager("Василий Константинович Випов");
            vipManager.review(application);
            vipManager.approve(application);
            vipManager.sign(application);
        } else {
            Director director = new Director("Борис Алексеевич Директоров");
            director.review(application);
            director.approve(application);
            director.sign(application);
        }

        System.out.println("Заявка на кредит была обработана, одобрена и подписана. ");
        System.out.println("Должность/подпись");
        System.out.println(application.getApprovedBy());
        System.out.println("________________________________________________________");
    }

    public void createAgreement(Application application) {
        System.out.println("Создаем договор по заявке " + application.getName());
    }
}