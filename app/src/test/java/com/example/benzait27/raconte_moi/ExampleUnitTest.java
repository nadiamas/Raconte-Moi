package com.example.benzait27.raconte_moi;

import org.junit.Test;
/*import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.junit.runner.RunWith;*/
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
//@RunWith(JUnitQuickcheck.class)
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    public class StringProperties {
      //  @Property
        public void concatenationLength(String s1, String s2) {
            assertEquals(s1.length() + s2.length(), (s1 + s2).length());
        }
    }
}
