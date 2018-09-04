
public class Anagram {

	void anagramFind(String s,String s1) {
		int l1=s.length();
		int len2=s1.length();
		int arr[]=new int[len2];
		 arr[len2-1]= 0;
		//int flag=0;
		if(l1==len2) {
			for(int i=0;i<l1;i++) {
				
				for(int j=0;j<len2;j++) {
					if(s.charAt(i)==s1.charAt(j)){
						arr[j]=1;
						break;
						
					}
				}
			}
			int cnt=0;
			for(int i=0;i<len2;i++)
				 {
				if(arr[i]==1)
					cnt++;
					
				}
		
		if(cnt==len2) {
			System.out.println("anagram");
		}
				else {
					System.out.println("Not anagram");
				}
			}
		else {
			System.out.println("String size should be same");
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anagram obj=new Anagram();
		obj.anagramFind(args[0], args[1]);
	}

}
