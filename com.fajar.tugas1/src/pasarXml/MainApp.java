package pasarXml;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pasarXml.Pembeli;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
		
		User user = context.getBean("profil", User.class);
		
		Pembeli pembeli = (Pembeli) user;

		System.out.println(pembeli.toString());
		System.out.println("Barang : " + pembeli.getTransaksi().nama());
		System.out.println("Harga Satuan : Rp" + pembeli.getTransaksi().harga());
		System.out.println("Jumlah : " + pembeli.getTransaksi().jumlah());
		System.out.println("Total : Rp" + pembeli.getTransaksi().total());
		
		context.close();
	}

}
