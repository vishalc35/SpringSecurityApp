package com.amazon.springsecurityapp.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


/**
 * NOTE: REMEMBER WE USED AbstractAnnotationConfigDispatcherServletInitializer AND STILL ABLE TO RUN CONTROLLER
 * THIS CLASS IS USED FOR USING SPRING SECURITY FEATURES
 *
 * */
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    private static final Logger log = LoggerFactory.getLogger(WebAppInitializer.class);

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{AppConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

//    private static final String DISPATCHER_NAME="dispatcher";
//
//    @Override
//    public void onStartup(ServletContext servletContext) throws ServletException {
//        log.info("Web App Started!!!");
//
//
//        //create spring application context
//        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
//        context.register(AppConfig.class);
//
//        DispatcherServlet dispatcherServlet = new DispatcherServlet(context);
//
//        ServletRegistration.Dynamic registration = servletContext.addServlet(DISPATCHER_NAME,dispatcherServlet);
//        registration.setLoadOnStartup(1);
//        registration.addMapping("/");
//    }
}
