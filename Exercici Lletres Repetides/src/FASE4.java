

import java.util.ArrayList;

public class FASE4 {
	
	
	public static void main(String []s) {
		
		ArrayList<String>ListaNombre=new ArrayList<>();
		
		ListaNombre.add("M");
		ListaNombre.add("i");
		ListaNombre.add("r");
		ListaNombre.add("i");
		ListaNombre.add("a");
		ListaNombre.add("m");
				
		ArrayList<String>ListaApellido=new ArrayList<>();
		
		ListaApellido.add("H");
		ListaApellido.add("u");
		ListaApellido.add("g");
		ListaApellido.add("u");
		ListaApellido.add("e");
		ListaApellido.add("t");
		
		ArrayList<String>ListaNombreEntero=new ArrayList<>();
		
		ListaNombreEntero.addAll(ListaNombre);
		ListaNombreEntero.add(" ");
		ListaNombreEntero.addAll(ListaApellido);
		
		for (int i = 0; i < ListaNombreEntero.size(); i++) {
			
		System.out.print(ListaNombreEntero.get(i));
		}
	
			
			
			
	}
}