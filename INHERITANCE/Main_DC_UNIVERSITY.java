package INHERITANCE;

public class Main_DC_UNIVERSITY {
    public static void main(String[] args) {

        System.out.println("\n____________________________________ TEST OF THE SINGLE INHERITANCE ____________________________________\n");
        Subclass_1_Single_Inheritance Single_Inheritance = new Subclass_1_Single_Inheritance();
        Single_Inheritance.Set_Student_Name("\tDANNE DANIEL THUMBA\t"); Single_Inheritance.Set_Student_ID("\t\t24/276/BSCS-S\t");   Single_Inheritance.getSet_Student_Year("\t\t\t  2\t\t\t");
        Single_Inheritance.Set_Student_Name("\tTHOD THIAN THISAN\t");   Single_Inheritance.Set_Student_ID("\t  35/387/BSCS-S\t\t");   Single_Inheritance.getSet_Student_Year("\t\t\t  1\t\t\t");
        Single_Inheritance.Set_Student_Name("\tTHRECIE THORE THINIS\t");    Single_Inheritance.Set_Student_ID("\t\t46/498/BSCS-S\t\t"); Single_Inheritance.getSet_Student_Year("\t\t\t  3\t\t\t\t");
        Single_Inheritance.print_Single_Inheritance();

        System.out.println("\n__________________________________ TEST OF THE MULTILEVEL INHERITANCE __________________________________\n");

        Subclass_2_Multilevel_Inheritance Multilevel_Inheritance = new Subclass_2_Multilevel_Inheritance();
        Multilevel_Inheritance.Set_Student_Name("\tDANNE DANIEL THUMBA\t"); Multilevel_Inheritance.Set_Student_Name("\tTHOD THIAN THISAN\t");   Multilevel_Inheritance.Set_Student_Name("\tTHRECIE THORE THINIS\t");
        Multilevel_Inheritance.set_Fees("\t\t\t954 $\t\t");   Multilevel_Inheritance.set_Fees("\t\t715.5 $\t\t\t"); Multilevel_Inheritance.set_Fees("\t\t\t 477 $\t\t\t");
        System.out.println(Multilevel_Inheritance.print_Single_Inheritance());
        System.out.println(Multilevel_Inheritance.print_Multilevel_Inheritance());
        //System.out.println("THE STUDENTS NAMES ARE :\t" + Multilevel_Inheritance.print_Single_Inheritance() + "\n" + Multilevel_Inheritance.print_Multilevel_Inheritance());

        System.out.println("\n__________________________________ TEST OF THE HIERARCHICAL INHERITANCE __________________________________\n");
        Subclass_3_Hierarchical_Inheritance Hierarchical_Inheritance = new Subclass_3_Hierarchical_Inheritance();
        Hierarchical_Inheritance.Set_Student_Name("\tDANNE DANIEL THUMBA\t"); Hierarchical_Inheritance.Set_Student_Name("\tTHOD THIAN THISAN\t"); Hierarchical_Inheritance.Set_Student_Name("\tTHRECIE THORE THINIS\t");
        System.out.println("THE STUDENT'S NAMES ARE : \t" + Hierarchical_Inheritance.print_Hierarchical_Inheritance());
        Hierarchical_Inheritance.Set_Course_Name("Applied Object Oriented Programming||"); Hierarchical_Inheritance.Set_Course_Name("Data Structure||"); Hierarchical_Inheritance.Set_Course_Name("Numerical Method||");
        System.out.println("THE COURSE LIST IS \t\t: \t" + Hierarchical_Inheritance.Course_Name_List);
    }
}