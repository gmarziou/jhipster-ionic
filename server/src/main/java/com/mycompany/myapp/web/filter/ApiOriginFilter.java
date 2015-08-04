package com.mycompany.myapp.web.filter;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;

/**
 * Filter to add CORS headers to responses.
 *
 * Copied from https://github.com/swagger-api/swagger-codegen/blob/master/modules/swagger-codegen/src/main/resources/JavaSpringMVC/apiOriginFilter.mustache
 */
public class ApiOriginFilter implements javax.servlet.Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
        HttpServletResponse res = (HttpServletResponse) response;
        res.addHeader("Access-Control-Allow-Origin", "*");
        res.addHeader("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT");
        res.addHeader("Access-Control-Allow-Headers", "Content-Type");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }
}
