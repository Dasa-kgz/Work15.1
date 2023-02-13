import person.Builder;
import person.Driver;
import person.Programmer;

public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        programmer.setAge(25);
        System.out.println(programmer);
        programmer.work();
        System.out.println("*******************************");

        Driver driver = new Driver();
        driver.setAge(20);
        System.out.println(driver);
        driver.work();
        System.out.println("*******************************");

        Builder builder = new Builder();
        builder.setAge(25);
        System.out.println(builder);
        builder.work();
    }
}