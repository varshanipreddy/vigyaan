package com.varsha.vigyaan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by VARSHANI on 13-09-2017.
 */

public class Emergency extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.emergency);
    }



    public void onButtonClick(View V)
    {
        if (V.getId() == R.id.emergency_signup) {
            Intent i = new Intent(Emergency.this, Signup.class);
            startActivity(i);
        }
    }

}
