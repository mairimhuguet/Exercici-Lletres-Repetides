

import java.util.ArrayList;

public class FASE2 {
	
	
	public static void main(String []s) {
		ArrayList<String>Lista=new ArrayList<>();
		
		Lista.add("m");
		Lista.add("i");
		Lista.add("r");
		Lista.add("i");
		Lista.add("a");
		Lista.add("m");
		Lista.add("0");
		
		
		for (int i = 0; i < Lista.size(); i++) {
			
			String Letra=(Lista.get(i));
			
		if (Letra.chars().allMatch(Character::isDigit))
			{
			System.out.println("Els noms de les persones no contenen números!");
			}
		else
		{	
			
			switch (Letra) {
			case "a":
				System.out.println("La letra "+Letra+" es vocal");
				break;
			case "e":
				System.out.println("La letra "+Letra+" es vocal");
				break;
			case "i":
				System.out.println("La letra "+Letra+" es vocal");
				break;
			case "o":
				System.out.println("La letra "+Letra+" es vocal");
				break;
			case "u":
				System.out.println("La letra "+Letra+" es vocal");
				break;
			default:
				System.out.println("La Letra "+Letra+" es consonante");
			}
		}
		
		
		}
		
		}
			
		
			
	
}

