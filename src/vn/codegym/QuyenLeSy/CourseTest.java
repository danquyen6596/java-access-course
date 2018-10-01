package vn.codegym.QuyenLeSy;

import static vn.codegym.QuyenLeSy.Course.displayCourse;

public class CourseTest {
    public static void main(String[] args) {
        Course course = new Course("javer");
        displayCourse(course);
        String andy = "andy";
        course.addStudent(andy);
        displayCourse(course);
        String booby = "booby";
        course.addStudent(booby);
        displayCourse(course);
        course.removeStudent(andy);
        displayCourse(course);
        String samy = "samy";
        course.removeStudent(andy);
        displayCourse(course);
    }
}
