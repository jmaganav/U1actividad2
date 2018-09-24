package unam.fca.dmoviles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.time.LocalDateTime;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Actividad 2 Introduccion a eventos con Button
        //https://developer.android.com/reference/android/widget/Button
        //Button es un componente de Android que realizar acciones al hacer click en el

        // El archivo del layout de la actividad se encuentra en la carpeta
        // res/layout/activity_main.xml

        setContentView(R.layout.activity_main);

        final TextView tv = findViewById(R.id.btn);

        final Button button = findViewById(R.id.btn);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

               tv.setText(LocalDateTime.now().toString());            }
        });


        final TextView helloTextView = (TextView) findViewById(R.id.btn) ;
        helloTextView.setText(R.string.btn);


        //Para hacer referencia a un componente del layout, utilizamos el metodo findViewById
        //y le pasamos como parametro el id correspondiente.

        //Para cambiar el texto de tv
        //tv.setText(R.string.btn);

        //Actividades
        //a) Agrega un evento  setOnClickListener al boton como viene en la referencia
        //b) El el metodo onClick, modifica el texto de tv para que muestre la fecha actual con LocalDateTime.now().ToString()
        //c) Sube tu codigo al repositorio.
        //d) Sube un documento en word a la plataforma Moodle con las capturas de pantalla de tu actividad. Incluye la liga a tu repositorio

    }
}
