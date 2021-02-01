package org.instagram.tabactivity;

import android.os.Bundle;

import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import org.instagram.tabactivity.NonSwipeableViewPager;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends AppCompatActivity {


    private TabLayout tabLayout;
    private NonSwipeableViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout=(TabLayout)findViewById(R.id.tabs);
        viewPager= findViewById(R.id.viewPager);


        //create viewpageradaper class object
        ViewPagerAdapter adapter=new ViewPagerAdapter(getSupportFragmentManager());
        //adding fragments using adapter object
        adapter.AddFragment(new MainFragment(), "Free Fire");
        adapter.AddFragment(new Main2Fragment(), "Pubg");
        adapter.AddFragment(new Main2Fragment(), "Pubg");
        adapter.AddFragment(new Main2Fragment(), "Pubg");
        adapter.AddFragment(new Main2Fragment(), "Pubg");
        adapter.AddFragment(new Main2Fragment(), "Pubg");
        adapter.AddFragment(new Main2Fragment(), "Pubg");
        adapter.AddFragment(new Main2Fragment(), "Pubg");
        adapter.AddFragment(new Main2Fragment(), "Pubg");
        adapter.AddFragment(new Main2Fragment(), "Pubg");

        //set adapter into viewpager
        viewPager.setAdapter(adapter);

        //set viewpager into tablayout
        tabLayout.setupWithViewPager(viewPager);

    }
}