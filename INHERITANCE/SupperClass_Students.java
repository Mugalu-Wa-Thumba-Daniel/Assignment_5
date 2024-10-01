package INHERITANCE;

public class SupperClass_Students {
    String Student_Name;
    String Student_ID;
    String Student_Year;
    String Student_Semester;

    public SupperClass_Students() {
    }

    String Set_Student_Name(String student_Name) {
        this.Student_Name = student_Name;
        return null;
    }

    String Set_Student_ID(String student_ID) {
        this.Student_ID = student_ID;
        return null;
    }

    String getSet_Student_Year(String student_Year) {
        this.Student_Year = student_Year;
        //return Integer.parseInt(null);
        return null;
    }
    String Set_Student_Semester (String student_Semester) {
        this.Student_Semester = student_Semester;
        return null;
    }

    public String Print_Student_Inf() {
        System.out.println("Student Name: " + Student_Name);
        System.out.println("Student ID: " + Student_ID);
        System.out.println("Student Year: " + Student_Year);
        System.out.println("Student Semester: " + Student_Semester);
        return null;
    }

}
