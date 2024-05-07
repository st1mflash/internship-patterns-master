package ru.liga.internshippatterns.model.role;

import ru.liga.internshippatterns.model.Application;
import ru.liga.internshippatterns.model.ApplicationStatus;

public class Director implements ManagerRole   {
    private final String fio;

    public Director(String fio) {
        this.fio = fio;
    }

    @Override
    public void sign(Application application) {
        application.setApprovedBy("Директор филиала: " + fio);
    }
}
