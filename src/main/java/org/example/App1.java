package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import java.util.concurrent.TimeUnit;

public class App1
        //Кейс номер 3
{

    public static void main(String[] args ) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.addArguments ("start-maximized"); // открытие полноэкранного формата
        options.addArguments ("--incognito"); // открытие страницы в режиме инкогнито
        options.addArguments ("disable-popup-blocking"); // блокировка всплывающих окон

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) driver;



        driver.get("https://ribomaniya.ru");
        driver.findElement(By.xpath("//*[@id='bx_basketFKauiI']/div/ul/li/a")).click();
        //вход в форму авторизации
        driver.findElement(By.xpath("//input[@name='USER_LOGIN']")).sendKeys("Serxio");
        //ввод логина
        driver.findElement(By.xpath("//input[@name='USER_PASSWORD']")).sendKeys("ssswww");
        //ввод пароля
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        driver.findElement(By.xpath("//div[@class='dropdown-submenu']/a[@href='/katushki/']")).click();
        driver.findElement(By.xpath("//div[@class='px-0 p-1 p-sm-3 mt-auto']/a[@href='/katushki/bezynertsionnye-katushki/']")).click();
        driver.findElement(By.xpath(".//img[@src='/upload/resize_cache/iblock/bd6/k50fea3aq8jcfjakuwg7m2fgc2kcdjrn/250_250_1/bezynertsionnye_katushki_salmo_supreme_ice.jpeg']")).click();
        js.executeScript("window.scrollTo(0,800)");Thread.sleep(1000);
        driver.findElement(By.xpath(".//input[@class='btn btn-primary']")).click();
        js.executeScript("window.scrollTo(0,0)");Thread.sleep(1000);
        driver.findElement(By.xpath(".//div[@class='text-end']/a[@href='/cabinet/basket/']")).click();
        driver.findElement(By.xpath(".//button[@class='btn btn-lg btn-primary basket-btn-checkout']")).click();


        driver.quit();
        // выход из браузера

    }
}