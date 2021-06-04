package es.studium.filmingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.fonts.Font;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import es.studium.filmingapp.ui.peliculas.PeliculasFragment;
import es.studium.filmingapp.ui.series.SeriesFragment;

public class Detalles extends AppCompatActivity implements View.OnClickListener {

    ImageView imgCaratula;
    TextView titulo;
    TextView subtitulo;
    TextView director;
    TextView reparto;
    ImageView clasificacion;
    TextView sinopsis;
    TextView temporadas;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles);

        if(PeliculasFragment.posicion != -1){
            imgCaratula = findViewById(R.id.imgDetallePelicula);
            imgCaratula.setImageResource(PeliculasFragment.items.get(PeliculasFragment.posicion).getImagen());
            titulo = findViewById(R.id.tituloPelicula);
            titulo.setText(PeliculasFragment.items.get(PeliculasFragment.posicion).getTitulo());
            subtitulo = findViewById(R.id.subTituloPelicula);
            subtitulo.setText(PeliculasFragment.items.get(PeliculasFragment.posicion).getSubtitulo());
            director = findViewById(R.id.directorPelicula);
            director.setText(PeliculasFragment.items.get(PeliculasFragment.posicion).getDirector());
            reparto = findViewById(R.id.repartoPelicula);
            reparto.setMovementMethod(new ScrollingMovementMethod());
            reparto.setText(PeliculasFragment.items.get(PeliculasFragment.posicion).getReparto());
            sinopsis = findViewById(R.id.sinopsisPelicula);
            sinopsis.setMovementMethod(new ScrollingMovementMethod());
            sinopsis.setText(PeliculasFragment.items.get(PeliculasFragment.posicion).getSinopsis());
            clasificacion = findViewById(R.id.imgClasificacionPelicula);
            clasificacion.setImageResource(PeliculasFragment.items.get(PeliculasFragment.posicion).getClasificacion());
            PeliculasFragment.posicion = -1;
        }
        else if(SeriesFragment.posicion != -1){
            imgCaratula = findViewById(R.id.imgDetallePelicula);
            imgCaratula.setImageResource(SeriesFragment.items.get(SeriesFragment.posicion).getImagen());
            titulo = findViewById(R.id.tituloPelicula);
            titulo.setText(SeriesFragment.items.get(SeriesFragment.posicion).getTitulo());
            subtitulo = findViewById(R.id.subTituloPelicula);
            subtitulo.setText(SeriesFragment.items.get(SeriesFragment.posicion).getSubtitulo());
            director = findViewById(R.id.directorPelicula);
            director.setText(SeriesFragment.items.get(SeriesFragment.posicion).getDirector());
            reparto = findViewById(R.id.repartoPelicula);
            reparto.setMovementMethod(new ScrollingMovementMethod());
            reparto.setText(SeriesFragment.items.get(SeriesFragment.posicion).getReparto());
            sinopsis = findViewById(R.id.sinopsisPelicula);
            sinopsis.setMovementMethod(new ScrollingMovementMethod());
            sinopsis.setText(SeriesFragment.items.get(SeriesFragment.posicion).getSinopsis());
            clasificacion = findViewById(R.id.imgClasificacionPelicula);
            clasificacion.setImageResource(SeriesFragment.items.get(SeriesFragment.posicion).getClasificacion());
            temporadas = findViewById(R.id.temporadas);
            temporadas.setText(SeriesFragment.items.get(SeriesFragment.posicion).getNumTemporadas());
            SeriesFragment.posicion = -1;
        }

        button = findViewById(R.id.buttonPelicula);
        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        finish();
    }
}