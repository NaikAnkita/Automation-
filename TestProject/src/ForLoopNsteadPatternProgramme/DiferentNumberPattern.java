package ForLoopNsteadPatternProgramme;

public class DiferentNumberPattern {
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int c=1;
		
		for (int i=1; i<=5; i++) {
			for (int j=0; j<i; j++) {	//j value get increase twice bcs i value is 2 nad it will get increase as c
				System.out.print(c + "\t");
				++c;
			}System.out.println();	//same number print
		}
		
	}
}
