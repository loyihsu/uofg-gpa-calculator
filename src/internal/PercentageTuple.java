package internal;

public class PercentageTuple extends Tuple<String, GradeBand, Double> implements ValuePercentage {
    public PercentageTuple(String first, GradeBand second, Double third) {
        super(first, second, third);
    }

    @Override
    public double getValue() {
        return second.value;
    }

    @Override
    public double getPercentage() {
        return third;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
