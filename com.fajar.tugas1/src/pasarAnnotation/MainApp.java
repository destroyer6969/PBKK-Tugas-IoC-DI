package pasarAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("AnnotationConfig.xml");
		
		User user = context.getBean("pembeli", User.class);
		Pembeli pembeli = (Pembeli) user;
		pembeli.setId(001);
		pembeli.setName("Rasyid");
		pembeli.setEmail("rasyidfajar01@gmail.com");
		pembeli.setNohp("081576969781");
		System.out.println(pembeli.toString());
		System.out.println("Barang : " + pembeli.getTransaksi().nama());
		System.out.println("Harga Satuan : Rp" + pembeli.getTransaksi().harga());
		System.out.println("Jumlah : " + pembeli.getTransaksi().jumlah());
		System.out.println("Total : Rp" + pembeli.getTransaksi().total());
		
		context.close();
	}
}
