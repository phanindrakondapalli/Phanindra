
public class Unique {
	
	static int[] uniqueArr(int a[]){
		
		int n=a.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < a.length; j++) {


				if (a[i]==a[j]){
					a[j]=a[n-1];
					n--;
					j--;

				}
			}


		}
		int na[]=new int[n];
		for (int i = 0; i < n; i++) {
			na[i]=a[i];
		}
		return na;
	}
	public static void main(String[] args) {
		int ar[]={1,3,2,4,5,6,2};
		
	}

}
