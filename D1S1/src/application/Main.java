package application;

import java.util.Scanner;

import implementations.CAccessoryRepair;
import implementations.COrder;
import implementations.CPhoneRepair;
import interfaces.IAccessoryRepair;
import interfaces.IOrder;
import interfaces.IPhoneRepair;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to our site. Would you like to order or repair?");

		String processOrder = in.nextLine().trim().toLowerCase();

		String productDetail = null;

		switch (processOrder) {
		case "order":
			IOrder iOrder = new COrder();
			System.out.println("Please provide Phone Model Name");
			productDetail = in.nextLine();
			iOrder.ProcessOrder(productDetail);
			break;
		case "repair":
			System.out.println("Is it the phone or the accessory that you want to be repaired?");
			String productType = in.nextLine();
			if (productType.equals("phone")) {
				IPhoneRepair irep = new CPhoneRepair();
				System.out.println("Please provide the Phone Model Name");
				productDetail = in.nextLine();
				irep.ProcessPhoneRepair(productDetail);
			} else {
				IAccessoryRepair iarep = new CAccessoryRepair();
				System.out.println("Please provide the accessory detail, like headphone, tempered glass");
				productDetail = in.nextLine();
				iarep.ProcessAccessoryRepair(productDetail);
			}
			break;
		default:
			break;
		}
		in.close();
	}

}
