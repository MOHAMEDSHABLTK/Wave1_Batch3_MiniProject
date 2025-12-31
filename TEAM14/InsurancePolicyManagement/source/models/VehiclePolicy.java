package models;

public class VehiclePolicy extends Policy {
    private String vehicleType;

    public VehiclePolicy(int policyId, String holderName, String vehicleType) {
        super(policyId, holderName);
        this.vehicleType = vehicleType;
    }

    @Override
    public void calculatePremium() {
        premium = vehicleType.equalsIgnoreCase("Car") ? 3000 : 2000;
    }
}
