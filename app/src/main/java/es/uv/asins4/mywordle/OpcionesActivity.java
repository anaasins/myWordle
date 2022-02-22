package es.uv.asins4.mywordle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Switch;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.Objects;

public class OpcionesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opciones);

        SharedPreferences sharedPref =  getSharedPreferences("preferencias", Context.MODE_PRIVATE);
        String salida = sharedPref.getString("username", "Username");
        TextInputEditText text = findViewById(R.id.username2);
        text.setText(salida);

        Boolean ayerC = sharedPref.getBoolean("ayer", false);
        Switch ayer = findViewById(R.id.ayer);
        ayer.setChecked(ayerC);

        Boolean oscuroC = sharedPref.getBoolean("oscuro", false);
        Switch oscuro = findViewById(R.id.oscuro);
        oscuro.setChecked(oscuroC);

        Boolean daltonicosC = sharedPref.getBoolean("daltonicos", false);
        Switch daltonicos = findViewById(R.id.daltonicos);
        daltonicos.setChecked(daltonicosC);

        Boolean ayudasC = sharedPref.getBoolean("ayudas", false);
        Switch ayudas = findViewById(R.id.ayudas);
        ayudas.setChecked(ayudasC);

        Boolean publicidadC = sharedPref.getBoolean("publicidad", false);
        Switch publicidad = findViewById(R.id.publicidad);
        publicidad.setChecked(publicidadC);

        ImageButton imageButton = findViewById(R.id.cerrarButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //cojo el texto
                TextInputLayout texto = findViewById(R.id.username);
                String user = Objects.requireNonNull(texto.getEditText()).getText().toString();
                Switch ayer = findViewById(R.id.ayer);
                Boolean ayerB = ayer.isChecked();
                Switch oscuro = findViewById(R.id.oscuro);
                Boolean oscuroB = oscuro.isChecked();
                Switch daltonicos = findViewById(R.id.daltonicos);
                Boolean daltonicosB = daltonicos.isChecked();
                Switch ayudas = findViewById(R.id.ayudas);
                Boolean ayudasB = ayudas.isChecked();
                Switch publicidad = findViewById(R.id.publicidad);
                Boolean publicidadB = publicidad.isChecked();


                //Abro los preferences
                SharedPreferences sharedPref = getSharedPreferences("preferencias", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();

                //Añado el texto
                editor.putString("username", user);
                editor.putBoolean("ayer", ayerB);
                editor.putBoolean("oscuro", oscuroB);
                editor.putBoolean("daltonicos", daltonicosB);
                editor.putBoolean("ayudas", ayudasB);
                editor.putBoolean("publicidad", publicidadB);

                editor.apply();

                //cierro la pantalla
                Intent in = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(in);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.game_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.opciones:
                return true;
            case R.id.informacion:
                Intent in2 = new Intent(getApplicationContext(), InfoActivity.class);
                startActivity(in2);
                return true;
            case R.id.inicio:
                Intent in3 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(in3);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}