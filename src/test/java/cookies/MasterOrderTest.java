package cookies;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MasterOrderTest {

    @Test
    public void shouldReturnTotalBoxesOf1() {
        MasterOrder underTest = new MasterOrder();
        CookieOrder cookieOrderTest = new CookieOrder(" ", 1);
        underTest.addOrder(cookieOrderTest);
        int check = underTest.getTotalBoxes();
        assertEquals(1, check);
    }@Test
    public void shouldReturnTotalBoxesOf2() {
        MasterOrder underTest = new MasterOrder();
        CookieOrder cookieOrderTest2 = new CookieOrder("", 2);
        underTest.addOrder(cookieOrderTest2);
        int check = underTest.getTotalBoxes();
        assertEquals(2, check);
    }
    @Test
    public void shouldReturnTotalBoxesAsOneAfterRemoval(){
        MasterOrder underTest = new MasterOrder();
        CookieOrder cookieOrderTest = new CookieOrder("Thin Mints", 1);
        CookieOrder cookieOrderTest2 = new CookieOrder("SAMOAS", 1);
        underTest.addOrder(cookieOrderTest);
        underTest.addOrder(cookieOrderTest2);
        underTest.removeVariety("Thin Mints");
        int check = underTest.getTotalBoxes();
        assertEquals(1, check);
    }
    @Test
    public void shouldReturnTotalBoxesWithMultipleOrdersSameVarietyAsOneRemovalOfAll (){
        MasterOrder underTest = new MasterOrder();
        CookieOrder cookieOrderTest = new CookieOrder("Thin Mints", 1);
        CookieOrder cookieOrderTest2 = new CookieOrder("Thin Mints", 1);
        CookieOrder cookieOrderTest3 = new CookieOrder("SAMOAS", 1);
        underTest.addOrder(cookieOrderTest);
        underTest.addOrder(cookieOrderTest2);
        underTest.addOrder(cookieOrderTest3);
        underTest.removeVariety("Thin Mints");
        int check = underTest.getTotalBoxes();
        assertEquals(1, check);
    }
    @Test
    public void shouldReturnTotalOf2ForThinMints(){
        MasterOrder underTest = new MasterOrder();
        CookieOrder cookieOrderTest = new CookieOrder("Thin Mints", 1);
        CookieOrder cookieOrderTest2 = new CookieOrder("Thin Mints", 1);
        CookieOrder cookieOrderTest3 = new CookieOrder("SAMOAS", 1);
        underTest.addOrder(cookieOrderTest);
        underTest.addOrder(cookieOrderTest2);
        underTest.addOrder(cookieOrderTest3);
        int check = underTest.getVarietyBoxes("Thin Mints");
        assertEquals(2, check);
    }
    @Test
    public void shouldReturnTotalOf3ForThinMints(){
        MasterOrder underTest = new MasterOrder();
        CookieOrder cookieOrderTest = new CookieOrder("Thin Mints", 2);
        CookieOrder cookieOrderTest2 = new CookieOrder("Thin Mints", 1);
        CookieOrder cookieOrderTest3 = new CookieOrder("SAMOAS", 1);
        underTest.addOrder(cookieOrderTest);
        underTest.addOrder(cookieOrderTest2);
        underTest.addOrder(cookieOrderTest3);
        int check = underTest.getVarietyBoxes("Thin Mints");
        assertEquals(3, check);
    }
}
