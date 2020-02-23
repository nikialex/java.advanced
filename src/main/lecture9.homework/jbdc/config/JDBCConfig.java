package jbdc.config;

import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


@Configuration
public class JDBCConfig {

  @Bean
  public DataSource mysqlDataSource(){
    DriverManagerDataSource dataSource = new DriverManagerDataSource();
    dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
    dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/spotify");
    dataSource.setUsername("niki");
    dataSource.setPassword("Vaskoalex123");

    return dataSource;
  }
}
