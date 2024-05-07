package ru.liga.internshippatterns.model.role;

import ru.liga.internshippatterns.model.Application;

public class VipManager extends Employee {
    private final String fio;

    public VipManager(String fio) {
        this.fio = fio;
    }

    @Override
    public void signApplication(Application application) {
        application.setApprovedBy("Менеджер VIP клиентов: " + fio);
    }
}
