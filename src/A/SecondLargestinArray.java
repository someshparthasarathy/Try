package A;

import java.util.Arrays;
import java.util.Iterator;

public class SecondLargestinArray {
    public static void main(String[] args) {
    	int arr[]=new int[] {101,502,52,33,34,25,502};//25,33,34,52,101,502,502
    	Arrays.sort(arr);
    	//for(int i=arr.length-1;i>=0;i--) {
    		System.out.println(arr[arr.length-2]);
    		//break;
    	//}
    	
    }
}

