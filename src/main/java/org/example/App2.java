package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class App2
    //Кейс номер 1
{
    public static void main( String[] args ) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.addArguments ("start-maximized"); // открытие полноэкранного формата
        options.addArguments ("--incognito"); // открытие страницы в режиме инкогнито
        options.addArguments ("disable-popup-blocking"); // блокировка всплывающих окон

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

        driver.get("https://ribomaniya.ru");
        driver.findElement(By.xpath("//*[@id='bx_basketFKauiI']/div/ul/li/a")).click();
        //вход в форму авторизации
        driver.findElement(By.xpath("//input[@name='USER_LOGIN']")).sendKeys("Serxio");
        //ввод логина
        driver.findElement(By.xpath("//input[@name='USER_PASSWORD']")).sendKeys("ssswww");
        //ввод пароля
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        driver.quit();
        // выход из браузера

    }
}

