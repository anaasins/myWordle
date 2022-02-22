package es.uv.asins4.mywordle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        ImageButton imageButton = findViewById(R.id.closeButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
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
                Intent in = new Intent(getApplicationContext(), OpcionesActivity.class);
                startActivity(in);
                return true;
            case R.id.informacion:
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