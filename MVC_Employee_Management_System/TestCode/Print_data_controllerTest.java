import Controller.Print_data_controller;
import Controller.Remove_employee_controller;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import Controller.conn;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Print_data_controllerTest {

    @Before
    public void setUp() throws SQLException {


    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void print_data_controller() throws SQLException  {
        String e_id ="1";
        String name = null;
        ResultSet rs = Print_data_controller.print_data_controller(e_id);
        while(rs.next())
        {
            name=rs.getString(1);

        }
        assertEquals("Brad Pitt",name);
        rs.close();

    }
}