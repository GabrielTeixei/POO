package aula07.e1;

public class TournamentManger  extends tournament{
    private Player[] players;
    private int numPlayers;
    
    public TournamentManger(Player[] players, int numPlayers) {
        this.players = players;
        this.numPlayers = numPlayers;
    }

    public TournamentManger() {
        players = new Player[4];
        numPlayers = 0;
    }


    public void searchForPlayer(Player playerSearch) {

        for(int i = 0; i < numPlayers; i++){
            if(players[i].getID() == playerSearch.getID()){
                System.out.println(players[i].toString());
            }
        }

        if (verificarPlayer() == false) {
            System.out.println("Player not found");
        }
        

    }


    public void addPlayer(Player player) {
        if (numPlayers < 100) {
            players[numPlayers] = player;
            numPlayers++;
        }
    }

    public void removePlayer(Player player){
        for(int i = 0; i < numPlayers; i++){
            if(players[i].getID() == player.getID()){
                for(int j = i; j < numPlayers; j++){
                    players[j] = players[j+1];
                }
                numPlayers--;
            }
        }

    }

    public void printTournaments() {
        for (int i = 0; i < numPlayers; i++) {
            System.out.println(players[i].toString());
        }

    }

    public boolean nextRound() {
        if (numPlayers > 1) {
            return true;
        } else {
            return false;
        }
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    public int getNumPlayers() {
        return numPlayers;
    }

    public void setNumPlayers(int numPlayers) {
        this.numPlayers = numPlayers;
    }

    @Override
    public String toString() {
        return "TournamentManger [players=" + players + ", numPlayers=" + numPlayers + "]";
    }




}
