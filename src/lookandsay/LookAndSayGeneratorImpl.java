/*
 * LookAndSayGeneratorImpl.java
 * Create Date: Jan 19, 2021
 * Initial-Author: Janos Aron Kiss
 */

package lookandsay;

/**
 * Base implementation of the {@link LookAndSayGenerator} interface.
 * @version $Revision$ $LastChangedDate$
 * @author $Author$
 */
public class LookAndSayGeneratorImpl implements LookAndSayGenerator {

    @Override
    public String lookAndSay(CharSequence member) {
        if ( member == null )
            return null;

        if ( member.length() == 0 )
            return "";
        
        if ( member.length() == 1 )
            return "1" + member;
        
        return generateLookAndSay(member);
    }

    private String generateLookAndSay(CharSequence member) {
        int length = member.length();

        StringBuilder sb = new StringBuilder(length * 2);

        int counter = 1;
        char lastChar = member.charAt(0);
        char currentChar;
        for ( int i = 1; i < member.length(); i++ ) {
            currentChar = member.charAt(i);
            if ( currentChar != lastChar ) {
                sb.append(counter).append(lastChar);
                lastChar = currentChar;
                counter = 1;
            }
            else
                counter++;
        }
        
        return sb.append(counter).append(lastChar).toString();
    }

}
