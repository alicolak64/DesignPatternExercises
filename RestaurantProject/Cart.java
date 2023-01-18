import java.util.ArrayList;
import java.util.List;

public class Cart {

    private final List<Goods> cart;

    public Cart() {
        this.cart = new ArrayList<>();
    }

    public List<Goods> getCart() {
        return cart;
    }

    public void addFood(Goods goods) {
        cart.add(goods);
    }

    public void removeFood(Goods goods) {
        cart.remove(goods);
    }

}
