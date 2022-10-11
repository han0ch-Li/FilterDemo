package org.example.Filter;

import javax.servlet.*;
import java.io.IOException;

public class CharacterEncodingFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("CharacterEncoding initialize successfully");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletResponse.setCharacterEncoding("utf-8");
        servletRequest.setCharacterEncoding("utf-8");
        servletResponse.setContentType("text/html;charset=utf-8");
        System.out.println("过滤器执行前");
        filterChain.doFilter(servletRequest,servletResponse);//让程序继续执行，如果不写，程序会被拦截停止
        System.out.println("过滤器执行后");

    }

    @Override
    public void destroy() {
        System.out.println("CharacterEncoding destroy successfully");
    }
}
