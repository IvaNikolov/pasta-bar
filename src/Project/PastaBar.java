package Project;

import java.util.Scanner;

public class PastaBar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] regularCustomers = { "0631111111", "063222222", "063333333", "064444444", "065555555", "066666666" };
		String[] ingredients = { "Makarone", "Spagete", "Bolognese", "Curetina", "Govedja prsuta", "Slanina",
				"Piletina", "4 sira", "Dimljeni sir", "Parmezan", "Pavlaka", "Pesto sos", "Napolitana", "Povrce mix",
				"Pecurke", "Kutija" };
		int[] prices = { 50, 60, 120, 120, 140, 100, 100, 100, 80, 50, 80, 80, 80, 50, 50, 20 };
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Izvolite !!");
		
		System.out.println("Izaberite sastojak za pastu:");
		String ingredientName = s.nextLine();
		
		int suma = 0;

		while (!(ingredientName.equals("Poruci"))) {
			int indexOfPriceArray = findIngredient(ingredients, ingredientName); //this method is returning index
			suma = prices[indexOfPriceArray] + suma;
			
			System.out.println("Izaberite sastojak za pastu:");
			ingredientName = s.nextLine();  
		}
		
		System.out.println("Unesite vas broj telefona:");
		String phone = s.next();
		if (isRegularCustomer(regularCustomers, phone)) {
			System.out.println("Vasa pasta iznosi:" + suma*90/100 + "RSD");
		} else {
			System.out.println("Vasa pasta iznosi:" + suma + "RSD");
		}
		System.out.println("Prijatno");
	}
	
	
	public static int findIngredient(String[] ingredients, String ingredientName) {
		for (int i = 0; i < ingredients.length; i++) {
			if (ingredients[i].equals(ingredientName)) {
				return i;
			}
		}
		
		return -1;
	}
	
	public static boolean isRegularCustomer(String[] phoneNumbers, String phone) {

		for (int i = 0; i < phoneNumbers.length; i++) {
			if (phone.equals(phoneNumbers[i])) {
				return true;
			}
		}
		return false;
	}

}
