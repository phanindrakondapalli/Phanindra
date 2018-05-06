import java.util.Scanner;

public class Delete {
	static int[]  deleteArr(int ar[],int in){
		if(in<0||in>ar.length){
			System.out.println("not valid");
			return  null;
		}
		int na[]=new int[ar.length-1];
		for (int  i= 0; i < ar.length; i++) {
			if(i<in)
				na[i]=ar[i];
			else
				na[i]=ar[i+1];
		}
		return na;
	}

	public static void main(String[] args) {
		int a[]={1,2,3,4,5,6};
		int n=4;
		System.out.println(deleteArr(a, n));
		
	}
}
