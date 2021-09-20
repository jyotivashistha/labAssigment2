package problem2;

public class MergeSort {

	public void sort(int[] notes,int left ,int right) {
        if(left<right) {
	int mid=(left+right)/2;
	
	sort(notes,left,mid);
	sort(notes,mid+1,right);
	
	merge(notes,left,mid,right);
    }
	}

	private void merge(int[] notes, int left, int mid, int right) {
		// TODO Auto-generated method stub
		int n1=mid-left+1;
		int n2=right-mid;
		
		int leftArray[]=new int[n1];
		int rightArray[]=new int[n2];
		
		for(int i=0;i<n1;i++) {
			leftArray[i]=notes[left+1];
		}
		for(int i=0;i<n1;i++) {
			leftArray[i]=notes[mid+1+i];
		}
		
		int i=0, j=0;
		int k=left;
		
		
		while(i<n1 && j<n2) {
			if(leftArray[i]>=rightArray[j]) {
				notes[k]=leftArray[i];
				i++;
			}
			else {
				notes[k]=rightArray[j];
				j++;
			}
			k++;
		}
		while(i<n1) {
			notes[k]=leftArray[i];
			i++;
			k++;
		}
		while(j<n1) {
			notes[k]=rightArray[i];
			j++;
			k++;
		}
	}


}
