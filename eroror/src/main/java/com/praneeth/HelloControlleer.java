package com.praneeth;

import java.io.IOException;
import java.net.URL;
import java.net.http.HttpResponse;

import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.function.ServerRequest.Headers;
import org.springframework.web.servlet.mvc.method.annotation.HttpHeadersReturnValueHandler;

@RestController
public class HelloControlleer implements ErrorController {
	HttpHeaders header=null;
HttpResponse  res=null;
	@RequestMapping("/hello")
	public String helloworld()
	{
		return "praneeth";
	}

	@Override
	public String getErrorPath() {
		// TODO Auto-generated method stub
		return null;
			}
	@RequestMapping("/error")
	public String errorPage(HttpServletResponse response) throws IOException
	{
		WebMvcConfigurer co=null;
		response.setHeader("ramesh", "praneeth");
response.setContentType("text/json");
/*
		 * HttpServletResponse response=null; response.setStatus(404, "ramesh kamesh");
		 */
return "error page"+response;
	}}
