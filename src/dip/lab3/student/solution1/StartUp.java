
package dip.lab3.student.solution1;

public class StartUp {

	public static void main(String[] args) {
		Reader reader = new KeyboardReader();
		Writer writer = new ConsoleWriter();
		
		Copier copier = new Copier( reader, writer );
		copier.copy();
	}
}
