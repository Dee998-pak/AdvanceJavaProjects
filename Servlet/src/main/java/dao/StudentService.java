package dao;

import entity.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentService {
    private static Connection con=null;
    static {
        try {
           con= DriverManager.getConnection("jdbc:mysql://localhost:3306/student");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void register(Student student){
        String sql="insert into student_data values(?,?,?)";
        try {
            PreparedStatement prt = con.prepareStatement(sql);
            prt.setString(1, student.getName());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
