package com.example.cn1404;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;;import com.google.android.material.navigation.NavigationView;


public class HomeActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        toolbar = findViewById(R.id.toolbar);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        //hide or show items
        Menu menu = navigationView.getMenu();
//        menu.findItem(R.id.nav_logout).setVisible(false);

        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setCheckedItem(R.id.nav_home);

    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);

        // Kích hoạt chức năng tìm kiếm
        MenuItem searchItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) searchItem.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                // Xử lý khi người dùng nhấn nút tìm kiếm
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                // Xử lý khi người dùng thay đổi văn bản tìm kiếm
                return true;
            }
        });

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_search) {
            // Xử lý khi biểu tượng tìm kiếm được nhấn
            return true;
        }
        if (id == R.id.action_keypad) {

//             Xử lý khi biểu tượng "keypad" được nhấn
            AlertDialog.Builder alerDialog = new AlertDialog.Builder(HomeActivity.this);
            View DialogView = LayoutInflater.from(HomeActivity.this).inflate(R.layout.danhmucdoan, null);
            alerDialog.setView(DialogView);
            setContentView(R.layout.danhmucdoan);

            return true;
        }

        // Xử lý các mục menu khác nếu cần

        return super.onOptionsItemSelected(item);

    }
//        @Override
//    public boolean onNavigationItemSelected(@NonNull MenuItem Item) {
//        if  (Item.getItemId()==R.id.nav_home) {
//            getSupportFragmentManager().beginTransaction()
//                    .replace(R.id.nav_yeuthich,new Nav_Home)
////                Intent intent = new Intent(HomeActivity.this, YeuthichActivity.class);
//                startActivity(intent);
//               break;
//            case R.id.nav_share:
//                Toast.makeText(this, "share", Toast.LENGTH_SHORT).show();
//                break;
//        }
//       drawerLayout.closeDrawer(GravityCompat.START);
//        return true;
//}
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.nav_home) {
            // Xử lý khi nhấn vào menu Home
        } else if (item.getItemId() == R.id.nav_yeuthich) {
            Intent intent = new Intent(HomeActivity.this, YeuthichActivity.class);
            startActivity(intent);
        } else if (item.getItemId() == R.id.nav_share) {
            Toast.makeText(this, "share", Toast.LENGTH_SHORT).show();
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

//ahihi

}