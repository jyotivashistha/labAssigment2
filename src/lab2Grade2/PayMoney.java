package lab2Grade2;

import java.util.Scanner;

public class PayMoney {

public int no_of_days(int[] transction,int target) {
	
	for(int i=0;i<transction.length;i++) {
		if(transction[i]==target || target<transction[i])
			return i+1;
		else {
			target=target - transction[i];
		}
	}
	return -1;
	
}
    
}
