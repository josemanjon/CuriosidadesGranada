package com.example.jose.curiosidadesgranada;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomList extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] texto;
    private final Integer[] imageId;
    public CustomList(Activity context, String[] texto, Integer[] imageId) {
        super(context, R.layout.list_single, texto);
        this.context = context;
        this.texto = texto;
        this.imageId = imageId;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.list_single, null, true);
        TextView txtTitle = (TextView) rowView.findViewById(R.id.txt);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.img);

        txtTitle.setText(texto[position]);
        imageView.setImageResource(imageId[position]);

        return rowView;
    }
}
