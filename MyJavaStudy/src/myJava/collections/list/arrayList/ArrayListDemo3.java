package myJava.collections.list.arrayList;

import java.util.ArrayList;



/**
 * @author Mohit
 * 
 * This program is used to get all the element of array list via for loop
 */
public class ArrayListDemo3 {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		System.out.println(arrayList.size());
		int x[] = {1,-1, 2, -2, 3, -3, 4, -4};
		
		for(int i=0;i<x.length;i++)
		{
			arrayList.add(x[i]);
		}
		System.out.println(arrayList);
		System.out.println(arrayList.size());
		
		Object object[] = arrayList.toArray();

		for(int i=0; i<object.length;i++)
		{
			Integer integer = (Integer) object[i];
			System.out.println(integer.intValue());
		}
		
	}
}
