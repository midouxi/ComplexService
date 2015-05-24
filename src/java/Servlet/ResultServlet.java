/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Beans.ComplexBean;
import java.io.IOException;
import java.util.Objects;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author macbookpro
 */
public class ResultServlet extends HttpServlet {


  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ComplexBean c1 = new ComplexBean(Float.parseFloat(request.getParameter("reel1")),Float.parseFloat(request.getParameter("img1")));
        ComplexBean c2 = new ComplexBean(Float.parseFloat(request.getParameter("reel2")),Float.parseFloat(request.getParameter("img2")));
        ComplexBean c3 =new ComplexBean();
        double d1 = -1;
        if(request.getParameter("operation").equals("somme")){
           c3=somme(c1,c2);
        } else if (request.getParameter("operation").equals("multiplication")) {
            c3=multiplication(c1,c2);
        } else if (request.getParameter("operation").equals("soustraction")){
            c3=soustraction(c1, c2);
        } else if (request.getParameter("operation").equals("module")){
            d1=module(c1);
        } else if (request.getParameter("operation").equals("conjugue")){
            c3=conjugue(c1);
        }
        
        if(c3.getImg()!=0 && c3.getReel()!= 0 ){
            request.setAttribute("reel", c3.getReel());
            request.setAttribute("img", c3.getImg());
        }
        if(d1>=0){
           request.setAttribute("module",d1);
        }
        this.getServletContext().getRequestDispatcher( "/WEB-INF/result.jsp" ).forward( request, response );
                
    }
    
    public ComplexBean somme(ComplexBean c1,ComplexBean c2){
        ComplexBean c3=new ComplexBean();
        c3.setReel(c1.getReel()+c2.getReel());
        c3.setImg(c1.getImg()+c2.getImg());
        return c3;
    }
    
    public ComplexBean multiplication(ComplexBean c1,ComplexBean c2){
        ComplexBean c3=new ComplexBean();
        c3.setReel(c1.getReel()*c2.getReel());
        c3.setImg(c1.getImg()*c2.getImg());
        return c3;
    }
    
    public ComplexBean soustraction(ComplexBean c1,ComplexBean c2){
        ComplexBean c3=new ComplexBean();
        c3.setReel(c1.getReel()-c2.getReel());
        c3.setImg(c1.getImg()-c2.getImg());
        return c3;
    }
    
    public double module(ComplexBean c1) {
        double result = Math.sqrt(Math.pow(c1.getReel(),2)+Math.pow(c1.getImg(),2));
        return result;
    }
    
    public ComplexBean conjugue(ComplexBean c1){
        ComplexBean c3=new ComplexBean();
        c3.setReel(c1.getReel());
        c3.setImg((-1)*c1.getImg());
        return c3;
    }
}
