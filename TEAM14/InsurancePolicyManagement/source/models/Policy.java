package models;

public abstract class Policy {
    protected int policyId;
    protected String holderName;
    protected double premium;

    public Policy(int policyId, String holderName) {
        this.policyId = policyId;
        this.holderName = holderName;
    }

    public int getPolicyId() {
        return policyId;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getPremium() {
        return premium;
    }

    public abstract void calculatePremium();
}
