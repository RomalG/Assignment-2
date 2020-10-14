package romal.george.s301107788;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //onSubmit event method
    public void OnSubmit(View v) {

        //define an intent object to move to another screen
        Intent intent = new Intent(MainActivity.this, georgeActivityHomeTypes.class);


        //startActivity method will take you to another screen
        startActivity(intent);


    }




}