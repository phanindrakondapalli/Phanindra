
public class DispCommon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]={1,2,3,4,6,10,0};
		int na[]={2,6,7,8,9,10};
		int n=ar.length;
		int y=na.length;
		for (int i = 0; i<n; i++){
			for (int j = 0; j <y; j++) {
				if(ar[i]==na[j])
				{
					System.out.print(ar[i]+" ");
				}
			}
		}
	}
}
