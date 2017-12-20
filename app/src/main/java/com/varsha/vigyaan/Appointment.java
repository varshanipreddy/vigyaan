package com.varsha.vigyaan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by VARSHANI on 13-09-2017.
 */

public class Appointment extends Activity{
    DatabaseHelper helper = new DatabaseHelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.appointment);
    }

    public void onButtonClick(View V) {
        if (V.getId()== R.id.login)
        {
            EditText a = (EditText)findViewById(R.id.TFusername);
            String str =a.getText().toString();
            EditText b = (EditText)findViewById(R.id.TFpassword);
            String pass =b.getText().toString();

            String password =  helper.searchpass(str);
            if (pass.equals(password))
            {
                //here a page is supposed to be imported which is shown after login...below is taken for testing purpose
                Intent i = new Intent(Appointment.this, DispensaryContacts.class);
                startActivity(i);
            }
            else
            {
                Toast toss = Toast.makeText(Appointment.this , "incorrect password",Toast.LENGTH_SHORT);
                toss.show();


            }


        }




        if (V.getId() == R.id.signuphere)
        {
            Intent i = new Intent(Appointment.this, Signup.class);
            startActivity(i);
        }
    }




}
