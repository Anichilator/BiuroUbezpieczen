public class HealthInsurancePolicy extends InsurancePolicy {
    private int coverage;

    public HealthInsurancePolicy(String policyNumber, double premium, int coverage) {
        super(policyNumber, premium);
        this.coverage = coverage;
    }
    @Override
    public double calculatePremium() {
        return getPremium() * 0.1 * coverage;
    }
}