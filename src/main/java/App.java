import java.util.Scanner;
/**
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Erica Joseph
 */
public class App {
    public static void main(String[] args) {
        //initiate scannner
        Scanner sc = new Scanner(System.in);
//input
        System.out.print("Enter the principle: ");
        double principle = sc.nextDouble();
        System.out.print("Enter the rate of interest: ");
        double intRate = sc.nextDouble();
        System.out.print("Enter the number of years: ");
        double years = sc.nextDouble();
//calculation
        //A = P(1 + rt)

        double intRateadj = intRate * .01;
        double invWorth = principle*(1+(intRateadj)*(years));
//output
        System.out.print("After "+ (int) years +" years at "+ (int)  intRate +"%, the investment will be worth $"+ (int) invWorth +".");
    }
}
