package poliporprishem;

public class CityBank extends RBI {
    public static void main(String[] args) {
        CityBank obj = new CityBank();
        System.out.println(obj.getHomeLoan());
    }
    public double getHomeLoan(){
        return 13.5;
    }
}
