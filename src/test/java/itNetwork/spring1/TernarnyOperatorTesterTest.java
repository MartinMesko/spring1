package itNetwork.spring1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.stream.Stream;

class TernarnyOperatorTesterTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams()
    {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams()
    {
        System.setOut(originalOut);
    }

    @ParameterizedTest
    @MethodSource("provideInput")
    public void testMain(String input, String expected)
    {
        ByteArrayInputStream inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);
        TernarnyOperatorTester.main(new String[]{});
        Assertions.assertEquals(expected, outContent.toString());
    }


    private static Stream<Arguments> provideInput()
    {
        return Stream.of(
                Arguments.of("17\n", "Zadaj vek osoby: Mladistva osoba\n"),
                Arguments.of("18\n", "Zadaj vek osoby: Osoba starsia ako 18 rokov\n"),
                Arguments.of("19\n", "Zadaj vek osoby: Osoba starsia ako 18 rokov\n")
        );
    }

}