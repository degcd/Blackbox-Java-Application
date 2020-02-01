package exceptions;

/**
 * Exception wird geworfen, wenn ein weiterer Wert zu einem bereits beendeten Spiel hinzugef�gt werden soll
 */
public class GameHasEndedException extends Exception {
    public GameHasEndedException(String msg){
        super(msg);
    }
}