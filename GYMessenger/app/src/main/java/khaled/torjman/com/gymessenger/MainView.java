package khaled.torjman.com.gymessenger;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainView extends AppCompatActivity {

    private TextView mTextMessage;



    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    contactFragment();
                    return true;
                case R.id.navigation_dashboard:
                    messageFragment();
                    return true;
                case R.id.navigation_notifications:
                    searchFragment();
                    return true;
                case R.id.navigations_settings:
                    settingsFragment();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_view);

        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().add(R.id.layout,new Contacts()).commit();

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    public void contactFragment()
    {
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.layout,new Contacts()).commit();
    }
    public void messageFragment()
    {
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.layout,new Messages()).commit();

    }
    public void searchFragment()
    {
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.layout,new Search()).commit();

    }
    public void settingsFragment()
    {
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.layout,new Settings()).commit();

    }


    public void goToChat(View view) {
        Intent i = new Intent(this,ChatActivity.class);
        startActivity(i);
    }
}
