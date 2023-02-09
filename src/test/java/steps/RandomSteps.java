package steps;

import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utils.Driver;
import utils.Waiter;

public class RandomSteps {
    @Test
    public void getRandomData(){
        Faker faker = new Faker();
        String chuck = faker.chuckNorris().fact();

        for (int i = 0; i < 20; i++) {
            System.out.println(faker.chuckNorris().fact());
            System.out.println(faker.funnyName().name());

        }
        Driver.getDriver().get("https://www.google.com/");
        Driver.getDriver().findElement(By.name("q")).sendKeys(faker.chuckNorris().fact() + Keys.ENTER);
        System.out.println();
        System.out.println(faker.gameOfThrones().dragon());
        System.out.println(faker.gameOfThrones().dragon());
        System.out.println(faker.gameOfThrones().dragon());
        System.out.println(faker.gameOfThrones().dragon());
        System.out.println(faker.gameOfThrones().character());
        System.out.println(faker.crypto());
        System.out.println(faker.lebowski().quote());


        Waiter.pause(3);













        Driver.quitDriver();
    }
}
