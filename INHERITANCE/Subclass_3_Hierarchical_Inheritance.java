package INHERITANCE;

import java.util.ArrayList;

public class Subclass_3_Hierarchical_Inheritance extends SupperClass_Students {
    ArrayList<String> Student_Name_List = new ArrayList<>();
    ArrayList<String> Course_Name_List = new ArrayList<>();

    @Override
    String Set_Student_Name(String student_Name) {
        this.Student_Name_List.add(student_Name);
        return null;
    }

    String Set_Course_Name(String course_Name) {
        this.Course_Name_List.add(course_Name);
        return null;
    }

    ArrayList<String> print_Hierarchical_Inheritance(){
        return (Student_Name_List);
    }
}
