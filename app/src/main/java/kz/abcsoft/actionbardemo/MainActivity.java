package kz.abcsoft.actionbardemo;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Action Bar");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main_actions, menu);
        return super.onCreateOptionsMenu(menu) ;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.


        switch(item.getItemId()){
            case R.id.action_search:
                return true ;
            case R.id.action_location_found:
                locationFound();
                return true ;
            case R.id.action_refresh:
                return true ;
            case R.id.action_help:
                return true ;
            case R.id.action_check_updates:
                return true ;
            default:
                return super.onOptionsItemSelected(item) ;
        }

    }

    public void locationFound() {
        Intent i = new Intent(getApplicationContext(), LocationFound.class);
        startActivity(i);
    }
}
