/**
 * The enum of bands, supporting band value convertion
 * and getBand for GPA calculation or grade estimation given a GPA grade map or percentage GradeMap
 * implementing ValuePercentage.
 * @author Yu-Sung Loyi Hsu
 */

package internal;

import java.util.ArrayList;

public enum GradeBand {
    H(0), G2(1), G1(2), F3(3), F2(4), F1(5),
    E3(6), E2(7), E1(8), D3(9), D2(10), D1(11),
    C3(12), C2(13), C1(14), B3(15), B2(16), B1(17),
    A5(18), A4(19), A3(20), A2(21), A1(22);

    final int value;

    GradeBand(int value) {
        this.value = value;
    }

    /**
     * This method uses the ValuePercentage interface to calculate the grade/GPA
     * and return corresponding GPA after rounding.
     * @param tuples
     * @param <T>
     * @return
     */
    public static <T extends ValuePercentage> GradeBand getBand(ArrayList<T> tuples) {
        double calc = 0.0, percentage = 0.0;
        for (ValuePercentage tuple : tuples) {
            calc += tuple.getValue() * tuple.getPercentage();
            percentage += tuple.getPercentage();
        }

        calc /= percentage;

        int rawGradeConverter = (int) calc;
        if (calc - (double) rawGradeConverter >= 0.5) {
            rawGradeConverter += 1;
        }

        for (GradeBand band : GradeBand.values()) {
            if (rawGradeConverter == band.value) {
                return band;
            }
        }

        return null;
    }

    @Override
    public String toString() {
        return this.name() + "(" + value + ")";
    }
}
