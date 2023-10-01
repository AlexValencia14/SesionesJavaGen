package logicOperators;

public class Exercise {
	public static void main(String[] args) {
		//Enrique, Paola y Mariana se dirigen a la MacStore y deciden comprar un iPhone 15 cada uno. La tienda tiene una promoción por el mes patrio: "Si el total de tu compra supera los 25 mil pesos, obtén un 10% de descuento". Enrique, Paola y Mariana deciden comprar los tres equipos con una sola tarjeta. Al llegar a caja, la cajera les menciona que la tienda en estos momentos cuenta con una promoción de 12 meses sin intereses, por lo tanto, deciden pagar con la TDC de Mariana. ¿Cuál sería el costo total por los 3 equipos sin descuento? ¿Aplicaría el descuento en su compra? ¿Cuál sería el costo total con el descuento aplicado? ¿Cuánto pagarían mensualmente?
		short precioIPhone15=20000;
		float descuento= 10f;
		
		int total=precioIPhone15*3;
		System.out.println("El costo total sin descuento de los 3 equipos es de: "+total);
		
		if (total>=25000) {
			float totalConDescuento = total*(1-descuento/100);
			float pagoMensualDescuento = totalConDescuento/12;
			System.out.println("****Se aplica descuento del 10%****");
			System.out.println("El costo total con descuento de los 3 equipos es de: "+totalConDescuento);
			System.out.println("El pago mensual de 12 meses sin intereses es de: "+pagoMensualDescuento );
		}else {
			float pagoMensual= total/12;
			System.out.println("No aplica el descuento");
			System.out.println("El pago mensual de 12 meses sin intereses es de: "+pagoMensual);
		}
		
		
	}
}
