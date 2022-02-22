package es.uv.asins4.mywordle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final String correcta = "amigo";

        SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
        int intento = sharedPref.getInt("try", 0);
       // int hits = sharedPref.getInt("hits", 0);
        SharedPreferences.Editor editor2 = sharedPref.edit();
        editor2.putInt("try", 1);
        editor2.apply();

        ImageButton imageButton2 = findViewById(R.id.opcionesButton);
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getApplicationContext(), OpcionesActivity.class);
                startActivity(in);
            }
        });

        ImageButton imageButton = findViewById(R.id.imageButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getApplicationContext(), InfoActivity.class);
                startActivity(in);
            }
        });

        Button jugarButton = findViewById(R.id.buttonJugar);
        jugarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //cojo la palabra
                TextInputLayout palabra = findViewById(R.id.palabraInput);
                String palabraString = palabra.getEditText().getText().toString();
                if(palabraString.length() != 5){
                    jugarButton.setText("Palabra no valida");
                }else {
                    jugarButton.setText("Comprobar");

                    //cojo los intentos que llevo
                    SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
                    int intento = sharedPref.getInt("try", 0);
                    int hits = 0;
                    //escribo la palabra en los cuadraditos
                    //TODO --> comprobar que tiene 5 letras y avisar si no
                    //TODO --> comprobar si coincide o no con mi palabra
                    //TODO --> pintar las letras de colores
                    //TODO --> avisar de que ya has hecho los 6 intentos hoy
                    if (intento == 1){
                        TextView t1 = findViewById(R.id.textView11);
                        t1.setText(palabraString.substring(0, 1));
                        t1.setAllCaps(true);
                        if(palabraString.substring(0, 1).equals(correcta.substring(0, 1)))
                        {
                            t1.setBackgroundColor(Color.GREEN);
                            t1.setTextColor(Color.WHITE);
                            hits ++;

                        }else if(correcta.contains(palabraString.substring(0, 1))){
                            t1.setBackgroundColor(Color.YELLOW);
                        }else {
                            t1.setBackgroundColor(Color.GRAY);
                            t1.setTextColor(Color.WHITE);
                        }

                        TextView t2 = findViewById(R.id.textView12);
                        t2.setText(palabraString.substring(1, 2));
                        t2.setAllCaps(true);
                        if(palabraString.substring(1, 2).equals(correcta.substring(1, 2)))
                        {
                            t2.setBackgroundColor(Color.GREEN);
                            t2.setTextColor(Color.WHITE);
                            hits ++;
                        }else if(correcta.contains(palabraString.substring(1, 2))){
                            t2.setBackgroundColor(Color.YELLOW);
                        }else {
                            t2.setBackgroundColor(Color.GRAY);
                            t2.setTextColor(Color.WHITE);
                        }

                        TextView t3 = findViewById(R.id.textView13);
                        t3.setText(palabraString.substring(2, 3));
                        t3.setAllCaps(true);
                        if(palabraString.substring(2, 3).equals(correcta.substring(2, 3)))
                        {
                            t3.setBackgroundColor(Color.GREEN);
                            t3.setTextColor(Color.WHITE);
                            hits ++;
                        }else if(correcta.contains(palabraString.substring(2, 3))){
                            t3.setBackgroundColor(Color.YELLOW);
                        }else {
                            t3.setBackgroundColor(Color.GRAY);
                            t3.setTextColor(Color.WHITE);
                        }

                        TextView t4 = findViewById(R.id.textView14);
                        t4.setText(palabraString.substring(3, 4));
                        t4.setAllCaps(true);
                        if(palabraString.substring(3, 4).equals(correcta.substring(3, 4)))
                        {
                            t4.setBackgroundColor(Color.GREEN);
                            t4.setTextColor(Color.WHITE);
                            hits ++;
                        }else if(correcta.contains(palabraString.substring(3, 4))){
                            t4.setBackgroundColor(Color.YELLOW);
                        }else {
                            t4.setBackgroundColor(Color.GRAY);
                            t4.setTextColor(Color.WHITE);
                        }

                        TextView t5 = findViewById(R.id.textView15);
                        t5.setText(palabraString.substring(4, 5));
                        t5.setAllCaps(true);
                        if(palabraString.substring(4, 5).equals(correcta.substring(4, 5)))
                        {
                            t5.setBackgroundColor(Color.GREEN);
                            t5.setTextColor(Color.WHITE);
                            hits ++;
                        }else if(correcta.contains(palabraString.substring(4, 5))){
                            t5.setBackgroundColor(Color.YELLOW);
                        }else {
                            t5.setBackgroundColor(Color.GRAY);
                            t5.setTextColor(Color.WHITE);
                        }
                    } else if(intento == 2){
                        TextView t1 = findViewById(R.id.textView21);
                        t1.setText(palabraString.substring(0, 1));
                        t1.setAllCaps(true);
                        if(palabraString.substring(0, 1).equals(correcta.substring(0, 1)))
                        {
                            t1.setBackgroundColor(Color.GREEN);
                            t1.setTextColor(Color.WHITE);
                            hits ++;
                        }else if(correcta.contains(palabraString.substring(0, 1))){
                            t1.setBackgroundColor(Color.YELLOW);
                        }else {
                            t1.setBackgroundColor(Color.GRAY);
                            t1.setTextColor(Color.WHITE);
                        }

                        TextView t2 = findViewById(R.id.textView22);
                        t2.setText(palabraString.substring(1, 2));
                        t2.setAllCaps(true);
                        if(palabraString.substring(1, 2).equals(correcta.substring(1, 2)))
                        {
                            t2.setBackgroundColor(Color.GREEN);
                            t2.setTextColor(Color.WHITE);
                            hits ++;
                        }else if(correcta.contains(palabraString.substring(1, 2))){
                            t2.setBackgroundColor(Color.YELLOW);
                        }else {
                            t2.setBackgroundColor(Color.GRAY);
                            t2.setTextColor(Color.WHITE);
                        }

                        TextView t3 = findViewById(R.id.textView23);
                        t3.setText(palabraString.substring(2, 3));
                        t3.setAllCaps(true);
                        if(palabraString.substring(2, 3).equals(correcta.substring(2, 3)))
                        {
                            t3.setBackgroundColor(Color.GREEN);
                            t3.setTextColor(Color.WHITE);
                            hits ++;
                        }else if(correcta.contains(palabraString.substring(2, 3))){
                            t3.setBackgroundColor(Color.YELLOW);
                        }else {
                            t3.setBackgroundColor(Color.GRAY);
                            t3.setTextColor(Color.WHITE);
                        }

                        TextView t4 = findViewById(R.id.textView24);
                        t4.setText(palabraString.substring(3, 4));
                        t4.setAllCaps(true);
                        if(palabraString.substring(3, 4).equals(correcta.substring(3, 4)))
                        {
                            t4.setBackgroundColor(Color.GREEN);
                            t4.setTextColor(Color.WHITE);
                            hits ++;
                        }else if(correcta.contains(palabraString.substring(3, 4))){
                            t4.setBackgroundColor(Color.YELLOW);
                        }else {
                            t4.setBackgroundColor(Color.GRAY);
                            t4.setTextColor(Color.WHITE);
                        }


                        TextView t5 = findViewById(R.id.textView25);
                        t5.setText(palabraString.substring(4, 5));
                        t5.setAllCaps(true);
                        if(palabraString.substring(4, 5).equals(correcta.substring(4, 5)))
                        {
                            t5.setBackgroundColor(Color.GREEN);
                            t5.setTextColor(Color.WHITE);
                            hits ++;
                        }else if(correcta.contains(palabraString.substring(4, 5))){
                            t5.setBackgroundColor(Color.YELLOW);
                        }else {
                            t5.setBackgroundColor(Color.GRAY);
                            t5.setTextColor(Color.WHITE);
                        }
                    }else if(intento == 3){
                        TextView t1 = findViewById(R.id.textView31);
                        t1.setText(palabraString.substring(0, 1));
                        t1.setAllCaps(true);
                        if(palabraString.substring(0, 1).equals(correcta.substring(0, 1)))
                        {
                            t1.setBackgroundColor(Color.GREEN);
                            t1.setTextColor(Color.WHITE);
                            hits ++;
                        }else if(correcta.contains(palabraString.substring(0, 1))){
                            t1.setBackgroundColor(Color.YELLOW);
                        }else {
                            t1.setBackgroundColor(Color.GRAY);
                            t1.setTextColor(Color.WHITE);
                        }

                        TextView t2 = findViewById(R.id.textView32);
                        t2.setText(palabraString.substring(1, 2));
                        t2.setAllCaps(true);
                        if(palabraString.substring(1, 2).equals(correcta.substring(1, 2)))
                        {
                            t2.setBackgroundColor(Color.GREEN);
                            t2.setTextColor(Color.WHITE);
                            hits ++;
                        }else if(correcta.contains(palabraString.substring(1, 2))){
                            t2.setBackgroundColor(Color.YELLOW);
                        }else {
                            t2.setBackgroundColor(Color.GRAY);
                            t2.setTextColor(Color.WHITE);
                        }

                        TextView t3 = findViewById(R.id.textView33);
                        t3.setText(palabraString.substring(2, 3));
                        t3.setAllCaps(true);
                        if(palabraString.substring(2, 3).equals(correcta.substring(2, 3)))
                        {
                            t3.setBackgroundColor(Color.GREEN);
                            t3.setTextColor(Color.WHITE);
                            hits ++;
                        }else if(correcta.contains(palabraString.substring(2, 3))){
                            t3.setBackgroundColor(Color.YELLOW);
                        }else {
                            t3.setBackgroundColor(Color.GRAY);
                            t3.setTextColor(Color.WHITE);
                        }

                        TextView t4 = findViewById(R.id.textView34);
                        t4.setText(palabraString.substring(3, 4));
                        t4.setAllCaps(true);
                        if(palabraString.substring(3, 4).equals(correcta.substring(3, 4)))
                        {
                            t4.setBackgroundColor(Color.GREEN);
                            t4.setTextColor(Color.WHITE);
                            hits ++;
                        }else if(correcta.contains(palabraString.substring(3, 4))){
                            t4.setBackgroundColor(Color.YELLOW);
                        }else {
                            t4.setBackgroundColor(Color.GRAY);
                            t4.setTextColor(Color.WHITE);
                        }

                        TextView t5 = findViewById(R.id.textView35);
                        t5.setText(palabraString.substring(4, 5));
                        t5.setAllCaps(true);
                        if(palabraString.substring(4, 5).equals(correcta.substring(4, 5)))
                        {
                            t5.setBackgroundColor(Color.GREEN);
                            t5.setTextColor(Color.WHITE);
                            hits ++;
                        }else if(correcta.contains(palabraString.substring(4, 5))){
                            t5.setBackgroundColor(Color.YELLOW);
                        }else {
                            t5.setBackgroundColor(Color.GRAY);
                            t5.setTextColor(Color.WHITE);
                        }
                    }else if(intento == 4){
                        TextView t1 = findViewById(R.id.textView41);
                        t1.setText(palabraString.substring(0, 1));
                        t1.setAllCaps(true);
                        if(palabraString.substring(0, 1).equals(correcta.substring(0, 1)))
                        {
                            t1.setBackgroundColor(Color.GREEN);
                            t1.setTextColor(Color.WHITE);
                            hits ++;
                        }else if(correcta.contains(palabraString.substring(0, 1))){
                            t1.setBackgroundColor(Color.YELLOW);
                        }else {
                            t1.setBackgroundColor(Color.GRAY);
                            t1.setTextColor(Color.WHITE);
                        }

                        TextView t2 = findViewById(R.id.textView42);
                        t2.setText(palabraString.substring(1, 2));
                        t2.setAllCaps(true);
                        if(palabraString.substring(1, 2).equals(correcta.substring(1, 2)))
                        {
                            t2.setBackgroundColor(Color.GREEN);
                            t2.setTextColor(Color.WHITE);
                            hits ++;
                        }else if(correcta.contains(palabraString.substring(1, 2))){
                            t2.setBackgroundColor(Color.YELLOW);
                        }else {
                            t2.setBackgroundColor(Color.GRAY);
                            t2.setTextColor(Color.WHITE);
                        }

                        TextView t3 = findViewById(R.id.textView43);
                        t3.setText(palabraString.substring(2, 3));
                        t3.setAllCaps(true);
                        if(palabraString.substring(2, 3).equals(correcta.substring(2, 3)))
                        {
                            t3.setBackgroundColor(Color.GREEN);
                            t3.setTextColor(Color.WHITE);
                            hits ++;
                        }else if(correcta.contains(palabraString.substring(2, 3))){
                            t3.setBackgroundColor(Color.YELLOW);
                        }else {
                            t3.setBackgroundColor(Color.GRAY);
                            t3.setTextColor(Color.WHITE);
                        }

                        TextView t4 = findViewById(R.id.textView44);
                        t4.setText(palabraString.substring(3, 4));
                        t4.setAllCaps(true);
                        if(palabraString.substring(3, 4).equals(correcta.substring(3, 4)))
                        {
                            t4.setBackgroundColor(Color.GREEN);
                            t4.setTextColor(Color.WHITE);
                            hits ++;
                        }else if(correcta.contains(palabraString.substring(3, 4))){
                            t4.setBackgroundColor(Color.YELLOW);
                        }else {
                            t4.setBackgroundColor(Color.GRAY);
                            t4.setTextColor(Color.WHITE);
                        }

                        TextView t5 = findViewById(R.id.textView45);
                        t5.setText(palabraString.substring(4, 5));
                        t5.setAllCaps(true);
                        if(palabraString.substring(4, 5).equals(correcta.substring(4, 5)))
                        {
                            t5.setBackgroundColor(Color.GREEN);
                            t5.setTextColor(Color.WHITE);
                            hits ++;
                        }else if(correcta.contains(palabraString.substring(4, 5))){
                            t5.setBackgroundColor(Color.YELLOW);
                        }else {
                            t5.setBackgroundColor(Color.GRAY);
                            t5.setTextColor(Color.WHITE);
                        }
                    }else if(intento == 5){
                        TextView t1 = findViewById(R.id.textView51);
                        t1.setText(palabraString.substring(0, 1));
                        t1.setAllCaps(true);
                        if(palabraString.substring(0, 1).equals(correcta.substring(0, 1)))
                        {
                            t1.setBackgroundColor(Color.GREEN);
                            t1.setTextColor(Color.WHITE);
                            hits ++;
                        }else if(correcta.contains(palabraString.substring(0, 1))){
                            t1.setBackgroundColor(Color.YELLOW);
                        }else {
                            t1.setBackgroundColor(Color.GRAY);
                            t1.setTextColor(Color.WHITE);
                        }

                        TextView t2 = findViewById(R.id.textView52);
                        t2.setText(palabraString.substring(1, 2));
                        t2.setAllCaps(true);
                        if(palabraString.substring(1, 2).equals(correcta.substring(1, 2)))
                        {
                            t2.setBackgroundColor(Color.GREEN);
                            t2.setTextColor(Color.WHITE);
                            hits ++;
                        }else if(correcta.contains(palabraString.substring(1, 2))){
                            t2.setBackgroundColor(Color.YELLOW);
                        }else {
                            t2.setBackgroundColor(Color.GRAY);
                            t2.setTextColor(Color.WHITE);
                        }

                        TextView t3 = findViewById(R.id.textView53);
                        t3.setText(palabraString.substring(2, 3));
                        t3.setAllCaps(true);
                        if(palabraString.substring(2, 3).equals(correcta.substring(2, 3)))
                        {
                            t3.setBackgroundColor(Color.GREEN);
                            t3.setTextColor(Color.WHITE);
                            hits ++;
                        }else if(correcta.contains(palabraString.substring(2, 3))){
                            t3.setBackgroundColor(Color.YELLOW);
                        }else {
                            t3.setBackgroundColor(Color.GRAY);
                            t3.setTextColor(Color.WHITE);
                        }

                        TextView t4 = findViewById(R.id.textView54);
                        t4.setText(palabraString.substring(3, 4));
                        t4.setAllCaps(true);
                        if(palabraString.substring(3, 4).equals(correcta.substring(3, 4)))
                        {
                            t4.setBackgroundColor(Color.GREEN);
                            t4.setTextColor(Color.WHITE);
                            hits ++;
                        }else if(correcta.contains(palabraString.substring(3, 4))){
                            t4.setBackgroundColor(Color.YELLOW);
                        }else {
                            t4.setBackgroundColor(Color.GRAY);
                            t4.setTextColor(Color.WHITE);
                        }

                        TextView t5 = findViewById(R.id.textView55);
                        t5.setText(palabraString.substring(4, 5));
                        t5.setAllCaps(true);
                        if(palabraString.substring(4, 5).equals(correcta.substring(4, 5)))
                        {
                            t5.setBackgroundColor(Color.GREEN);
                            t5.setTextColor(Color.WHITE);
                            hits ++;
                        }else if(correcta.contains(palabraString.substring(4, 5))){
                            t5.setBackgroundColor(Color.YELLOW);
                        }else {
                            t5.setBackgroundColor(Color.GRAY);
                            t5.setTextColor(Color.WHITE);
                        }
                    }else if(intento == 6){
                        TextView t1 = findViewById(R.id.textView61);
                        t1.setText(palabraString.substring(0, 1));
                        t1.setAllCaps(true);
                        if(palabraString.substring(0, 1).equals(correcta.substring(0, 1)))
                        {
                            t1.setBackgroundColor(Color.GREEN);
                            t1.setTextColor(Color.WHITE);
                            hits ++;
                        }else if(correcta.contains(palabraString.substring(0, 1))){
                            t1.setBackgroundColor(Color.YELLOW);
                        }else {
                            t1.setBackgroundColor(Color.GRAY);
                            t1.setTextColor(Color.WHITE);
                        }

                        TextView t2 = findViewById(R.id.textView62);
                        t2.setText(palabraString.substring(1, 2));
                        t2.setAllCaps(true);
                        if(palabraString.substring(1, 2).equals(correcta.substring(1, 2)))
                        {
                            t2.setBackgroundColor(Color.GREEN);
                            t2.setTextColor(Color.WHITE);
                            hits ++;
                        }else if(correcta.contains(palabraString.substring(1, 2))){
                            t2.setBackgroundColor(Color.YELLOW);
                        }else {
                            t2.setBackgroundColor(Color.GRAY);
                            t2.setTextColor(Color.WHITE);
                        }

                        TextView t3 = findViewById(R.id.textView63);
                        t3.setText(palabraString.substring(2, 3));
                        t3.setAllCaps(true);
                        if(palabraString.substring(2, 3).equals(correcta.substring(2, 3)))
                        {
                            t3.setBackgroundColor(Color.GREEN);
                            t3.setTextColor(Color.WHITE);
                            hits ++;
                        }else if(correcta.contains(palabraString.substring(2, 3))){
                            t3.setBackgroundColor(Color.YELLOW);
                        }else {
                            t3.setBackgroundColor(Color.GRAY);
                            t3.setTextColor(Color.WHITE);
                        }

                        TextView t4 = findViewById(R.id.textView64);
                        t4.setText(palabraString.substring(3, 4));
                        t4.setAllCaps(true);
                        if(palabraString.substring(3, 4).equals(correcta.substring(3, 4)))
                        {
                            t4.setBackgroundColor(Color.GREEN);
                            t4.setTextColor(Color.WHITE);
                            hits ++;
                        }else if(correcta.contains(palabraString.substring(3, 4))){
                            t4.setBackgroundColor(Color.YELLOW);
                        }else {
                            t4.setBackgroundColor(Color.GRAY);
                            t4.setTextColor(Color.WHITE);
                        }

                        TextView t5 = findViewById(R.id.textView65);
                        t5.setText(palabraString.substring(4, 5));
                        t5.setAllCaps(true);
                        if(palabraString.substring(4, 5).equals(correcta.substring(4, 5)))
                        {
                            t5.setBackgroundColor(Color.GREEN);
                            t5.setTextColor(Color.WHITE);
                            hits ++;
                        }else if(correcta.contains(palabraString.substring(4, 5))){
                            t5.setBackgroundColor(Color.YELLOW);
                        }else {
                            t5.setBackgroundColor(Color.GRAY);
                            t5.setTextColor(Color.WHITE);
                        }
                    }
                    intento ++;
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putInt("try", intento);
                    editor.apply();

                    if (intento > 6){
                        jugarButton.setText("Juego finalizado");
                        jugarButton.setEnabled(false);
                    }
                    if (hits == 5){
                        jugarButton.setText("Juego finalizado");
                        jugarButton.setEnabled(false);
                    }
                }
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
                Intent in = new Intent(getApplicationContext(), OpcionesActivity.class);
                startActivity(in);
                return true;
            case R.id.informacion:
                Intent in2 = new Intent(getApplicationContext(), InfoActivity.class);
                startActivity(in2);
                return true;
            case R.id.inicio:
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}