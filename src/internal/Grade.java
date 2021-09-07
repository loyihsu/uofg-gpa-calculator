/**
 * The representation of a Grade that is released by the school.
 * It implements ValuePercentage to support calculating GPA using GradeBand method.
 * @author Yu-Sung Loyi Hsu
 */

package internal;

public class Grade implements ValuePercentage {
    private String courseName;
    private GradeBand band;
    private int gradePoint;

    public Grade(String name, GradeBand grade, int gradePoint) {
        courseName = name;
        band = grade;
        this.gradePoint = gradePoint;
    }

    public GradeBand getBand() {
        return band;
    }

    @Override
    public String toString() {
        return "\'" + courseName + "\' (" + gradePoint + "): " + band;
    }

    // ===========================================================
    // ValuePercentage
    // ===========================================================

    public double getValue() {
        return getBand().value;
    }

    public double getPercentage() {
        return gradePoint;
    }
}
