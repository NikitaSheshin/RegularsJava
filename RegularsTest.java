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
        Assert.assertTrue(reg.checkIP("0.0.0.0"));
        Assert.assertTrue(reg.checkIP("255.255.255.255"));
        Assert.assertTrue(reg.checkIP("10.100.200.20"));
    }

    @Test
    public void checkFalseIP(){
        Assert.assertFalse(reg.checkIP("0,0.0.255"));
        Assert.assertFalse(reg.checkIP("255.dgg.255.0"));
        Assert.assertFalse(reg.checkIP("34.54.1347.234"));
        Assert.assertFalse(reg.checkIP("0.0.0."));
        Assert.assertFalse(reg.checkIP("255.2.255"));
        Assert.assertFalse(reg.checkIP("34.54.47.-234"));
    }

    @Test
    public void checkTrueGUID(){
        Assert.assertTrue(reg.checkGUID("e02fd0e4-00fd-090A-ca30-0d00a0038ba0"));
        Assert.assertTrue(reg.checkGUID("f0f0b61c-3c47-486c-ae5d-09dcbdafb921"));
        Assert.assertTrue(reg.checkGUID("07E5C308-8E9D-48F4-9E51-C801A00A521A"));
        Assert.assertTrue(reg.checkGUID("00000000-0000-0000-0000-000000000000"));
        Assert.assertTrue(reg.checkGUID("ffffffff-ffff-ffff-ffff-ffffffffffff"));
        Assert.assertTrue(reg.checkGUID("AAAAAAAA-BBBB-CCCC-DDDD-EEEEEEEEEEEE"));
    }

    @Test
    public void checkFalseGUID(){
        Assert.assertFalse(reg.checkGUID("e02fd0e400fd090Aca300d00a0038ba0"));
        Assert.assertFalse(reg.checkGUID("f0f0b1c-3c47-486c-a5d-09dcbdafb91"));
        Assert.assertFalse(reg.checkGUID("e02fd.e4-00fd-09A-ca30-0d00a0?38ba0"));

        Assert.assertFalse(reg.checkGUID("e02-fd0e4-00fd090-Aca300d-00a00-38ba0"));
        Assert.assertFalse(reg.checkGUID("f0f0b1c-3c47-486c-a5d-09dcbdafb91"));
        Assert.assertFalse(reg.checkGUID("e02fdRe4-00fd-09Ac-ca30-0d00a038ba0"));
    }

    @Test
    public void checkTrueURL(){
        Assert.assertTrue(reg.checkURL("http://www.example.com"));
        Assert.assertTrue(reg.checkURL("www.example.com"));
        Assert.assertTrue(reg.checkURL("ex.com"));
        Assert.assertTrue(reg.checkURL("https://example.com"));
        Assert.assertTrue(reg.checkURL("://example/page1.ru"));
        Assert.assertTrue(reg.checkURL("example/?page1+page2.com"));
    }

    @Test
    public void checkFalseURL(){
        Assert.assertFalse(reg.checkURL("Just Text"));
        Assert.assertFalse(reg.checkURL("a.com"));
        Assert.assertFalse(reg.checkURL("google.d"));
        Assert.assertFalse(reg.checkURL("google.qwertyy"));
        Assert.assertFalse(reg.checkURL
                ("https://www.sdgkbfghdjsdbgkjbgfdg4gg58787eg7eg8d6rhgsdhg8hsgd7h6rgrdghdfhg6rheg6hd67hfgherhg67dh67ghggggggggfdgdfgdfgfdgdhdghdfjgndbgjdbgdfbgdbgdfjbgdjbgjfbgbgghfdbgjdbfdggfgd76gffd6bg76er67bg76d6gd67fb67gd6g67e67gbre76gfdbg6bgergdbf6bg6erbg6rebg7bdf6g7rbkhhhhhhhhhhhhd.com"));
        Assert.assertFalse(reg.checkURL("https:/google.com"));
    }

    @Test
    public void checkTruePassword(){
        Assert.assertTrue(reg.checkPass("C00l_Pass"));
        Assert.assertTrue(reg.checkPass("SupperPas1"));
        Assert.assertTrue(reg.checkPass("VikaSuperParol2002"));
        Assert.assertTrue(reg.checkPass("___AAA999aaa"));
        Assert.assertTrue(reg.checkPass("Passw0rd"));
        Assert.assertTrue(reg.checkPass("pa22w_Rd"));
    }

    @Test
    public void checkFalsePassword(){
        Assert.assertFalse(reg.checkPass("Cool_pass"));
        Assert.assertFalse(reg.checkPass("C00l"));
        Assert.assertFalse(reg.checkPass("cool Pass"));
        Assert.assertFalse(reg.checkPass("C00l pass"));
        Assert.assertFalse(reg.checkPass("password"));
        Assert.assertFalse(reg.checkPass("1254674676"));
    }
}