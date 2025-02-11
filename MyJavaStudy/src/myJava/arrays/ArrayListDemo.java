package myJava.arrays;

//Array List is in action
import java.util.ArrayList;
import java.util.Iterator;

class ArrayListDemo {
	public static void main(String args[]) {
		ArrayList<String> arl = new ArrayList<String>();
		arl.add("Apple");
		arl.add("Mango");
		arl.add("Grapes");
		arl.add("Guava");
		System.out.println("Contents : " + arl);
		arl.remove(3);
		arl.remove("Apple");
		System.out.println("Contents After Removing : " + arl);
		System.out.println("Size of ArrayList : " + arl.size());
		System.out.println("Extracting using Iterator : ");
		;
		Iterator it = arl.iterator();
		while (it.hasNext())
			System.out.println(it.next());
	}
}
/*
 * Output Contents : [Apple, Mango, Grapes, Guava] Contents After Removing :
 * [Mango, Grapes] Size of ArrayList : 2 Extracting using Iterator : Mango
 * Grapes
 */