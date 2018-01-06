package jcn.dyndns.org.myexchange;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import jcn.dyndns.org.myexchange.fragment.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Add  Fragment to Active
        if(savedInstanceState == null){

            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contentMainFragment, new MainFragment())
                    .commit();
        }

    } // Main Method





} // Main Class
