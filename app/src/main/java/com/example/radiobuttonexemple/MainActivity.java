package com.example.radiobuttonexemple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroupCarros;
    private CheckBox checkBoxArCondicionado,
            checkBoxPelicula,
            checkBoxSom,
            checkBoxMultimidia;
    private Button buttonCalcular;
    private TextView textViewResultado;

    private List<String> checked = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroupCarros = findViewById(R.id.radioGroupCarros);
        checkBoxArCondicionado = findViewById(R.id.checkBoxArCondicionado);
        checkBoxMultimidia = findViewById(R.id.checkBoxMultimidia);
        checkBoxPelicula = findViewById(R.id.checkBoxPelicula);
        checkBoxSom = findViewById(R.id.checkBoxSom);

        buttonCalcular = findViewById(R.id.buttonCalcular);

        textViewResultado = findViewById(R.id.textViewResultado);

        radioGroupCarros.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // cria um evento
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.radioButtonCarro1:
                        textViewResultado.setText("Carro 1");
                        break;
                    case R.id.radioButtonCarro2:
                        textViewResultado.setText("Carro 2");
                        break;
                    case R.id.radioButtonCarro3:
                        textViewResultado.setText("Carro 3");
                        break;
                    case R.id.radioButtonCarro4:
                        textViewResultado.setText("Carro 4");
                        break;
                    default:
                        textViewResultado.setText("Clique em uma opção");


                }
            }
        });
    }


    public void onClickCalcular(View view) {
        if (checkBoxSom.isChecked()){

            checked.add(checkBoxSom.getText().toString());
        }

        if (checkBoxPelicula.isChecked()){

            checked.add(checkBoxPelicula.getText().toString());
        }
        if (checkBoxMultimidia.isChecked()){
            checked.add(checkBoxMultimidia.getText().toString());
        }
        if (checkBoxArCondicionado.isChecked()){
            checked.add(checkBoxArCondicionado.getText().toString());
        }
        textViewResultado.setText(checked.toString());

    }

}


