package ru.liga.internshippatterns.model.role;

import ru.liga.internshippatterns.model.Application;

public class Manager extends EmployeeManager {
    private final String fio;

    public Manager(String fio) {
        this.fio = fio;
    }

    @Override
    public void signApplication(Application application) {
        application.setApprovedBy("Менеджер: " + fio);
    }
}
