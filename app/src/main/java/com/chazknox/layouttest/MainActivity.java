package com.chazknox.layouttest;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends ActionBarActivity {

    private Spinner splitSpinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get ref from widget
        splitSpinner = (Spinner)findViewById(R.id.splitSpinner);

        //create array adapter
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.split_array, android.R.layout.simple_spinner_item);

        //set layout for dropdown list
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //set the adapter to the spinner
        splitSpinner.setAdapter(adapter);

        // use the following command to get info from the Spinner
        splitSpinner.setSelection(0);
        int pos = splitSpinner.getSelectedItemPosition();
        String selectedText = (String)splitSpinner.getSelectedItem();

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
    public void calculateAndDisplay() {

        int splitPosition = splitSpinner.getSelectedItemPosition();
        int split = splitPosition + 1;
        float perPersonAmount = 0;
     /*   if(split == 1 ){
            perPersonLabel.setVisibility.(View.GONE);
            perPersonTextView.setVisibility.(View.GONE);
        } else {
            perPersonAmount = totalAmount / split;
            perPersonLabel.setVisibility.(View.VISIBLE);
            perPersonTextView.setVisibility.(View.VISIBLE);
        }*/
    }
}
