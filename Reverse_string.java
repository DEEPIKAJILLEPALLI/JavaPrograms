import java.util.Scanner;

public class Reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String word=sc.nextLine();
		int len=word.length();
		System.out.print("REVERSE OF WORD "+word+" is ");
		for(int i=len-1;i>=0;i--) {
			System.out.print(word.charAt(i));
		}
	}

}
