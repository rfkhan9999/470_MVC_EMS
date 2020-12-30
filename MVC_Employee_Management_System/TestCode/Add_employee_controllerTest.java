import Controller.Add_employee_controller;
import Controller.conn;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class Add_employee_controllerTest {


    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() throws SQLException {
        conn con = new conn();
        String str = "delete from employee where emp_id = '"+ "10" +"'";
        con.s.executeUpdate(str);
    }

    @Test
    void addController()  {
        String a = "add";
        String bb = "add Father";
        String c = "22";
        String d = "2/2/2002";
        String e = "Am Rica";
        String ff = "0123443";
        String g = "add@gmail.com";
        String h = "add academy";
        String i = "Pro";
        String j = "Am rica";
        String k = "10";
        int rs = Add_employee_controller.addController(a, bb, c, d, e, ff, g, h, i, j, k);
        assertEquals(1,rs);
    }
}