package INHERITANCE;

import java.util.ArrayList;

public class Subclass_1_Single_Inheritance extends SupperClass_Students {
    ArrayList<String> Student_Name_List = new ArrayList<>();
    ArrayList<String> Student_ID_List = new ArrayList<>();
    ArrayList<String> Student_Year_List = new ArrayList<>();

    public Subclass_1_Single_Inheritance() {
        super();
    }

    String get_Student_Name_List() {
        return Student_Name_List.toString();
    }

    @Override
    String Set_Student_Name(String student_Name){
        this.Student_Name_List.add(student_Name);
        return null;
    }

    @Override
    String Set_Student_ID(String Id){
        this.Student_ID_List.add(Id);
        return null;
    }

    @Override
    String getSet_Student_Year(String student_Year) {
        super.getSet_Student_Year(student_Year);
        this.Student_Year_List.add(String.valueOf(student_Year));
        //return student_Year;
        return null;
    }

    String print_Single_Inheritance(){
        System.out.println("THE STUDENT'S NAMES ARE :\t" + Student_Name_List);
        System.out.println("THE STUDENT'S IDs ARE   :\t" + Student_ID_List);
        System.out.println("THE STUDENT'S YEARS ARE :\t" + Student_Year_List);
        return null;
    }
}
