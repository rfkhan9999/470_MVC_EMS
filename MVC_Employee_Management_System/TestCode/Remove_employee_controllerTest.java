import Controller.Remove_employee_controller;
import Controller.conn;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class Remove_employee_controllerTest {

    @BeforeEach
    void setUp() throws SQLException {
        String a = "ji";
        String bb = "ji F";
        String c = "22";
        String d = "2/2/2002";
        String e = "Am Rica";
        String ff = "0123443";
        String g = "ji@gmail.com";
        String h = "wala academy";
        String i = "Pro";
        String j = "Am rica";
        String k = "7";
        conn cc = new conn();
        String q = "insert into employee(name,fname,age,dob,address,phone,email,education,post,aadhar,emp_id) values('"+a+"','"+bb+"','"+c+"','"+d+"','"+e+"','"+ff+"','"+g+"','"+h+"','"+i+"','"+j+"','"+k+"')";
        cc.s.executeUpdate(q);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void searchController() throws SQLException {
        String e_id ="7";
        String name = null;
        ResultSet rs = Remove_employee_controller.searchController(e_id);
        while(rs.next())
        {
            name=rs.getString(1);

        }
        assertEquals("ji",name);


    }

    @Test
    void removeController() {
        String e_id ="7";
        ResultSet rs = Remove_employee_controller.removeController(e_id);
        assertEquals(null,rs);
    }

}