
package dip.lab3.student.solution1;



public class Copier {
	
	private final Reader reader;
	private final Writer writer;
	public Copier( Reader reader, Writer writer ) {
		this.reader = reader;
		this.writer = writer;
	}
	
	/**
	 * Copy one line of input from reader to writer.
	 * Program ends when carriage return is entered. Notice how flexible 
	 * this is due to polymorphism!
	 */
	public void copy() {
            String line = reader.readln();
            writer.writeln( line );
	}
}
