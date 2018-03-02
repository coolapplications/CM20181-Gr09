package co.edu.udea.compumovil.gr09_20181.lab1;


import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;


public class Restaurante extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurante);

        ImageButton plates = (ImageButton)findViewById(R.id.imageButton2);
        ImageButton drinks = (ImageButton)findViewById(R.id.imageButton3);
        plates.setOnClickListener(this);
        drinks.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, RegisterOption.class);
        Toast.makeText(this,"platos",Toast.LENGTH_LONG).show();
        startActivity(intent);


        Fragment frag = new Fragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.restaurante, frag).commit();

    }

    





    /*public void platos(View view){
        Intent intent = new Intent(this, RegisterOption.class);
        Toast.makeText(this,"platos",Toast.LENGTH_LONG).show();
        startActivity(intent);
    }

    public void bebidas(View view){
        Intent intent = new Intent(this, RegisterOption.class);
        Toast.makeText(this,"bebidas",Toast.LENGTH_LONG).show();
        startActivity(intent);
    }*/


}
