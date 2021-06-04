package es.studium.filmingapp.ui.series;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import es.studium.filmingapp.Anime;
import es.studium.filmingapp.AnimeAdapter;
import es.studium.filmingapp.Caraturas;
import es.studium.filmingapp.Detalles;
import es.studium.filmingapp.ItemClickListener;
import es.studium.filmingapp.R;

public class SeriesFragment extends Fragment {

    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;
    public static List<Anime> items;
    public static int posicion = -1;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        final View root = inflater.inflate(R.layout.fragment_series, container, false);
        // Inicializar series
        items = new ArrayList();

        items.add(new Anime(R.drawable.stranger_things, R.font.letra, "Stranger Things","","Matt Duffer (Creador)","Winona Ryder, David Harbour, Matthew Modine, Finn Wolfhard, Millie Bobby Brown, Gaten Matarazzo, Caleb McLaughlin, Natalia Dyer, Charlie Heaton, Noah Schnapp, Cara Buono, Joe Keery, Rob Morgan, John Reynolds, Joe Chrest, Ross Partridge, Mark Steger",R.drawable.cuatro_estrellas_y_media,"Homenaje a los clásicos misterios sobrenaturales de los años 80, \"Stranger Things\" es la historia de un niño que desaparece en el pequeño pueblo de Hawkins, Indiana, sin dejar rastro en 1983. En su búsqueda desesperada, tanto sus amigos y familiares como el sheriff local se ven envueltos en un enigma extraordinario: experimentos ultrasecretos, fuerzas paranormales terroríficas y una niña muy, muy rara...", "Número de Teporadas: 3"));
        items.add(new Anime(R.drawable.modern_family, R.font.letra, "Modern Family","","Steven Levitan (Creador)","Ed O'Neill, Sofia Vergara, Julie Bowen, Ty Burrell, Jesse Tyler Ferguson, Eric Stonestreet, Rico Rodriguez, Nolan Gould, Sarah Hyland, Ariel Winter, Aubrey Anderson-Emmons, Reid Ewing, Adam DeVine, Fred Willard, Nathan Lane, Kevin Daniels, Justin Kirk, Chazz Palminteri, Elizabeth Banks, Philip Baker Hall, Jeremy Maguire, Nathan Fillion, Shelley Long, Benjamin Bratt, Steve Zahn, Ernie Hudson, Barry Corbin, Jon Polito, Dana Powell, Christian Barillas, Joe Mande, Andrew Daly, Kasey Mahaffy, Rob Riggle, Nancy DeMars, Chris Geere, Matthew Risch",R.drawable.cuatro_estrellas_y_media,"Aclamada serie -es la sitcom más premiada en los últimos años- que narra el día a día de una gran familias compuesta por Jay Pritchett (Ed O’Neill) y su joven mujer Gloria Delgado (Sofia Vergara), madre de Manny (Rico Rodriguez), y al mismo tiempo muestra la vida de las dos familias compuestas por sus hijos ya adultos: el abogado gay Mitchell (Jesse Tyler Ferguson), casado con Cameron Tucker (Eric Stonestreet) y padres adoptivos de la pequeña Lily, y su hija Claire (Julie Bowen), casada con Phil Dunphy (Ty Burrell) y que son padres de 3 hijos, la pija Haley (Sarah Hyland), la estudiosa Alex (Ariel Winter) y el simple Luke (Nolan Gould).", "Número de temporadas: 11"));
        items.add(new Anime(R.drawable.vikingos, R.font.letra, "Vikingos","","Michael Hirst (Creador)","Travis Fimmel, Katheryn Winnick, Gustaf Skarsgård, Alexander Ludwig, Clive Standen, Maude Hirst, Alyssa Sutherland, Moe Dunford, Linus Roache, Gabriel Byrne, Jordan Patrick Smith, Alex Høgh Andersen, George Blagden, Jennie Jacques, John Kavanagh, Georgia Hirst, Jessalyn Gilsig, Peter Franzén, Jasper Pääkkönen, Edvin Endre, Jonathan Rhys Meyers, Jefferson Hall, Philip O'Sullivan, Marco Ilsø, Morgane Polanski, Josefin Asplund, Cormac Melia, Huw Parmenter, Ben Robson, Nathan O'Toole, Gaia Weiss, Lothaire Bluteau, Amy Bailey, Cathal O'Hallin, Donal Logue, Ivan Kaye, Owen Roe, Karen Hassan, Leah McNamara, David Lindström, Ruby O'Leary, Ida Nielsen, Ferdia Walsh-Peelo, James Quinn Markey., Darren Cahill, Alicia Agneson, Vladimir Kulich, Dagny Backer Johnsen",R.drawable.cuatro_estrellas_y_media,"Narra las aventuras del héroe Ragnar Lothbrok, de sus hermanos vikingos y su familia, cuando él se subleva para convertirse en el rey de las tribus vikingas. Además de ser un guerrero valiente, Ragnar encarna las tradiciones nórdicas de la devoción a los dioses. Según la leyenda era descendiente directo del dios Odín.", "Números de temporadas: 6"));
        items.add(new Anime(R.drawable.hijosanarquia, R.font.letra, "Hijos de la Anarquía","","Kurt Sutter","Colin Morgan, Bradley James, Angel Coulby, Katie McGrath, Richard Wilson, Anthony Head y John Hurt",R.drawable.cuatro_estrellas_y_media,"Sons of Anarchy narra la vida de la familia Teller-Morrow en la población de Charming junto con la de otros miembros del club, sus familias, ciudadanos de Charming y varios rivales y aliados que minan y apoyan a los negocios legales e ilegales de SAMCRO.", "Números de temporadas: 9"));
        items.add(new Anime(R.drawable.lupin, R.font.letra, "Lupin","","George Kay (Creador)","Omar Sy, Ludivine Sagnier, Nicole García, Hervé Pierre, Vincent Londez, Antoine Gouy, Soufiane Guerrab, Clotilde Hesme, Etan Simon, Shirine Boutella, Johann Dionnet, Vincent Garanger, Mamadou Haidara, Fargass Assandé, Marie Barraud, Léo Boucry, Christian Gazio, Xavier Lemaître, Eric Paul, Moussa Sylla, Jocelyne Vignon, Nicolas Wanczycki, Azzedine Ahmed-Chaouch, Guillaume Auvert, Saïd Benchnafa, Anne Benoît, Lea Bonneau, Caroline Borderieux, Arthur Choisnet, Grégoire Colin, Vincent Furic, Fabien Giameluca, Quentin Gouget, Karim Lasmi, Cédric Meusburger, Mathilde Peter, Pierre Rousselet",R.drawable.cuatro_estrellas_y_media,"Versión contemporánea del clásico francés, Omar Sy da vida a Assane Diop, ladrón de guante blanco y aficionado a las aventuras de Arsene Lupin que busca vengar la muerte de su padre.", "Número de temporadas: 1"));


        // Obtener el Recycler
        recycler = root.findViewById(R.id.myRecyclerView2);
        recycler.setHasFixedSize(true);


        //Usar un administrador para LinearLayout
        lManager = new LinearLayoutManager(getContext());
        recycler.setLayoutManager(lManager);

        // Crear un nuevo adaptador
        adapter = new AnimeAdapter(items, new ItemClickListener() {
            @Override
            public void onClick(View v, int position) {

                switch (v.getId()){
                    case R.id.imagen:
                        posicion = position;
                        Intent intent = new Intent(getActivity(), Caraturas.class);
                        //intent.putExtra("posicion", position+"");
                        startActivity(intent);
                        break;
                    case R.id.nombre:
                        posicion = position;
                        Intent intentS = new Intent(getActivity(), Detalles.class);
                        //intent.putExtra("posicion", position+"");
                        startActivity(intentS);
                        break;
                }
            }
        });


        recycler.setAdapter(adapter);
        return root;
    }
}