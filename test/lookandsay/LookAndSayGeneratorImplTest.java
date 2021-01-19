/*
 * LookAndSayGeneratorImplTest.java
 * Create Date: Jan 19, 2021
 * Initial-Author: Janos Aron Kiss
 */
package lookandsay;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test class of {@link LookAndSayGeneratorImpl}.
 * @version $Revision$ $LastChangedDate$
 * @author $Author$
 */
public class LookAndSayGeneratorImplTest {
    
    private static final String[] DATA = new String[]{"1", "11", "21", "1211", "111221", "312211", "13112221", "1113213211"};
    
    public LookAndSayGeneratorImplTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of lookAndSay method, of class LookAndSayGeneratorImpl.
     */
    @Test
    public void testLookAndSay() {
        System.out.println("lookAndSay");
        LookAndSayGeneratorImpl instance = new LookAndSayGeneratorImpl();
        assertEquals(null, instance.lookAndSay(null));
        assertEquals("", instance.lookAndSay(""));
        for ( int i = 1; i < DATA.length; i++ )
            assertEquals(DATA[i], instance.lookAndSay(DATA[i - 1]));
    }
    
}
