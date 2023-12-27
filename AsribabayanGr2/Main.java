// Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
// Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный метод getProduct(int name, int volume, int temperature) выдающий продукт 
// соответствующий имени, объему и температуре
// В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику заложенную в программе
// Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре Формат сдачи: Ссылка на гитхаб-проект Подписать фамилию и номер группы

package AsribabayanGr2;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        HotDrink tea = new HotDrink("чай", 55, 100, 95);
        HotDrink coffee = new HotDrink("кофе", 70, 100, 90);
        HotDrink cocoa = new HotDrink("какао", 100, 100, 97);
        HotDrink milk = new HotDrink("молоко", 35, 100, 70);
        HotDrink water = new HotDrink("вода", 10, 100, 100);

        List<Product> listProducts = new ArrayList<>();
        listProducts.add(tea);
        listProducts.add(coffee);
        listProducts.add(cocoa);
        listProducts.add(milk);
        listProducts.add(water);

        HotDrinkMachine HotDrinkMachine = new HotDrinkMachine(listProducts);

        HotDrink giveMeHotDrink = HotDrinkMachine.getProduct("чай", 95);
        System.out.println(giveMeHotDrink != null ? "\nПолучите: "+giveMeHotDrink : "\nНапиток не найден");

        giveMeHotDrink = HotDrinkMachine.getProduct("кофe", 90);
        System.out.println(giveMeHotDrink != null ? "\nПолучите: "+giveMeHotDrink : "\nНапиток не найден");        
        
        giveMeHotDrink = (HotDrink)HotDrinkMachine.getProduct("какао", 97);
        System.out.println(giveMeHotDrink != null ? "\nПолучите: "+giveMeHotDrink : "\nНапиток не найден");  
        
        giveMeHotDrink = HotDrinkMachine.getProduct("молоко", 70);
        System.out.println(giveMeHotDrink != null ? "\nПолучите: "+giveMeHotDrink : "\nНапиток не найден");
        
        giveMeHotDrink = HotDrinkMachine.getProduct("вода", 100);
        System.out.println(giveMeHotDrink != null ? "\nПолучите: "+giveMeHotDrink : "\nНапиток не найден");
        
    }

}

