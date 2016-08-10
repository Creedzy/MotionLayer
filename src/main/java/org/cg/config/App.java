package org.cg.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

	import javax.servlet.ServletContext;
	import javax.servlet.ServletException;
	import javax.servlet.ServletRegistration;
	 
	import org.springframework.web.WebApplicationInitializer;
	import org.springframework.web.context.ContextLoaderListener;
	import org.springframework.web.context.WebApplicationContext;
	import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
	import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


	
	
	 
	public class App extends AbstractAnnotationConfigDispatcherServletInitializer  {
		
	   
		@Override
		protected Class<?>[] getRootConfigClasses() {
			
			return new Class[]{ SecurityConfig.class};
		}

		@Override
		protected Class<?>[] getServletConfigClasses() {
			
			return new Class[]{ WebConfig.class,ApplicationConfig.class};
		}

		@Override
		protected String[] getServletMappings() {
			
			return new String[]{"/"};
		}

	   

	}
