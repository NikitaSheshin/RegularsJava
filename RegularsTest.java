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

    @Test
    public void checkTrueGUID(){
        Assert.assertTrue(reg.checkGUID("e02fd0e4-00fd-090A-ca30-0d00a0038ba0"));
        Assert.assertTrue(reg.checkGUID("f0f0b61c-3c47-486c-ae5d-09dcbdafb921"));
        Assert.assertTrue(reg.checkGUID("07E5C308-8E9D-48F4-9E51-C801A00A521A"));
    }

    @Test
    public void checkFalseGUID(){
        Assert.assertFalse(reg.checkGUID("e02fd0e400fd090Aca300d00a0038ba0"));
        Assert.assertFalse(reg.checkGUID("f0f0b1c-3c47-486c-a5d-09dcbdafb91"));
        Assert.assertFalse(reg.checkGUID("e02fd.e4-00fd-09A-ca30-0d00a0?38ba0"));
    }
}