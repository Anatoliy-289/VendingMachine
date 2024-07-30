public class VendingMachine {

    private List<Product> products;

    public VendingMachine() {
        this.products = new ArrayList<>();    
    }

    public VendingMachine(List<Product> products) {
        this.products = products;
    }


    public void addtProducts (List<Product> products) {
        this.products.addall(products);
    }

    public Product getProduct(String name) {
        
        for (Product product : products) {
            if (product.getName().equals(name)) {
                products.remove(product);                
                return product;
            
            }
        }

        System.out.println("No such product: " + name);
        return null;
    }


    public Product getProduct(String name, float volume, int temperature) {
        
        for (Product product : products) {
            if (product.getName().equals(name) && product.getVolume().equals(volume) && product.getTemperature().equals(temperature)) {
                products.remove(product);                
                return product;
            
            }
        }

        System.out.println("No such product: " + name);
        return null;
    }



    //public Product getProduct(String name) {
        
        //for (Product product : products) {
            //if (product.getName().equals(name)) {
                //products.remove(product);
                //return product;
            
            //}
        //}

        //throw new RuntimeException("No such product: " + name);
        
    //}



    public List<Product> getProducts() {
        return products;
    }
}
