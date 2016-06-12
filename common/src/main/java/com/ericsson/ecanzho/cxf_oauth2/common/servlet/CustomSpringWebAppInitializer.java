package com.ericsson.ecanzho.cxf_oauth2.common.servlet;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.request.RequestContextListener;
import org.springframework.web.context.support.XmlWebApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * Created by ecanzho on 6/12/2016.
 */
public class CustomSpringWebAppInitializer implements WebApplicationInitializer {
    public void onStartup(ServletContext servletContext) throws ServletException {
        XmlWebApplicationContext xmlWebAppCtx = new XmlWebApplicationContext();
        xmlWebAppCtx.setConfigLocation("classpath*:applicationContext.xml");
        xmlWebAppCtx.setServletContext(servletContext);

        servletContext.addListener(new ContextLoaderListener(xmlWebAppCtx));
        servletContext.addListener(new RequestContextListener());
    }
}
