package operadoresBasicos;

public class ConversionTipos {

	public static void main(String[] args) {
		byte monederoPequeyo = 10;
		int monederoMediano = 10000;
		long monederoGrande = 10000000000l;
		
		//monederoGrande = monederoMediano; // conversión automática
		//monederoMediano = monederoPequeyo;
		
		monederoPequeyo = (byte) monederoMediano; //conversión explícita (cast)
		
		System.out.println("Monedero pequeño: " + monederoPequeyo);
		System.out.println("Monedero mediano: " + monederoMediano);
		System.out.println("Monedero grande: " + monederoGrande);

	}

}
