package puc.aluno.conversorRomano;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class ConversorRomanoTeste {
	
	@Test
	public void TesteRetornaUm() {
		ConversorRomano conversor = new ConversorRomano();
		
		String numRomano = conversor.converter(1);
		assertEquals("I", numRomano);
	}
	
	@Test
	public void TesteRetornaCinco() {
		ConversorRomano conversor = new ConversorRomano();
		
		String numRomano = conversor.converter(5);
		assertEquals("V", numRomano);
	}
	
	@Test
	public void TesteRetornaSete() {
		ConversorRomano conversor = new ConversorRomano();
		
		String numRomano = conversor.converter(7);
		assertEquals("VII", numRomano);
	}
	
	@Test
	public void TesteRetornaQuatro() {
		ConversorRomano conversor = new ConversorRomano();
		
		String numRomano = conversor.converter(4);
		assertEquals("IV", numRomano);
	}
	
	@Test
	public void TesteRetornaDez() {
		ConversorRomano conversor = new ConversorRomano();
		
		String numRomano = conversor.converter(10);
		assertEquals("X", numRomano);
	}
	
	@Test
	public void TesteRetornaCinquenta() {
		ConversorRomano conversor = new ConversorRomano();
		
		String numRomano = conversor.converter(50);
		assertEquals("L", numRomano);
	}
	
	@Test
	public void TesteRetornaQuarenta() {
		ConversorRomano conversor = new ConversorRomano();
		
		String numRomano = conversor.converter(50);
		assertEquals("XL", numRomano);
	}
	
}
