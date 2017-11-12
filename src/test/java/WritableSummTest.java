import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 12.11.2017.
 */
public class WritableSummTest {
    WritableSumm w = new WritableSumm();

    @Test
    public void testNumberToString() throws Exception {
        String[] str1 = {"","один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять", "десять", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать",
                "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать",
                "двадцать"};
        for (int i = 0; i < 20; i++) {

            assertEquals(str1[i], w.numberToString(i));

        }
    }
}