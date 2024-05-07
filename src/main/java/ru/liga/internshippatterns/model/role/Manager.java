package ru.liga.internshippatterns.model.role;

import ru.liga.internshippatterns.model.Application;
import ru.liga.internshippatterns.model.ApplicationStatus;

public class Manager implements ManagerRole {
    private final String fio;

    public Manager(String fio) {
        this.fio = fio;
    }

    @Override
    public void sign(Application application) {
        application.setApprovedBy("Менеджер: " + fio);
    }
}
