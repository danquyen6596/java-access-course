package vn.codegym.QuyenLeSy;

public class Course {

    private String name;
    private String[] students = new String[20];
    private int studentsCount = 0;

    public Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String[] getStudents() {
        return students;
    }

    public int getStudentsCount() {
        return studentsCount;
    }

    public void addStudent(String name) {
        students[studentsCount] = name;
        studentsCount++;
    }

    public static void displayCourse(Course course) {
        System.out.println("Course \"" + course.getName()
                + "\" has " + course.getStudentsCount()
                + " student(s): {");
        String[] students = course.getStudents();
        for (int i = 0; i < course.getStudentsCount(); i++) {
            System.out.println("\t\"" + students[i] + "\",");
        }
        System.out.println("}");
    }

    public void removeStudent(String name) {
        boolean found = false;
        for (int i = 0; i < studentsCount; i++) {
            if (students[i] == name) {
                found = true;
                for (int j = i + 1; j < studentsCount; j++) {
                    students[j - 1] = students[j];
                }
                studentsCount--;
                System.out.println("Student \"" + name + "\" removed!");
            }
        }
        if (!found) {
            System.out.println("Student \"" + name + "\" not existed in list, nothing removed!");
        }
    }
}
