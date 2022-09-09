import org.junit.*;

public class RegularsTest {
    static Regulars reg;

    @BeforeClass
    public static void init() { reg = new Regulars(); }

    @AfterClass
    public static void dispose() { reg = null; }

    @Test
    public void checkTrueIP(){
        Assert.assertTrue(reg.checkIP("0.0.0.255"));
        Assert.assertTrue(reg.checkIP("255.255.255.0"));
        Assert.assertTrue(reg.checkIP("34.54.134.234"));
    }

    @Test
    public void checkFalseIP(){
        Assert.assertFalse(reg.checkIP("0,0.0.255"));
        Assert.assertFalse(reg.checkIP("255.dgg.255.0"));
        Assert.assertFalse(reg.checkIP("34.54.1347.234"));
    }
}