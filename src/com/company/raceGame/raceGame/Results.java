package com.company.raceGame.raceGame;

import java.time.LocalTime;

/**
 * Class Results that counting all results and showing them
 * @author Rodion Ibragimov
 * @version 2.228
 */
public class Results {
    /**
     * LocalTime now - time method
     */
    private LocalTime now = LocalTime.now();

    /**
     * Setter position of the racer
     * @param position - position of the racer
     * @return position - position of the racer
     */
    private int setPosition(int position) {

        return position;
    }

    /**
     * Setter time that racer spent on the race
     * @param time - time that racer spent on the race
     * @return time - time that racer spent on the race
     */
    private int setTime(int time) {

        return time;
    }

    /**
     * Getter that shows position of the racer
     */
    public void getPosition() {
        setPosition(0);
    }

    /**
     * Getter that shows time that racer spent on the race
     */
    public void getTime() {
        setTime(now.getSecond());

    }

}
