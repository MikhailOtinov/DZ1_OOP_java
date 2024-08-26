package OOP.HW.HW_3;

import java.util.ArrayList;
import java.util.Iterator;

public class VendingMachine {

  public void getProduct(ArrayList<HotDrink> hotDrinks) {
    System.out.println("Сегодня в продаже: ");
    Iterator<HotDrink> iterator = hotDrinks.iterator();
    while (iterator.hasNext())
    {
      HotDrink item = iterator.next();
      System.out.println(item.getName());
    }
  }

  public void getProduct(String name, int volume, int temperature) {
    System.out.printf("Будьте оторожны, самый горячий напиток: " + name + ", его температура составляет " + temperature + ", объем напитка: " + volume);
  }
}
