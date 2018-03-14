package com.payrix.apitestapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v7.widget.*;

import com.payrix.sdklib.PayrixException;
import com.payrix.sdklib.data.remote.*;
import com.payrix.sdklib.Accounts;
import com.payrix.apitestapp.payrixobjects.AccountContent.*;
import java.util.*;
import com.payrix.apitestapp.AccountView.OnAccountItemPostListener;
import com.payrix.apitestapp.payrixobjects.AccountContent.AccountItem;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private Accounts mService;
    private AccountRecyclerViewAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*
        try {

            mService = PayrixAPI.getAccountService();

            mRecyclerView = (RecyclerView) findViewById(R.id.);

            mAdapter = new AccountRecyclerViewAdapter(this, new ArrayList<AccountItem>(0), new OnAccountItemPostListener() {

                @Override
                public void onPostClick(long id) {
                    Toast.makeText(MainActivity.this, "Post id is" + id, Toast.LENGTH_SHORT).show();
                }
            });

            RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
            mRecyclerView.setLayoutManager(layoutManager);
            mRecyclerView.setAdapter(mAdapter);
            mRecyclerView.setHasFixedSize(true);
            RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL_LIST);
            mRecyclerView.addItemDecoration(itemDecoration);



        } catch (PayrixException e) {
            e.printStackTrace();
        }
        */
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
