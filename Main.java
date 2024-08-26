package OOP.HW.HW_3;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    HotDrink cappuccino = new HotDrink("cappuccino", 550, 330);
    HotDrink macchiato = new HotDrink("macchiato", 750, 290);
    HotDrink gingerTea = new HotDrink("ginger tea", 340, 250);
    HotDrink cacao = new HotDrink("cacao", 250, 250);
    List<HotDrink> mainGoods = new ArrayList<>();
    mainGoods.add(cappuccino);
    mainGoods.add(macchiato);
    mainGoods.add(gingerTea);
    mainGoods.add(cacao);

    VendingMachine vendingMachine = new VendingMachine();
    vendingMachine.getProduct((ArrayList<HotDrink>) mainGoods);

    HotDrinkTea hotDrinkTea = new HotDrinkTea("green tea", 500, 250, 65);
    System.out.println(hotDrinkTea.getInfo());

    vendingMachine.getProduct("green tea", 250, 65);




  }



}
