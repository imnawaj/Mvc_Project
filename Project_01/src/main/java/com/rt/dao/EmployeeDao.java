package com.rt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.rt.entity.Employee;

@Repository
public class EmployeeDao {

	@Autowired
	JdbcTemplate template;
	
	public boolean addData(Employee e) {
		try {

			Object[] args = { e.getFname(),e.getLname(),e.getBirthdate(),e.getGender(),e.getEmail(),e.getNumber(),e.getCountry() };
			int a = template.update("insert into student_register(`fname`,`lname`,`birthdate`,`gender`,`email`,`number`,`country`) values(?,?,?,?,?,?,?)",args);

			if (a == 1) {
				return true;
			} else {
				return false;
			}

		} catch (Exception e2) {
           e2.printStackTrace();
		}
		return false;
	}

	public boolean updatedata(Employee e) {
		try {

			Object[] args = { e.getFname(),e.getLname(),e.getBirthdate(),e.getGender(),e.getEmail(),e.getNumber(),e.getCountry(),e.getId() };
			int a = template.update("update student_register set fname=?,lname=?,birthdate=?,gender=?,email=?,number=?,country=? where id=?",args);

			if (a == 1) {
				return true;
			} else {
				return false;
			}

		} catch (Exception e2) {
           e2.printStackTrace();
		}
		return false;
		
	}

	public Employee singledata(int id) {
		Employee e = null;
		try {

			Object[] args = { id };
			 e = template.queryForObject("select * from student_register where id = ?", args,
					new RowMapper<Employee>() {

						public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
							return new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
									rs.getString(5), rs.getString(6), rs.getString(7),rs.getString(8));
						}
					});

		} catch (Exception e2) {
       e2.printStackTrace();
		}
		return e;
	}

	public boolean deletedata(int id) {
	
		try {

			Object[] args = { id };
			 int data = template.update("delete from student_register where id = ?", args);
			 
			 if(data==1){
				 return true;
			 }
				
				

		} catch (Exception e2) {
         System.out.println(e2);
		}
		return false;
	}

	public List<Employee>  selectAll() {
		List<Employee> list = null;
		try {

			 list = template.query("select * from student_register",
					new RowMapper<Employee>() {

				public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
					return new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
							rs.getString(5), rs.getString(6), rs.getString(7),rs.getString(8));
				}
			});

		} catch (Exception e) {
			System.err.println(e);
		}
		return list;
	}

	

}
