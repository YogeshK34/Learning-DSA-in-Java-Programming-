package sample_programs;

public class Compound_Interest {
    public static void main(String[] args) {
        // to calculate compound interest formula: principal * (Math.pow((1 + interestRate / 100), timePeriod) - 1)
        double principal = 5000;                  //(in rupees)
        double rate_of_interest = 30;             //(in percentage)
        double time_period = 2;                   //(in years)
        double total_interest = (principal * (Math.pow((1 + rate_of_interest/100),time_period)-1));
        double compound_interest = (principal + total_interest);
        System.out.print("Compound Interest is: "+compound_interest);
    }
}
