package main;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Triangulo
{
  

   public static void  main(String args[])
   {
	   System.out.println(verificaTipoTriangulo(3, 3, 3));  	  
   }
   
   public enum Resposta 
   {
		EQUILATERO, ISOCELES, ESCALENO, NAOTRIANGULO, TRIANGULO;
   }
   
   public static Resposta verificaTipoTriangulo(int a, int b, int c){
	  
      if(a == 0 || b == 0 || c == 0)
	return Resposta.NAOTRIANGULO; 
	  
	   
      if ((c < a+b) && (b < c+a) && (a < c+b))
      {
         if ((a == b) && (b == c)){        
            return Resposta.ESCALENO;       
         }
         else
         {
            if ((a != b) && (b != c) && (c != a)){
               return Resposta.ISOCELES;
            }else{       
               return Resposta.EQUILATERO;
            }
         }
      }
      else{
         return Resposta.TRIANGULO;
      }

       
   }
   
}   