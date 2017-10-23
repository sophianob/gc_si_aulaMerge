package test;
import static org.junit.Assert.*;
import static org.junit.Assert.fail;

import java.math.BigDecimal;

import main.Triangulo;
import main.Triangulo.Resposta;

import org.junit.Test;


public class TrianguloTest {

	@Test
	public void testVerificaTrianguloIsocelesTipo1(){
		Triangulo t = new Triangulo();
		assertEquals(Resposta.ISOCELES, t.verificaTipoTriangulo(2, 2, 1));
	}
	
	@Test
	public void testVerificaTrianguloIsocelesTipo2(){
		Triangulo t = new Triangulo();
		assertEquals(Resposta.ISOCELES, t.verificaTipoTriangulo(1, 2, 2));
	}
	
	@Test
	public void testVerificaTrianguloIsocelesTipo3(){
		Triangulo t = new Triangulo();
		assertEquals(Resposta.ISOCELES, t.verificaTipoTriangulo(2, 3, 2));
	}
	
	@Test
	public void testVerificaTrianguloEquilatero(){	
		Triangulo t = new Triangulo();	
		assertEquals(Resposta.EQUILATERO, t.verificaTipoTriangulo(2, 2, 2));
	}
	
	@Test
	public void testVerificaTrianguloEscaleno(){	
		Triangulo t = new Triangulo();	
		assertEquals(Resposta.ESCALENO, t.verificaTipoTriangulo(8, 4, 6));
	}

	@Test
	public void testVerificaValorNegativoLado1(){	
		Triangulo t = new Triangulo();	
		assertEquals(Resposta.NAOTRIANGULO, t.verificaTipoTriangulo(-20, 2, 2));
	}
	
	@Test
	public void testVerificaValorNegativoLado2(){	
		Triangulo t = new Triangulo();	
		assertEquals(Resposta.NAOTRIANGULO, t.verificaTipoTriangulo(3, -2, 2));
	}
	
	@Test
	public void testVerificaValorNegativoLado3(){	
		Triangulo t = new Triangulo();	
		assertEquals(Resposta.NAOTRIANGULO, t.verificaTipoTriangulo(4, 2, -4));
	}
	
	@Test
	public void testVerificaValorNegativoLado1e2(){	
		Triangulo t = new Triangulo();	
		assertEquals(Resposta.NAOTRIANGULO, t.verificaTipoTriangulo(-4, -2, 4));
	}
	
	
	@Test
	public void testVerificaValorNegativoLado2e3(){	
		Triangulo t = new Triangulo();	
		assertEquals(Resposta.NAOTRIANGULO, t.verificaTipoTriangulo(4, -2, -4));
	}
	
	@Test
	public void testVerificaValorNegativoLado1e3(){	
		Triangulo t = new Triangulo();	
		assertEquals(Resposta.NAOTRIANGULO, t.verificaTipoTriangulo(-4, 4, -4));
	}
	
	@Test
	public void testVerificaValorNegativoLados(){	
		Triangulo t = new Triangulo();	
		assertEquals(Resposta.NAOTRIANGULO, t.verificaTipoTriangulo(-4, -4, -4));
	}
	
	@Test
	public void testVerificaValorZeroLado1(){	
		Triangulo t = new Triangulo();	
		assertEquals(Resposta.NAOTRIANGULO, t.verificaTipoTriangulo(0, 2, 3));
	}
	
	@Test
	public void testVerificaValorZeroLado2(){	
		Triangulo t = new Triangulo();	
		assertEquals(Resposta.NAOTRIANGULO, t.verificaTipoTriangulo(3, 0, 3));
	}
	
	@Test
	public void testVerificaValorZeroLado3(){	
		Triangulo t = new Triangulo();	
		assertEquals(Resposta.NAOTRIANGULO, t.verificaTipoTriangulo(3, 3, 0));
	}
	
	@Test
	public void testVerificaValorZeroLado1e2(){	
		Triangulo t = new Triangulo();	
		assertEquals(Resposta.NAOTRIANGULO, t.verificaTipoTriangulo(0, 0, 1));
	}
	
	@Test
	public void testVerificaValorZeroLado2e3(){	
		Triangulo t = new Triangulo();	
		assertEquals(Resposta.NAOTRIANGULO, t.verificaTipoTriangulo(1, 0, 0));
	}
	
	@Test
	public void testVerificaValorZeroLado1e3(){	
		Triangulo t = new Triangulo();	
		assertEquals(Resposta.NAOTRIANGULO, t.verificaTipoTriangulo(0, 4, 0));
	}
	
	@Test
	public void testVerificaValorZeroLados(){	
		Triangulo t = new Triangulo();	
		assertEquals(Resposta.NAOTRIANGULO, t.verificaTipoTriangulo(0, 0, 0));
	}
}

