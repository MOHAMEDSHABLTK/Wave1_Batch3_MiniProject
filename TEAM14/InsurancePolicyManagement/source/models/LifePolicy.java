package models;


public class LifePolicy extends Policy {
    private int age;

    public LifePolicy(int policyId, String holderName, int age) {
        super(policyId, holderName);
        this.age = age;
    }

    @Override
    public void calculatePremium() {
        premium = (age < 40) ? 5000 : 8000;
    }
}
