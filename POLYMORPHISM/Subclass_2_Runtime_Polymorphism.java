package POLYMORPHISM;

public class Subclass_2_Runtime_Polymorphism extends Subclass_1_Runtime_Polymorphism {

    @Override
    String Set_Student_Name(String student_Semester, int student_Age, String student_Email) {
        this.Student_Semester = student_Semester;
        this.Student_Age = student_Age;
        this.Student_Email = student_Email;
        return null;
    }

    @Override
    public String Print_Student_Inf() {
        return ("\n[2] This is the Method that displays runtime polymorphism Info in the Second SubClass :\n\n" + "Student Semester : " + Student_Semester + "\nStudent Age      : " + Student_Age + "\nStudent E-mail   : " + Student_Email);
    }

}
