public class Test{
	public static void main(String[] args) {
		Macan m1 = new Macan("Kumbang");
		m1.showJenis();
		System.out.println("Macan ini beratnya = "+m1.showBerat());

		Macan m2 = new Macan("Putih",70);
		m2.showJenis();
		System.out.println("Macan ini beratnya = "+m2.showBerat());

		Macan m3 = new Macan("Tuutul",50);
		m3.showJenis();
		System.out.println("Macan ini beratnya = "+m3.showBerat());

	}
}