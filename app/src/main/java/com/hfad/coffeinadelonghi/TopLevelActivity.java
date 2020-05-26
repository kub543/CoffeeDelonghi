package com.hfad.coffeinadelonghi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.hfad.coffeinadelonghi.orders.OrdersActivity;
import com.hfad.coffeinadelonghi.play.PlayActivity;

public class TopLevelActivity extends AppCompatActivity {

    /* This app is created for us and our family. Its goul is make easier our meetings when lot of people wont order a coffee and we
    don't have to remember all orders and we don't have to describe every time each coffee before some one will decide to choice it.
 */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_level);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> listViev, View v, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(TopLevelActivity.this, DrinkCategoryActivity.class);
                    startActivity(intent);
                }

                if (position == 1) {
                    Intent intent = new Intent(TopLevelActivity.this, OrdersActivity.class);
                    startActivity(intent);
                }

                if (position == 2) {
                    Intent intent = new Intent(TopLevelActivity.this, PlayActivity.class);
                    startActivity(intent);
                }
            }
        };

        ListView listView = (ListView) findViewById(R.id.list_options);
        listView.setOnItemClickListener(itemClickListener);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.list_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.List:
                Intent intent = new Intent(this, OrdersActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }
    }

    public void play(View view) {
        Intent intent = new Intent(this, PlayActivity.class);
        startActivity(intent);
    }
}