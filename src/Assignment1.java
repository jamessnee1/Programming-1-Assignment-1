import java.util.Scanner;
public class Assignment1 {
	
	public static void main(String [] args){
		//Declaring input Scanner, and doubles of all the variables and prompting the user for values
		
				Scanner userInput = new Scanner(System.in);
				double initialDeposit, interestRate, monthlyInterestRate, monthlyDeposit, newAccountBalance, interest;
				System.out.printf("Enter your initial deposit amount in dollars: ");
				initialDeposit = userInput.nextDouble();
				System.out.printf("Enter the annual interest rate as a percentage: ");
				interestRate = userInput.nextDouble();	
				System.out.printf("Enter your monthly deposit amount in dollars: ");
				monthlyDeposit = userInput.nextDouble();
				System.out.println("\nSavings growth over the next 6 months:\n");
				
		//Adding the initial deposit and the monthly deposit to get the current balance
				
				newAccountBalance = initialDeposit + monthlyDeposit;
				
		//Calculate interest rate per month
				
				monthlyInterestRate = interestRate / 12;
				
		//Calculate interest on the new account balance
				
				interest = monthlyInterestRate * newAccountBalance / 100;
				newAccountBalance = interest + newAccountBalance;
				System.out.printf("Balance after first month: $%.2f", newAccountBalance);
				System.out.printf("\nInterest earned for this month: $%.2f\n", interest);
				
		//Calculate interest on the new account balance, month 2
				
				newAccountBalance = monthlyDeposit + newAccountBalance;
				interest = monthlyInterestRate * newAccountBalance / 100;
				newAccountBalance = interest + newAccountBalance;
				System.out.printf("\nBalance after second month: $%.2f", newAccountBalance);
				System.out.printf("\nInterest earned for this month: $%.2f\n", interest);
				
		//Calculate interest on the new account balance, month 3
				
				newAccountBalance = monthlyDeposit + newAccountBalance;
				interest = monthlyInterestRate * newAccountBalance / 100;
				newAccountBalance = interest + newAccountBalance;
				System.out.printf("\nBalance after third month: $%.2f", newAccountBalance);
				System.out.printf("\nInterest earned for this month: $%.2f\n", interest);
				
		//Calculate interest on the new account balance, month 4
				
				newAccountBalance = monthlyDeposit + newAccountBalance;
				interest = monthlyInterestRate * newAccountBalance / 100;
				newAccountBalance = interest + newAccountBalance;
				System.out.printf("\nBalance after fourth month: $%.2f", newAccountBalance);
				System.out.printf("\nInterest earned for this month: $%.2f\n", interest);
				
        //Calculate interest on the new account balance, month 5
				
				newAccountBalance = monthlyDeposit + newAccountBalance;
				interest = monthlyInterestRate * newAccountBalance / 100;
				newAccountBalance = interest + newAccountBalance;
				System.out.printf("\nBalance after fifth month: $%.2f", newAccountBalance);
				System.out.printf("\nInterest earned for this month: $%.2f\n", interest);
		
		//Calculate interest on the new account balance, month 6
				
				newAccountBalance = monthlyDeposit + newAccountBalance;
				interest = monthlyInterestRate * newAccountBalance / 100;
				newAccountBalance = interest + newAccountBalance;
				System.out.printf("\nBalance after sixth month: $%.2f", newAccountBalance);
				System.out.printf("\nInterest earned for this month: $%.2f\n", interest);
				
				
	}
	
}
	