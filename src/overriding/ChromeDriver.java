package overriding;

public class ChromeDriver extends WebDriver {
    public void click () {
        System.out.println("clicking at chrome");
    }
    public void type () {
        System.out.println("type at chrome");
    }
}

