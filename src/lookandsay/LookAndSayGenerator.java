/*
 * LookAndSayGenerator.java
 * Create Date: Jan 19, 2021
 * Initial-Author: Janos Aron Kiss
 */

package lookandsay;

/**
 * Interface to generate a member of the sequence from the previous member, read off the digits of the previous member,
 * counting the number of digits in groups of the same digit.
 * @version $Revision$ $LastChangedDate$
 * @author $Author$
 */
public interface LookAndSayGenerator {

    /**
     * Returns the new sequence from the previous {@code member}.
     */
    String lookAndSay(CharSequence member);

}
