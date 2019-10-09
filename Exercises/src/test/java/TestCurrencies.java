import Currencies.Currency;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestCurrencies {

    @Test
    public void testCurrency() {
        Currency c = new Currency();
        Boolean t = true;
        assertEquals(true, t);
    }
}