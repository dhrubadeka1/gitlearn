package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Program started...." );
        @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        JdbcTemplate template = context.getBean("jdbcTemplate",JdbcTemplate.class);
        
        //insert query
        String query ="insert into student(id,name,city) values(?,?,?)";
        
        //fire query
        int result = template.update(query,19,"Ram","Kolkata");
        System.out.println("number of record inserted" +result);
        
    }
}
