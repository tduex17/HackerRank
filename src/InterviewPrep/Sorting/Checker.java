package InterviewPrep.Sorting;

import java.util.Comparator;

/**
 * A player of the game. Has a name and a score.
 */
class Player {

    public final String name;
    public final int score;

    /**
     * Constructor.
     *
     * @param name player name
     * @param score player score
     */
    Player(final String name, final int score) {
        this.name = name;
        this.score = score;
    }
}

/**
 * Compares two player objects.
 */
class Checker implements Comparator<Player> {

    /**
     * Compares two player objects.
     * Returns -1 if player 1 < player 2.
     * Returns 0 if player 1 = player 2.
     * Returns 1 if player 1 > player 2.
     *
     * @param firstPlayer player 1
     * @param secondPlayer player 2
     * @return integer representing the comparison of two player objects
     */
    public int compare(final Player firstPlayer, final Player secondPlayer) {
        if (firstPlayer.score < secondPlayer.score) {
            return 1;
        } else if (firstPlayer.score > secondPlayer.score) {
            return -1;
        } else {
            return firstPlayer.name.compareTo(secondPlayer.name);
        }
    }

}

