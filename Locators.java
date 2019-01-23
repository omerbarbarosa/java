
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Locators {
    private static WebDriver driver;

    @BeforeClass
    public static void yc() {
        System.out.println(1);
        System.setProperty("webdriver.chrome.driver", "/Users/omerb/Desktop/selenium/chromedriver");
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get("https://buyme.co.il/");

    }
//    @BeforeClass
    public static void beforeMyClass(){
        System.setProperty("webdriver.chrome.driver","/Users/omerb/Desktop/selenium/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
        driver.get("https://buyme.co.il/");
    }

//    @Test
    public void test01() {
        driver.findElement(By.xpath("//*[@id=\"ember587\"]/div/ul[1]/li[3]/a/span[2]")).click();
        driver.findElement(By.className("text-btn")).click();
        driver.findElement(By.id("ember984")).click();
        driver.findElement(By.id("ember984")).sendKeys("עומר");
        driver.findElement(By.id("ember986")).click();
        driver.findElement(By.id("ember986")).sendKeys("gaga12321224e3313353622333632535630@gmail.com");
        driver.findElement(By.id("valPass")).click();
        driver.findElement(By.id("valPass")).sendKeys("Motherfucker1");
        driver.findElement(By.id("ember990")).click();
        driver.findElement(By.id("ember990")).sendKeys("Motherfucker1");
        new Actions(driver).moveToElement(driver.findElement(By.className("fa-check"))).click().perform();
        driver.findElement(By.xpath("//*[@id=\"ember982\"]/button")).click();

    }
    @Test
    public void test02() throws InterruptedException {
        Thread.sleep(1000);
//        driver.findElement(By.className("thumbnail")).click();
        driver.findElement(By.className("chosen-container")).click();
        driver.findElement(By.xpath("//*[@id=\"ember660_chosen\"]/div/ul/li[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"ember675_chosen\"]/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"ember675_chosen\"]/div/ul/li[3]")).click();
        driver.findElement(By.xpath("//*[@id=\"ember684_chosen\"]/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"ember684_chosen\"]/div/ul/li[4]")).click();
        driver.findElement(By.className("ui-btn")).click();

        //
//        driver.findElement(By.xpath("//input[@type=‘search-chosen' and @tabindex='0']"))

    }

    @Test
    public void test03() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement((By.className("thumbnail"))).click();


    }
    @Test
    public void test04() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement((By.className("selected"))).click();
        driver.findElement(By.id("ember1146")).click();
//        driver.findElement(By.className("ember-text-field")).click();
//        driver.findElement(By.xpath("//*[@id=\"ember1260\"]")).sendKeys("דניאל");
        driver.findElement(By.id("ember1146")).sendKeys("דניאל");
        driver.findElements(By.className("label")).get(1).sendKeys();
        driver.findElement(By.xpath("//*[@id=\"ember1148\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"ember1148\"]")).sendKeys("עומר");
        driver.findElement(By.xpath("//*[@id=\"ember1171\"]/textarea")).click();
        driver.findElement(By.xpath("//*[@id=\"ember1171\"]/textarea")).sendKeys("המון מזל טוב עד 120 אושר וכושר ואוטומציה");
        driver.findElement(By.xpath("//*[@id=\"ember1158_chosen\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"ember1158_chosen\"]/div/ul")).click();
//        driver.findElement(By.id("ember1182")).click();
//        driver.findElement(By.id("ember1182")).sendKeys("cm5waeymrgs1le2rz5b3.jpg");
        new Actions(driver).moveToElement(driver.findElement(By.className("col"))).click().perform();
        driver.findElement(By.className("send-methods")).click();
        driver.findElement(By.className("input-theme")).sendKeys("gaga99@gmail.com");
        driver.findElement((By.className("btn-save"))).click();
        driver.findElement(By.xpath("//*[@id=\"ember1090\"]/div[5]/button")).click();
        

    }

}


//        Select mySelection = new Select(driver.findElement(By.className("chosen-container chosen-container-single form-control dib search-chosen ember-view ember-chosenselect form-control chosen-rtl chosen-rtl chosen-container-single-nosearch")));
//        mySelection.selectByIndex(1);
//        driver.findElement(By.xpath("//*[@id=\"ember660_chosen\"]")).click();
//        System.out.println(driver.getTitle());
//        driver.findElement(By.id(constants1.locator)).click();
//        driver.findElement(constants1.locator2).click();
//        driver.findElement(By.id("gt-submit")).click();



//
//    @Test
//    public void test03() {
//        LoginPage.pressLogin(driver);
//
//
//    }
//    @Test
//    public void test04() {
//        HomePage.presslogin(driver).click();
//    }
//
////            WebElement e = driver.findElement(By.id("gt-submit")).click();  //web element
//
////            List<WebElement> myList = driver.findElements(By.id("gt-submit"));
////              Select mySelection = new Select(driver.findElement(By.id("countries")));
////              mySelection.selectByVisibleText("Israel"); //dropdown element by visible text
//
////              Select mySelection = new Select(driver.findElement(By.id("countries")));
//
////              mySelection.selectByVisibleText("0"); //dropdown element by index text
//
////                driver.switchTo().alert().accept();   //pop ups - accepts
////                driver.switchTo().alert().dismiss();
////                driver.switchTo().alert().sendKeys("Text");
////                driver.switchTo().alert().getText();
//
//    //ads
//
////                driver.switchTo().frame("my-frame"); //my frame = id ,frame = ads
////                driver.switchTo().frame((WebElement));
////                driver.findElement(By.className("bla-frame")); //כשאין לו ID אשתמש בCLASS
////                driver.switchTo().defaultContent();
//
//    //Window handle-עובר בין טאבים
//
////                String handle = driver.getWindowHandle(); // to get the current windows we will use
////
////                Set<String>handle = driver.getWindowHandle();
////
////                driver.switchTo().window("windows");
////
////                //Autentication-ניהול הרשאות
////                driver.get("username:password@http://www.site.com"); //מדלג על האישור מבלי להכניס נתונים
////
////                Alert alert = driver.switchTo().alert();
////                Credentials credentials = new UserAndPassword("user","password");
////                alert.authentcateUsing(credentials);
//
//
////
////            WebElement myButton = myList.get(0);
////
////            driver.findElement(By.xpath("//input[@id='gt-submit']")); // relative locator not absoulote
//
//
//}
//
//
//
//
//
//
