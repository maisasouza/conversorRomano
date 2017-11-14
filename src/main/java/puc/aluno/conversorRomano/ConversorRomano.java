package puc.aluno.conversorRomano;

public class ConversorRomano {

	public String converter(int i) {
		int resto = i;
		StringBuilder romano = new StringBuilder();
		
		while (resto > 0) {
			if(resto >= 5) {
				romano.append(achaLetra(5));
				resto -= 5;
			} else if (resto >= 1) {
				romano.append(achaLetra(1));
				resto -= 1;
			}
		}
		
		return romano.toString();
	}
	
	private String achaLetra(int i) {
		switch(i) {
		case 5:
			return "V";
		case 1:
			return "I";
		default:
			return "";
	}
	}

}
