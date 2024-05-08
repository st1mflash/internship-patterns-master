package ru.liga.internshippatterns.model.role;

import ru.liga.internshippatterns.model.Application;

public class Director extends EmployeeManager {
    private final String fio;

    public Director(String fio) {
        this.fio = fio;
    }

    @Override
    public void signApplication(Application application) {
        application.setApprovedBy("Директор филиала: " + fio);
    }
}
