package consolidatedconditional.good;

public class Main {

    private double extraSalary;
    private int seniority;
    private int education;
    private int incidents;
    private boolean certification;

    double calculateExtraSalary() {
        double result = 0;

        if (!isEligibleExtraSalary()) {
           return result;
        }

        //Calculate extra salary
        //...
        return result;
    }

    private boolean isEligibleExtraSalary() {
        boolean studies = education >= 1 || certification;
        boolean jobPerformance = seniority >= 1 && incidents <= 10;

        return studies || jobPerformance;
    }
}
