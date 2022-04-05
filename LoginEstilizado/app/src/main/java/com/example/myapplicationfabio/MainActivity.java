package com.example.myapplicationfabio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText email, senha;
    Button entrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email  = findViewById(R.id.editTextEmail);
        senha  = findViewById(R.id.editTextSenha);
        entrar = findViewById(R.id.buttonEntrar);

        entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validarDados();
            }
        });
    }

    private boolean validarDados() {
        boolean retorno = true;
        if(TextUtils.isEmpty(email.getText().toString())){
            retorno  = false;
            email.setError("*");
            email.requestFocus();
        }
        if(TextUtils.isEmpty(senha.getText().toString())){
            retorno  = false;
            senha.setError("*");
            senha.requestFocus();
            
        }
        return retorno;
    }
}
