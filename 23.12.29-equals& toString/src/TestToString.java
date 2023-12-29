
public class TestToString {
	public static void main(String[] args) {
		Object o = new Object();
		String str = "abcd";
		Box b = new Box(100, 100, 100);
		
		String concat = "문자열결합," + new Object();
		System.out.println(concat);
	
		
//		System.out.println(o.toString());
//		System.out.println(str.toString());
//		System.out.println(b.toString());
//				
//		Person p = new Person("둘리", 55);
//		
//		System.out.println(p.toString());
//		
//		Customer c = new Customer("재욱", "010-22-222");
//		System.out.println(c.toString());
//		
//		Student s = new Student("동수", 95, 90, 85, new Pen(3000));
//		System.out.println(s.toString());
	}
}
