import course_types.AssignmentCourse;
import course_types.CourseType;
import course_types.ExamCourse;
import evaluation_types.AssignmentBased;
import evaluation_types.ExamBased;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ExamBased examEval = new ExamBased(120);
        ExamCourse examCourseType = new ExamCourse(examEval);
        Course<ExamCourse> calculus = new Course<>("MATH101", examCourseType);

        AssignmentBased assignmentEval = new AssignmentBased(5);
        AssignmentCourse assignmentCourseType = new AssignmentCourse(assignmentEval);
        Course<AssignmentCourse> programming = new Course<>("CS101", assignmentCourseType);

        ArrayList<? extends CourseType<?>> courseTypes = new ArrayList<>(){{
            add(examCourseType);
            add(assignmentCourseType);
        }};

        for (CourseType<?> courseType : courseTypes) {
            System.out.println(courseType);
        }
    }
}