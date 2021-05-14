package com.company.raceGame.raceGame;

/**
 * Class GameHandler that handles game (start, restart, end) and handles car movement (go, turn, stop, showing speed)
 * @author Rodion Ibragimov
 * @version 3.228
 */
public class GameHandler {
    /**
     * Results results that shows results after the race
     */
    private Results results = new Results();
    /**
     * GameCreating gameCreating that returns number of players, cars and track
     */
    private GameCreating gameCreating = new GameCreating();

    /**
     * Function that starts game
     */
    private void startGame() {

    }

    /**
     * Function that ends game
     */
    private void endGame() {

    }

    /**
     * Function that restarts game
     */
    private void restartGame() {

    }

    /**
     * Function that makes the car go forward
     */
    private void go() {

    }

    /**
     * Function that makes the car stop
     */
    private void stop() {

    }

    /**
     * Function that makes the car turn
     */
    private void turn() {

    }

    /**
     * Getter that shows speed of the car
     */
    private void getSpeed() {

    }

    /**
     * main function
     * @param args
     */
    public static void main(String[] args) {
        GameHandler gameHandler = new GameHandler();
        gameHandler.startGame();
        gameHandler.gameCreating.setPlayers();
        gameHandler.gameCreating.setTrack();
        gameHandler.gameCreating.setCar();
        gameHandler.results.getPosition();
        gameHandler.results.getTime();
        gameHandler.getSpeed();
        gameHandler.go();
        gameHandler.turn();
        gameHandler.stop();
        gameHandler.endGame();
        gameHandler.restartGame();
    }

}


