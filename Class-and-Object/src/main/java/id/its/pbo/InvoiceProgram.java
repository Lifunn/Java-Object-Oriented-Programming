package id.its.pbo;

public class InvoiceProgram {

	public static void main(String[] args) {
		Invoice a = new Invoice("99", "Beli epang lok", 1, 1000);
		
		System.out.println("Sebelum melakukan Setter");
		System.out.println(a.getPartNumber());
		System.out.println(a.getpartDescription());
		System.out.println(a.getquantity());
		System.out.println(a.getprice());
		System.out.println("Setelah melakukan Setter");
		a.setPartNumber("100");
		a.setPartDescription("Beli Rajan Lok");
		a.setQuantity(2);
		a.setPrice(500);
		System.out.println(a.getPartNumber());
		System.out.println(a.getpartDescription());
		System.out.println(a.getquantity());
		System.out.println(a.getprice());
	}

}
