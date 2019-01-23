import okio.Timeout;
import org.junit.*;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class junit {

    private static WebDriver driver;

    @BeforeClass
    public static void test01() {
        System.out.println(1);
        System.setProperty("webdriver.chrome.driver", "/Users/omerb/Desktop/selenium/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("-incognito");
        driver = new ChromeDriver(options);
        driver.get("https://www.madlan-internal.com");
        driver.navigate().to("http://www.madlan.co.il");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().refresh();
        driver.navigate().refresh();
        driver.navigate().refresh();
        driver.manage().window().fullscreen();
        driver.manage().window().maximize();
    }

    @Test(timeout = 19000)
    public void test02() {
        String a = "go";
        String b = "go";
        Assert.assertEquals(a, b);
        System.out.println((2));

    }

    @Test
    public void test03() {
        String url = driver.getCurrentUrl();
        Assert.assertEquals("https://www.madlan-internal.com/", url);

    }

    @Test
    public void test04() { System.out.println(driver.getTitle());
    }

    @Test
    public void test06() {
        System.out.println(driver.getCurrentUrl());
    }

    @Test
    public void ac() {
        System.out.println(5);
    }

    @Test
    public void ad() {
        System.out.println(driver.getWindowHandle());

    }

    @AfterClass
    public static void acd() {
        driver.quit();


   }
}



