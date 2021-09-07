package internal;

import java.util.ArrayList;

public class GradeMap {
    ArrayList<PercentageTuple> tuples;

    public GradeMap(ArrayList<PercentageTuple> tuples) {
        this.tuples = tuples;
    }

    GradeBand getBand() {
        return GradeBand.getBand(tuples);
    }
}
