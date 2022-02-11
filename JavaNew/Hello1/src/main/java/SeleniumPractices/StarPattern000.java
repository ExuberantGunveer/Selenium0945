package SeleniumPractices;

import java.util.Scanner;

import net.jodah.failsafe.internal.util.Assert;

public class StarPattern000 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter The Number Of Rows : ");
		int rows = sc.nextInt();
		
		for(int i = 1 ; i<=rows;i++ ) {
			for(int j =1;j<=i;j++) {
				System.out.print(" * ");
			}
			System.out.println(" ");
		}
		
		for(int i =1;i<=rows-1;i++) {
			for(int j=rows-1;j>=i;j--) {
				System.out.print(" * ");
				
			}
			System.out.println(" ");
			
		}
		
		
	}

}
