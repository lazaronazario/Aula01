package com.example.ionic.aula01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import static com.example.ionic.aula01.R.id.BtnCalcular;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

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

                double gasolina = Double.parseDouble(ETG.getText().toString());
                double alcool = Double.parseDouble(ETA.getText().toString());

                String Resultado ;

                if((gasolina * 0.7)> alcool){
                    Resultado = "Àlcool";

                }else{
                    Resultado = "Gasolina";

                }
                textResult.setText(Resultado);
            }
        });

    }
}
