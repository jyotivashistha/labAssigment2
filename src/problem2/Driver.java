package problem2;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		Scanner sc=new Scanner (System.in);
       int size=sc.nextInt();
       int denomination[]=new int [size];
       for(int i=0;i<size;i++) {
    	   System.out.println("Enter the first denomination");
    	   denomination[i]=sc.nextInt();
       }
       System.out.println("Enter the target price");
       int target=sc.nextInt();
       Currancy currancy=new Currancy();
       currancy.Number_Of_Demonination(denomination, target);
       
   
	}

}
