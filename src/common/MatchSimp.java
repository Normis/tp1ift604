package common;

public class MatchSimp {
	private String equipeV;
	private String equipeD;

	public MatchSimp(int numero, String equipeV, String equipeD) {
		this.equipeV = equipeV;
		this.equipeD = equipeD;
	}
	
	public String getHomeTeam(){
		return equipeD;
	}
	
	public String getAwayTeam(){
		return equipeV;
	}
	
	public String getTeamName(){
		return equipeV + "\n" + equipeD;
	}
}
