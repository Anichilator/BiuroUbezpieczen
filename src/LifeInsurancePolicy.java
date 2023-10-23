public class LifeInsurancePolicy extends InsurancePolicy {
    private int coverage;

    public LifeInsurancePolicy(String policyNumber, double premium, int coverage) {
        super(policyNumber, premium);
        this.coverage = coverage;
    }

    @Override
    public double calculatePremium() {
        return getPremium() * 0.05 * coverage;
    }
}