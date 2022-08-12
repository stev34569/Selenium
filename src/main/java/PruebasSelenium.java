
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PruebasSelenium {

    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\steve\\Desktop\\II 2022\\Calidad del software\\Semana 5\\chromedriver - copia\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.navigate().to("https://localhost:44370/GestionarReservaCitas.aspx");

     driver.manage().window().maximize();
// driver.findElement(By.name("q")).sendKeys("");
 driver.findElement(By.className("gNO89b")).click();
 String appTitle = driver.getTitle();


        System.out.println("Application title is:" + driver.getTitle());

 //driver.quit();
 
 
    }

}
