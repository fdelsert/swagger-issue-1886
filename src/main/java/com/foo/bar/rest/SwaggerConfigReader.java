package com.foo.bar.rest;



import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

import io.swagger.jaxrs.config.BeanConfig;
import io.swagger.jaxrs.config.DefaultJaxrsConfig;


public class SwaggerConfigReader extends DefaultJaxrsConfig {

    /**
     * 
     */
    private static final long serialVersionUID = 1638783798880874518L;

    @Override
    public void init(ServletConfig config) throws ServletException {

        super.init(config);
        //contextPath will be null for host2 and /xyz for host1.
        String contextPath = config.getServletContext().getContextPath();
        BeanConfig beanConfig = new BeanConfig();
        beanConfig.setVersion("1.0.0");
        beanConfig.setTitle("rest API Documentation");
        beanConfig.setSchemes(new String[] {
                "http", "https"
        });
        
        beanConfig.setResourcePackage("com.foo.bar.rest");
        beanConfig.setBasePath(contextPath);
        beanConfig.setScan(true);
    }
}