package ru.liga.internshippatterns.model.role;

import ru.liga.internshippatterns.model.Application;
import ru.liga.internshippatterns.model.ApplicationStatus;

public class VipManager {
    private final String fio;

    public VipManager(String fio) {
        this.fio = fio;
    }

    public void review(Application application) {
        application.setStatus(ApplicationStatus.PROCESSING);
    }

    public void approve(Application application) {
        application.setStatus(ApplicationStatus.APPROVED);
    }

    public void sign(Application application) {
        application.setApprovedBy("Менеджер VIP клиентов: " + fio);
    }
}
