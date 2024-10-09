package com.tccorp.Lttshop.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.tccorp.Lttshop.Modelo.Persona;

/**
 * Servlet implementation class ServletDeLogeo
 */
public class ServletDeLogeo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletDeLogeo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Persona> empleados = new ArrayList<>();
		empleados.add(new Persona("Raynor", "bustillos", "784512", "rbus", "123raynor", "admin"));
		empleados.add(new Persona("Mario", "casas", "9685", "MCas", "123456789", "operador"));
		String usu = request.getParameter("usuario");
		String pasw = request.getParameter("password");
		int cont = 0;

		for (Persona persona : empleados) {
			if (persona.getLogin().equals(usu) && persona.getPassword().equals(pasw)) {
				String nomAut=persona.getLogin();
				Cookie cookie=new Cookie("logg", nomAut);		
				response.addCookie(cookie);
				if (persona.getRol().equals("admin")) {
					HttpSession session = request.getSession();
					session.setAttribute("usuarioVal", usu);
					session.setAttribute("rol","administrador");
					response.sendRedirect("paginaDeBienvenida.jsp");
					
					break;
				} else {
					HttpSession session = request.getSession();
					session.setAttribute("usuarioVal", usu);
					session.setAttribute("rol","operador");
					response.sendRedirect("paginaDeBienvenida.jsp");
					break;
				}

			}
			cont++;
		}
		if (empleados.size() == cont) {
			response.sendRedirect("index.jsp");
		}

		/*
		 * String usu=request.getParameter("usuario"); String
		 * pasw=request.getParameter("password"); if(usu.equals("Pepe") &&
		 * pasw.equals("123456")) { HttpSession session=request.getSession();
		 * session.setAttribute("usuarioVal", usu);
		 * response.sendRedirect("paginaDeBienvenida.jsp"); }else {
		 * response.sendRedirect("index.jsp"); }
		 */
	}

}
