import java.util.*;
abstract class InsurancePolicy {
    private String policyNumber;
    private double contribution;

    public InsurancePolicy(String policyNumber, double contribution) {
        this.policyNumber = policyNumber;
        this.contribution = contribution;
    }
    public double getContribution() {
        return contribution;
    }
    public String getPolicyNumber() {
        return policyNumber;
    }


    public abstract double calculateContribution();

    @Override
    public String toString() {
        return "InsurancePolicy{" +
                "policyNumber='" + policyNumber + '\'' +
                ", contribution=" + contribution +
                '}';
    }
}
