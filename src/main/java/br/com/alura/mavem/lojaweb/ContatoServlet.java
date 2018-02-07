package br.com.alura.mavem.lojaweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.maven.produtos.Produto;

@WebServlet(urlPatterns="/contato")
public class ContatoServlet  extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Produto produto = new Produto("Bala", 0.35);		
		PrintWriter writer = resp.getWriter();
		writer.println("<html><h2> Entre em Contato conosco "+produto.getNome()+"</h2></html>");
		writer.close();
		
		
	}

}
