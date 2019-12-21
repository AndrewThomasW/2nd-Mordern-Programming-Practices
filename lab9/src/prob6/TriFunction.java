package prob6;

public interface TriFunction<X,Y,Z,U> {
	U apply(X x, Y y, Z z);
}
