package com.example.ionic.aula01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import static com.example.ionic.aula01.R.id.BtnCalcular;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    EditText  ETA ;
    EditText  ETG;
    TextView  textResult;
    Button    BtnCalcular;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BtnCalcular = (Button) findViewById(R.id.BtnCalcular);
        ETG = (EditText) findViewById(R.id.ETG);
        ETA = (EditText) findViewById(R.id.ETA);
        textResult  = (TextView) findViewById(R.id.textResult);

        BtnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double gasolina = (ETG.getText().toString() == null || ETG.getText().toString().equals("") ? 0 : Double.parseDouble(ETG.getText().toString()));
                double alcool = (ETA.getText().toString() == null || ETA.getText().toString().equals("") ? 0 : Double.parseDouble(ETA.getText().toString()));

                String Resultado = null;

                if(gasolina == alcool ) {

                    Toast.makeText(getApplicationContext(), "Campos iguais", Toast.LENGTH_LONG).show();
                    
                }else if (gasolina < 0 || alcool < 0) {

                    Toast.makeText(getApplicationContext(), "Campo em branco", Toast.LENGTH_LONG).show();

                }else

                    if ((gasolina * 0.7) > alcool) {
                        Resultado = "Álcool";

                    } else {
                        Resultado = "Gasolina";

                    }
                    textResult.setText("A melhor opção é: " + Resultado);

            }



        });

    }
}
