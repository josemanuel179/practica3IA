package dominio;

public class Consulta {
	private String court;
	private int roundImp;
	private int bestOf;
	private int player0;
	private int player1;

	public void setCourt(String court) {
 	   this.court = court;
    }

    public String getCourt() {
        return court;
    }

    public void setRoundImp(int roundImp) {
 	 	this.roundImp = roundImp;
    }

    public int getRoundImp() {
        return roundImp;
    }

    public void setBestOf(int bestOf) {
 		this.bestOf = bestOf;
    }

    public int getBestOf() {
        return bestOf;
    }

    public void setPlayer0(int player0) {
 		this.player0 = player0;
 	}

    public int getPlayer0() {
    	return player0;
    }

    public void setPlayer1(int player1) {
    	this.player1 = player1;
    }

    public int getPlayer1() {
        return player1;
    }

    public Consulta(String court, int roundImp, int bestOf, int player0, int player1){
    	this.court = court;
    	this.roundImp = roundImp;
    	this.bestOf = bestOf;
    	this.player0 = player0;
    	this.player1 = player1;
    }

    @Override
    public String toString() {
        return getCourt() + "," + getRoundImp() + "," + getBestOf() + "," + getPlayer0() + 
        "," + getPlayer1() + ",?" + "\n%\n%";
    }
}