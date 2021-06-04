package es.studium.filmingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import es.studium.filmingapp.ui.peliculas.PeliculasFragment;
import es.studium.filmingapp.ui.series.SeriesFragment;

public class Caraturas extends AppCompatActivity implements View.OnClickListener {

    ImageView imgCaratula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caraturas);

        if(PeliculasFragment.posicion != -1){
            imgCaratula = findViewById(R.id.imgCaratulaPelicula);
            imgCaratula.setOnClickListener(this);
            imgCaratula.setImageResource(PeliculasFragment.items.get(PeliculasFragment.posicion).getImagen());
            PeliculasFragment.posicion = -1;
        }
        else if(SeriesFragment.posicion != -1){
            imgCaratula = findViewById(R.id.imgCaratulaPelicula);
            imgCaratula.setOnClickListener(this);
            imgCaratula.setImageResource(SeriesFragment.items.get(SeriesFragment.posicion).getImagen());
            SeriesFragment.posicion = -1;
        }
    }

    @Override
    public void onClick(View v) {
        finish();
    }
}