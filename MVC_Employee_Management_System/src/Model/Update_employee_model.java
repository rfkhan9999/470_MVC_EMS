package Model;

import Controller.conn;
import java.sql.ResultSet;

public class Update_employee_model {
    public static ResultSet search_employee(String e_id) {
        try {
            conn con = new conn();
            String str = "select * from employee where emp_id = '" + e_id + "'";
            ResultSet rs = con.s.executeQuery(str);
            return rs ;

        }
        catch (Exception ex) {
        }
        return null;
    }

    public static int update_employee(String t1, String t2, String age,String dat, String t3, String t4,String t5,String t6, String t7, String t8,String t9, String id_emp ) {

        try{
            Controller.conn cc = new conn();
            String str = "update employee set name='"+t1+"',fname='"+t2+"',age='"+age+"',dob='"+dat+"',address='"+t3+"',phone='"+t4+"',email='"+t5+"',education='"+t6+"',post='"+t7+"',aadhar='"+t8+"',emp_id='"+t9+"' where emp_id='"+id_emp+"'";
            int rs = cc.s.executeUpdate(str);
            return 1;

        }

        catch(Exception e){
            System.out.println("The error is:"+e);
        }
        return 0;
    }
}
