package com.securityconfig;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.dao.security.UserInfoDAO;

@Configuration
@ComponentScan("com")
@EnableTransactionManagement
// Load to Environment.
@PropertySource({"classpath:persistence-mssql.properties",
"classpath:security-persistence-mssql.properties"})
public class ApplicationContextConfig {

 

   // Lưu trữ các giá thuộc tính load bởi @PropertySource.
   @Autowired
   private Environment env;

   @Autowired
   private UserInfoDAO userInfoDAO;

   @Bean
   public ResourceBundleMessageSource messageSource() {
       ResourceBundleMessageSource rb = new ResourceBundleMessageSource();
       // Load property in message/validator.properties
       rb.setBasenames(new String[] { "messages/validator" });
       return rb;
   }

   @Bean(name = "viewResolver")
   public InternalResourceViewResolver getViewResolver() {
       InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
       viewResolver.setPrefix("/WEB-INF/pages/");
       viewResolver.setSuffix(".jsp");
       return viewResolver;
   }

   @Bean(name = "dataSource")
   public DataSource getDataSource() {
       DriverManagerDataSource dataSource = new DriverManagerDataSource();
 
       // Xem: datasouce-cfg.properties
       dataSource.setDriverClassName(env.getProperty("security.jdbc.driver"));
       dataSource.setUrl(env.getProperty("security.jdbc.url"));
       dataSource.setUsername(env.getProperty("security.jdbc.user"));
       dataSource.setPassword(env.getProperty("security.jdbc.password"));

       System.out.println("## getDataSource: " + dataSource);

       return dataSource;
   }
   @Bean(name = "registrationController")
   public void registrationController() {
      
   }
   
   // Transaction Manager
   @Autowired
   @Bean(name = "transactionManager")
   public DataSourceTransactionManager getTransactionManager(DataSource dataSource) {
       DataSourceTransactionManager transactionManager = new DataSourceTransactionManager(dataSource);

       return transactionManager;
   }
 
}