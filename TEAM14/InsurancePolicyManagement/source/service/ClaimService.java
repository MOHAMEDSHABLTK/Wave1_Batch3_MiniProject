package service;

import java.util.*;
import exception.InvalidClaimException;
import models.*;

public class ClaimService {
    private List<Claim> claims = new ArrayList<>();

    public void submitClaim(Claim claim) throws InvalidClaimException {
        if (claim == null) {
            throw new InvalidClaimException("Claim cannot be null");
        }
        claims.add(claim);
    }

    public List<Claim> getAllClaims() {
        return claims;
    }
}
