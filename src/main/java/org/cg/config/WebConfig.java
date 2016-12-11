package org.cg.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("org.cg")
public class WebConfig extends WebMvcConfigurerAdapter {

	
	@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
        registry.addResourceHandler("/apps/login/**").addResourceLocations("file:/usr/local/tomcat/webapps/CC/apps/login/");
        registry.addResourceHandler("/404").addResourceLocations("file:/usr/local/tomcat/webapps/CC/");
        registry.addResourceHandler("/index.html").addResourceLocations("/resources/webapp/index.html","file:/usr/local/tomcat/webapps/CC/");
        registry.addResourceHandler("/bower_components/**").addResourceLocations("file:/usr/local/tomcat/webapps/CC/bower_components/");
        registry.addResourceHandler("/scripts/**").addResourceLocations("file:/usr/local/tomcat/webapps/CC/scripts/");
        registry.addResourceHandler("/js/**").addResourceLocations("file:/usr/local/tomcat/webapps/CC/js/");
        registry.addResourceHandler("/styles/**").addResourceLocations("file:/usr/local/tomcat/webapps/CC/styles/");
        registry.addResourceHandler("/views/**").addResourceLocations("file:/usr/local/tomcat/webapps/CC/views/");
    }
	
	@Bean  
    public UrlBasedViewResolver setupViewResolver() {  
        UrlBasedViewResolver resolver = new UrlBasedViewResolver();  
        resolver.setPrefix("/");  
        resolver.setSuffix(".html");  
        resolver.setViewClass(JstlView.class);  
        return resolver;  
    }  
}
