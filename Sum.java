
public class Sum {
	void pair(int ar[],int br[],int n){

		for (int i = 0; i < ar.length; i++) {
			for (int j = i+1; j < br.length; j++) {
				if(ar[i]+br[j]==n){
					System.out.println("the sum of equal to "+n+" are "+ar[i]+","+br[j]);
				}
			}
		}
	}
	public static void main(String[] args) {
		Sum s=new Sum();
		int ar[]={1,2,15,12};
		int br[]={1,2,3,4,5,6,7,8};
		s.pair(ar,br, 8);
	}         
}

