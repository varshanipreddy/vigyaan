package com.varsha.vigyaan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by VARSHANI on 13-09-2017.
 */

public class Medicines extends Activity {




    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page1);
    }

    public void onButtonClick(View V)

    {





        if (V.getId() == R.id.medicinelist)
        {
            Intent i = new Intent(Medicines.this, Symptoms.class);
            startActivity(i);
        }

        if (V.getId() == R.id.medicine1)
        {
            Intent i = new Intent(Medicines.this, Symptoms.class);
            startActivity(i);
        }

        //the .class symptoms will be changed after the survey is done and the medicine list for the respective id is found.

        if (V.getId() == R.id.medicine2)
        {
            Intent i = new Intent(Medicines.this, Symptoms.class);
            startActivity(i);
        }

        if (V.getId() == R.id.medicine3)
        {
            Intent i = new Intent(Medicines.this, Symptoms.class);
            startActivity(i);
        }

        if (V.getId() == R.id.medicine4)
        {
            Intent i = new Intent(Medicines.this, Symptoms.class);
            startActivity(i);
        }
        if (V.getId() == R.id.medicine5)
        {
            Intent i = new Intent(Medicines.this, Symptoms.class);
            startActivity(i);
        }
        if (V.getId() == R.id.medicine6)
        {
            Intent i = new Intent(Medicines.this, Symptoms.class);
            startActivity(i);
        }
        if (V.getId() == R.id.medicine7)
        {
            Intent i = new Intent(Medicines.this, Symptoms.class);
            startActivity(i);
        }
        if (V.getId() == R.id.medicine8)
        {
            Intent i = new Intent(Medicines.this, Symptoms.class);
            startActivity(i);
        }
        if (V.getId() == R.id.medicine9)
        {
            Intent i = new Intent(Medicines.this, Symptoms.class);
            startActivity(i);
        }

        if (V.getId() == R.id.medicine10)
        {
            Intent i = new Intent(Medicines.this, Symptoms.class);
            startActivity(i);
        }
        if (V.getId() == R.id.medicine11)
        {
            Intent i = new Intent(Medicines.this, Symptoms.class);
            startActivity(i);
        }
        if (V.getId() == R.id.medicine12)
        {
            Intent i = new Intent(Medicines.this, Symptoms.class);
            startActivity(i);
        }

        if (V.getId() == R.id.medicine13)
        {
            Intent i = new Intent(Medicines.this, Symptoms.class);
            startActivity(i);
        }




    }












}
