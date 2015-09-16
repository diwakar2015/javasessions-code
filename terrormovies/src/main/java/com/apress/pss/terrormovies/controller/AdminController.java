package com.apress.pss.terrormovies.controller;

import java.security.Principal;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@RequestMapping(method = RequestMethod.POST, value = "/movies")
	@ResponseBody
	public String createMovie(@RequestBody String movie) {
		System.out.println("Adding movie!! "+movie);
		return "created";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/movies")
    @ResponseBody
    public String createMovie() {
        UserDetails user = (UserDetails)SecurityContextHolder.getContext().getAuthentication().
        getPrincipal();
        System.out.println("returned movie!");
        return "User "+user.getUsername()+" is accessing movie x";
    }

	@RequestMapping(method = RequestMethod.GET, value = "/sessions")
	@ResponseBody
	public String returnSessionValue(HttpServletRequest request) {
		
		
/*	UserDetails u = (UserDetails)SecurityContextHolder.getContext().
			   getAuthentication().getPrincipal();
		
		System.out.println("UserName retrieved from header request :  "+ u.getUsername());
		System.out.println("Password retrieved from header request :  "+ u.getUsername());
		System.out.println("Roles : "+ u.getAuthorities().toString());*/
		
		//Print all the header informations
		Enumeration headerNames = request.getHeaderNames();
		while(headerNames.hasMoreElements()) {
		  String headerName = (String)headerNames.nextElement();
		  System.out.println("Headers : "+ request.getHeader(headerName));
		}
		
		HttpSession session = request.getSession();
		//Remote user
		
		System.out.println("Remote user "+ request.getRemoteUser());
		session = request.getSession();
		
		System.out.println("Sessions details : "+ session.getAttribute("SPRING_SECURITY_CONTEXT").toString());
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
		System.out.println("Authenticated Username : "+ auth.getName());
		
		System.out.println("Details: "+ auth.getDetails());
		
		Iterator roles = auth.getAuthorities().iterator();
		
		while(roles.hasNext())
		{
			System.out.println("Roles : "+ roles.next());
		}
		
		
		return "done!!";

	}



}