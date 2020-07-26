public class TaxCalculator{

public static void multiply(){
        int a, b, result;
        a=10;
        b=12;
        result= a * b;
        System.out.println("The result is: " + result);
    }
    
    public static void main(String[]args){
        multiply();
        float incomeInDollars, taxToPay, taxRate;

        incomeInDollars = 5000;
        taxRate = 0.15f;
        taxToPay = incomeInDollars * taxRate;
        System.out.println("Tax I'll have to pay:" + taxToPay);
        
    }
}