abstract class InsurancePolicy {
    private String policyNumber;
    private double premium;

    public InsurancePolicy(String policyNumber, double premium) {
        this.policyNumber = policyNumber;
        this.premium = premium;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public double getPremium() {
        return premium;
    }

    public abstract double calculatePremium();

    @Override
    public String toString() {
        return "Policy Number: " + policyNumber + ", Premium: " + premium;
    }
}