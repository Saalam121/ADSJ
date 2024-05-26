import java.util.*;

public class Main11 {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>(Arrays.asList(
                new Product(1, "Laptop", 15000, "Electronics", 4.5),
                new Product(2, "Smartphone", 8000, "Electronics", 4.2),
                new Product(3, "Refrigerator", 20000, "Appliance", 4.7),
                new Product(4, "Microwave", 5000, "Appliance", 3.9),
                new Product(5, "Headphones", 12000, "Electronics", 4.8)));

        // i) Find all products having rating between 4 and 5
        List<Product> ratedProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.rating >= 4 && product.rating <= 5) {
                ratedProducts.add(product);
            }
        }
        System.out.println("Rated Products: " + ratedProducts);

        // ii) Find first n products having price > 10000
        int n = 3;
        List<Product> expensiveProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.price > 10000) {
                if (expensiveProducts.size() < n) {
                    expensiveProducts.add(product);
                }
            }
        }
        System.out.println("Expensive Products: " + expensiveProducts);

        // iii) Find the number of products under each type
        Map<String, Integer> productTypeCounts = new HashMap<>();
        for (Product product : products) {
            productTypeCounts.put(product.type, productTypeCounts.getOrDefault(product.type, 0) + 1);
        }
        System.out.println("Product Type Counts: " + productTypeCounts);

        // iv) Find average rating of products with type = "Electronics"
        int count = 0;
        double totalRating = 0;
        for (Product product : products) {
            if ("Electronics".equals(product.type)) {
                totalRating += product.rating;
                count++;
            }
        }
        double averageRating = (count > 0) ? totalRating / count : 0;
        System.out.println("Average Rating of Electronics: " + averageRating);
    }
}

class Product {
    int id;
    String name;
    double price;
    String type;
    double rating;

    public Product(int id, String name, double price, String type, double rating) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.type = type;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return String.format("Product{id=%d, name='%s', price=%.2f, type='%s', rating=%.1f}", id, name, price, type,
                rating);
    }
}
