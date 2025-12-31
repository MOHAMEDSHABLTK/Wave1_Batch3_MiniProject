package models;

public class Claim {
    private int claimId;
    private int policyId;
    private String status;

    public Claim(int claimId, int policyId) {
        this.claimId = claimId;
        this.policyId = policyId;
        this.status = "Submitted";
    }

    public int getPolicyId() {
        return policyId;
    }

    public String getStatus() {
        return status;
    }

    public int getClaimId() {
        return claimId;
    }

    public void approve() {
        status = "Approved";
    }
}
