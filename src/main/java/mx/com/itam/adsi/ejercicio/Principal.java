package mx.com.itam.adsi.ejercicio;
public class Principal{
	
	public static void main(String ... argv){
		System.out.println(convert("FFF1","0123456789ABCDEF"));
	}

	private static int convert(String source, String alphabet){
		int res = 0;
		int base = alphabet.length();
		for(char c : source.toCharArray()){
			res = res*base + alphabet.indexOf(c);
		}
		return res;
	}
}
