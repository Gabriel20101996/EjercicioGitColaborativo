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

	static void opcion3() {
		
		System.out.println("Decides colaborar con la CNP");
		System.out.println();
		System.out.println("Estas en la ubicacion donde se situa el portal. Una vez alli, entras junto con los agentes del GEO a las instalaciones, de camino alli al portal, hay complicaciones.");
		System.out.println();
		System.out.println("Las entidades van matando poco a poco a todos los agentes.");
		System.out.println();
		System.out.println("Huyendo de las entidades consigues llegar hasta el portal, gracias a Aiden.");
		System.out.println();
		System.out.println("Una vez alli, encuentras un centro de controles, en el que hay un boton grande y rojo.");
		System.out.println();
		System.out.println("1.- Pulsar el boton y arriesgarte a que cierre el portal");
		System.out.println("2.- No pulsar el boton e intentar buscar una manera de cerrarlo por ti misma.");
		System.out.println();
		System.out.println("Decides: ");
		
		int eleccion = scanner.nextInt();
		
		if(eleccion == 1) {
			
			opcion5();
		}else {
			
			opcion6();
		}
	}
	
	
	static void opcion4() {
		
		System.out.println("Decides no colaborar con la CNP, por ese motivo, deciden investigarte para cerrar el portal sin tu ayuda.");
		System.out.println();
		System.out.println("En una de las investigaciones Aiden se corrompe y debido a ello, tu cuerpo no es capaz de soportarlo y entras en un coma en el que nunca volveras a despertar.");
	}
	
	static void opcion5() {
		
		System.out.println("Decides pulsar el boton y el portal se comienza a cerrar, se inicia una cuenta atras durante la cual tienes que decidir entre:");
		System.out.println();
		System.out.println("1.- Permanecer en el mundo de los vivos y desvincularte definitivamente de Aiden");
		System.out.println("2.- Acompanar a Aiden al inframundo y convertirte en una entidad");
		System.out.println();
		System.out.println("Decides: ");
		int eleccion = scanner.nextInt();
		
		if(eleccion == 1) {
			
			opcion7();
		}else {
			
			opcion8();
		}
	}
	
	
	static void opcion6() {
		
		System.out.println("Mientras que intentas buscar la manera de cerrarlo, las entidades destuyen el centro de control generando una explosion, causando tu muerte.");
		System.out.println();
		System.out.println("Debido a esto, el inframundo conquista el mundo de los vivos.");
	}
	
	static void opcion7() {
		
		System.out.println("Al cerrar el portal Aiden se despide de ti y descubres que era el espiritu de tu hermano.");
		System.out.println();
		System.out.println("Has conseguido sobrevivir y salvar el mundo, decides vivir tu vida con la mayor normalidad posible y teniendo a Aiden en tu recuerdo");
	}
	
	static void opcion8() {
		
		System.out.println("Aiden te confiesa que es tu hermano y decides morir e ir al inframundo, permaneciendo con el eternamente");
	}
}
