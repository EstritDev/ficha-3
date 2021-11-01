package com.example.ficha3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TextBoxes
        EditText txtN1 = findViewById(R.id.txtN1);
        EditText txtN2 = findViewById(R.id.txtN2);

        //Botões
        Button btnSoma = findViewById(R.id.btnSoma);
        Button btnSubtrair = findViewById(R.id.btnSubtrair);
        Button btnDetalhes
                = findViewById(R.id.btnDetalhes);

        btnSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtN1.getText().length() == 0 || txtN2.getText().length() == 0){
                    Toast.makeText(getApplicationContext(),"Porfavor preencha todos os campos", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}