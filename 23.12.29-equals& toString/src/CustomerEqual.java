
public class CustomerEqual {
	public static void main(String[] args) {
		Customer cus1 = new Customer("고객1", "010-202-222");
		Customer cus2 = new Customer("고객1", "010-202-222");
	
		if (cus1.equals(cus2)) {
			System.out.println("정보일치 확인");
		}
				
		Customer cu3 = new Customer("고객3", "0152631");
		
		if (!cus1.equals(cu3)) {
			System.out.println("정보 불일치");
			
		}
		
		
	}
}
