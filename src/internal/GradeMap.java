/**
 * The GradeMap representation, supporting directly getting band.
 * @author Yu-Sung Loyi Hsu
 */

package internal;

import java.util.ArrayList;

public class GradeMap {
    ArrayList<PercentageTuple> tuples;      // PercentageTuple implements ValuePercentage

    public GradeMap(ArrayList<PercentageTuple> tuples) {
        this.tuples = tuples;
    }

    GradeBand getBand() {
        return GradeBand.getBand(tuples);
    }
}
