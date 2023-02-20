package homeWorkClass25;

public class WebDriverTester {
    public static void main(String[] args) {
        WebDriver[]webDrivers={new ChromeDriver(),new FireFoxDriver()};
        for(WebDriver wb:webDrivers){
            wb.openBrowser();
            wb.closeBrowser();
            wb.maximizeWindow();
            wb.findElement();
        }
    }
}
