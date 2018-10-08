public class Item {
    private int id;
    private String category;
    private String itemName;
    private long price;
    private int display;
    private int stock;

    public void setId(int id){
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setCategory(String category) {
        this.category  = category;
    }
    public String getCategory(){
        return category;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public String getItemName(){
        return itemName;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public long getPrice(){
        return price;
    }
    public void setDisplay(int display) {
        this.display = display;
    }
    public int getDisplay(){
        return display;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public int getStock(){
        return stock;

    }
}
