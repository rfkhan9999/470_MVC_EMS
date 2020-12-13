package Model;

import Controller.conn;
import java.sql.ResultSet;

public class Add_Employee_Model {

    public static int add_employee (String a,String bb,String c,String d,String e,String ff,String g,String h,String i,String j,String k){
        try{
            conn cc = new conn();
            String q = "insert into employee(name,fname,age,dob,address,phone,email,education,post,aadhar,emp_id) values('"+a+"','"+bb+"','"+c+"','"+d+"','"+e+"','"+ff+"','"+g+"','"+h+"','"+i+"','"+j+"','"+k+"')";
            int rs = cc.s.executeUpdate(q);
            return 1;


        }

        catch (Exception ee) {
            ee.printStackTrace();
        }
        return 0;


    }
}
