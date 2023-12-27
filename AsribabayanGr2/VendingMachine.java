package AsribabayanGr2;

import java.util.List;

public interface VendingMachine {
  void initProducts(List<Product> products);

  Product getProduct(String name);
}

