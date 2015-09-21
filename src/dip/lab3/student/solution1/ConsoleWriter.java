
package dip.lab3.student.solution1;


public class ConsoleWriter implements Writer {
        @Override
	public void writeln( String line ) {
            System.out.println("Here is your text.");
            System.out.println( line );
	}
}
