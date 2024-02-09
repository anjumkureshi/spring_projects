package com.indianrailways;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DSConfig extends AbstractAnnotationConfigDispatcherServletInitializer
{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {MVCConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
	 String[] allowedURIs= {"/"};
	 return allowedURIs;
	}

}
