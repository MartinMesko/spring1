package itNetwork.spring1;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class StreamUtils {
    // Metóda na nastavenie System.out do nového ByteArrayOutputStream a vrátenie tohto streamu.
    public static ByteArrayOutputStream setSystemOut() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        return outContent;
    }

    // Metóda na obnovenie pôvodného System.out
    public static void restoreSystemOut(PrintStream originalOut) {
        System.setOut(originalOut);
    }

    // Metóda na nastavenie System.in na nový ByteArrayInputStream vytvorený z daného vstupu.
    public static void setSystemIn(String input) {
        ByteArrayInputStream inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);
    }

    // Metóda na vytvorenie ByteArrayInputStream z daného vstupného reťazca.
    public static ByteArrayInputStream createByteArrayInputStream(String input) {
        return new ByteArrayInputStream(input.getBytes());
    }

    // Metóda na vytvorenie ByteArrayOutputStream.
    public static ByteArrayOutputStream createByteArrayOutputStream() {
        return new ByteArrayOutputStream();
    }

    // Metóda na vytvorenie PrintStream z daného ByteArrayOutputStream.
    public static PrintStream createPrintStream(ByteArrayOutputStream outputStream) {
        return new PrintStream(outputStream);
    }
}