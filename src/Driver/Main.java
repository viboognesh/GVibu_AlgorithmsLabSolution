package Driver;

import java.util.Scanner;
import SolutionCode.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Select the question you want to execute:");
		System.out.println("1. Question 1");
		System.out.println("2. Question 2");
		
		int choice = sc.nextInt();
		
		if(choice == 1) {
			Question1 q1 = new Question1();
			q1.execute(sc);
		}
		else if(choice == 2) {
			Question2 q2 = new Question2();
			q2.execute(sc);
		}
		
		sc.close();	
	}

}
