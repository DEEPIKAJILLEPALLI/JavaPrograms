import java.util.Scanner;

public class Char_existsINWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String word=sc.nextLine();
		char ch=sc.next().charAt(0);
		int len=word.length();
		int cnt=0;
		for(int i=0;i<len;i++) {
			if(word.charAt(i)==' ') {
				i++;
			}
			if(word.charAt(i)==ch) {
				cnt++;
			}
		}
		if(cnt>0) {
			System.out.println("no. of charcters  "+ch+"found in word "+word+" is "+cnt);
		}
		else {
			System.out.println("NO single character found");
		}
	}

}
