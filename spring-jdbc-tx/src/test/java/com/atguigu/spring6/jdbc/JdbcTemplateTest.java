package com.atguigu.spring6.jdbc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.List;

/**
 * @projectName: spring6
 * @package: com.atguigu.spring6.jdbc
 * @className: JdbcTemplateTest
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/12 18:32
 */
@SpringJUnitConfig(locations = "classpath:bean.xml")
public class JdbcTemplateTest {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void testUpdate() {

        // 插入

        // String sql = "insert into t_emp values(null,?,?,?)";
        // Object[] params = {"林平之", 20, "未知"};
        // int rows = jdbcTemplate.update(sql, params);
        // System.out.println(rows);

        // 修改
        //
        // String sql = "update t_emp set name=? where id =?";
        // Object[] params = {"林平之atguigu", 1};
        // int rows = jdbcTemplate.update(sql, params);
        // System.out.println(rows);

        // 删除
        String sql = "delete from t_emp where id =?";
        Object[] params = {1};
        int rows = jdbcTemplate.update(sql, params);
        System.out.println(rows);

    }


    // 查询返回对象
    @Test
    public void testSelectObject() {

        // 方法一
        // String sql = "select * from t_emp where id=?";
        // Emp empList = jdbcTemplate.queryForObject(sql, (rs, rowNum) -> {
        //     Emp emp = new Emp();
        //     emp.setId(rs.getInt("id"));
        //     emp.setAge(rs.getInt("age"));
        //     emp.setName(rs.getString("name"));
        //     emp.setSex(rs.getString("sex"));
        //     return emp;
        // },2);
        // System.out.println(empList);

        // 方法二
        String sql = "select * from t_emp where id=?";
        Emp empList = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Emp.class), 2);
        System.out.println(empList);        // String sql = "select * from t_emp where id=?";

    }

    // 返回集合
    @Test
    public void testSelectList() {
        String sql = "select * from t_emp where id=?";
        List<Emp> empList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Emp.class), 2);
        System.out.println(empList);
    }

    // 查询单个值
    @Test
    public void testSelectValue() {
        String sql = "select count(*) from t_emp";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println(count);
    }
}
