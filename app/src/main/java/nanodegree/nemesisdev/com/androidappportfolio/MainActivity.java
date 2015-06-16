package nanodegree.nemesisdev.com.androidappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private Button mSpotifyStreamer;
    private Button mScoresApp;
    private Button mLibraryApp;
    private Button mBuildItBigger;
    private Button mXYZReader;
    private Button mCapstone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSpotifyStreamer = (Button) findViewById(R.id.button_spotifyStreamer);
        mSpotifyStreamer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(MainActivity.this, "Spotify Streamer App", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        mScoresApp = (Button) findViewById(R.id.button_scoresApp);
        mScoresApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(MainActivity.this, "Scores App", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        mLibraryApp = (Button) findViewById(R.id.button_libraryApp);
        mLibraryApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(MainActivity.this, "Library App", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        mBuildItBigger = (Button) findViewById(R.id.button_buildItBigger);
        mBuildItBigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(MainActivity.this, "Build It Bigger App", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        mXYZReader = (Button) findViewById(R.id.button_xyzReader);
        mXYZReader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(MainActivity.this, "XYZ Reader App", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        mCapstone = (Button) findViewById(R.id.button_capstone);
        mCapstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(MainActivity.this, "Capstone App", Toast.LENGTH_SHORT);
                toast.show();
            }
        });


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
