package co.edu.udea.compumovil.grXX_20181.lab1;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class Restaurante extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurante);
    }

    public void platos(View view){
        Intent intent = new Intent(this, Platos.class);
        Toast.makeText(this,"platos",Toast.LENGTH_LONG).show();
        startActivity(intent);
    }

    public void bebidas(View view){
        Intent intent = new Intent(this, Bebidas.class);
        Toast.makeText(this,"bebidas",Toast.LENGTH_LONG).show();
        startActivity(intent);
    }


}
