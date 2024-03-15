package assignment;

import java.util.Scanner;

public class AssignmentSelenium {

	
	
		
	public static void main(String[] args) {
		
		

		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the number of entries: ");
	        int n = sc.nextInt();
	        int[] arr1 = new int[n];
	        int[] arr2 = new int[n];
	        int[] arr3 = new int[n];
	        System.out.print("Enter " + n + " comma separated numbers for array 1: ");
	        String[] input1 = sc.next().split(",");
	        System.out.print("Enter " + n + " comma separated numbers for array 2: ");
	        String[] input2 = sc.next().split(",");
	        for (int i = 0; i < n; i++) {
	            arr1[i] = Integer.parseInt(input1[i]);
	            arr2[i] = Integer.parseInt(input2[i]);
	            arr3[i] = arr1[i] * arr2[i];
	        }
	        int sum = 0;
	        for (int i : arr3) {
	            sum += i;
	        }
	        System.out.println("The sum of all entries in Array3 is: " + sum);
	    }	
	
	
	}
	


