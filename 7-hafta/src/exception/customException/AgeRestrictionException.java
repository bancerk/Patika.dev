package exception.customException;

public class AgeRestrictionException extends RuntimeException {
    public AgeRestrictionException(String message) {
        super(message);
    }
}
