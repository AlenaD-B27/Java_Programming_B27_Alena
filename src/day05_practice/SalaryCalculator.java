package day05_practice;

public class SalaryCalculator {
    public static void main(String[] args) {

//        declare and assign these variables:
//
//        salary, stateTaxRate, federalTaxRate,  stateTax, federalTax, totalTax, salaryAfterTax
//
//        Sample data:
//        100000 (salary)
//                0.08 (state tax rate)
//        0.21 (federal tax rate)
//
//        Hint: use tax rates of 0.08 and 0.21 for 8% and 21%
//
//                Print the tax rates, your total salary, the amount of tax for state and federal, the total tax amount, and your salary after all taxes
//                ____________________________________________________________

        double salary = 100_000;
        double stateTax = 0.08, federalTaxRate = 0.21;
        double totalTax = salary*(stateTax+federalTaxRate);
        double salaryAfterTax = salary-totalTax;

        System.out.println("salary = " + salary);

        System.out.print("State tax rate = ");
        System.out.print(stateTax*100);
        System.out.println('%');

        System.out.print("Federal tax rate = ");
        System.out.print(federalTaxRate*100);
        System.out.println('%');

        System.out.println("salaryAfterTax = " + salaryAfterTax);



    }
}
