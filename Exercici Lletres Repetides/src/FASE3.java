
import java.util.Hashtable;


public class FASE3 {

	public static void main(String args[]) {
		
		String miriam = "miriam";
		int count = 0;
		
		Hashtable<String,String> hashtable = 
				new Hashtable<String, String>();
		
		for (int i = 0; i < miriam.length(); i++) {
		count=0;	
			for (int j = 0; j < miriam.length(); j++) {
		
				if (miriam.charAt(i)==miriam.charAt(j)) {
					count++;
				}
			}
			String str1 = String.valueOf(count);
			//hashtable.put(miriam.charAt(i), str1);
			hashtable.put("m", str1);
			hashtable.put("i", str1);
			hashtable.put("r", str1);
			hashtable.put("i", str1);
			hashtable.put("a", str1);
			hashtable.put("m", str1);
				
			System.out.println(miriam.charAt(i)+" té "+str1+" unitats");
	
				
		}
		
	}
}
