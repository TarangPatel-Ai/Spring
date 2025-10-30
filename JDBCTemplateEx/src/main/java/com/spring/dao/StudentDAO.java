package com.spring.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

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
	
	public List<Student> getallStudents(){
		String sql="select * from student";
		return temp.query(sql,new ResultSetExtractor<List<Student>>() {
		@Override
		public List<Student> extractData(ResultSet rs) throws SQLException, DataAccessException {
		ArrayList<Student> al=new ArrayList<>();
		while(rs.next()) {
		Student s=new Student();
		s.setSid(rs.getInt(1));
		s.setSname(rs.getString(2));
		s.setSemail(rs.getString(3));
		al.add(s);
		}
		return al;
		}
		});
	}

	
}
