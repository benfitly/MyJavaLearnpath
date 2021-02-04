/*
    Create a method called displayHighScorePosition
        it should a players name as a parameter, and a 2nd parameter as a position
        in the high score table.
        You should display the players name along with a message
        like " managed to get into position " and the position they got and
        a further message " on the high score table".

    Create a 2nd method called calculateHighScorePosition
        it should be sent one argument only, the player score
        it should return an int
        the return data should be:
            1 if the score is >=1000
            2 if the score is >=500 and < 1000
            3 if the score is >=100 and < 500
            4 in all other cases

    call both methods and display the results
*/


public class ScoreCalc {

    public static int calculateHighScorePosition (int toCalc) {

        if (toCalc >=1000) {
            return 1 ;

        } else if (toCalc < 1000 && toCalc >= 500){
            return 2;

        } else if (toCalc >= 100 && toCalc < 500){
            return 3;

        } else {
            return 4;
        }

    }

    public static void displayHighScorePosition (String playerName, int position) {

        position = calculateHighScorePosition(position);

        System.out.println(playerName + " managed to get position " + position +
        " on the high score table.");
    }

    public static void main (String[] args) {

        displayHighScorePosition(args[0], Integer.parseInt(args[1]));

    }
}
