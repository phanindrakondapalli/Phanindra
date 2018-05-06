import arrays.ArrayCombine;

public class OddEvenCount {
	static int[]evenOddCount(int ar[]){
		int c[]=new int[2];
		for (int i = 0; i < c.length; i++) {
			c[ar[i]%2]++;
		}
		System.out.println(c);
		return c;
	}
public static void main(String[] args) {
	ArrayCombine ao=new ArrayCombine();
	OddEvenCount oe=new OddEvenCount();
	System.out.println("enter the elements");
	int a[]=ao.readArr();
	oe.evenOddCount(a);
}
}
