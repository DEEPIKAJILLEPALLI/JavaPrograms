
public class LargeSmallCommandLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size=args.length;
		int a[]=new int[size];
		for(int i=0;i<size;i++) {
			a[i]=Integer.parseInt(args[i]);
		}
		LargeSmallCommandLine  obj=new LargeSmallCommandLine ();
		obj.MaxMIN(a, size);
	}
	void  MaxMIN(int a[],int s) {
		int min=a[0];
		int max=a[0];
		for(int i=1;i<s;i++) {
			if(a[i]>max) {
				max=a[i];
			}
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("MAX:"+max+" MIN:"+min);
	
	}
	

}
