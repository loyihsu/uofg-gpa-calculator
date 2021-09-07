/**
 * This class extends from Grade that supports estimating grades from GradeMap.
 * @author Yu-Sung Loyi Hsu
 */

package internal;

public class EstimatedGrade extends Grade {
    public EstimatedGrade(String name, GradeMap map, int gradePoint) {
        super(name, map.getBand(), gradePoint);
    }
}
