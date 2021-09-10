package tp3;

public class Teste {
	
	
static FrangoEmpanado frango;
static BatataFrita batata;
static Molho molho;
static Cliente cliente;
static ContaBancaria conta;
static Entregador entregador;


	public static void main(String[] args) {
		
		frango = new FrangoEmpanado ('P',"Um delicioso Frango",17.87,"Peito");
		batata = new BatataFrita ('M',"Batata crocante e quentinha", 12.85,"Cheddar e Bacon");
		molho = new Molho ('G', "Um molho para melhorar sua experiencia", 2.53, "Barbecue" );
		cliente = new Cliente ("Fagner", "Aguas Claras", "025.159.753-46", "(61) 94545-6363");
		conta = new ContaBancaria("BB",0005,"15985245-3");
		entregador = new Entregador ("Kléber", "Plano Piloto", "951.546.748-20", "Bicicleta", 4.7, conta);
		
		System.out.println(frango.toString());
		System.out.println();
		System.out.println(batata.toString());
		System.out.println();
		System.out.println(molho.toString());
		System.out.println();
		System.out.println(cliente.toString());
		System.out.println();
		System.out.println(entregador.toString());
	}

}
