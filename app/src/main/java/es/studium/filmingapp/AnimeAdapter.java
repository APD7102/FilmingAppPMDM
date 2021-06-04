package es.studium.filmingapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AnimeAdapter extends RecyclerView.Adapter<AnimeAdapter.AnimeViewHolder> {


    private List<Anime> items;
    private static ItemClickListener listener;

    public AnimeAdapter(List<Anime> items, ItemClickListener listener){

        this.items =items;
        this.listener = listener;
    }

    @Override
    public AnimeViewHolder onCreateViewHolder( ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.lista_cardview, viewGroup, false);

        return new AnimeViewHolder(v);
    }


    @Override
    public void onBindViewHolder(AnimeViewHolder viewHolder, int i) {
        viewHolder.imagen.setImageResource(items.get(i).getImagen());
        viewHolder.nombre.setText(items.get(i).getTitulo());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }


    public static class AnimeViewHolder extends RecyclerView.ViewHolder  implements View.OnClickListener{
        // Campos respectivos de item
        public ImageView imagen;
        public TextView nombre;


        public AnimeViewHolder(@NonNull View v){
            super(v);
            imagen = (ImageView) v.findViewById(R.id.imagen);
            nombre = (TextView) v.findViewById(R.id.nombre);

            imagen.setOnClickListener(this);
            nombre.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            listener.onClick(v, getAdapterPosition());
        }
    }


}
