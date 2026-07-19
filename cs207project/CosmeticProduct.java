package cs207project;

public class CosmeticProduct implements Comparable<CosmeticProduct> {
    private int productId;
    private String brand;
    private String productName;
    private double price;
    private double rating;
    private int salesCount;
    private String category;

    public CosmeticProduct(int productId, String brand, String productName, double price, double rating, int salesCount, String category) {
        this.productId = productId;
        this.brand = brand;
        this.productName = productName;
        this.price = price;
        this.rating = rating;
        this.salesCount = salesCount;
        this.category = category;
    }
    public int getProductId(){ 
    	return productId; }
    public String getBrand() { 
    	return brand; }
    public String getProductName() { 
    	return productName; }
    public double getPrice() { 
    	return price; }
    public double getRating() { 
    	return rating; }
    public int getSalesCount() { 
    	return salesCount; }
    public String getCategory() { 
    	return category; }


    @Override
    public int compareTo(CosmeticProduct other) {
        return Integer.compare(this.productId, other.productId);
    }

    @Override
    public String toString() {
        return "CosmeticProduct{" + "productId = " + productId + ", brand = '" + brand + '\'' + ", productName = '" + productName + '\'' +
", price = " + price + ", rating = " + rating + ", salesCount = " + salesCount + ", category = '" + category + '\'' + '}';
    }
}