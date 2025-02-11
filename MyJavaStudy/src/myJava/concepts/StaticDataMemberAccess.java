package myJava.concepts;

//There are three ways to access static data member
class StaticDataMemberAccess {
	static int x = 10;

	public static void main(String... s) {
		StaticDataMemberAccess obj = new StaticDataMemberAccess();
		System.out.println(x + " Static data member direct access.");
		System.out.println(obj.x + " Static data member access with the object.");
		System.out.println(
				StaticDataMemberAccess.x + " Static data member access by qualifying with the name of the class.");
	}
}
/*
 * Output 10 Static data member direct access. 10 Static data member access with
 * the object. 10 Static data member access by qualifying with the name of the
 * class.
 */