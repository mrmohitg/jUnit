package myJava.annotation;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyMarker {
}

public class Marker {
	@MyMarker
	public static void myMeth() {
		Marker ob = new Marker();
		try {
			Method m = ob.getClass().getMethod("myMeth");
			// Determine if the annotation is present.
			if (m.isAnnotationPresent(MyMarker.class))
				System.out.println("My marker is present.");
		} catch (Exception e) {
			System.out.println("Method not found.");
		}
	}

	public static void main(String... args) {
		myMeth();
	}
}