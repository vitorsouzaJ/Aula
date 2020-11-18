package br.univille.app.mvc.conversor;

public class ConversorConta  {
	
	private static  double numInicial ;
	private static double numFinal;
	
	
	
	public void setNumInicial(double numInicial) {
		this.numInicial = numInicial;
	}



	public void setNumFinal(double numFinal) {
		this.numFinal = numFinal;
	}

	
	
	public static String celsiusFahrenheit() {
		numFinal = (numInicial * 1.8) + 32;
		String telas =  Double.toString(numFinal);
		return telas;
	}
	
	public static String celsiusKelvin() {
		numFinal = numInicial + 273.15;
		String telas =  Double.toString(numFinal);
		return telas;
	}

	
	public static String fahrenheitKelvin() {
		numFinal = (numInicial - 32) * 0.555556 + 273.15; 
		String telas =  Double.toString(numFinal);
		return telas;
	}

	
	public static String fahrenheitCelsius() {
		numFinal = (numInicial - 32) * 0.555556;
		String telas =  Double.toString(numFinal);
		return telas;
	}

	
	public static String kelvinCelsius() {
		numFinal = numInicial -273.15;
		String telas =  Double.toString(numFinal);
		return telas;
	}

	
	public static String kelvinFahrenheit() {
		numFinal = (numInicial -273.15) * 1.8 + 32;
		String telas =  Double.toString(numFinal);
		return telas;
	}



	
}
	
	
	
	
	
	
	
	
	
