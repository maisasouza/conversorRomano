package puc.aluno.conversorRomano;

import java.util.HashMap;

public class ConversorRomano {

	public String converter(int i) {
		int resto = i;
		StringBuilder romano = new StringBuilder();
		int[] numChaves = {50,10,5,1};
		
		while(resto > 0) {
			for(int j = 0; j < numChaves.length; j++) {
				if(resto == numChaves[j] - 1){
					romano.append(achaLetra(1));
					romano.append(achaLetra(numChaves[j]));
					resto = 0;
					break;
				} else if (resto >= numChaves[j]) {
					romano.append(achaLetra(numChaves[j]));
					resto -= numChaves[j];
					break;
				}
			}
		}

		return romano.toString();
	}

	private String achaLetra(int i) {
		HashMap<Integer,String> mapaRomano = new HashMap<Integer,String>();
		mapaRomano.put(1, "I");
		mapaRomano.put(5, "V");
		mapaRomano.put(10, "X");
		mapaRomano.put(50, "L");
		mapaRomano.put(100, "C");
		mapaRomano.put(500, "D");
		mapaRomano.put(1000, "M");
		
		
		return mapaRomano.get(i);
	}

}
