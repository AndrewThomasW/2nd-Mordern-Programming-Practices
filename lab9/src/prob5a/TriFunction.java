package prob5a;

@FunctionalInterface
public interface TriFunction<X,Y,Z,U> {
	U apply(X x, Y y, Z z);
}
