package SolutionCode;

import java.util.Scanner;

public class Question2 {
	public int[] getDenominations(Scanner input) {
		//Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the size of currency denominations");
		int i = input.nextInt();
		
		int[] denominations = new int[i];
		
		System.out.println("Enter the currency denominations value");
		
		for(int j=0; j<i; j++) {
			int d = input.nextInt();  // get denomination value
			
			for(int k=0; k<j; k++) {     //check every denomination value
				if(d>denominations[k]) { //and keep swapping until it is in
					int swap = d;		 //descending order
					d = denominations[k];
					denominations[k] = swap;
				}
			}
			
			denominations[j] = d;
		}
		
		//input.close();
		
		return denominations;
	}
	
	public void calculate(int amount, int[] denominations) {
		for(int i=0; i<denominations.length; i++) {
			int n = amount / denominations[i];
			if(n!=0) {
				System.out.println(denominations[i]+":"+n);
				amount = amount % denominations[i];
			}
		}
	}
	
	public void execute(Scanner input) {		
		//Scanner input = new Scanner(System.in);
		
		int[] denominations = getDenominations(input);

		
		System.out.println("Enter the amount you want to pay");
		int amount = input.nextInt();
		
		calculate(amount, denominations);
		
		//input.close();
	}
}
