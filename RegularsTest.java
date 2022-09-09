import org.junit.*;

import static org.junit.Assert.*;


public class RegularsTest {
    Regulars reg;

    @BeforeClass
    public void init() { reg = new Regulars(); }

    @AfterClass
    public void dispose() { reg = null; }

    @Test
    public void checkTrueIP(){
        Assert.assertTrue(reg.checkIP("0.0.0.255"));
        Assert.assertTrue(reg.checkIP("255.255.255.0"));
        Assert.assertTrue(reg.checkIP("34.54.134.234"));
    }

    @Test
    public void checkFalseIP(){
        Assert.assertTrue(reg.checkIP("0,0.0.255"));
        Assert.assertTrue(reg.checkIP("255.dgg.255.0"));
        Assert.assertTrue(reg.checkIP("34.54.1347.234"));
    }
}