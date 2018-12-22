package me.sumithpuri.github.manila.maven.sample.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * MIT License
 *
 * Copyright (c) 2018-19,	Sumith Kumar Puri
 *
 * GitHub URL 			https://github.com/sumithpuri
 * Blog Post URL		http://www.techilashots.com/2015/02/starting-with-apache-maven.html	
 * Blog Short URL		https://goo.gl/F3SUJA
 * Package Prefix 		me.sumithpuri.github.manila
 * Project Codename		manila
 * Contact E-Mail		code@sumithpuri.me
 * Contact WhatsApp		+91 9591497974
 *
 *
 * Permission is hereby  granted,  free  of  charge, to  any person  obtaining a  copy of  this  software and associated 
 * documentation files (the "Software"), to deal in the  Software without  restriction, including without limitation the 
 * rights to use, copy, modify, merge, publish, distribute, sub-license and/or sell copies of the Software and to permit 
 * persons to whom the Software is furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in  all copies or substantial portions of the 
 * Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS  OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE 
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR 
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES  OR  OTHER  LIABILITY, WHETHER IN AN ACTION  OF  CONTRACT, TORT OR 
 * OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
public class Manila extends HttpServlet {

	static {
		System.out.println("Copyright (c) 2018-19,	Sumith Kumar Puri");
		System.out.println();
		System.out.println("Project Codename      Manila");
		System.out.println("Project Description   Apache Maven Sample");
		System.out.println("Technical Blog        http://www.techilashots.com");
		System.out.println("Technical Blog Post   https://goo.gl/F3SUJA");
		System.out.println("[Developer Notes]     [01] Use Java Version 9.0+ Compiler");
		System.out.println("[Developer Notes]     [01] Use Apache Tomcat 9.0+ Server");
		System.out.println();
	}
	
	public void doGet(HttpServletRequest httpRequest, HttpServletResponse httpResponse) 
				throws ServletException, IOException {
		
		PrintWriter out = httpResponse.getWriter();

		out.println("Copyright (c) 2018-19,	Sumith Kumar Puri");
		out.println();
		out.println("Project Codename      Manila");
		out.println("Project Description   Apache Maven Sample");
		out.println("Technical Blog        http://www.techilashots.com");
		out.println("Technical Blog Post   https://goo.gl/F3SUJA");
		out.println("[Developer Notes]     [01] Use Java Version 9.0+ Compiler");		
		out.println("[Developer Notes]     [01] Use Apache Tomcat 9.0+ Server");		
		out.println();
		out.println();
		out.println("----------------------------------------------------------------");
		out.println("          ***** Manila is [Pearl of the Orient] *****           ");
		out.println("----------------------------------------------------------------");
		out.println("Read [Starting with Apache Maven] at https://goo.gl/F3SUJA");
		out.println("Refer to the Maven [pom.xml] Structure from Source Code");
		out.println("----------------------------------------------------------------");
		out.close();
		return;
	}
}


