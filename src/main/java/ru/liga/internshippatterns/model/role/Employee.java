package ru.liga.internshippatterns.model.role;

import ru.liga.internshippatterns.model.Application;
import ru.liga.internshippatterns.model.ApplicationStatus;

public abstract class Employee {
    protected abstract void signApplication(Application application);

    public final void handlingApplication(Application application) {
        reviewApplication(application);
        approveApplication(application);
        signApplication(application);
    }

    private void reviewApplication(Application application) {
        application.setStatus(ApplicationStatus.PROCESSING);
    }

    private void approveApplication(Application application) {
        application.setStatus(ApplicationStatus.APPROVED);
    }
}
