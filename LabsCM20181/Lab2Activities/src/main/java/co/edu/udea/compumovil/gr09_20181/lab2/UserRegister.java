package co.edu.udea.compumovil.gr09_20181.lab2;

import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import OpenHelper.SQLite_OpenHelper;

import static android.content.Intent.createChooser;

public class UserRegister extends AppCompatActivity {

    Button btnRecordUser;
    ImageView phot = (ImageView)findViewById(R.id.imvPhoto);
    EditText photo, txtNameUser, txtMailuser, txtPassUser;


    SQLite_OpenHelper helper = new SQLite_OpenHelper(this, "BD", null, 1 );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_register);

        btnRecordUser = (Button)findViewById(R.id.btnReg);
        txtNameUser = (EditText)findViewById(R.id.txtNomReg);
        txtMailuser = (EditText)findViewById(R.id.txtMailReg);
        txtPassUser = (EditText)findViewById(R.id.txtPassReg);

        btnRecordUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                helper.openDB();
                helper.newRegister(String.valueOf(photo.getText()),
                        String.valueOf(txtNameUser.getText()),
                        String.valueOf(txtMailuser.getText()),
                        String.valueOf(txtPassUser.getText()));
                helper.closeDB();

                Toast.makeText(getApplicationContext(), "Registro Almacenado con éxito",
                        Toast.LENGTH_LONG).show();

                Intent i = new Intent(getApplicationContext(), Restaurant.class);
                startActivity(i);
            }
        });
    }

    public void onclicK(View view) {

        Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        intent.setType("image/");
        startActivityForResult(createChooser(intent,"Seleccione app"),10);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode==RESULT_OK){
            Uri path = data.getData();
            phot.setImageURI(path);
        }
    }
}
