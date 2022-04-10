package SolutionCode;

import java.util.Scanner;

public class Question1{
	public int[] getInput(Scanner input) {
		//Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the size of transaction array");
		int i = input.nextInt();
		int[] values = new int[i];
		
		System.out.println("Enter the values of array");
		for(int j=0;j<i;j++) {
			values[j] = input.nextInt();
		}
				
		//input.close();
		
		return values;
	}
	
	public void calculate(int target, int[] values) {
		int sum = 0;
		for(int i = 0; i<values.length; i++) {
			sum += values[i];
			if(sum>=target) {
				System.out.println("Target acheived after "+(i+1)+" transactions");
				break;
			}
		}
		
		if(sum<target) {
			System.out.println("Given target is not acheived");
		}
	}
	
	public void execute(Scanner input) {		
		//Scanner input = new Scanner(System.in);
		
		int[] values = getInput(input);

		
		System.out.println("Enter the no of targets that needs to be acheived");
		int i = input.nextInt();
		
		for(int j=0; j<i; j++) {
			System.out.println("Enter the value of target");
			int target = input.nextInt();
			calculate(target, values);
		}
		
		//input.close();
	}

}
