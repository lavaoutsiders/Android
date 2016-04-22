package jianing.comtrabel.com.applauncher;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Send BUG REPORT - NOT CREATED", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }

        });


    }
    public void DisplaySpotify(View view) {
     DisplayToast("Spotify App!");
    }
    public void DisplayScore(View view) {
        DisplayToast("Score App!");
    }
    public void DisplayLibrary(View view) {
        DisplayToast("Library App!");
    }
    public void DisplayBuildBigger(View view) {
        DisplayToast("Build bigger App!");
    }
    public void DisplayXYZ(View view) {
        DisplayToast("XYZ Reader App!");
    }
    public void DisplayCapstone(View view) {
        DisplayToast("Capstone App!");
    }
    //Displays the toast on the screen
    public void DisplayToast(String strText) {

        Context context = getApplicationContext();
        CharSequence text = strText;
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

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



    }

