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

    public double getValue() {
        return getBand().value;
    }

    public double getPercentage() {
        return gradePoint;
    }

    @Override
    public String toString() {
        return "Course: \'" + courseName + '\'' +
                ", band=" + band +
                ", gradePoint=" + gradePoint;
    }
}
