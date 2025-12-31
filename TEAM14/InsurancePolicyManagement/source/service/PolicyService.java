package service;

import java.util.*;
import models.Policy;
import exception.PolicyNotFoundException;

public class PolicyService {
    private Map<Integer, Policy> policyMap = new HashMap<>();

    public void addPolicy(Policy policy) {
        policy.calculatePremium();
        policyMap.put(policy.getPolicyId(), policy);
    }

    public Policy getPolicy(int policyId) throws PolicyNotFoundException {
        if (!policyMap.containsKey(policyId)) {
            throw new PolicyNotFoundException("Policy not found with ID: " + policyId);
        }
        return policyMap.get(policyId);
    }
}
