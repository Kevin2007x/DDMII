package com.example.calculoimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcularIMC(View view){
    EditText IDPESO = findViewById(R.id.IDPESO);
    EditText IDALTURA = findViewById(R.id.IDALTURA);
    TextView message = findViewById(R.id.IDRESULTADO);

    float peso = Float.parseFloat(IDPESO.getText().toString());

    float altura = Float.parseFloat(IDALTURA.getText().toString());

    float imc = peso / (altura * altura);

    if (imc <= 18.5) {
        message.setText("Baixo peso");
    } else if (imc <= 24.9) {
    }

    package com.example.testeapp;
    import androidx.appcompat.app.AppCompatActivity
    import android.os.Bundle;
    import android.view.View;
    import android.widget.EditText;
    import android widget.TextView;

}