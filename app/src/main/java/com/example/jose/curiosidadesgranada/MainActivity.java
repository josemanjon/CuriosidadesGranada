package com.example.jose.curiosidadesgranada;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView list;
    String[] web = {
            "Arcángel vengador",
            "Camino de los neveros helados",
            "Campanas homicidas",
            "Carlos V, rey mago",
            "Carta de amor en la Alhambra",
            "Casa de leyenda",
            "\"Dale limosna, mujer\"",
            "El curioso cuadro de la catedral",
            "El héroe de la Alhambra",
            "Emperatriz y duquesa",
            "La Alhambra: reloj solar",
            "La filomatic",
            "La única calle del mundo dedicada a vagos",
            "La única mujer enterrada en la Catedral",
            "Más delicado que la calle de la Colcha",
            "Niños luchando",
            "Paseo del salón",
            "Pico Mulhacén: tumba del rey",
            "Primera cabalgata de Reyes Magos en España",
            "Primeros bomberos de España",
            "\"Simpas\" de hace un siglo",
            "Tumba profanada del Gran Capitán",
    };

    Integer[] imageId = {
            R.drawable.arcangel_vengador,
            R.drawable.camino_de_los_neveros,
            R.drawable.campanas_homicidas,
            R.drawable.carlos_v_rey_mago,
            R.drawable.carta_de_amor,
            R.drawable.casa_de_leyenda,
            R.drawable.dale_limosna_mujer,
            R.drawable.el_curioso_cuadro,
            R.drawable.el_heroe_de_la_alhambra,
            R.drawable.emperatriz_y_duquesa,
            R.drawable.la_alhambra_reloj,
            R.drawable.la_filomatic,
            R.drawable.la_calle_vagos,
            R.drawable.la_mujer_enterrada_catedral,
            R.drawable.mas_delicado_calle_colcha,
            R.drawable.ninyos_luchando,
            R.drawable.paseo_del_salon,
            R.drawable.pico_mulhacen,
            R.drawable.primera_cabalgata,
            R.drawable.primeros_bomberos,
            R.drawable.sinpas,
            R.drawable.tumba_gran_capitan,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final CustomList listAdapter = new CustomList(MainActivity.this, web, imageId);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(listAdapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, Detalles.class);
                Bundle bundle = new Bundle();
                bundle.putString("posicion", web[position]);
                bundle.putInt("imagen", imageId[position]);
                bundle.putInt("posicionDetalle", position);
                intent.putExtras(bundle);
                startActivity(intent);
            }

        });

    }
}