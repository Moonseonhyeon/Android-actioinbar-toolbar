package org.linda.myapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    
    private ImageView ivMenu;
    private DrawerLayout drawerLayout;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivMenu = findViewById(R.id.iv_menu);
        drawerLayout=findViewById(R.id.drawer);
        toolbar=findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();


        ivMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               drawerLayout.openDrawer(Gravity.LEFT);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return false;
    }
}