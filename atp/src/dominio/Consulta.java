package dominio;

public class Consulta {
	private int tournament_id;
	private String court;
	private String surface;
	private int roundImp;
	private int bestOf;
	private int player0;
	private int player1;
	private int winner;

	public void setTournament(int tournament) {
 	   this.tournament = tournament;
    }

    public int getTournament() {
        return tournament;
    }

	public void setCourt(String court) {
 	   this.court = court;
    }

    public String getCourt() {
        return court;
    }

    public void setSurface(String surface) {
 		this.surface = surface;
    }

    public String getSurface() {
        return surface;
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

    public void setPlayer0(String player0) {
 		this.player0 = player0;
 	}

    public int getPlayer0() {
    	return player0;
    }

    public void setPlayer1(String player1) {
    	this.player1 = player1;
    }

    public int getPlayer1() {
        return player1;
    }

    public void setWinner(int winner) {
 	   	this.winner = winner;
    }

    public int getWinner() {
        return winner;
    }

    public Consulta(String tournament, String court, String surface, int roundImp, int bestOf, int player0, int player1, int winner){
    	this.tournament = tournament;
    	this.court = court;
    	this.surface = surface;
    	this.roundImp = roundImp;
    	this.bestOf = bestOf;
    	this.player0 = player0;
    	this.player1 = player1;
    	this.winner = winner;
    }

    @Override
    public String toString() {
        return getTournament() + "," + getCourt() + "," + getSurface() + "," + getRoundImp() + "," + getBestOf() + "," + 
            getPlayer0() + "," + getPlayer1() + "?" + "\n%\n%";
    }
}