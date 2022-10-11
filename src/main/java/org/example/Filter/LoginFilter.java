package org.example.Filter;

import org.example.util.Constant;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest request = (HttpServletRequest)servletRequest;
        HttpServletResponse response = (HttpServletResponse)servletResponse;

        if(request.getSession().getAttribute(Constant.USER_SESSION) == null){
            response.sendRedirect("/FilterDemo/error.jsp");
        }

        filterChain.doFilter(request,response);
    }

    @Override
    public void destroy() {

    }
}
