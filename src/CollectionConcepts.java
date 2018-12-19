import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionConcepts {
    public static void main(String[] args) {

        Product door = new Product("Door",44);
        Product floor = new Product("floor",414);
        Product window = new Product("glass window",144);

        Collection<Product> products = new ArrayList<>();
        products.add(door);
        products.add(floor);
        products.add(window);

        System.out.println(products);

        final Iterator<Product> productIterator = products.iterator();
        while (productIterator.hasNext())
        {
            Product newProduct = productIterator.next();
            System.out.println(newProduct);
        }
    }
}
