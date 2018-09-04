
public class MaxCmmdArg {
	void max(int a[],int s) {
		int max=a[0];
		for(int i=1;i<s;i++) {
			if(a[i]>max) {
				max=a[i];
			}
	}
		System.out.println(max);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size=args.length;
		int a[]=new int[size];
		for(int i=0;i<size;i++) {
			a[i]=Integer.parseInt(args[i]);
		}
		MaxCmmdArg  obj=new MaxCmmdArg();
		obj.max(a, size);
	}

}
