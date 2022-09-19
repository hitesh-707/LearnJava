
package overriding;
public class Base {
    public WebDriver getFastBrowser(String BrowserName){
        if(BrowserName.equals("Chrome")){
            return new ChromeDriver();
        }
        else if(BrowserName.equals("Safari")){
            return new SafariDriver();
        }
        else {
            return new WebDriver();
        }
    }
}