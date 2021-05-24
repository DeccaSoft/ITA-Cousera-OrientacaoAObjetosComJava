
public class Principal {
	
	public static void main(String[] args) {
		Compra c1 = new Compra(100.0);
		System.out.println("Compra a vista c1 total ="+c1.total());

		Compra c2 = new Compra(150.0);
		System.out.println("Compra a vista c2 total ="+c2.total());

		Compra c3 = new CompraParcelada(100.0,1,0.10);
		System.out.println("Compra parcelada c3 de 100.0 com 1 parcelas,juros de 10%a.m. total ="+c3.total());

		Compra c4 = new CompraParcelada(100.0,0,0.05);
		System.out.println("Compra parcelada c4 de 100.0 com 0 parcelas,juros de 5%a.m.  total ="+c4.total());
	
		Compra c5 = new CompraParcelada(100.0,1,0.05);
		System.out.println("Compra parcelada c5 de 100.0 com 1 parcelas,juros de 5%a.m.  total ="+c5.total());

		Compra c6 = new CompraParcelada(100.0,2,0.05);
		System.out.println("Compra parcelada c6 de 100.0 com 2 parcelas,juros de 5%a.m.  total ="+c6.total());

		Compra c7 = new CompraParcelada(100.0,5,0.05);
		System.out.println("Compra parcelada c7 de 100.0 com 5 parcelas,juros de 5%a.m.  total ="+c7.total());

		Compra c8 = new CompraParcelada(100.0,10,0.05);
		System.out.println("Compra parcelada c8 de 100.0 com 5 parcelas,juros de 5%a.m.  total ="+c8.total());
	}

}
