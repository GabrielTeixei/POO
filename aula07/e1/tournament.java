package aula07.e1;

public class tournament implements ITournamentManager{

    private Player[] players;
    private int numPlayers;
    private Player player;
        
    public tournament() {
        players = new Player[4];
        numPlayers = 0;
    }

    public void addPlayer(Player player) {
        if (numPlayers <= 100) {
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

    public boolean verificarPlayer(){
        for(int i = 0; i < numPlayers; i++){
            
            if(players[i].getID() == player.getID()){
                return true;
            }
        }
        return false;
        
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
    
    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    @Override
    public String toString() {
        return "tournament [numPlayers=" + numPlayers + ", player=" + player + ", players=" + players + "]";
    }

    @Override
    public Player searchForPlayer(String nome) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'searchForPlayer'");
    }

    @Override
    public Player searchForPlayer(int ID) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'searchForPlayer'");
    }
   


     
    
    


}
