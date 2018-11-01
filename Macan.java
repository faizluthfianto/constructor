public class Macan extends Hewan{
	
	public int berat;

	public Macan(String jenis, int berat){
		super(jenis);		
		this.berat = berat;
	}

	public Macan(String jenis){
		super(jenis);
	}


	public int showBerat(){
		return berat;
	}

}