package com.ericsson.ecanzho.cxf_oauth2.common.servlet;

import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.web.WebApplicationInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * Created by ecanzho on 6/12/2016.
 */
public class CxfServletInitializer implements WebApplicationInitializer {
    public void onStartup(ServletContext servletContext) throws ServletException {
        ServletRegistration.Dynamic cxfServlet = servletContext.addServlet("cxfServlet", new CXFServlet());
        cxfServlet.setLoadOnStartup(1);
        cxfServlet.addMapping("/rest/*");
    }
}
