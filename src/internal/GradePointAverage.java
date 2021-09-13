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

    double getValue() {
        double values = 0.0, gradePoints = 0.0;
        for (Grade grade: grades) {
            values += grade.getValue() * grade.getPercentage();
            gradePoints += grade.getPercentage();
        }

        values /= gradePoints;

        int rounder = ((int)(values * 100)) % 10;
        values = ((double)((int)(values * 10))) / 10;

        if (rounder >= 5) {
            values += 0.1;
        }

        System.out.println(values);
        return values;
    }

    @Override
    public String toString() {
        return "GPA: " + getGPA() + " (Exact Value: " + getValue() + ")";
    }
}
