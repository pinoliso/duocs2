package duoc.s2;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class PeliculaController {
	public List<Pelicula> peliculas = new ArrayList();
	
	public PeliculaController() {
		peliculas.add(new Pelicula(1, "Transformers", 2007, "Michael Bay", "Acción", "El destino de la humanidad está en juego cuando dos razas de robots, los buenos Autobots y los villanos Decepticons, llevan su guerra a la Tierra. Los robots tienen la habilidad de transformarse en diferentes objetos mecánicos mientras buscan la clave del poder supremo. Sólo un joven humano, Sam Witwicky puede salvar al mundo de la destrucción total."));
		peliculas.add(new Pelicula(2, "El Rey León", 1994, "Rob Minkof, Roger Allers", "Aventuras", "Tras la muerte de su padre, Simba deberá enfrentarse a su tío para recuperar el trono de Rey de la Selva. Timón y Pumba le acompañarán en su misión."));
		peliculas.add(new Pelicula(3, "Sabrina", 1995, "Sidney Pollack", "Romance", "Sabrina Fairchild (Julia Ormond), la hija del chófer de la acaudalada familia de los Larrabee, desde niña se sintió fascinada por los hermanos Larrabee, especialmente por David. Convertida ya en una jovencita, gracias a los ahorros de su padre, se va a París. Cuando regresa a Estados Unidos, se ha transformado en una bella y sofisticada joven que deslumbra a David hasta tal punto que está dispuesto a romper su compromiso matrimonial con una millonaria. Pero Linus (Harrison Ford), el hermano mayor, ha cerrado un trato comercial con el padre de la novia de David y no está dispuesto a consentir que nadie interfiera en sus negocios."));
		peliculas.add(new Pelicula(4, "Ex-Máquina", 2015, "Alex Garland", "Ciencia ficción", "Caleb, un joven programador, gana un concurso que le permitirá conocer al misterioso y solitario director ejecutivo de la empresa en la que trabaja. Al llegar a su residencia, Caleb descubre que tiene que convivir con un robot creado por su jefe."));
		peliculas.add(new Pelicula(5, "Rápido y Furioso", 2001, "Rob Cohen", "Aventuras", "Cada noche, Los Ángeles es testigo de alguna carrera de coches. Últimamente ha aparecido un nuevo corredor, todos saben que es duro y que es rápido, pero lo que no saben es que es un detective con la determinación de salir victorioso."));
	}
	
	@GetMapping("/peliculas")
	public List<Pelicula> getPeliculas() {
		return peliculas;
	}

	@GetMapping("/peliculas/{id}")
    public Pelicula getPeliculaById(@PathVariable int id) {
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getId() == id) {
                return pelicula;
            }
        }
        return null;
    }
	
}
