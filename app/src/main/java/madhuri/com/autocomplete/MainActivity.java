package madhuri.com.autocomplete;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    String[] city = {"Rajkot","Baroda","Jamnagar"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Getting the instance of AutoCompleteTextVie
        AutoCompleteTextView autoCompleteTextView = findViewById(R.id.autocompletetext);

        //Creating the instance of ArrayAdapter containing list of language names
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line,city);

        autoCompleteTextView.setAdapter(arrayAdapter);
    }
}