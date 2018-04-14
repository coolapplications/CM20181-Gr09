package co.edu.udea.compumovil.gr09_20181.lab2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.RequiresApi;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import static android.content.Intent.createChooser;

public class DrinkRegister extends AppCompatActivity {
    ImageView imagen;
    EditText et1, et2, et3;
    TextView tv2;

    ConstraintLayout cl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(savedInstanceState != null){
            setContentView(R.layout.activity_drink_register);
            imagen = findViewById(R.id.selectImage);
            et1 = findViewById(R.id.textName);
            et2 = findViewById(R.id.textPrice);
            et3 = findViewById(R.id.textIngredients);
            tv2 = findViewById(R.id.textInfo);
            cl = findViewById(R.id.c2);
        }else{
            setContentView(R.layout.activity_drink_register);
        }

            }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP_MR1)
    public void onclicK(View view) {

        cargarImagen();
    }

    private void cargarImagen() {
        Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        intent.setType("image/");
        startActivityForResult(createChooser(intent,"Seleccione app"),10);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode==RESULT_OK){
            Uri path = data.getData();
            imagen.setImageURI(path);
        }
    }

    @SuppressLint("WrongConstant")
    public void register(View v){
        String s = et1.getText().toString() + "\n";
        s = s + et2.getText().toString() + "\n";
        s = s + et3.getText().toString() + "\n";

        cl.setVisibility(1);

        tv2.setText(s);

    }

    @SuppressLint("WrongConstant")
    public void delete(View view) {
        et1.setText(null);
        et2.setText(null);
        et3.setText(null);
        tv2.setText(null);
        cl.setVisibility(2);
    }

    @SuppressLint("WrongConstant")
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putAll(savedInstanceState);
    }

}
