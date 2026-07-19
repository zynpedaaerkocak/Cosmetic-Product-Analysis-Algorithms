package cs207project;

import java.util.Random;

public class DataGenerator {
	private static final String[] brands = {
			"Rare Beauty",
			"Fenty",
			"Rhode",
			"Maybelline",
			"Essence"
	};
	
	private static final String[] categories = {
			"Foundation",
			"Mascara",
			"Lipstick",
			"Blush",
			"Concealer"
	};
	public static CosmeticProduct[] generateProducts(int size) {
		CosmeticProduct[] products = new CosmeticProduct[size];
		Random random = new Random();
		
		for(int i=0;i<size;i++) {
			int productId = random.nextInt(90000) + 1000;
		       String brand = brands[random.nextInt(brands.length)];
	            String category = categories[random.nextInt(categories.length)];
	            String productName = brand + " Product " + (i + 1);
	            double price = 10 + (200 - 10) * random.nextDouble(); // creates a random price between 10 and 200
	            double rating = 1 + (5 - 1) * random.nextDouble(); // creates a random rating between 1 and 5
	            int salesCount = random.nextInt(10000);
	            products[i] = new CosmeticProduct(productId,brand,productName,price,rating,salesCount,category);
	        }
	        return products;
	    }
	}

	
	
	
	
	

