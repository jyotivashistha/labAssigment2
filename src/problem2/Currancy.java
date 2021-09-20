package problem2;

import java.util.Scanner;

import lab2Grade2.PayMoney;

public class Currancy {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		Scanner sc=new Scanner (System.in);
       int size=sc.nextInt();
       int denomination[]=new int [size];
       for(int i=0;i<size;i++) {
    	   System.out.println("Enter the first denomination");
    	   denomination[i]=sc.nextInt();
       }
       System.out.println("eneter the tareget");
	    int target =sc.nextInt();
	    Currancy currancy=new Currancy();
	    int Number_Of_Demonination=currancy.Number_Of_Demonination(denomination, target);
	    if(Number_Of_Demonination==-1)
	    	System.out.println("target is not achive");
	    else {
	    	System.out.println("target is achive in"+Number_Of_Demonination);
	    }
       System.out.println("Enter the target price");
       int target1=sc.nextInt();
       
     
       
//	MergeSort ms=new MergeSort();
//	ms.sort(denomination, 0, denomination.length-1);
	}

	
	
	
	public int Number_Of_Demonination(int notes[],int amount) {
//		notes=sort[notes];
//		return -1;
		int noOfNodes=0;
		int[] noteCounter=new int[notes.length];
		
		try {
			for(int i=0;i<notes.length;i++) {
				if (amount>=notes[i]) {
					noteCounter[i]=amount/notes[i];
					noOfNodes+=amount/notes[i];
					amount=noteCounter[i]*notes[i];
				}
			}
			if(amount>0) {
				System.out.println("amount is not exact as highes domination");
			}
			else {
				System.out.println("payment approch min numbers notes will be");
			}
				for(int i=0;i<notes.length;i++) {
					if(noteCounter[i]!=0) {
						System.out.println(notes[i]+":"+noteCounter[i]);
					}
					
			}
		}
		catch(ArithmeticException e) {
			System.out.println(e+"notes of denomination 0 is invalid");
		}
		
		
		
	}
	

}
