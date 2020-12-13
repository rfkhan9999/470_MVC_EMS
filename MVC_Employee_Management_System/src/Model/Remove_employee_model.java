package Model;

import Controller.conn;

import java.sql.ResultSet;

public class Remove_employee_model {

    public static ResultSet remove_employee_search(String e_id){
        try{
            conn con = new conn();
            String str = "select name,phone,email from employee where emp_id ='"+ e_id +"' ";
            ResultSet rs = con.s.executeQuery(str);
            return rs;

        }

        catch (Exception e) {
            e.printStackTrace();
        }
        return null;


    }

    public static ResultSet remove_employee(String e_id){
        try{
            conn con = new conn();
            String str = "delete from employee where emp_id = '"+ e_id +"'";
            con.s.executeUpdate(str);
            return null;

        }

        catch (Exception e) {
            e.printStackTrace();
        }
        return null;



    }
}
