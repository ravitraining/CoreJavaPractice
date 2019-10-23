package ExceptionHandling;

public class TooYoungException extends RuntimeException {
	public TooYoungException() {
		super("Too Young for this");
	}
}

class TooOldExceptoin extends RuntimeException
{
	public TooOldExceptoin() {
		super("Too old for this");
	}
}