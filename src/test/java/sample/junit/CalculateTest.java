package sample.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.junit.*;



/**
 * Created by duongnapham on 8/26/15.
 */
public class CalculateTest {




    @Test
    public void succeedingTest() {
    }

    @Test
    public void failingTest() {
        fail("a failing test");
    }


    @Test
    public void passingTest() {
        assertEquals(2, 2);
        assertEquals(4, 4);
    }
    
    @Test
    @Ignore
    public void ignoreTest() {
        assertEquals(2, 2);
        assertEquals(4, 4);
    }

    @Test
    public void failingTest2() {
        //assertEquals(2, 3);
        assertEquals(4, 3);
    }
    
    @Test
    public void failingTest3() {
        assertEquals(4, 3);
        //assertEquals(2, 3);
    }
    
    @Test
    public void failingTest4() {
        assertEquals(4, 4);
        assertEquals(2, 3);
    }
    
    

    @Test
    public void errorTest(){
        //System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        new ArrayList<Object>().get(0);

        //WebDriver webdriver = new ChromeDriver();
        //webdriver.get("http://google.com");
        //webdriver.findElement(By.id("element that doesn't exist")).click();
        assertEquals(2, 2);
        assertEquals(4, 4);
    }
    
    @Test
    public void errorAfterAssertTest(){
    	assertEquals(2, 2);
    	//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
    	new ArrayList<Object>().get(0);

    	
    	//WebDriver webdriver = new ChromeDriver();
        //webdriver.get("http://google.com");
        //webdriver.findElement(By.id("element that doesn't exist")).click();
        
        assertEquals(4, 4);
    }



    private static String greeting() {
        return "Hello, World!";
    }

    
    
    /*@BeforeClass
    public static void initCalculator() {
        calculator = new CalculatorUtils();
        dateUtils = new DateUtils();
    }

    @Before
    public void beforeEachTest() {
        System.out.println("......Waiting.... .. at "  + dateUtils.getCurrentDate());
        System.out.println("This is executed before each Test");
    }

    @After
    public void afterEachTest() {
        System.out.println("This is executed after each Test");
        System.out.println("......END --- Waiting.... .. at "  + dateUtils.getCurrentDate());
    }

    @Test
    public void testSum_One() {
        int testSum = 7;
        System.out.println("----- START OF Verify function testSum -------------");
        int sum = calculator.sum(2, 9);
        System.out.println("@Test sum(): " + sum + " = " + testSum);
        Assert.assertEquals(sum, testSum);
        System.out.println("----- END OF Verify function testSum -------------");
    }

    @Test
    public void testSum_second() {
        int subResult = 10;
        System.out.println("----- START OF Verify function testSum -------------");
        int sum = calculator.sum(2, 5);
        System.out.println("@Test sum(): " + sum + " = " + subResult);
        Assert.assertEquals(sum, subResult);
        System.out.println("----- END OF Verify function testSum -------------");
    }*/

}
