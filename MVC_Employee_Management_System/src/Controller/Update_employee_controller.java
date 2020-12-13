package Controller;


import Model.Update_employee_model;

import java.sql.ResultSet;

public class Update_employee_controller {

    public static ResultSet searchController (String e_id) {
        ResultSet rs = Update_employee_model.search_employee(e_id);
        return rs;

    }

    public static int updateController (String t1, String t2, String age,String dat, String t3, String t4,String t5,String t6, String t7, String t8,String t9, String id_emp) {
        int rs = Update_employee_model.update_employee(t1,t2,age,dat,t3,t4,t5,t6,t7,t8,t9,id_emp);
        return rs;

    }
}
