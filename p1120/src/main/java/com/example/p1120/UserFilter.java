package com.example.p1120;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@WebFilter("/user/*")
public class UserFilter extends HttpFilter implements Filter {
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		log.debug("요청 전 필터 내용");
		chain.doFilter(request, response);
		log.debug("요청 후 필터 내용");
	}
}
