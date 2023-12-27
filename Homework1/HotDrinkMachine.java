package Homework1;

import java.util.List;

public class HotDrinkMachine implements VendingMachine {

  private List<Product> products;

  public HotDrinkMachine(List<Product> products) {
      initProducts(products);
  }

  public Product getProduct(String name) {
    for (Product product : products) {
      if (product.getName().equalsIgnoreCase(name)) {
        products.remove(product);
        return product;
      }
    }
    return null;
  }

  public HotDrink getProduct(String name, int temperature) {
    for (Product product : products) {
      if (product instanceof HotDrink) {
        if (product.getName().equalsIgnoreCase(name) && ((HotDrink) product).getTemperature() == temperature) {
          products.remove(product);
          return (HotDrink) product;
        }
      }
    }
    return null;
  }

  public HotDrink getProduct(String name, int volume, int temperature) {
    for (Product product : products) {
      if (product instanceof HotDrink) {
        if (product.getName().equalsIgnoreCase(name) && ((HotDrink) product).getVolume() == volume
            && ((HotDrink) product).getTemperature() == temperature) {
          products.remove(product);
          return (HotDrink) product;
        }
      }
    }
    return null;
  }

  
  public void initProducts(List<Product> products) {
    this.products = products;
  }

}