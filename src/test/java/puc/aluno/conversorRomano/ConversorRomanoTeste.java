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
		
		String numRomano = conversor.converter(7);
		assertEquals("IV", numRomano);
	}
}
