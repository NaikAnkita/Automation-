package ForLoopNsteadPatternProgramme;

public class PrintPatterb {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for (int i = 1 ; i < 6 ; i++)
		{
			for (int j = 1 ; j <= i ; j++) {
				System.out.print("*");
				
			}System.out.println("\n");	//Escape sequence for new line (\n)
			
		}
		for(int i=1; i<6; i++) {
			for (int j=5; j>i; j--) {
				
				System.out.print("*");
			}System.out.println("\n");
		}
		
	}

}
