/**
 * A specific type of Tuple with generic types specified
 * as String (Course name), GradeBand and Double (Grade Point).
 * It implements ValuePercentage to support calculating estimated grade with the method from GradeBand.
 * @author Yu-Sung Loyi Hsu
 */

package internal;

public class PercentageTuple extends Tuple<String, GradeBand, Double> implements ValuePercentage {
    public PercentageTuple(String first, GradeBand second, Double third) {
        super(first, second, third);
    }

    // ===========================================================
    // ValuePercentage
    // ===========================================================

    @Override
    public double getValue() {
        return second.value;
    }

    @Override
    public double getPercentage() {
        return third;
    }
}
