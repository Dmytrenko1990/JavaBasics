package homeWorkClass25;
/*
Create a WebDriver Interface that will have the following unimplemented behaviour:
        openBrowser(), closeBrowser(), maximizeWindow(), findElement().
        Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
*/
interface WebDriver {
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}
class ChromeDriver implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("Chrome browser is opened");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Chrome browser is closed");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Chrome browser is maximizing");
    }

    @Override
    public void findElement() {
        System.out.println("Chrome browser is looking for element");
    }
}
class FireFoxDriver implements WebDriver{
    @Override
    public void openBrowser(){
        System.out.println("FireFox browser is opened");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Firefox browser is closed");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("FireFox browser is maximizing ");
    }

    @Override
    public void findElement() {
        System.out.println("FireFox browser is looking for element");
    }
}

