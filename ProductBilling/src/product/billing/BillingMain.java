package product.billing;

import java.util.Scanner;

public class BillingMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		System.out.println("Enter the no. of Products ");
		int arrSize = sc.nextInt(); 
		
		
		ProductInfo[] prodList = new ProductInfo[arrSize]; 
		String decision ="N"; 
		
		System.out.println("Enter the items for billing ");
		
		int i = 0; 
		
		do {
			
			ProductInfo prodInfo = new ProductInfo();
			System.out.println("Enter the prod Name ");

			String prodName = sc.next(); 
			prodInfo.setProductName(prodName);
			
			System.out.println("Enter the prod quantity ");

			
			int quant = sc.nextInt(); 
			prodInfo.setQuantity(quant);
			
			System.out.println("Enter the prod per unit price ");

			float ppu = sc.nextFloat(); 
			prodInfo.setPricePerUnit(ppu);
			
			prodList[i] = prodInfo;
			
			i++; 
			
			System.out.println("Do you want to insert another product (y/n)");
			
			decision = sc.next();
			
		}while("Y".equalsIgnoreCase(decision)); 
		
		
		System.out.println("Insertion done  ");
		
		float totalCost = 0.0f; 
		
		for(ProductInfo product:  prodList)
		{
			System.out.println("***********************");

			System.out.println("Product Name "+product.getProductName());
			System.out.println("Product Quantity "+product.getQuantity());

			System.out.println("Product Price Per unit "+product.getPricePerUnit());

			System.out.println("Product Cost "+product.getCost());
			
			System.out.println("***********************");
			
			totalCost = totalCost+product.getCost();

		}
		
		
		System.out.println("total Billing Cost : "+totalCost);
		
		
		
		
		
		
		

	}

}
