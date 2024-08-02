package com.sumanth.SpringJdbc.repository;

import com.sumanth.SpringJdbc.Model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class Studentrepo {

    public JdbcTemplate getJdbc() {
        return jdbc;
    }
     @Autowired
    public void setJdbc(JdbcTemplate jdbc)// Spring will create it
     {
        this.jdbc = jdbc;
    }

    private JdbcTemplate jdbc;
    public Studentrepo() {

        System.out.println("repo cons");
    }
    public List<Student> findall() {
        //   List<Student> students = new ArrayList<>();
        //  return students;
        String sql= " select * from student";
        System.out.println("Hi1");
        RowMapper<Student> r= new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                Student s = new Student();
                s.setRollno(rs.getInt("rollno"));
                s.setName(rs.getString("name"));
                s.setMarks(rs.getInt("marks"));
                return s;
            }
        };
        return     jdbc.query(sql,r);
    }




    public void save(Student s) {
        String sql= "insert into student(rollno,name,marks) values (?,?,?)";
        //  System.out.println("Hello data is ssaved");
        int update=     jdbc.update(sql,s.getRollno(),s.getName(),s.getMarks());
        System.out.println(update + " " +"effected");
    }


}
