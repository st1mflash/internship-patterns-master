package ru.liga.internshippatterns.model;

import lombok.Getter;
import lombok.Setter;
import ru.liga.internshippatterns.model.role.ManagerRole;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
public class Application {
    private final String name;
    private final Client client;
    private BigDecimal creditAmount;
    private Integer creditTerm;
    private String product;
    private ApplicationStatus status;
    private String approvedBy;
    private String creditPurpose;
    private Double rate;
    private Double eir;

    public Application(String name, Client client, BigDecimal creditAmount, Integer creditTerm, String product, ApplicationStatus status, String approvedBy, String creditPurpose, Double rate, Double eir) {
        assert name != null;
        assert client != null;
        assert creditAmount != null;
        assert creditTerm != null;

        this.name = name;
        this.client = client;
        this.creditAmount = creditAmount;
        this.creditTerm = creditTerm;
        this.product = product;
        this.status = status;
        this.approvedBy = approvedBy;
        this.creditPurpose = creditPurpose;
        this.rate = rate;
        this.eir = eir;
    }

    private Application(ApplicationBuilder applicationBuilder) {
        this.name = applicationBuilder.name;
        this.client = applicationBuilder.client;
        this.creditTerm = applicationBuilder.creditTerm;
        this.creditAmount = applicationBuilder.creditAmount;
        this.product = applicationBuilder.product;
        this.status = applicationBuilder.status;
        this.approvedBy = applicationBuilder.approvedBy;
        this.creditPurpose = applicationBuilder.creditPurpose;
        this.rate = applicationBuilder.rate;
        this.eir = applicationBuilder.eir;
    }
    public static class ApplicationBuilder {
        private String name;
        private Client client;
        private BigDecimal creditAmount;
        private Integer creditTerm;
        private String product = "";
        private ApplicationStatus status = null;
        private String approvedBy = "";
        private String creditPurpose = "";
        private Double rate = 0D;
        private Double eir = 0D;

        public ApplicationBuilder(
                String name,
                Client client,
                BigDecimal creditAmount,
                Integer creditTerm
        ) {
            this.name = name;
            this.client = client;
            this.creditTerm = creditTerm;
            this.creditAmount = creditAmount;
        }

        public ApplicationBuilder name(String val) {
            this.name = val;
            return this;
        }

        public ApplicationBuilder client(Client val) {
            this.client = val;
            return this;
        }

        public ApplicationBuilder creditAmount(BigDecimal val) {
            this.creditAmount = val;
            return this;
        }

        public ApplicationBuilder creditTerm(Integer val) {
            this.creditTerm = val;
            return this;
        }

        public ApplicationBuilder product(String val) {
            this.product = val;
            return this;
        }

        public ApplicationBuilder status(ApplicationStatus val) {
            this.status = val;
            return this;
        }

        public ApplicationBuilder approvedBy(String val) {
            this.approvedBy = val;
            return this;
        }

        public ApplicationBuilder creditPurpose(String val) {
            this.creditPurpose = val;
            return this;
        }

        public ApplicationBuilder rate(Double val) {
            this.rate = val;
            return this;
        }

        public ApplicationBuilder eir(Double val) {
            this.eir = val;
            return this;
        }

        public Application build() {
            return new Application(this);
        }
    }
    @Override
    public String toString() {
        return "Application{" +
               "name='" + name + '\'' +
               ", client=" + client.getFio() +
               ", creditAmount=" + creditAmount +
               ", creditTerm=" + creditTerm +
               ", product='" + product + '\'' +
               ", status=" + status +
               ", approvedBy='" + approvedBy + '\'' +
               ", creditPurpose='" + creditPurpose + '\'' +
               ", rate=" + rate +
               ", eir=" + eir +
               '}';
    }
}
