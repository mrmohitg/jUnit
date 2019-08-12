package myJava.arrays;

//Two Dimentional Array
public class ArrayOfArrayAnimalDemo {
	public static void main(String... args) {
		String[][] animals = { { "Dog", "Cat", "Pig", "Mouse" }, { "Lion", "Tiger", "Bear", "Dear" },
				{ "Cow", "Goat", "Sheep", "Lamb" } };
		for (int i = 0; i < animals.length; i++) {
			for (int j = 0; j < animals[i].length; j++) {
				System.out.println(animals[i][j] + " ");
			}
		}
	}
}
/*
 * Output Dog Cat Pig Mouse Lion Tiger Bear Dear Cow Goat Sheep Lamb
 */