
class ScoreBoardDemo {
	int convertovers_balls(float overs) {
		int overs_last=(int)(overs*10)%10;
		int balls_first=(int)overs;
		return((balls_first*6)+overs_last);
		
		
		
	}
	public float Runrate(float overs,int runs) {
		return(runs/overs);
	}
	public void displayOutput(int reqRuns,float remng_overs) {
		int balls=convertovers_balls(remng_overs);
		float runrate=Runrate(remng_overs,reqRuns);
		if(reqRuns<100||balls<100) {
			System.out.println(reqRuns+"runs "+"\n"+balls+"balls "+"runrate "+runrate );
		}
		else {
			System.out.println(reqRuns+"runs "+"\n"+remng_overs+"balls "+"runrate "+runrate );
		}
	}
}
public class ScoreBoard{
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int requireruns=Integer.parseInt(args[0]);
		float remngovers=Float.parseFloat(args[1]);
		 ScoreBoardDemo scoreboard=new  ScoreBoardDemo();
		 scoreboard.displayOutput(requireruns, remngovers);
		

	}

}
