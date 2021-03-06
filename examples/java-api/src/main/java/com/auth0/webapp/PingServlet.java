package com.auth0.webapp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@WebServlet(name="ping-servlet", urlPatterns = { "/ping" })
public class PingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Log log = LogFactory.getLog(PingServlet.class);

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if (log.isTraceEnabled())
			log.trace(String.format("doGet(%s, %s)", req, resp));
		resp.setContentType("text/plain");
		resp.getWriter().write("All good. You don't need authorization to view this");
	}
}
