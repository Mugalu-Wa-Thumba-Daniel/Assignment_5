package POLYMORPHISM;

public class SupperClass_Overloading_Students {
    String Student_Name;
    String Student_ID;
    String Student_Year;
    String Student_Semester;
    int Student_Age;
    String Student_Email;

    public SupperClass_Overloading_Students() {
    }

    String Set_Student_Name() {
        //System.out.println("[ This is the Method that displays a default message Without any parameters ]");
        return "[1] [ This is the Method that displays a default message Without any parameters ]\n\n";
    }

    String Set_Student_Name(String Student_Name, String student_ID, String student_Year) {
        this.Student_Name = Student_Name;
        this.Student_ID = student_ID;
        this.Student_Year = student_Year;
        return null;
    }

    String Set_Student_Name(String student_Semester, int student_Age, String student_Email) {
        this.Student_Semester = student_Semester;
        this.Student_Age = student_Age;
        this.Student_Email = student_Email;
        return null;
    }

    public String Print_Student_Inf() {
        return ("[2] [ This is the Method that displays result With parameters :\n\n" + "Student Name     : " + Student_Name + "\nStudent ID       : " + Student_ID + "\nStudent Year     : " + Student_Year + "\nStudent Semester : " + Student_Semester + "\nStudent Age      : " + Student_Age + "\nStudent Email    : " + Student_Email);
    }

}
