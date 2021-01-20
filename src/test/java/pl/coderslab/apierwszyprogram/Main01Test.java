package pl.coderslab.apierwszyprogram;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import static org.assertj.core.api.Assertions.*;

public class Main01Test {

    private static final Object EXPECTED_OUTPUT = 30;

    public static void main(String[] args) {

        System.out.println("Hello world");
        }

    String output;

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Before
    public void setUp() {
        Main01.main(null);
        output = systemOutRule.getLog();
    }

    @Test
    public void whenRun_thenSystemOut_printHelloWorld() {
      assertThat(output.trim()).contains((CharSequence) EXPECTED_OUTPUT);
    }
}