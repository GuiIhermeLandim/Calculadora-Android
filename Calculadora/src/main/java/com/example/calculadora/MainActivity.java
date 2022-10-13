package com.example.calculadora;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText entrada1;
    private EditText entrada2;
    private TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        entrada1 = findViewById(R.id.etEntrada1);
        entrada2 = findViewById(R.id.etEntrada2);
        res = findViewById(R.id.tvResultado);
    }
    public void somar(View view){
        int n1 = Integer.parseInt(String.valueOf(entrada1.getText()));
        int n2 = Integer.parseInt(String.valueOf(entrada2.getText()));
        int resultado = n1 + n2;
        res.setText("Resultado: " + resultado);
    }
    public void subtrair(View view){
        int n1 = Integer.parseInt(String.valueOf(entrada1.getText()));
        int n2 = Integer.parseInt(String.valueOf(entrada2.getText()));
        int resultado = n1 - n2;
        res.setText("Resultado: " + resultado);
    }
    public void multiplicar(View view){
        int n1 = Integer.parseInt(String.valueOf(entrada1.getText()));
        int n2 = Integer.parseInt(String.valueOf(entrada2.getText()));
        int resultado = n1 * n2;
        res.setText("Resultado: " + resultado);
    }
    public void dividir(View view){
        int n1 = Integer.parseInt(String.valueOf(entrada1.getText()));
        int n2 = Integer.parseInt(String.valueOf(entrada2.getText()));
        int resultado = n1 / n2;
        res.setText("Resultado: " + resultado);
    }
}


