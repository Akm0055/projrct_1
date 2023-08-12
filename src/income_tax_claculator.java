/*
for income less than 2.5l  = 0% tax
for income 2.5-5 = 5% tax
for income 5-10 = 20% tax
for income greater than 10 = 30%
 */
import java.util.Scanner;
public class income_tax_claculator {
    public static void main(String[] args) {
        System.out.println("enter your income per annum");
        Scanner sc = new Scanner(System.in);
        float income = sc.nextFloat();
        float tax=0;
        if (income <= 2.5f ){
            tax=0;
        }
        else if (income >2.5f && income <= 5f) {
            tax += 0.05f * (income - 2.5f);
        }
        else if (income > 5f && income <=10f){
            tax += 0.05f * (income - 2.5f);
            tax += 0.2f * (income - 5f);
        }
        else if (income >10f){
            tax = tax + 0.05f * (income - 2.5f);
            tax = tax + 0.2f * (income - 5f);
            tax = tax + 0.3f * (income - 10f);
        }
        System.out.println("ur income tax is : "+tax+"lakhs");
    }


}
