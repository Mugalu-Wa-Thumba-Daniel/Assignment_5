package INHERITANCE;

import java.util.ArrayList;

public class Subclass_2_Multilevel_Inheritance extends Subclass_1_Single_Inheritance{
    ArrayList<String> Accademic_Fees = new ArrayList<>();

    int set_Fees(String fees){
        this.Accademic_Fees.add(fees);
        return 0;
    }

   @Override
    String print_Single_Inheritance() {
       return ("THE STUDENTS NAMES ARE\t:\t"+ super.get_Student_Name_List());
    }
    String print_Multilevel_Inheritance() {
        return ("ACCADEMIC FEES ARE\t\t:\t" + Accademic_Fees);
    }
}
