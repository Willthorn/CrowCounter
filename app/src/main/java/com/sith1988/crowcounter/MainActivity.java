package com.sith1988.crowcounter;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button mButtonCrowCounter;
    private Button mButtonCatCounter;
    private Button mButtonCountersToZero;
    private int mCrowCount = 0;
    private int mCatCount = 0;

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
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        mButtonCrowCounter = (Button)findViewById(R.id.buttonCrowCount);
        mButtonCrowCounter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCrowCount += 1;
                TextView Textview = (TextView) findViewById(R.id.textView);
                String mCrowCounterMessage = "Я насчитал " + mCrowCount + " ворон";
                Textview.setText(mCrowCounterMessage);

            }
        });
        mButtonCatCounter = (Button)findViewById(R.id.buttonCatCount);
        mButtonCatCounter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCatCount += 1;
                TextView mViewCatCounter = (TextView)findViewById(R.id.textView);
                mViewCatCounter.setText("Я насчитал " + mCatCount + " котов");
            }
        });
        mButtonCountersToZero = (Button)findViewById(R.id.buttonToZero);
        mButtonCountersToZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCrowCount = 0;
                mCatCount = 0;
                TextView mSetToZeroSuccess = (TextView)findViewById(R.id.textView);
                mSetToZeroSuccess.setText("Счетчики успешно обнулены");
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

    public void OnClick(View view) {
        TextView Textview = (TextView)findViewById(R.id.textView);
        Textview.setText("Ты кто такой? Давай, до свидания!");
    }
}
