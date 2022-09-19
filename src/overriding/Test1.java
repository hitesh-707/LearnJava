package overriding;

public class Test1 extends Base {
    public String BrowserName = "Safari";

    public static void main(String[] args) {
        Test1 tc = new Test1();
        tc.veryFast();
    }
        public void veryFast () {
            WebDriver obj = getFastBrowser(BrowserName);
            obj.click();
            obj.typing();

        }
    }
