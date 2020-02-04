/*
 * Formatar: Minusculo - toLowerCase(), maiusculo - toUpperCase(), remover espa�o - trim()
 * Recortar: substring(inicio), substring(inicio, fim)
 * Substituir caracter/string: Replace(char, char), Replace(string, string)
 * Buscar: IndexOf, LastIndexOf
 * recortar: str.split("")
 */

public class exemplo_formatar_string {

	public static void main(String[] args) {

		String original = "abcde FGHIJ ABC abc DEFG          ";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2,9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xy");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		System.out.println("--------- String Original ----------");
		System.out.println(original + "-");
		System.out.println("--------- String Modificada S01 ---------");
		System.out.println(s01 + "-");
		System.out.println("--------- String Modificada S02 ---------");
		System.out.println(s02 + "-");
		System.out.println("--------- String Modificada S03 ---------");
		System.out.println(s03 + "-");
		System.out.println("--------- String Modificada S04 ---------");
		System.out.println(s04 + "-");
		System.out.println("--------- String Modificada S05 ---------");
		System.out.println(s05 + "-");
		System.out.println("--------- String Modificada S06 ---------");
		System.out.println(s06 + "-");
		System.out.println("--------- String Modificada S07 ---------");
		System.out.println(s07 + "-");
		System.out.println("--------- Index of ---------");
		System.out.println(i + "-");
		System.out.println("--------- Last index of ---------");
		System.out.println(j + "-");
	}

}
