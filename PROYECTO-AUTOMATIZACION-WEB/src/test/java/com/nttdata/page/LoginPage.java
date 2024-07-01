package com.nttdata.page;

import org.openqa.selenium.By;

public class LoginPage {

    //Localizadores de elementos
    public static By  bcuenta=By.xpath("//header/nav[@id='navbar']/div[1]/div[4]/div[2]/div[2]");
    public static By  bisesion=By.xpath("//a[contains(text(),'Iniciar sesión')]");
    public static By userInput = By.xpath("//input[@id='UserName']");
    public static By passInput = By.xpath("//input[@id='Password']");
    public static By loginButton = By.xpath("//body/section[1]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/input[1]");
//span
    public static By vlogin =By.xpath("//header/nav[@id='navbar']/div[1]/div[4]/div[2]/div[2]/a[1]/span[1]");

    public static By egra = By.xpath("//body/section[@id='main-container']/div[@id='home']/div[1]/div[1]/div[3]");
    public static By iproducto = By.xpath("//body/section[@id='main-container']/div[@id='landing']/div[7]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[15]/a[1]/img[1]");
    public static By bañadir = By.xpath("//button[contains(text(),'Añadir al carrito')]");
//p
    public static By vagregar =By.xpath("//p[@id='ModalLabel']");

//cap
public static By bc =By.xpath("//body/section[1]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[4]/div[1]");

//modal
public static By lo1 =By.id("onesignal-slidedown-cancel-button");

    //body/w-div[@role='’']/w-div[1]/w-div[1]/span[1]
    public static By lo2 =By.xpath("//body//w-div[@role='dialog']//w-div/span");
    public static By iselec =By.xpath("//tbody/tr[1]/td[1]/a[1]/img[1]");
    //public static By vimagen =By.xpath("//body/section[@id='main-container']/div[@id='landing']/div[7]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[15]/a[1]/img[1]");
    public static By icar =By.xpath("//a[contains(text(),'Ir al carrito')]");

/*
    Sofa seccional Derecho Lujo Vitoriano - Color: Gris
    S/. 1,449.00
*/
    //Sofa seccional Derecho Lujo Vitoriano



//    public static By lo2 =By.xpath("//body/w-div[@id='w7gf3xf']/w-div[1]/w-div[1]/span[1]");

  //  Buton  id Onesignal-slidedown-cancel-button

//body/w-div[@id='w7gf3xf']/w-div[1]/w-div[1]/span[1]



    //public static By i1 = By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='inventory_container']/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[@class='inventory_item_img' and @src='/static/media/sauce-backpack-1200x1500.0a0b85a3.jpg']");

    //body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='inventory_container']/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]

    //   By.xpath("//div[@data-test='inventory-item-name']");

    //By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div//[@id='contents_wrapper']/div[@id='inventory_container']/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]");

        //    By.id("shopping_cart_container");
   // By.xpath("//div[@id='shopping_cart_container' and @class='shopping_cart_container']");





}