package ru.liga.internshippatterns.model.role;

import ru.liga.internshippatterns.model.Application;
import ru.liga.internshippatterns.model.ApplicationStatus;

public interface ManagerRole {
    default public void review(Application application) {
        application.setStatus(ApplicationStatus.PROCESSING);
    }

    default public void approve(Application application) {
        application.setStatus(ApplicationStatus.APPROVED);
    }
    public void sign(Application application);
}
