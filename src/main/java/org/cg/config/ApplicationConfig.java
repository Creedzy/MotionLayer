package org.cg.config;

import org.springframework.beans.factory.config.MethodInvokingFactoryBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperFactoryBean;

import com.fasterxml.jackson.datatype.joda.JodaModule;



@Configuration()
@ComponentScan("org.cg")
@ImportXml("classpath:")
public class ApplicationConfig {

	public Jackson2ObjectMapperFactoryBean objectMapper() {
		Jackson2ObjectMapperFactoryBean objectMapper = new Jackson2ObjectMapperFactoryBean();
		objectMapper.setSimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
		objectMapper.setIndentOutput(true);
		return objectMapper;
	}
	
	public MethodInvokingFactoryBean factoryBean() {
		MethodInvokingFactoryBean factoryBean = new MethodInvokingFactoryBean();
		factoryBean.setTargetClass(Jackson2ObjectMapperFactoryBean.class);
		factoryBean.setTargetMethod("registerModule");
		Object[] obj=new Object[] {JodaModule.class};
		
		factoryBean.setArguments(obj);
		return factoryBean;
		
	}
}
