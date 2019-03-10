import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        WebDriver driver = new ChromeDriver();
//        System.setProperty("webdriver.chrome.driver", "C:/Users/pc/Downloads/chromedriver.exe");
      //  Thread.sleep(5000);
        //driver.get("https://www.google.com");

//        driver.get("https://www.facebook.com");
        driver.get("https://www.trendyol.com");


        // ***** Giriş yapıldı
        System.out.println(driver.findElement(By.xpath(".//*[@id='not-logged-in-container']")).getText());

        driver.findElement(By.xpath("//img[contains(@src,'/Resources/images/kadin.png')]")).click(); //kadın seçildi


       driver.findElement(By.xpath(".//*[@id='not-logged-in-container']")).click(); // girişe basıldı


        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("xxxx@gmail.com");

      driver.findElement(By.xpath("//input[@id='password']")).sendKeys("pasword123.");

      driver.findElement(By.id("loginSubmit")).click(); //giriş butonu


        driver.manage().window().maximize();

        //***************  tablar yüklendi

        System.out.println(driver.findElement(By.xpath("//a[@href='/Butik/Liste/Kadin']")).getText());

        driver.findElement(By.xpath("//a[@href='/Butik/Liste/Kadin']")).click();


        System.out.println("1 kadın seçildi");


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }




        driver.findElement(By.xpath("//a[@href='/Butik/Liste/Erkek']")).click();
        System.out.println("2 Erkek seçildi");



        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//a[@href='/Butik/Liste/cocuk']")).click();
        System.out.println("3 cocuk seçildi");



        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//a[@href='/Butik/Liste/Ayakkabi--canta']")).click();
        System.out.println("4 Ayakkabi--canta seçildi");



        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//a[@href='/Butik/Liste/Saat--Aksesuar']")).click();
        System.out.println("5 Saat--Aksesuar seçildi");



        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//a[@href='/Butik/Liste/Kozmetik']")).click();
        System.out.println("6 Kozmetik seçildi");


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//a[@href='/Butik/Liste/Ev--Yasam']")).click();
        System.out.println("7 Ev--Yasam seçildi");




        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//a[@href='/Butik/Liste/Elektronik']")).click();
        System.out.println("8 Elektronik seçildi");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//a[@href='/Butik/Liste/Supermarket']")).click();
        System.out.println("9 Supermarket seçildi");


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        driver.findElement(By.xpath("//a[@href='/Butik/Liste/Kadin']")).click();


        System.out.println("1 kadın seçildi");


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }






        driver.findElement(By.xpath("//a[@href='/TRENDYOLMiLLA---Woman/ButikDetay/308090/Kadin']")).click();  // butik seçildi

        driver.findElement(By.xpath("//div[contains(@class, 'name') and text()='Hardal Baskılı Örme Semi-Fitted T-shirt TWOSS19VG0126']")).click(); //ürün seçildi


        System.out.println(driver.findElement(By.id("addToBasketButton")).getText());

        driver.findElement(By.id("addToBasketButton")).click(); //sepete ekle yapıldı



     //   driver.findElement(By.xpath("//span[contains(@class,'text')]  [contains(text(),'S')]")).click();



        driver.quit();

    }
}
