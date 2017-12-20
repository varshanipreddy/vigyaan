package com.varsha.vigyaan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by VARSHANI on 13-09-2017.
 */

public class Signup extends Appointment
{

    DatabaseHelper helper = new DatabaseHelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
    }


    public void onButtonClick(View V)
    {
        if (V.getId() == R.id.signup)
        {

            EditText name = (EditText) findViewById(R.id.TFname);
            EditText email_id = (EditText) findViewById(R.id.TFemail);
            EditText user_name = (EditText) findViewById(R.id.TFsignup_username);
            EditText password = (EditText) findViewById(R.id.signup_password1);
            EditText confirm_password = (EditText) findViewById(R.id.signup_password2);



            String namestr = name.getText().toString();
            String email_idstr = email_id.getText().toString();
            String user_namestr = user_name.getText().toString();
            String  passwordstr =  password.getText().toString();
            String confirm_passwordstr = confirm_password.getText().toString();

                    if ( !passwordstr.equals(confirm_passwordstr))
                    {
                       //popup msg
                        Toast pass = Toast.makeText(Signup.this , "passwords do not match!",Toast.LENGTH_SHORT);
                        pass.show();

                     }
                     else
                    {
                      //insert data in database
                        Contact c = new Contact();
                        c.setName(namestr);
                        c.setEmail(email_idstr);
                        c.setPass(passwordstr);
                        c.setUname(user_namestr);


                        helper.insertContact(c);

                        //below is taken for testing purpose
                        Toast pas = Toast.makeText(Signup.this , "u r successfully signed up",Toast.LENGTH_SHORT);
                        pas.show();
                        ((EditText)findViewById(R.id.TFusername)).setText("");






                    }





        }






    }



}
