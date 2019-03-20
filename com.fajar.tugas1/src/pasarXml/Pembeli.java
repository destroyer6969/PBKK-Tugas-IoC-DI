package pasarXml;

public class Pembeli implements User {
	
	public Barang transaksi;
	
	private int id;
	private String name;
	private String email;
	private String nohp;

	@Override
	public String desc() {
		// TODO Auto-generated method stub
		return "Pembeli sedang berbelanja";
	}

	public Pembeli() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pembeli(Barang transaksi) {
		super();
		this.transaksi = transaksi;
	}
	

	public Barang getTransaksi() {
		return transaksi;
	}

	public void setTransaksi(Barang transaksi) {
		this.transaksi = transaksi;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNohp() {
		return nohp;
	}

	public void setNohp(String nohp) {
		this.nohp = nohp;
	}
	
	@Override
	public String toString() {
		return "Pembeli [id=" + id + ", name=" + name + ", email=" + email + ", nohp=" + nohp + "]";
	}

}
