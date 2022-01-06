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
	}
	
	
	public static int findIngredient(String[] ingredients, String ingredientName) {
		for (int i = 0; i < ingredients.length; i++) {
			if (ingredients[i].equals(ingredientName)) {
				return i;
			}
		}
		
		return -1;
	}
}
