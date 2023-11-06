import java.util.*;
public class HealthInsurancePolicy extends InsurancePolicy {
    private int coverage;

    public HealthInsurancePolicy(String policyNumber, double contribution, int coverage) {
        super(policyNumber, contribution);
        this.coverage = coverage;
    }
    @Override
    public double calculateContribution() {
        return getContribution() * 0.1 * coverage;
    }
}