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

	static void opcion9() {

		System.out.println("Decides salir a buscar a Aiden. Tras seguir sus pisadas por el bosque, le encuentras.");
		System.out.println("");
		System.out.println("Comenzais a dar un paseo y a hablar sobre lo que ha ocurrido.");
		System.out.println("En mitad de la charla, cerca de un precipicio, una manada de ciervos os empiezan a acorralar.");
		System.out.println("Aiden se tropieza y se queda colgando de una rama.");
		System.out.println("");
		System.out.println("Decides:");
		System.out.println("1.- Ayudarle");
		System.out.println("2.- No ayudarle");

		int eleccionBosque = scanner.nextInt();

		if (eleccionBosque == 1) {
			opcion11();
		} else {
			opcion12();
		}
	}

	static void opcion11() {

		System.out.println("Decides ir a ayudarle, la rama en la que estaba sujeto Aiden se rompe, provocando que os caigais los dos por el precipicio.");
		System.out.println("Tras la caida, Aiden tiene un muerte instantanea y tu sobrevives.");
	}

	static void opcion12() {

		System.out.println("Decides no ayudar a tu hermano, por tanto tu hermano muere.");
		System.out.println("Tras su caida, los ciervos te empiezan a acorralar mas y terminas cayendo, provocando tu muerte tambien.");
	}

	static void opcion10() {

		System.out.println("Decides esperar que vuelva tu hermano. ");
		System.out.println("Al siguiente dia la policia acude al orfanato para comunicarte una terrible noticia, tu hermano a fallecido tras caerse por un barranco.");
		System.out.println("");
	}

}
