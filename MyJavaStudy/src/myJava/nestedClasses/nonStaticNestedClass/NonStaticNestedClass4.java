package myJava.nestedClasses.nonStaticNestedClass;

//Non static nested class extended by the Main class explicitly.
class Outerrr {
	int x = 10;
	static int y = 20;
	Outerrr o = new Outerrr();

	class Inner {
		void show() {
			System.out.println(x);
			System.out.println(y);
		}
	}
}

/*class NonStaticNestedClass4 extends Outerrr.Inner {
	public static void main(String... s) {
		NonStaticNestedClass4 a = new NonStaticNestedClass4();
		Outerrr obj = new Outerrr();
		Outerrr.Inner obj2 = obj.new Inner();
		// System.out.println(obj.x);
		// System.out.println(y);
		// Outer.Inner obj2 = obj.new Inner();
		// obj2.show();
	}
}*/
