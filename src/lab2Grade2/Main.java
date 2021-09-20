package lab2Grade2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int array[];
//		int target;
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter ethe size of transaction array");
	    int size =sc.nextInt();
	    int[] transaction =new int[size];
	    
	    for(int i=0;i<size;i++) {
	    	System.out.println("enter"+i+1+"element");
	    	transaction[i]=sc.nextInt();
	    }
	    System.out.println("eneter the tareget");
	    int target =sc.nextInt();
	    PayMoney paymoney=new PayMoney();
	    int no_of_days=paymoney.no_of_days(transaction,target);
	    if(no_of_days==-1)
	    	System.out.println("target is not achive");
	    else {
	    	System.out.println("target is achive in"+no_of_days);
	    }
	    
	}

}
