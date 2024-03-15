package Techademy;

import java.util.Scanner;

public class IT_Calculator {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int taxableIncome, taxPaidPerYear, taxPayablePerMonth;

        
        System.out.print("Enter Taxable Income: $");
        taxableIncome = scanner.nextInt();

       
        if (taxableIncome <= 25000) {
            
            taxPaidPerYear = 0;
        } else if (taxableIncome <= 50000) {
           
            taxPaidPerYear = taxableIncome * 10/100;
        } else if (taxableIncome <= 75000) {
           
            taxPaidPerYear = taxableIncome * 20/100;
        } else {
            
            taxPaidPerYear = taxableIncome * 30/100;
        }

        
        taxPayablePerMonth = taxPaidPerYear / 12;

       
        System.out.println("Tax Paid in a Year: $" + taxPaidPerYear);
        System.out.println("Tax Payable in a Month: $" + taxPayablePerMonth);

        scanner.close();
    }
}
