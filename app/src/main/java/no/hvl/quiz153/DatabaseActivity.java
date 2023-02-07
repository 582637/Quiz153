package no.hvl.quiz153;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import java.util.ArrayList;
import java.util.Collections;

import no.hvl.quiz153.databinding.ActivityDatabaseBinding;

public class DatabaseActivity extends AppCompatActivity {
    ArrayList<String> names = new ArrayList<>();

    ListView listView;

    Button button_sort;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database);
        listView = (ListView) findViewById(R.id.my_list);
        names.add("Iver");
        names.add("ASELIN");
        CustomAdaptr customAdaptr = new CustomAdaptr(getApplicationContext(),names);
        listView.setAdapter(customAdaptr);
        Button button_sort = (Button) findViewById(R.id.button_sort);
        button_sort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Collections.sort(names);
                listView.setAdapter(new CustomAdaptr(getApplicationContext(),names));
            }
        });
    }
}