package ca.prog1400;

/*
    Author : Woojin Oh
    Date : Jan. 28, 2019
    Description : PROG1400 ASSIGNMENT 1 - Fantasy Hockey
    File name : Player.java
*/

public class Player {
    // Variables or properties
    String playerName;
    int playerGoals;
    int playerAssists;
    int playerToTalScores;

    // Constuctors
    public Player(String inputPlayerName, int inputPlayerGoals, int inputPlayerAssists) {
        this.playerName = inputPlayerName;
        this.playerGoals = inputPlayerGoals;
        this.playerAssists = inputPlayerAssists;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
    public int getPlayerGoals() {
        return playerGoals;
    }

    public void setPlayerGoals(int playerGoals) {
        this.playerGoals = playerGoals;
    }

    public int getPlayerAssists() {
        return playerAssists;
    }

    public void setPlayerAssists(int playerAssists) {
        this.playerAssists = playerAssists;
    }

    // Get player total scores
    public int getPlayerToTalScores() {
        playerToTalScores = playerGoals + playerAssists;
        return playerToTalScores;
    }

    public void setPlayerToTalScores(int playerToTalScores) {
        this.playerToTalScores = playerToTalScores;
    }

    // output function
    public void outputPlayerDetails(String inputTeamName) {
        System.out.println(String.format("\n%s", inputTeamName));
        System.out.println(String.format("\n%-20s: G - %-10d A - %-10d Total - %d", playerName, playerGoals, playerAssists, getPlayerToTalScores()));
    }
}
