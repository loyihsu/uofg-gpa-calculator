package internal;

public class EstimatedGrade extends Grade {
    public EstimatedGrade(String name, GradeMap map, int gradePoint) {
        super(name, map.getBand(), gradePoint);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
