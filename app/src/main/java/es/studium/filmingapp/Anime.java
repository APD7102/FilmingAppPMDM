package es.studium.filmingapp;

public class Anime {

    private final int imagen;
    private final int fuente;
    private final String titulo;
    private final String subtitulo;
    private final String director;
    private final String reparto;
    private final int clasificacion;
    private final String sinopsis;
    private final String numTemporadas;


    public Anime(int imagen, int fuente, String titulo, String subtitulo, String director, String reparto, int clasificacion, String sinopsis, String numTemporadas){
        this.imagen = imagen;
        this.fuente = fuente;
        this.titulo = titulo;
        this.subtitulo = subtitulo;
        this.director = director;
        this.reparto = reparto;
        this.clasificacion = clasificacion;
        this.sinopsis = sinopsis;
        this.numTemporadas = numTemporadas;
    }

    public int getImagen() {
        return imagen;
    }
    public int getFuente() { return fuente; }
    public String getTitulo() {
        return titulo;
    }
    public String getSubtitulo(){ return subtitulo; }
    public String getDirector(){ return director; }
    public String getReparto(){ return reparto; }
    public int getClasificacion(){ return clasificacion; }
    public String getSinopsis(){ return sinopsis; }
    public String getNumTemporadas(){ return numTemporadas; }
}
