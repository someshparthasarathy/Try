package A;

public class sumOfDigitinAnArray {

	public static void main(String[] args) {
		int[] ar=new int[] {5,5,100};
		int a=0;
		int b=0;
		int sum=0;
		for(int i=0;i<ar.length;i++) {
			a=a+ar[i];
		}
		System.out.println("Total:"+a);
		while(a>0) {
			b=a%10;
			sum=sum+b;
			a=a/10;
		}
		System.out.println(sum);
	}

}
