package com.example.postgresql_test.config;

import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "com.example.postgresql_test.mapper", sqlSessionFactoryRef = "pgSqlSessionFactory")
public class PostgresqlDataSource {

    @Bean(name = "pgDataSource")
    @ConfigurationProperties("spring.datasource.pg")
    public DataSource pgDataSource() {
        return new HikariDataSource();
        //DataSourceBuilder.create().build();
    }

    @Bean(name = "pgSqlSessionFactory")
    public SqlSessionFactory pgSqlSessionFactory(@Qualifier("pgDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        return bean.getObject();
    }

    @Bean(name = "pgSqlSessionTemplate")
    public SqlSessionTemplate pgSqlSessionTemplate(@Qualifier("pgSqlSessionFactory")SqlSessionFactory sqlSessionFactory){
        return new SqlSessionTemplate(sqlSessionFactory);
    }

    @Bean(name = "pgDataSourceTransactionManager")
    public DataSourceTransactionManager pgDataSourceTransactionManager(@Qualifier("pgDataSource")DataSource dataSource){
        return new DataSourceTransactionManager(dataSource);
    }


}
