package question3;

public interface Cache {
	
	default long timeout() {
		
		return 1;
	}
}
