package com.indianrailways;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

@ComponentScan("com.*")
@EnableJpaRepositories("com.*")
@Configuration
public class JPAConfig
{
  /*//Bean Objects
	//1. create DataSource object i.e provide database details
	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource datasource=new DriverManagerDataSource();
		datasource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		datasource.setUrl("jdbc:oracle:thin:@localhost:1521:orcl1");
		datasource.setUsername("system");
		datasource.setPassword("Anjum123");
		return datasource;
	}
	//2.Enity Manager Factory instance
	@Bean("entityManagerFactory")
	public LocalContainerEntityManagerFactoryBean createEntityManagerFactory() {
		LocalContainerEntityManagerFactoryBean factory=new LocalContainerEntityManagerFactoryBean();
		
		//a.set DataSource Details// created at step1
		factory.setDataSource(getDataSource());
		//b.Packages info of Entity classes
		factory.setPackagesToScan("com.*");
		//c.hibernate FW Properties
		HibernateJpaVendorAdapter adapter=new HibernateJpaVendorAdapter();
		factory.setJpaVendorAdapter(adapter);
		return factory;
	}
	//3.create a transaction manager
	@Bean("transactionManager")
	public PlatformTransactionManager createTransaction() {
		JpaTransactionManager transactionManager =new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(createEntityManagerFactory().getObject());
		return transactionManager;
	}
	
	public Properties configureHibernateProps() {
		
		Properties props=new Properties();
		props.setProperty("hibernate.hbm2ddl.auto","update");
		props.setProperty("hibernate.show_sql","true");
		props.setProperty("hibernate.dialect","org.hibernate.dialect.Oracle10gDialect");
		return props;
	}*/
	
	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:orcl1");
		dataSource.setUsername("System");
		dataSource.setPassword("Anjum123");
		
		return dataSource;
	}

	// 2. Entity Manager Factory instance
	@Bean("entityManagerFactory")
	public LocalContainerEntityManagerFactoryBean createEntityManagerFactory() {

		LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();

		// a. Set DataSource Details // created at step 1
		factory.setDataSource(getDataSource());

		// b. Packages info of Entity classes
		factory.setPackagesToScan("com.*");

		// c. Hibernate FW Properties
		factory.setJpaProperties(configureHibernateProps());

		// 4. Which vendor , impl FW
		HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
		factory.setJpaVendorAdapter(adapter);

		return factory;
	}

	// 3. Create A Transaction manager

	// 3. Create A Transaction manager
	@Bean("transactionManager")
	public PlatformTransactionManager createTransactionManager() {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		// transactionManager.setEntityManagerFactory(createEntityManagerFactory().getObject());
		transactionManager.setEntityManagerFactory(createEntityManagerFactory().getObject());

		return transactionManager;
	}

	public Properties configureHibernateProps() {
		Properties props = new Properties();
		props.setProperty("hibernate.hbm2ddl.auto", "update");
		props.setProperty("hibernate.show_sql", "true");
		props.setProperty("hibernate.dialect", "org.hibernate.dialect.Oracle10gDialect");
		props.setProperty("hibernate.enable_lazy_load_no_trans","true");
		return props;
	}
	
	
}
