package com.example.jokempo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }



    public void SelecionarPedra (View view){
            this.OpçãoSelecionada("Pedra");
    }
    public void SelecionarPapel (View view) {

        this.OpçãoSelecionada("Papel");
    }
    public void SelecionarTesoura (View view) {
        this.OpçãoSelecionada("Tesoura");
    }


    public void OpçãoSelecionada(String EscolhaUsuario )
    {
            ImageView Resultado = (ImageView) findViewById(R.id.Resultado);
            TextView TextResultado = (TextView) findViewById(R.id.resultado);

    String[] opcoes = {"Pedra", "Papel", "Tesoura"};
    int numero = new  Random().nextInt(2);
        String EscolhaApp = opcoes[numero];
            System.out.println(EscolhaApp);

            switch (EscolhaApp) {
                case "Pedra":
                    Resultado.setImageResource(R.drawable.pedra);
                    break;

                case "Papel":
                    Resultado.setImageResource(R.drawable.papel);
                    break;

                case "Tesoura":
                    Resultado.setImageResource(R.drawable.tesoura);



            }
            if (
                    (EscolhaApp == "Pedra" && EscolhaUsuario == "Tesoura")||
                    (EscolhaApp == "Papel" && EscolhaUsuario == "Pedra")||
                    (EscolhaApp =="Tesoura"&& EscolhaUsuario == "Papel")
            )
            {       TextResultado.setText("Você Perdeu... D;");

            }else if (

                    (EscolhaUsuario == "Pedra" && EscolhaApp == "Tesoura")||
                    (EscolhaUsuario == "Papel" && EscolhaApp == "Pedra")||
                    (EscolhaUsuario =="Tesoura"&& EscolhaApp == "Papel")
            )
            { TextResultado.setText("Você Ganhou!! :D");

            }else{

                TextResultado.setText("Empatamos!!!");

                 }
    }
}
