
package dip.lab3.student.solution1;


import java.util.Scanner;
public class KeyboardReader implements Reader {

        @Override
	public String readln() {
            System.out.println("Please type some text, then press enter:");

            Scanner input = new Scanner(System.in);
            return input.nextLine();
	}
}
