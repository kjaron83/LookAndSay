/*
 * Main.java
 * Create Date: Jan 19, 2021
 * Initial-Author: Janos Aron Kiss
 */
package lookandsay;

import java.util.Scanner;

/**
 * @version $Revision$ $LastChangedDate$
 * @author $Author$
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String... args) {
        System.out.println("Hi,");

        LookAndSayGenerator instance = new LookAndSayGeneratorImpl();
        Scanner scan = new Scanner(System.in);
        String member;
        do {
            System.out.println("Enter a member to generate a look-and-say sequence. Enter nothing to exit.");
            member = scan.nextLine().trim();
            if ( !member.isEmpty() )
                System.out.println(instance.lookAndSay(member));
        } while ( !member.isEmpty() );

        System.out.println("Bye.");
    }
    
}
