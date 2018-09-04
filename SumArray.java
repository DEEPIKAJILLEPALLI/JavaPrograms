
public class SumArray {
	 int sum(int array[],int size)
	 {
		 int sum=0;
		 for(int i=0;i<size;i++) {
			 sum+=array[i];
		 }
		 return sum;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumArray obj=new SumArray();
 int array[]= {1,2,78,-1,0,7};
 int len=array.length;
 int sumOfArray=obj.sum(array,len);
 System.out.println("sum of array:"+sumOfArray);
	}

}
