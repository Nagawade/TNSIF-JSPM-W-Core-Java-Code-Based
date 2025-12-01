package com.exception.tnsif;

public class NestedTryCatch2 {
	
	public static void check() {
		
		String m = "MAULI";
		
		int y = 7;
		
		String x = null;
		try {
			try {
				
				int ele = m.charAt(y);
				
			}
			catch(StringIndexOutOfBoundsException e) {
				
				System.err.println("Error :"+e.getMessage());
			}
			
			int leng = x.length();
			
			
			
		
		}
		catch(NullPointerException err) {
			System.err.println("Error :"+err.getMessage());
		}
	}

}
