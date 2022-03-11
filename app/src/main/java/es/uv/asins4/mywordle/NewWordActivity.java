package es.uv.asins4.mywordle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class NewWordActivity extends AppCompatActivity {
    public static final String EXTRA_REPLY = "es.uv.asins4.mywordle.wordlistsql.REPLY";
    private EditText editPalabra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_word);

        editPalabra = findViewById(R.id.nuevaPalabra);

        final Button button = findViewById(R.id.buttonGuardar);
        button.setOnClickListener(view -> {
            String word = editPalabra.getText().toString();
            if (word.length()==5){
                Intent replyIntent = new Intent();
                if (TextUtils.isEmpty(editPalabra.getText())) {
                    setResult(RESULT_CANCELED, replyIntent);
                } else {
                    replyIntent.putExtra(EXTRA_REPLY, word);
                    setResult(RESULT_OK, replyIntent);
                }
            }
            finish();
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
            case R.id.nuevaPalabra:
                return true;
            case R.id.opciones:
                Intent in = new Intent(getApplicationContext(), OpcionesActivity.class);
                startActivity(in);
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