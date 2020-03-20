package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test {
	
	//******************without streams*****************

	 public void displaywithoutgenerics(List<product> productList) {
		 List<Float> productpriceList = new ArrayList<Float>();
		 List<String> productName = new ArrayList<String>();
		 for (product product : productList) {
			 
			 //filtering data of list
			 if (product.price < 30000) {
				 productName.add(product.name);
				 productpriceList.add(product.price);
			 }
		 }
		 
		 
		 System.out.println(productName);
		 System.out.println(productpriceList);
	 }
	 
	 
	 //***********************with streams************************
	 
	 
	 public void displaywithgenerics(List<product> productList) {
		 List<Float> productpriceList2 = productList.stream()
		        .filter(p -> p.price > 30000)//fetching data
		        .map(p -> p.price)//fetching price
		        .collect(Collectors.toList());//collecting as list
		 System.out.println(productpriceList2);
		 
		 
}
	 
	 public void streamIterating(List<product> productsList) {
		 Stream
		 .iterate(1,element -> element + 1)
		 .filter(element -> element % 5 == 0).limit(5)
		 .forEach( System.out::println);
	 }
	 
	 
	 public void streamFilteringIterating(List<product> productsList) {
		 productsList.stream()
		 .filter(product -> product.price == 30000)
		 .forEach(product -> System.out.println(product.name));
	 }
	 
	 public void maxAndMin(List<product> productsList) {
		 //max() method to get max product price
		 product productA = productsList.stream()
				 .max((product1,product2) -> product1.price > product2.price ? 1 : -1)
                 .get();
                  System.out.println(productA.price);
                  
                  
            //min() method to get min product price
            product productB = productsList.stream()
            		.max((product1,product2) -> product1.price < product2.price ? 1 : -1)
            		.get();
            System.out.println(productB.price);
	 }
	 
	 public void countItems(List<product> productsList) {
		 long count = productsList.stream()
				 .filter(product -> product.price < 30000)
				 .count();
		 System.out.println(count);
	 }

	 public void toSet(List<product> productsList) {
		 Set<Float> productpriceList = productsList.stream()
				 .filter(product -> product.price < 30000)
				 .map(product -> product.price)
				 .collect(Collectors.toSet()); //collect it as set(remove duplicate elements)
		 
		 System.out.println(productpriceList);
				 
		 
	 }
	 
	 public void toMap(List<product> productsList) {
		 Map<Integer,String> productpriceMap = productsList.stream()
				 .collect(Collectors.toMap(p ->p.id,p -> p.name));
		 
		 System.out.println(productpriceMap);
				 
	 }
	 
	 public void methodRef(List<product> productsList) {
		 List<Float> productpriceList =
				 productsList.stream()
				             .filter(p -> p.price > 30000)
				             .map(product::getPrice)
				             .collect(Collectors.toList());
		 
		 System.out.println(productpriceList);
				 
	 }
	 
	 public static void main(String[] args) {
		 
		 List<product> productList = new ArrayList<product>();
		 //adding products
		 productList.add(new product(1,"HP Laptop",25000f));
		 productList.add(new product(2,"dell Laptop",30000f));
		 productList.add(new product(3,"Lenovo Laptop",28000f));
		 productList.add(new product(4,"Sony Laptop",28000f));
		 productList.add(new product(5,"Apple Laptop",90000f));
		 
		 
		 test test=new test();
		// test.displaywithgenerics(productList);
		   //test.displaywithoutgenerics(productList);
		// test.maxAndMin(productList);
		 //test.streamIterating(productList);
		  //test.streamFilteringIterating(productList);
		 //test.toSet(productList);
		  // test.toMap(productList);
		   
		   
		
	}
		 
}

	 
	 
	 
	 
	 