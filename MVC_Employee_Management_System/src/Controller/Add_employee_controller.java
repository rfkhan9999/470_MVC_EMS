package Controller;

import Model.Add_Employee_Model;
import java.sql.ResultSet;

public class Add_employee_controller {
    public static int addController (String a,String bb,String c,String d,String e,String ff,String g,String h,String i,String j,String k) {
        int rs = Add_Employee_Model.add_employee(a,bb,c,d,e,ff,g,h,i,j,k);
        return rs;

    }
}
