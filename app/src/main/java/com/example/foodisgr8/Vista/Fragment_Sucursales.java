package com.example.foodisgr8.Vista;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.foodisgr8.Controlador.MainActivity;
import com.example.foodisgr8.R;

public class Fragment_Sucursales extends Fragment {

    View f;
    private ActionBar actionBar;
    Drawable drawable1, drawable2, drawable3;
    ImageView imagen1, imagen2, imagen3;
    Button back2;
    Intent pasarPantalla2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        f = inflater.inflate(R.layout.fragment__sucursales, container, false);
//------------------------------------------------------------------------------------------
        actionBar = ((AppCompatActivity)getActivity()).getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setIcon(R.mipmap.logo_foreground);
        actionBar.setTitle("Sucursales");

        //------------------------------------------------------------------------------------------

        Resources res1 = getResources();
        drawable1 = res1.getDrawable(R.drawable.iconlugar, getActivity().getTheme());

        imagen1 = (ImageView) f.findViewById(R.id.imageSucur1);
        imagen1.setImageDrawable(drawable1);

        //------------------------------------------------------------------------------------------

        Resources res2 = getResources();
        drawable2 = res2.getDrawable(R.drawable.iconlugar, getActivity().getTheme());

        imagen2 = (ImageView) f.findViewById(R.id.imageSucur2);
        imagen2.setImageDrawable(drawable2);

        //------------------------------------------------------------------------------------------

        Resources res3 = getResources();
        drawable3 = res3.getDrawable(R.drawable.iconlugar, getActivity().getTheme());

        imagen3 = (ImageView) f.findViewById(R.id.imageSucur3);
        imagen3.setImageDrawable(drawable3);


        //------------------------------------------------------------------------------------------
        back2 = (Button) f.findViewById(R.id.back2);
        back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity().getApplicationContext(), "Has vuelto al Inicio", Toast.LENGTH_LONG).show();
                pasarPantalla2 = new Intent(getActivity().getApplicationContext(), MainActivity.class);
                startActivity(pasarPantalla2);
            }
        });
//------------------------------------------------------------------------------------------
        return f;
    }
}