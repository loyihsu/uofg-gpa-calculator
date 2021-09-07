/**
 * The GPA representation, supporting directly getting band.
 * @author Yu-Sung Loyi Hsu
 */

package internal;

import java.util.ArrayList;

public class GradePointAverage {
    ArrayList<Grade> grades;        // Grade implements ValuePercentage

    public GradePointAverage(ArrayList<Grade> grades) {
        this.grades = grades;
    }

    GradeBand getGPA() {
        return GradeBand.getBand(grades);
    }

    @Override
    public String toString() {
        return "GPA: " + getGPA();
    }
}
