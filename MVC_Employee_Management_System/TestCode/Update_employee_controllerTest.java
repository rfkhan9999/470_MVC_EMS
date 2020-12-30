import Controller.Remove_employee_controller;
import Controller.Update_employee_controller;
import Controller.conn;
import Model.Update_employee_model;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class Update_employee_controllerTest {

    @BeforeEach
    void setUp() throws SQLException {
        String a = "updateIns";
        String bb = "UpdteIns F";
        String c = "22";
        String d = "2/2/2002";
        String e = "Am Rica";
        String ff = "0123443";
        String g = "ji@gmail.com";
        String h = "wala academy";
        String i = "Pro";
        String j = "Am rica";
        String k = "15";
        conn cc = new conn();
        String q = "insert into employee(name,fname,age,dob,address,phone,email,education,post,aadhar,emp_id) values('"+a+"','"+bb+"','"+c+"','"+d+"','"+e+"','"+ff+"','"+g+"','"+h+"','"+i+"','"+j+"','"+k+"')";
        cc.s.executeUpdate(q);
    }

    @AfterEach
    void tearDown() throws SQLException {
        conn con = new conn();
        String str = "delete from employee where emp_id = '"+ "15" +"'";
        con.s.executeUpdate(str);
    }

    @Test
    void searchController() throws SQLException {
        String e_id ="15";
        String name = null;
        ResultSet rs = Remove_employee_controller.searchController(e_id);
        while(rs.next())
        {
            name=rs.getString(1);

        }
        assertEquals("updateIns",name);
    }

    @Test
    void updateController() {
        String t1 = "wala66";
        String t2 = "wala Father";
        String age = "22";
        String dat = "2/2/2002";
        String t3 = "Am Rica";
        String t4 = "0123443";
        String t5 = "wala@gmail.com";
        String t6 = "wala academy";
        String t7 = "Pro";
        String t8 = "Am rica";
        String t9 = "15";

        int rs = Update_employee_controller.updateController(t1,t2,age,dat,t3,t4,t5,t6,t7,t8,t9,"3");
        assertEquals(1,rs);
    }
}