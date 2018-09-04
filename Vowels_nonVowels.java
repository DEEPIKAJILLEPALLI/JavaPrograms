import java.util.Scanner;

public class Vowels_nonVowels {
  int cnt=0,cntv=0;
  int vowel_valid(String str,int len) {
	
	  for(int i=0;i<len;i++) {
		  if (str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
		  {
			  cntv++;
		  }
		  if(str.charAt(i)=='\0' ||str.charAt(i)==' ') {
			 return(0);
			
		  }
		  
	  }
	  return(cntv);
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vowels_nonVowels  obj=new Vowels_nonVowels();
		Scanner sc=new Scanner(System.in);
	String str=sc.next();
	  int len=str.length();
	int nvlen=len-(obj.vowel_valid(str,len));
	if((obj.cntv>nvlen) ){
		System.out.println("vowels greater");
	}
	else if((nvlen>obj.cntv) ) {
		System.out.println("Nonvowels greater");
	}
	else if(obj.cntv==nvlen) {
		System.out.println("both equal");
	}
	else {
		System.out.println("other than characters found");
	}
	}

}
