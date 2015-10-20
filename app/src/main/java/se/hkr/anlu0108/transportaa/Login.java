package se.hkr.anlu0108.transportaa;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    EditText username;
    EditText password;
    Button login;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        username = (EditText)findViewById(R.id.usernameLogin);
        password = (EditText)findViewById(R.id.passwordLogin);
        login = (Button)findViewById(R.id.loginButton);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String userNameString = username.getText().toString();
                String passwordString = password.getText().toString();
                if(userNameString.equalsIgnoreCase("Donner") && passwordString.equalsIgnoreCase("123")){
                    Intent intent = new Intent(Login.this, MainView.class);
                    startActivity(intent);


                }
            }
        });



    }


}
