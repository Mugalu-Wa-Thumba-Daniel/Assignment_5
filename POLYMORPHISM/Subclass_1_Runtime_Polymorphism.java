package POLYMORPHISM;

public class Subclass_1_Runtime_Polymorphism extends SupperClass_Overloading_Students {

    public Subclass_1_Runtime_Polymorphism() {
        super();
    }

    @Override
    String Set_Student_Name(String Student_Name, String student_ID, String student_Year) {
        this.Student_Name = Student_Name;
        this.Student_ID = student_ID;
        this.Student_Year = student_Year;
        //System.out.println("\n\t Student Name is : " + Student_Name + "\n\t Student ID is   : " + Student_ID + "\n\t Student Year is : " + Student_Year);
        return ("\n\t Student Name is : " + Student_Name + "\n\t Student ID is   : " + Student_ID + "\n\t Student Year is : " + Student_Year);
    }

    @Override
    public String Print_Student_Inf() {
        return ("\n[1] This is the Method that displays runtime polymorphism Info in the First SubClass :\n\n" + "Student Name     : " + Student_Name + "\nStudent ID       : " + Student_ID + "\nStudent Year     : " + Student_Year);
    }
}
