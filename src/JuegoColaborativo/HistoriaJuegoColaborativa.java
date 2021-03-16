
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

	static void opcion1() {


		System.out.println("Has decidido salvar a Ingrid, tu hermano no ha conseguido sobrevivir al parto.");
		System.out.println("");
		System.out.println("3 anios despues");	
		System.out.println("");

		System.out.println("Desde que eras pequenia, el doctor Nathan Dawkins y tu madre vieron algo especial en ti, no eras como las demas ninias. Comenzaron a ver sucesos extranios que ocurrian a tu alrededor. Tenias un amigo imaginario llamado Aiden."
				+ "	Ingrid murio debido a una depresion tras la muerte de tu hermano.");
		System.out.println("A partir de ese entonces, Nathan se hizo de cargo de tu custodia.");
		System.out.println("");
		System.out.println("15 anios despues");
		System.out.println("");


		System.out.println("Con el paso del tiempo Nathan descubrio que Aiden, es una entidad vinculada a ti. Es un ser inmaterial, con poderes telequineticos que hace que tengas contacto con el mundo de los espiritus.");
		System.out.println("");
		System.out.println("Al ser un peligro para la sociedad, la CNP esta informada sobre su existencia.");
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
	

	static void opcion2() {
		
		System.out.println("Decidir salvar a tu hermano, tendra como consecuencia la muerte de Ingrid.");
		System.out.println("");
		System.out.println("Al tomar esta decision, has conseguido salvar a tu hermano Aiden. En contrapartida, tu madre Ingrid no ha logrado sobrevivir al parto.");
		System.out.println("Este tragico acontecimiento provoca que Aiden y tu os crieis juntos en un orfanato.");
		System.out.println("");
		System.out.println("17 anios despues...");
		System.out.println("");
		System.out.println("En el orfanato, te hiciste amiga de una chica muy similar a ti, Zoe Smith.");
		System.out.println("Era sin duda tu mejor amiga del lugar y al tener ambas un caracter muy parecido, os apoyabais en los momentos dificiles. ");
		System.out.println("Zoe habia perdido a sus padres por un accidente de trafico y llevaba unos pocos anios en el orfanato. Pero desde que entablasteis conversacion por primera vez, se genero una clara complicidad y habiais forjado una fuerte y cercana amistad.");
		System.out.println("");
		System.out.println("Al principio Aiden la veia con ojos de rechazo ya que sentia un distanciamiento progresivo contigo por dicha relacion de amistad.");
		System.out.println("Aiden era un chico introvertido, serio, independiente, que no se habria facilmente ante otras personas y en el fondo se sentia solo. ");
		System.out.println("Por ello, veia a Zoe como una enemiga y aun no habia hablado con ella ni una sola vez.");
		System.out.println("");
		System.out.println("Un dia conseguiste convencer a Aiden de que Zoe no era el problema y le pediste que le diera una oportunidad para que se diera cuenta que ella tambien podria ser buena amiga de ambos y de esta manera fortalecer el vinculo con tu hermano.");
		System.out.println("Con el paso del tiempo, tanto tu como Aiden y Zoe empezasteis a compartir buenos momentos en el orfanato y formasteis un grupo unido y complice.");
		System.out.println("Pero poco a poco, Aiden se empezo a enamorar de Zoe y a tener fuertes sentimientos por ella.");
		System.out.println("");
		System.out.println("Despues de un largo periodo de reflexion por parte de tu hermano, decide confesar sus sentimientos a Zoe.");
		System.out.println("Aunque Zoe se sintio muy halagada por las palabras tan sentidas de Aiden, ella no sentia lo mismo por el.");
		System.out.println("Aiden se quedo en shock. Al principio estaba totalmente paralizado y no movia ni un musculo.");
		System.out.println("Pero rapidamente se puso a temblar, y se exclamo con un llanto desconsolado diciendo que ya no queria ser mas su amigo.");
		System.out.println("Seguidamente a ello, Aiden se fue a su habitacion sin mirar a nadie.");
		System.out.println("");
		System.out.println("Esa misma noche, Aiden se consigue fugar del orfanato sin mirar atras, perdiendose en los entresijos del bosque.");
		System.out.println("");
		System.out.println("Decides:");
		System.out.println("1.-Salir al bosque a buscar a Aiden.");
		System.out.println("2.-Esperar en el orfanato a que vuelva.");
		
		int eleccionBosque=scanner.nextInt();
		
		if(eleccionBosque==1) {
			
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
