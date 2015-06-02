package com.richcatstudios.portfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void displayToast(View view) {
        CharSequence text = null;
        int button_id = view.getId();
        switch (button_id) {
            case R.id.btn_spotify_streamer:
                text = "This button will launch my Spotify streamer!";
                break;
            case R.id.btn_super_duo1:
                text = "This button will launch my Scores App!";
                break;
            case R.id.btn_super_duo2:
                text = "This button will launch my Library App!";
                break;
            case R.id.btn_ant_terminator:
                text = "This button will launch my Build It Bigger app!";
                break;
            case R.id.btn_materialize:
                text = "This button will launch my XYZ Reader app!";
                break;
            case R.id.btn_capstone:
                text = "This button will launch my Capstone app!";
                break;
        }
        Toast.makeText(view.getContext(), text, Toast.LENGTH_SHORT).show();
    }
}
