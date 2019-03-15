package com.employee.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

import com.employee.pojo.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
	    this.jdbcTemplate = jdbcTemplate;  
	}  
	
	@Override
	public List<Employee> getAll() {
		 String sql="select * from emp";
		return this.jdbcTemplate.query( sql, new EmployeeMapper());
		
	}

	@Override
	public boolean insert(Employee e) {
		String query="insert into emp values(?,?,?,?,?,?,?)";
		 
		return jdbcTemplate.execute(query,new PreparedStatementCallback<Boolean>(){  
		    @Override  
		    public Boolean doInPreparedStatement(PreparedStatement ps)  
		            throws SQLException, DataAccessException {  
		          
		        ps.setInt(1,e.getEmpid());  
		        ps.setString(2,e.getEname());  
		        ps.setString(3,e.getJob());  
		        ps.setInt(4, e.getMgr());
		        ps.setInt(5,e.getSal());
		        ps.setInt(6,e.getComm());
		        ps.setInt(7, e.getDeptno());
		        return ps.execute();  
		    }          
		    });

		
	}

	@Override
	public boolean delete(Employee e) {
		String SQL = "delete from emp where empno = "+e.getEmpid();
	      this.jdbcTemplate.update(SQL);
	      System.out.println("Deleted Record with ID = " + e.getEmpid());
		return true;
	}

	@Override
	public boolean update(Employee e) {
		String updateQuery = "update emp set sal = ? where empno = ?";
		this.jdbcTemplate.update(updateQuery, e.getSal(), e.getEmpid());
	return true;
	}

	@Override
	public List<Employee> employee(Employee e) {
		String sql="select * from emp where empno="+e.getEmpid();
		return this.jdbcTemplate.query( sql, new EmployeeMapper());
		
	}
	
	@Override
	public List<Employee> orderBy()
	{
		String query="select * from emp order by ename";
		return this.jdbcTemplate.query( query, new EmployeeMapper());
	}

//	@Override
//	public List<Employee> groupBy()
//	{
//		String query="select count(empNo),deptNo from emp group by deptNo";
//		return this.jdbcTemplate.query( query, new EmployeeMapper());
//	}


}
