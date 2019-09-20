package com.study.spring16;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class StuDao extends JdbcDaoSupport {

	public class StuRowMapper implements RowMapper<Student> {

		@Override
		public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
			Student stu = new Student();
			stu.setId(rs.getInt("id"));
			stu.setName(rs.getString("name"));
			stu.setAge(rs.getInt("age"));
			return stu;
		}
	}

	// 增
	public void insert(Student stu) {
		String sql = "insert into student values(?,?,?)";
		this.getJdbcTemplate().update(sql, new Object[] { stu.getId(), stu.getName(), stu.getAge() },
				new int[] { Types.INTEGER, Types.VARBINARY, Types.INTEGER });
	}

	// 删
	public void delete(int id) {
		String sql = "delete from student where id = ?";
		this.getJdbcTemplate().update(sql, id);
	}

	// 改
	public void update(Student stu) {
		// String sql = "update student set name = ?, age = ?, where id = ?";
		
		/*
		 * 经常会遇到一行数据在特定条件下如果存在就更新列，不存在就插入新的行，
		 * 用replace和duplicate语法都可以实现，但是也是有区别的。
		 * 如果是数据覆盖就用replace，如果只是想实现update就用duplicate。
		 */
		
		String sql = "duplicate into student values(?,?,?)";  //更新操作
		String sql2 = "replace into student values(?,?,?)"; //覆盖操作
		this.getJdbcTemplate().update(sql2, new Object[] { stu.getId(), stu.getName(), stu.getAge() });
	}

	// 查询一个对象
	public Student queryById(int id) {
		String sql = "select * from student where id = ?";
		// return (Student) this.getJdbcTemplate().queryForObject(sql, new StuRowMapper(),1);
		// return (Student) this.getJdbcTemplate().queryForObject(sql, new Object[] {1},new StuRowMapper());
		return (Student) this.getJdbcTemplate().queryForObject(sql, new Object[] {1},new int[] {Types.INTEGER},new StuRowMapper());
	}
	
	// 查询所有对象
	public List<Student> queryAll() {
		String sql = "select * from student";
		return this.getJdbcTemplate().query(sql,new StuRowMapper());
	}
	
	// 查询一个名称
	public String queryNameById(int id) {
		String sql = "select name from student where id = ?";
		return this.getJdbcTemplate().queryForObject(sql, String.class,id);
	}
	
	// 查询所有名称
	public List<String> queryAllNames() {
		String sql = "select name from student";
		return this.getJdbcTemplate().queryForList(sql, String.class);
	}
	

	

}
