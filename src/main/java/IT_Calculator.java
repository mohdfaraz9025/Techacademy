import java.util.Scanner;

public class IT_Calculator {

    private double taxableIncome;
    private double taxPaidPerYear;
    private double taxPayablePerMonth;

    public IT_Calculator() {
        // Default constructor
    }

    public void calculateTax() {
        Scanner scanner = new Scanner(System.in);

        // Read TaxableIncome using Scanner
        System.out.print("Enter Taxable Income: $");
        taxableIncome = scanner.nextDouble();

        // Calculate tax paid in a Year
        if (taxableIncome <= 25000) {
            taxPaidPerYear = 0;
        } else if (taxableIncome <= 50000) {
            taxPaidPerYear = taxableIncome * 0.10;
        } else if (taxableIncome <= 75000) {
            taxPaidPerYear = taxableIncome * 0.20;
        } else {
            taxPaidPerYear = taxableIncome * 0.30;
        }

        // Calculate tax payable in a Month
        taxPayablePerMonth = taxPaidPerYear / 12;

        // Print results
        System.out.println("Tax Paid in a Year: $" + taxPaidPerYear);
        System.out.println("Tax Payable in a Month: $" + taxPayablePerMonth);
        
        // Close the scanner to avoid resource leak
        scanner.close();
    }

    public static void main(String[] args) {
        IT_Calculator calculator = new IT_Calculator();
        calculator.calculateTax();
    }
}
