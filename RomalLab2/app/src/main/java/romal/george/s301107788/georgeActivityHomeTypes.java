package romal.george.s301107788;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;
import android.content.Intent;


public class georgeActivityHomeTypes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_george_home_types);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.ssmenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.item1:
                Toast.makeText(this,"Apartment is selected", Toast.LENGTH_SHORT).show();
                //define an intent object to move to another screen
                Intent intent=new Intent(georgeActivityHomeTypes.this,georgeActivityApartment.class);

                //startActivity method will take you to another screen
                startActivity(intent);

                return true;

            case R.id.item2:
                Toast.makeText(this,"Detached home is selected", Toast.LENGTH_SHORT).show();

                return true;

            case R.id.item3:
                Toast.makeText(this,"Semi detached home is selected", Toast.LENGTH_SHORT).show();

                return true;

            case R.id.item4:
                Toast.makeText(this,"Condominium apartment is selected", Toast.LENGTH_SHORT).show();

                return true;
            case R.id.item5:
                Toast.makeText(this,"Town house apartment is selected", Toast.LENGTH_SHORT).show();

                return true;
            default:return super.onOptionsItemSelected(item);


        }

    }
}
