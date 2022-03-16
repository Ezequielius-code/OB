package consolidatedduplicate.good;

public class Main {

    private double extraSalary;
    private int seniority;
    private int education;
    private int incidents;
    private boolean certification;

    double calculateExtraSalary(){
        double result = 0;

        if(isEligibleExtraSalary()){
            result = 500;
        }else{
            result = 0;
        }
        sendMessage();
        return result;
    }

    private void sendMessage() {
        // send email
        // connect smtp
        System.out.println("Sending message");
    }

    private boolean isEligibleExtraSalary() {
        boolean studies = education >= 1 || certification;
        boolean jobPerformance = seniority >= 1 && incidents <= 10;

        return studies || jobPerformance;
    }
}
