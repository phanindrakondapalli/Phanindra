
public class MostFrequent {
	static int nthFrequent(int ar[]){

		int n=ar.length;
		int mo=ar[0];
		int mc=1;
		for (int i = 0; i <n; i++) {
			int	c=1;
			for (int j = i+1; j <n; j++) {
				if(ar[i]==ar[j]) 
				{
					c++;
				}
			}
 
			if(c>mc){
				mo=ar[i];
				mc=c;

			}
		}
		System.out.println(mo+" occured "+mc+" times");
		return mc;
	}
	public static void main(String[] args) {
		int ar1[]={22,11,23,11,15,19,11};
		nthFrequent(ar1);
	}
}
