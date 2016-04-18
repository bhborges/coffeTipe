package com.example.root.coffetipe;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{
    Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Button btnEspresso = (Button) findViewById(R.id.btnEspresso);
        Button btnCurto = (Button) findViewById(R.id.btnCurto);
        Button btnCarioca = (Button) findViewById(R.id.btnCarioca);
        Button btnFiltrado = (Button) findViewById(R.id.btnFiltrado);
        Button btnItaliano = (Button) findViewById(R.id.btnItaliano);
        Button btnRistretto = (Button) findViewById(R.id.btnRistretto);


        btnEspresso.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                fragment = null;


                fragment = new EspressoFrame();
                android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
                android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.containerBody, fragment);
                fragmentTransaction.commit();
            }
        });


        btnCarioca.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                fragment = null;


                fragment = new CariocaFrame();
                android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
                android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.containerBody, fragment);
                fragmentTransaction.commit();
            }
        });


        btnCurto.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                fragment = null;


                fragment = new CurtoFrame();
                android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
                android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.containerBody, fragment);
                fragmentTransaction.commit();
            }
        });

        btnFiltrado.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                fragment = null;


                fragment = new FiltradoFrame();
                android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
                android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.containerBody, fragment);
                fragmentTransaction.commit();
            }
        });

        btnItaliano.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                fragment = null;


                fragment = new ItalianoFrame();
                android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
                android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.containerBody, fragment);
                fragmentTransaction.commit();
            }
        });

        btnRistretto.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                fragment = null;


                fragment = new RistretoFrame();
                android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
                android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.containerBody, fragment);
                fragmentTransaction.commit();
            }
        });



    }


    public void onBackPressed() {
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction().
                    remove(getSupportFragmentManager().findFragmentById(R.id.containerBody)).commit();
        } else {
            return;
        }
    }
}
