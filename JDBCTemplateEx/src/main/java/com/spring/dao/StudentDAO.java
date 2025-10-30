package com.spring.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.pojo.Student;

public class StudentDAO {
	
	private JdbcTemplate temp;

	public void setTemp(JdbcTemplate temp) {
		this.temp = temp;
	}
	
	
	public int insert(Student s) {
		String sql = "insert into student values("+s.getSid()+",'"+s.getSname()+"','"+s.getSemail()+"')";
		System.out.println(sql);
		return temp.update(sql);
	}
	
	public List<Student> retreiveStudentData() {
		String sql = "select * from student";	
		List<Student> list = new ArrayList<>();

		
		// Use JdbcTemplate.query with a RowMapper to map ResultSet to Student objects
        list = temp.query(sql, (rs, rowNum) -> {
            Student student = new Student();
            student.setSid(rs.getInt("sid"));
            student.setSname(rs.getString("sname"));
            student.setSemail(rs.getString("semail"));
            return student;
        });

        return list;
	}
	
}
