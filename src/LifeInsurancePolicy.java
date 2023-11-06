import java.util.*;
public class LifeInsurancePolicy extends InsurancePolicy {
    private int coverage;

    public LifeInsurancePolicy(String policyNumber, double contribution, int coverage) {
        super(policyNumber, contribution);
        this.coverage = coverage;
    }

    @Override
    public double calculateContribution() {
        return getContribution() * 0.05 * coverage;
    }
}