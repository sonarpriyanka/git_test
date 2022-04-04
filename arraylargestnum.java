package Javapractice;

import java.util.Arrays;

public class arraylargestnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*Method one */
//		int a1[]= {60,70,80,100,2,20};
//		int len =a1.length;
//		Arrays.sort(a1);
//		System.out.println("smallest number in array is "+a1[0]);
//		
/*method 2*/
	
int[] array1= {30,40,1000,1,7};
int[] array2= {30,40,81,16,702,0,3};

System.out.println("smallest number from array 1 is "+largestnumber(array1));
System.out.println("smallest number from array 2 is "+largestnumber(array2));


//reversing an array 

int length=array2.length;
for (int i=length-1;i>=0;i--) {
	System.out.println(array2[i]+" ");
	
}

	}


static int largestnumber(int arr[]) {
	int temp;
	for(int i=0;i<=arr.length;i++) {
		
		for(int j=i+1;j<arr.length;j++) {
			
			if (arr[i]>arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}						
		}
	}
	return arr[0];
}








}
