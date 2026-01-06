package CaseStudies.DesignTicTacToe.Classic;

public class InvalidMoveException extends RuntimeException{
    public InvalidMoveException(String message)
    {
        super(message);
    }
}
