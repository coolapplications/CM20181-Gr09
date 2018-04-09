package co.edu.udea.compumovil.gr09_20181.lab1;

import android.annotation.SuppressLint;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.support.annotation.RequiresApi;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.TimePicker;

import static android.content.Intent.createChooser;

public class MenuRegister extends AppCompatActivity {

    ImageView imagen;
    EditText et1, et2, et3;
    TextView tv, tv2;
    CheckBox cb1,cb2,cb3;
    RadioButton rb1,rb2;
    ConstraintLayout cl;
    RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_register);
        imagen = findViewById(R.id.selectImage);
        tv = findViewById(R.id.select_time);
        et1 = findViewById(R.id.textName);
        et2 = findViewById(R.id.textPrice);
        et3 = findViewById(R.id.textIngredients);
        tv2 = findViewById(R.id.textInfo);
        cb1 = findViewById(R.id.checkManana);
        cb2 = findViewById(R.id.checkTarde);
        cb3 = findViewById(R.id.checkNoche);
        rb1 = findViewById(R.id.radioEntrada);
        rb2 = findViewById(R.id.radioEntrada);
        cl = findViewById(R.id.c2);
        rg = findViewById(R.id.radioGroup);
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

    public void obtenerHora(View v){
        TimePickerDialog rh = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int hourOfDay, int minute) {
                String hf = String.valueOf(hourOfDay);
                String mf = String.valueOf(minute);
                String s = "Tiempo de Preparación: ";
                tv.setText(s + hf + "H " + mf+"Min");
            }
        } , 0, 0, true);
        rh.show();
    }

    @SuppressLint("WrongConstant")
    public void register(View v){
        String s = et1.getText().toString() + "\n";
        if(cb1.isChecked())s = s + cb1.getText().toString() + "\n";
        if(cb2.isChecked())s = s + cb2.getText().toString() + "\n";
        if(cb3.isChecked())s = s + cb3.getText().toString() + "\n";
        if(rb1.isChecked())s = s + rb1.getText().toString() + "\n";
        if(rb2.isChecked())s = s + rb2.getText().toString() + "\n";
        s = s + tv.getText().toString() + "\n";
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
        cb1.setChecked(false);
        cb2.setChecked(false);
        cb3.setChecked(false);
        rg.clearCheck();
        tv.setText(null);
        tv2.setText(null);
        cl.setVisibility(2);
    }
}
