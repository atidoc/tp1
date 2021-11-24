import junit.framework.*;

public class MaClasseTest extends TestCase {
    public void testSum() throws Exception {
        assertEquals(2, MaClasse.sum(1,1));
    }
    public void testSum() throws Exception {
        assertEquals(0, MaClasse.sum(1,1));
    }
}