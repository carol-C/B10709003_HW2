package com.example.b10709003_hw2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.RelativeLayout;
public class MainActivity extends AppCompatActivity{
//public class MainActivity extends AppCompatActivity implements SwapDialog.DLister {
    /*private EditText ET_NAME;
    private EditText ET_AMOUNT;
    private int count=0;
    private SQLiteDatabase mdatabase;
    private ItemAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      /*  ItemDBHelper dbHelper =new ItemDBHelper(this);
        mdatabase= dbHelper.getWritableDatabase();

        RecyclerView recyclerView=findViewById(R.id.rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        mAdaper = new ItemAdaper(this,getAllitems());
        recyclerView.setAdapter(mAdapter);

        new ItemTouchHelper(new ItemTouchHelper.SimpleCallback(0,ItemTouchHelper.LEFT|ItemTouchHelper.RIGHT)){
            @Override
            public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder,@NonNull RecyclerView.ViewHolder targer){
                return false;
            }
            @Override
            public void onSwiped(@NonNull RecycleView.ViewHolder viewHolder,int direction){
                openDialog();
                if(count==1){
                    removeItem((long)viewHolder.itemView.getTag());
                    count--;
                }
            }
        }).attachToRecyclerView(recyclerView);
    }*/




   public boolean onCreateOptionsMenu(Menu menu){
       MenuInflater inflater=getMenuInflater();
       inflater.inflate(R.menu.menubar,menu);
       return true;
   }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
            switch (item.getItemId()){
            case R.id.add:
                Intent intent=new Intent(MainActivity.this,add.class);
                startActivity(intent);
                break;
            case R.id.setting:
            finish();
            Intent intent2 =new Intent( MainActivity.this,setting.class);
            startActivity(intent2);
        }
        return super.onOptionsItemSelected(item);
    }





     /*Intent intent=this.getIntent();
     final String name=intent.getStringExtra("name");
     final String num=intent.getStringExtra("num");

     SharedPreferences sharedPreferences= PreferenceManager.getDefaultSharedPreferences(this);
     String storeColor=SharedPreferences.getString("#FFFF0000");
     RelativeLayout relativeLayout=findViewById(R.id.testB);
     RelativeLayout.setBackgroundColor(Color.parseColor(storeColor));

     add(name,num);*/
    }

