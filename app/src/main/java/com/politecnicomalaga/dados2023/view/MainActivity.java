package com.politecnicomalaga.dados2023.view;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.politecnicomalaga.dados2023.control.Controlador;
import com.politecnicomalaga.dados2023.R;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint("SetTextI18n")
    public void playGame(View view) {
        Controlador controlador = Controlador.getSingleton();
        String[][] listasTextos = controlador.jugarPartida();

        // J1
        TextView tvDado1J1 = this.findViewById(R.id.label_num_d1_j1);
        tvDado1J1.setText(listasTextos[1][0]);
        TextView tvDado2J1 = this.findViewById(R.id.label_num_d2_j1);
        tvDado2J1.setText(listasTextos[1][1]);
        TextView tvVicJ1 = this.findViewById(R.id.label_vicJ1);
        tvVicJ1.setText(listasTextos[1][2]);
        TextView tvDerJ1 = this.findViewById(R.id.label_derJ1);
        tvDerJ1.setText(listasTextos[1][3]);
        TextView tvEmp = this.findViewById(R.id.label_empJ1);
        tvEmp.setText(listasTextos[1][4]);

        // J2
        TextView tvDado1J2 = this.findViewById(R.id.label_num_d1_j2);
        tvDado1J2.setText(listasTextos[2][0]);
        TextView tvDado2J2 = this.findViewById(R.id.label_num_d2_j2);
        tvDado2J2.setText(listasTextos[2][1]);
        TextView tvVicJ2 = this.findViewById(R.id.label_vicJ2);
        tvVicJ2.setText(listasTextos[2][2]);
        TextView tvDerJ2 = this.findViewById(R.id.label_derJ2);
        tvDerJ2.setText(listasTextos[2][3]);

        // Resultado
        TextView tvResultado = this.findViewById(R.id.label_resultado);
        tvResultado.setText("El resultado es: " + listasTextos[0][0]);
    }

}