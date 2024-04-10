package Utilities;

public class MatUtilities {
	
	public static double ApplyDiscValor(double a, double b){
		//Aplicar desconto % em um valor:
		return a - (a*(b/100));
	}
	
	public static double IncrementPercVal(double a, double b) {
		//Incrementar % a um valor:
		return a + (a*(b/100));
	}
	
	public static double SamplingOne(double a, double b) {
		//Amostragem - Quanto X% representa de Y:
		return (a+b)/100;
	}
	
	public static double SamplingTwo(double a, double b) {
		//Amostragem 2 - Quanto X representa de Y:
		return (b*100)/a;
	}
	
	public static double ValueDescWas(double a, double b) {
		//Valor era A e paguei B, qual foi o desconto%?
		return ((a-b)/a)*100;
	}
	
	public static double DeltaVariation(double a, double b) {
		//Variação Delta(%) - diferença % entre valores
		return 100-((b*100)/a);
	}
	
	public static double OriginalValue(double a, double b) {
		return (a * 100 / (100 - b));
	}
	
	public static double ThreeRule(double a, double b, double r1) {

		return (r1*b)/a;
	}
	
	public static String KeyGenerator(int size, boolean upper, boolean lower, boolean number, boolean simble) {
		 String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
		 String numbersCase = "0123456789";
		 String simbolsCase = "!@#$%^&*_=+-/";
		 
		return "";
	}
}