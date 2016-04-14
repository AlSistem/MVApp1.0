package com.example.alsistem.mvapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Usuario MV on 13/04/2016.
 */

public class Reserv extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reservas);
    }

    public void cerrar(View view) {
        finish();
    }

}