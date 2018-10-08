public class SistemToko {
    public static void main(String args[]){
        Item shoes = new Item();
        shoes.setId(1);
        shoes.setCategory("Shoes");
        shoes.setDisplay(10);
        shoes.setItemName("Adidas");
        shoes.setPrice(200);
        System.out.println("category: " + shoes.getCategory());

        Item sandal = new Item();
    }
}
