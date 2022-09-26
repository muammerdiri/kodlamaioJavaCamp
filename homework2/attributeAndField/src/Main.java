public class Main {
    public static void main(String[] args) {

        Product product = new Product();
        ProductManager productManager = new ProductManager();

        product.setId(1) ;
        product.setName ("Gözlük");
        product.setDescription("Katlanabilir Gözlük");
        product.setStock(10);
        product.setPrice (199.99);

        productManager.add(product);



    }
}