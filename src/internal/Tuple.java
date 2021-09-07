/**
 * A generic Tuple type.
 *
 * @author Yu-Sung Loyi Hsu
 * @param <T>
 * @param <U>
 * @param <V>
 */

package internal;

public class Tuple<T, U, V> {
    protected final T first;
    protected final U second;
    protected final V third;

    public Tuple(T first, U second, V third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ", " + third + ")";
    }
}
