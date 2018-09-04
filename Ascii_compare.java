
public class Ascii_compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if(args[0].compareTo(args[1])>0) {
			System.out.println("FIRST STRING IS LARGE");
		}
		else if(args[1].compareTo(args[0])>0){
			System.out.println("second STRING IS LARGE");
		}
		else {
			System.out.println("both equal");
			
		}
	}

}
