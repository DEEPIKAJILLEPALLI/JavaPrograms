
public class OddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if(Integer.parseInt(args[0])==1) {
			for(int i=1;i<=Integer.parseInt(args[1]);i++) {
				if(i%2!=0) {
					System.out.println(i);
					
				}
			}
			
		}
		else {
			System.out.println("no. should start from 1");
		}
	}

}
