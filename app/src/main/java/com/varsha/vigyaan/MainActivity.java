package com.varsha.vigyaan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page4);
    }

    public void onButtonClick(View V)
    {
        if(V.getId()== R.id.medicines)
       {
            Intent i = new Intent(MainActivity.this,Medicines.class);
            startActivity(i);
       }
        if(V.getId()== R.id.contacts)
        {
            Intent i = new Intent(MainActivity.this,DispensaryContacts.class);
            startActivity(i);
        }
        if(V.getId()== R.id.appointment)
        {
            Intent i = new Intent(MainActivity.this,Appointment.class);
            startActivity(i);
        }
        if(V.getId()== R.id.emergency)
        {
            Intent i = new Intent(MainActivity.this,Emergency.class);
            startActivity(i);
        }



    }





}
