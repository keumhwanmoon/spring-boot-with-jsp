package com.jason.interceptor;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author jason, Moon
 * @since 2016. 10. 21.
 */
public class LogInterceptor implements HandlerInterceptor {

    private Logger logger = Logger.getLogger(LogInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object handler) throws Exception {

        logger.info("=============== preHandle Interceptor ===============");

        logger.info(" RequestURI :::" + httpServletRequest.getRequestURI());
        logger.info(" RequestURL :::" + httpServletRequest.getRequestURL());

        logger.info("=============== preHandle Interceptor ===============");

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object handler, ModelAndView mv) throws Exception {

        logger.info("=============== postHandle Interceptor ===============");

        logger.info("User ::: " + mv.getModel().get("user"));

        logger.info("=============== postHandle Interceptor ===============");
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object handler, Exception e) throws Exception {

        logger.info("=============== afterCompletion Interceptor ===============");
    }
}
