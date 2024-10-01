package POLYMORPHISM;

public class Main_DC_UNIVERSITY {
    public static void main(String[] args) {

        SupperClass_Overloading_Students Students_Info = new SupperClass_Overloading_Students();
        Students_Info.Set_Student_Name("DANNE DANIEL THUMBA","24/276/BSCS-S", "Year 2");
        Students_Info.Set_Student_Name("Semester 1", 30, "danielmugalu945@gmail.com ]");
        System.out.println("\n____________________________________ TEST OF THE OVERLOADING ____________________________________\n");
        System.out.println(Students_Info.Set_Student_Name()+ Students_Info.Print_Student_Inf());

        System.out.println("\n____________________________________ TEST OF THE RUNTIME POLYMORPHISM ____________________________________");
        Students_Info = new Subclass_1_Runtime_Polymorphism();
        Students_Info.Set_Student_Name("THOD THIAN THISAN","35/387/BSCS-S","Year 1");
        System.out.println(Students_Info.Print_Student_Inf());

        Students_Info = new Subclass_2_Runtime_Polymorphism();
        Students_Info.Set_Student_Name("Semester 2", 40, "thodthianthisan@gmail.com ");
        System.out.println(Students_Info.Print_Student_Inf());

    }
}