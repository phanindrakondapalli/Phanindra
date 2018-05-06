
public class Union {
	public static void main(String[] args) {
		int ar[]={1,2,3,4,6,10,0};
		int na[]={2,6,7,8,9,10};
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]+" ");
		}
		for (int i = 0; i < na.length; i++) {
			int f=0;
			for (int j = 0; j < ar.length; j++) {
				if(na[i]==ar[j]){
					f=1;
					break;
				}

			}
			if(f==0)
				System.out.println(na[i]+" ");
		}
	}
}
