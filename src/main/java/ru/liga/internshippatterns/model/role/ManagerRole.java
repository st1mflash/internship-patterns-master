package ru.liga.internshippatterns.model.role;

import ru.liga.internshippatterns.model.Application;
import ru.liga.internshippatterns.model.ApplicationStatus;

public interface ManagerRole {
    default void review(Application application) {
        application.setStatus(ApplicationStatus.PROCESSING);
    }
    default void approve(Application application) {
        application.setStatus(ApplicationStatus.APPROVED);
    }
    void sign(Application application);
}
