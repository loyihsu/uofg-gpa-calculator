import internal.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Grade> myGrades = new ArrayList<>();

        // Normal Grades (Name, Band, Grade Points)

        myGrades.add(new Grade("Programming", GradeBand.A1, 20));
        myGrades.add(new Grade("Enterprise Cyber Security", GradeBand.B1, 15));
        myGrades.add(new Grade("Systems & Networks", GradeBand.B1, 10));
        myGrades.add(new Grade("Database Theory and Applications", GradeBand.C1, 10));

        // Estimated Grades (Name, Grade map (Item name, Band, Percentage), Grade Points)
        // This will be extremely inaccurate, but the best we can do without knowledge of the points that haven't come out.

        myGrades.add(new EstimatedGrade("IT+ Software Development Project",
                new GradeMap(new ArrayList<>(Arrays.asList(new PercentageTuple[] {
                        new PercentageTuple("Submission", GradeBand.A1, 100.0)
                }))),10)
        );

        myGrades.add(new EstimatedGrade("Human Computer Interaction - Design and Evaluation",
                new GradeMap(new ArrayList<>(Arrays.asList(new PercentageTuple[] {
                        new PercentageTuple("Research Critique", GradeBand.C1, 10.0),
                        new PercentageTuple("Exam", GradeBand.A5, 70.0),
                        new PercentageTuple("Design Fiction", GradeBand.A5, 20.0)
                }))),10)
        );

        myGrades.add(new EstimatedGrade("Software Engineering",
                new GradeMap(new ArrayList<>(Arrays.asList(new PercentageTuple[] {
                        new PercentageTuple("Assessed Exercise 1", GradeBand.A5, 10.0),
                        new PercentageTuple("Assessed Exercise 1", GradeBand.A5, 20.0)
                }))),15)
        );

        myGrades.add(new EstimatedGrade("Algorithms and Data Structure",
                new GradeMap(new ArrayList<>(Arrays.asList(new PercentageTuple[] {
                        new PercentageTuple("Assessed Exercise", GradeBand.A5, 20.0)
                }))),10)
        );

        myGrades.add(new EstimatedGrade("Advanced Programming",
                new GradeMap(new ArrayList<>(Arrays.asList(new PercentageTuple[] {
                        new PercentageTuple("Lab Part 1", GradeBand.A1, 16.0),
                        new PercentageTuple("Lab Part 2", GradeBand.A1, 14.0),
                        new PercentageTuple("Class Quiz", GradeBand.A1, 35.0)
                }))),10)
        );

        myGrades.add(new EstimatedGrade("Internet Technology",
                new GradeMap(new ArrayList<>(Arrays.asList(new PercentageTuple[] {
                        new PercentageTuple("Project Specs", GradeBand.A5, 10.0),
                        new PercentageTuple("Project Demo", GradeBand.B1, 25.0),
                        new PercentageTuple("Tango with Django Coursework", GradeBand.A1, 40.0)
                }))),10)
        );

        for (Grade grade: myGrades) {
            System.out.println(grade);
        }

        GradePointAverage gpa = new GradePointAverage(myGrades);
        System.out.println(gpa);
    }
}
