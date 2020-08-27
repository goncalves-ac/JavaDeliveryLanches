package delivery;

import java.util.Scanner;

public class Programa {

	static Scanner teclado = new Scanner(System.in);
	
	public static void menuSanduiche(Sanduiche lanche) {
		
		String[] ingredientes = new String[10];
		String ingrediente = "";
		int distancia = 0;
		int i = 0;
		
		System.out.print("\n");
		System.out.println("Sanduiche: ");
		System.out.println("Ingredientes: (Digite 0 para finalizar)");
		
		while (i < 10 && !ingrediente.equals("0")) {
			ingrediente = teclado.nextLine();
			ingredientes[i] = ingrediente;
			i++;
		}
		
		lanche.setIngredientes(ingredientes);
		System.out.print("\n");
		System.out.println("Informe distancia: ");
		distancia =  teclado.nextInt();
		System.out.print("\n");
		System.out.println("PEDIDO: ");
		for (String item : ingredientes) {
			if (item != null && !item.equals("0")) {
				System.out.println(item);
			}
		}
		System.out.print("\n");
		System.out.println("Seu pedido chegará em : " + lanche.calculaTempo(distancia) + "minutos.");
		System.out.print("\n");
	}
	
	public static void menuBolo (Bolo lanche) {
		
		String recheio = "";
		String cobertura = "";
		int tipoMassa;
		int distancia = 0;
		
		System.out.print("\n");
		System.out.println("Massa: \n[1] Pão de Ló \n[2] Chocolate \n[3] Red Velvet \n[0] Finalizar");
		tipoMassa = teclado.nextInt();
		System.out.print("\n");
		
		if (tipoMassa == 1) {
			System.out.println("Pão de ló");
			System.out.println("Recheio (Brigadeiro [branco ou preto], Ninho, Frutas): ");
			recheio = teclado.next();
			System.out.println("Cobertura (Brigadeiro [branco ou preto], Ninho, Naked): ");
			cobertura = teclado.next();
			System.out.print("\n");
			System.out.println("\nPEDIDO: \n   Bolo \nMassa: Pão de ló [ "+ tipoMassa + " ]\nRecheio: "+ recheio + "\nCobertuta: "+ cobertura);
			System.out.print("\n");
			
		} else if (tipoMassa == 2) {
			System.out.println("Chocolate");
			System.out.println("Recheio (Brigadeiro [branco ou preto], Ninho, Frutas): ");
			recheio = teclado.next();
			System.out.println("Cobertura (Brigadeiro [branco ou preto], Ninho, Naked): ");
			cobertura = teclado.next();
			System.out.print("\n");
			System.out.println("\nPEDIDO: \n   Bolo \nMassa: Chocolate [ "+ tipoMassa + " ]\nRecheio: "+ recheio + "\nCobertuta: "+ cobertura);
			System.out.print("\n");
			
		} else if (tipoMassa == 3) {
			System.out.println("Red Velvet");
			System.out.println("Recheio (Brigadeiro [branco], Ninho, Frutas): ");
			recheio = teclado.next();
			System.out.println("Cobertura (Brigadeiro [branco], Ninho, Naked): ");
			cobertura = teclado.next();
			System.out.print("\n");
			System.out.println("\nPEDIDO: \n   Bolo \nMassa: Red Velvet [ "+ tipoMassa + " ]\nRecheio: "+ recheio + "\nCobertuta: "+ cobertura);
			System.out.print("\n");
			
		} else {
			System.out.print("\n");
			System.out.println("Programa Finalizado. Volte Sempre.");
			System.exit(0);
		}
		
		System.out.println("Informe distancia: ");
		distancia =  teclado.nextInt();
		System.out.println("Seu pedido chegará em : " + lanche.calculaTempo(distancia) + "minutos.");
		System.out.print("\n");
		System.out.println("Aguarde.");
	}
	 
	public static void menuMassa (Massa lanche) {
		
		int tipoMassa;
		int distancia = 0;
		String molho = "";
		String acrescimo = "";
		
		System.out.print("\n");
		System.out.println("Massa: \n[1] Macarrão \n[2] Pizza \n[3] Lasanha \n[0] Finalizar");
		tipoMassa = teclado.nextInt();
		System.out.print("\n");
		
		if (tipoMassa == 1) {
			System.out.println("Macarrão");
			System.out.println("Molho (vermelho, branco, rose): ");
			molho = teclado.next();
			System.out.println("01 acréscimo (queijo, presunto): ");
			acrescimo = teclado.next();
			System.out.print("\n");
			System.out.println("\nPEDIDO: \n   Macarrão \nMolho: "+ molho + "\nAcrescimo: "+ acrescimo);
			System.out.print("\n");
			
		} else if (tipoMassa == 2) {
			System.out.println("Pizza");
			System.out.println("Sabores (Moda, Portuguesa, Calabresa, Frango): ");
			molho = teclado.next();
			System.out.print("\n");
			System.out.println("\nPEDIDO: \n   Pizza \nSabor: "+ molho );
			System.out.print("\n");
			
		} else if (tipoMassa == 3) {
			System.out.println("Lasanha");
			System.out.println("Molho (vermelho, branco, rose): ");
			molho = teclado.next();
			System.out.println("01 acréscimo (frango, bolonhesa): ");
			acrescimo = teclado.next();
			System.out.print("\n");
			System.out.println("\nPEDIDO: \n   Lasanha \nMolho: "+ molho + "\nAcrescimo: "+ acrescimo);
			System.out.print("\n");
			
		} else {
			System.out.print("\n");
			System.out.println("Programa Finalizado. Volte sempre.");
			System.exit(0);
		}
		
		System.out.print("\n");
		System.out.println("Informe distancia: ");
		distancia =  teclado.nextInt();
		System.out.println("Seu pedido chegará em : " + lanche.calculaTempo(distancia) + " minutos.");
		System.out.print("\n");
		System.out.println("Aguarde.");
		
	}
	
	public static void main(String[] args) {
		
		Lanche lanche;
		int opcao;
		
		System.out.println("Selecione o tipo de Lache: ");
		System.out.println("[1] Sanduiche \n[2] Bolos \n[3] Massas ");
		
		opcao = teclado.nextInt();
		
		if (opcao == 1) {
			lanche = new Sanduiche();
			lanche = (Sanduiche) lanche;
			menuSanduiche((Sanduiche) lanche);
			
		} else if (opcao == 2) {
			lanche = new Bolo();
			menuBolo((Bolo) lanche);
			
		} else if (opcao == 3) {
			lanche = new Massa();
			menuMassa((Massa) lanche);
		}
		
		System.out.println("Obrigadx pela preferência.");
		teclado.close();
	}
	
}
