package myJava.concepts;

//Default values of data types.
class LitralesConstant {
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	char c;

	void show() {
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
	}

	public static void main(String... s) {
		LitralesConstant obj = new LitralesConstant();
		obj.show();
	}
}
/*
 * Output 0 0 0 0 0.0 0.0
 */