package fundations;

public class NotationPoint {
	public static void main(String[] args) {
		String s = "Bom dia X";
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!");
		
		System.out.println(s);
		
		String x = "Jão".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X".replace("x", "Gui").toUpperCase().concat("!!!");
		System.out.println(y);
	}
}
