import service.*;
import models.*;

public class Main {
    public static void main(String[] args) {
        PolicyService policyService = new PolicyService();
        ClaimService claimService = new ClaimService();

        try {
            Policy lifePolicy = new LifePolicy(101, "Haasini", 25);
            Policy vehiclePolicy = new VehiclePolicy(102, "Reddy", "Car");

            policyService.addPolicy(lifePolicy);
            policyService.addPolicy(vehiclePolicy);

            System.out.println("Life Policy Premium: " + lifePolicy.getPremium());
            System.out.println("Vehicle Policy Premium: " + vehiclePolicy.getPremium());

            Claim claim = new Claim(1, 101);
            claimService.submitClaim(claim);

            System.out.println("Claim Id: " + claim.getClaimId());

        
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

