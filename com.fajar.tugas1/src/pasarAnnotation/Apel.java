package pasarAnnotation;

import org.springframework.stereotype.Component;

@Component
public class Apel implements Barang {

	@Override
	public Integer harga() {
		return 50000;
	}

	@Override
	public Integer jumlah() {
		return 2;
	}

	@Override
	public Integer total() {
		return this.harga()*this.jumlah();
	}
	
	@Override
	public String nama() {
		return "Apel";
	}
}
