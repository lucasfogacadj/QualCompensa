package br.com.lucasfogaca.qualcompensa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText garrafa;
    private EditText litrao;
    private EditText lata;
    private EditText latao;
    private ImageButton calc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        garrafa = findViewById(R.id.txt600);
        litrao = findViewById(R.id.txtlitrao);
        lata = findViewById(R.id.txtlata);
        latao = findViewById(R.id.editText4);
        calc = findViewById(R.id.imageButton2);


        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(garrafa.getText().toString().trim().equals("")|| litrao.getText().toString().trim().equals("")||lata.getText().toString().trim().equals("")||latao.getText().toString().trim().equals("")){
                    Toast.makeText(getApplicationContext(), "Insira corretamente os valores",Toast.LENGTH_LONG).show();
                }else{

                    double gar = Double.parseDouble(garrafa.getText().toString());
                    double lit = Double.parseDouble(litrao.getText().toString());
                    double lat = Double.parseDouble(lata.getText().toString());
                    double lt = Double.parseDouble(latao.getText().toString());

                    double valormlgarrafa = (600/gar);
                    double valormllitrao = (1000/lit);
                    double valormllata = (350/lat);
                    double valormllatao = (473/lt);

                    if(valormlgarrafa>valormllitrao&&valormlgarrafa>valormllata&&valormlgarrafa>valormllatao){
                        Toast.makeText(getApplicationContext(), "Compra Garrafa",Toast.LENGTH_LONG).show();
                    }
                    if(valormllata>valormlgarrafa&&valormllata>valormllatao&&valormllata>valormllitrao){
                        Toast.makeText(getApplicationContext(), "Compra Lata",Toast.LENGTH_LONG).show();
                    }
                    if(valormllatao>valormllata&&valormllatao>valormlgarrafa&&valormllatao>valormllitrao){
                        Toast.makeText(getApplicationContext(), "Compra Latao",Toast.LENGTH_LONG).show();
                    }
                    if(valormllitrao>valormlgarrafa&&valormllitrao>valormllata&&valormllitrao>valormllatao){
                        Toast.makeText(getApplicationContext(), "Compra Litrão",Toast.LENGTH_LONG).show();
                    }

                }

            }
        });


    }
}
