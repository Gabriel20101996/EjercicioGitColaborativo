package JuegoColaborativo;
import java.util.Scanner;
public class HistoriaJuegoColaborativa {

	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bienvenido a la historia donde tu eres el protagonista.");
		System.out.println("");

		System.out.println("Podras elegir entre varias opciones para decidir el rumbo de tu aventura.");
		System.out.println("");

		System.out.println("La historia comienza a las 9 de la maniana del 15 de diciembre de 1995 en el hospital Infanta Sofia de Madrid, "
				+ "hacia un frio helador y aun no habia salido el sol.");
		System.out.println("Hoy era un dia especial, Ingrid Baker estaba a punto de dar a luz. El medico anteriormente le habia avisado que iba a tener dos mellizos, un ninio y una ninia.");
		System.out.println("");

		System.out.println("Debido a esta situacion, el padre, Richard Williams, decidio dejar a Ingrid y cortar el contacto con ella y sus futuros hijos.");
		System.out.println("");

		System.out.println("El embarazo iba muy bien, pero iba a suceder un imprevisto desafortunado que cambiaria drasticamente el devenir de la historia, "
				+ "y eres tu quien debe decidir que rumbo tomar. Este dia marcara tu vida y a partir de ahi depende de ti y de tus actos en quien tu decidas ser.");
		System.out.println("");

		System.out.println("Llega el momento de tomar tu primera decision. Estas en la una encrucijada antes de nacer.");
		System.out.println("");
		System.out.println("Decides:");
		System.out.println("1.- Ingrid sobreviva al parto pero eso involucraria que tu hermano fallezca.");
		System.out.println("2.- Decidir salvar a tu hermano, tendra como consecuencia la muerte de Ingrid.");
		int eleccion = scanner.nextInt();

		if (eleccion == 1){

			
		} else {

			
		}
	}

	static void opcion1() {


		System.out.println("Has decidido salvar a Ingrid, tu hermano no ha conseguido sobrevivir al parto.");
		System.out.println("");
		System.out.println("3 anios despues…");	
		System.out.println("");

		System.out.println("Desde que eras pequenia, el doctor Nathan Dawkins y tu madre vieron algo especial en ti, no eras como las demas ninias. Comenzaron a ver sucesos extranios que ocurrian a tu alrededor. Tenias un amigo “imaginario” llamado Aiden."
				+ "	Ingrid murio debido a una depresion tras la muerte de tu hermano.");
		System.out.println("A partir de ese entonces, Nathan se hizo de cargo de tu custodia.");
		System.out.println("");
		System.out.println("15 anios despues…");
		System.out.println("");


		System.out.println("Con el paso del tiempo Nathan descubrio que Aiden, es una entidad vinculada a ti. Es un ser inmaterial, con poderes telequineticos que hace que tengas contacto con el mundo de los espiritus.");
		System.out.println("");
		System.out.println("Al ser “un peligro para la sociedad”, la CNP esta informada sobre su existencia.");
		System.out.println("La CNP han encontrando un portal multidimensional en unas instalaciones abandonas, en el que parecia haber entidades malignas."
				+ "Debido a ello, la CNP contacto contigo para que pudieses ayudar a la exterminacion del portal.");
		System.out.println("");
		System.out.println("Decides:");
		System.out.println("1.-Colaborar para que se cierre el portal.");
		System.out.println("2.-No colaborar.");

		int eleccion1 = scanner.nextInt();

		if (eleccion1 == 1){

			opcion3();
		} else {

			opcion4();
		}

	}
	
	
}
