package com.example.calculadora2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnUno, btnDos, btnTres, btnCuatro, btnCinco, btnSeis, btnSiete, btnOcho, btnNueve,
            btnSuma, btnResta, btnMultiplica, btnDivide, btnClean, btnBorrar, btnPunto, btnIgual, btnCero;

    String mostrar = "";
    String sim = "";

    TextView Resultado, prin;

    double resul = 0;
    double aux = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnUno = (Button)findViewById(R.id.Uno);
        btnDos = (Button)findViewById(R.id.Dos);
        btnTres = (Button)findViewById(R.id.Tres);
        btnCuatro = (Button)findViewById(R.id.Cuatro);
        btnCinco = (Button)findViewById(R.id.Cinco);
        btnSeis = (Button)findViewById(R.id.Seis);
        btnSiete = (Button)findViewById(R.id.Siete);
        btnOcho = (Button)findViewById(R.id.Ocho);
        btnNueve = (Button)findViewById(R.id.Nueve);
        btnSuma = (Button)findViewById(R.id.Suma);
        btnResta = (Button)findViewById(R.id.Resta);
        btnMultiplica = (Button)findViewById(R.id.Multiplica);
        btnDivide = (Button)findViewById(R.id.Divide);
        btnClean = (Button)findViewById(R.id.Clean);
        btnBorrar = (Button)findViewById(R.id.Borrar);
        Resultado = (TextView)findViewById(R.id.txtResl);
        btnPunto = (Button)findViewById(R.id.Punto);
        btnIgual = (Button)findViewById(R.id.Igual);
        prin = (TextView)findViewById(R.id.txtprin);
        btnCero = (Button)findViewById(R.id.Cero);

        btnCero.setOnClickListener(this);
        btnUno.setOnClickListener(this);
        btnDos.setOnClickListener(this);
        btnTres.setOnClickListener(this);
        btnCuatro.setOnClickListener(this);
        btnCinco.setOnClickListener(this);
        btnSeis.setOnClickListener(this);
        btnSiete.setOnClickListener(this);
        btnOcho.setOnClickListener(this);
        btnNueve.setOnClickListener(this);
        btnSuma.setOnClickListener(this);
        btnIgual.setOnClickListener(this);
        btnClean.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.Cero:
                mostrar += "0";
                prin.setText(mostrar);
                break;

            case R.id.Uno:
                if(prin.getText().equals("0")){
                    prin.setText("");
                }
                mostrar += "1";
                prin.setText(mostrar);
                break;

            case R.id.Dos:
                if(prin.getText().equals("0")){
                    prin.setText("");
                }
                mostrar += "2";
                prin.setText(mostrar);
                break;

            case R.id.Tres:
                if(prin.getText().equals("0")){
                    prin.setText("");
                }
                mostrar += "3";
                prin.setText(mostrar);
                break;

            case R.id.Cuatro:
                if(prin.getText().equals("0")){
                    prin.setText("");
                }
                mostrar += "4";
                prin.setText(mostrar);
                break;

            case R.id.Cinco:
                if(prin.getText().equals("0")){
                    prin.setText("");
                }
                mostrar += "5";
                prin.setText(mostrar);
                break;

            case R.id.Seis:
                if(prin.getText().equals("0")){
                    prin.setText("");
                }
                mostrar += "6";
                prin.setText(mostrar);
                break;

            case R.id.Siete:
                if(prin.getText().equals("0")){
                    prin.setText("");
                }
                mostrar += "7";
                prin.setText(mostrar);
                break;

            case R.id.Ocho:
                if(prin.getText().equals("0")){
                    prin.setText("");
                }
                mostrar += "8";
                prin.setText(mostrar);
                break;

            case R.id.Nueve:
                if(prin.getText().equals("0")){
                    prin.setText("");
                }
                mostrar += "9";
                prin.setText(mostrar);
                break;

            case R.id.Suma:
                resul += Double.parseDouble(mostrar);
                Resultado.setText(String.valueOf(resul));
                mostrar = "0";
                prin.setText(mostrar);
                sim = "+";
                break;

            case R.id.Igual:

                switch (sim){
                    case"+":
                        aux = Double.parseDouble( prin.getText().toString());
                        resul += aux;
                        Resultado.setText(String.valueOf(resul));
                        mostrar = "";
                        prin.setText("0");
                        break;
                }
                break;


            case R.id.Clean:
                mostrar = "";
                prin.setText("0");
                resul = 0;
                aux = 0;
                Resultado.setText("");
                break;
        }



    }
}
