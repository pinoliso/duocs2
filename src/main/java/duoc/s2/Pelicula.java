package duoc.s2;

public class Pelicula {
	public int id;
	public String titulo;
	public int anio;
	public String director;
	public String genero;
	public String sinopsis;

	public Pelicula(int id, String titulo, int anio, String director, String genero, String sinopsis) {
		this.id = id;
		this.titulo = titulo;
		this.anio = anio;
		this.director = director;
		this.genero = genero;
		this.sinopsis = sinopsis;
	}

	public int getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getAnio() {
		return anio;
	}

	public String getDirector() {
		return director;
	}

	public String getGenero() {
		return genero;
	}

	public String getSinopsis() {
		return sinopsis;
	}
}