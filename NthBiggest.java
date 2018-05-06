import java.util.Scanner;

public class NthBiggest {
static int nthBiggest(int a[],int n){
	for (int i = 0; i < a.length; i++) {
		int count=0;
		for (int j = 1; j < a.length; j++) {
			if(a[i]<a[j])
				count++;
		}
		if(count==n-1)
			return a[i];
	}
	return 0;
}
public static void main(String[] args) {
	int ar[]={1,2,3,4,5,6};
	int n=2;
	System.out.println(nthBiggest(ar, n));
}
}
