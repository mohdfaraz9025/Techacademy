package training;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Generics{
	
static Scanner sc= new Scanner(System.in);


static String str= sc.nextLine();

static String[] sr= str.split(" ");
static String rev="";
static String rev2="";
	
	
	public static String reverse() {
		for(int i=sr[0].length()-1;i>=0;i--) {
			
			rev= rev+sr[0].charAt(i);
			
		}
		
		for(int i=sr[1].length()-1;i>=0;i--) {
			
			rev2=rev2+sr[1].charAt(i);
		}
		
	return rev +" "+ rev2;
	}
	

public static void main(String[] args) {
	
System.out.println(Generics.reverse());


}
}

