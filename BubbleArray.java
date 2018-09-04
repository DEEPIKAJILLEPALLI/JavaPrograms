
public class BubbleArray {
int[] sortArray(int arr[],int n)
	{
		int temp;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		
		return arr;	
				
		}
		
		

	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		BubbleArray obj=new BubbleArray();
		int arr[]= {2,5,-1,0,7,3};
		int len=arr.length;
	 arr=obj.sortArray(arr,len);
		for(int i=0;i<len;i++) {
			System.out.println(arr[i]);
		}
		

	}

}
