package co.edu.udea.compumovil.gr09_20181.lab2;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import OpenHelper.SQLite_OpenHelper;

public class UserRegister extends AppCompatActivity {

    Button btnRecordUser;
    ImageView photo = (ImageView)findViewById(R.id.imvPhoto);
    EditText txtNameUser, txtMailuser, txtPassUser;


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
                Uri photoUriUser = Uri.parse("R.drawable.photo");
                Uri uriImage = Uri.parse("android.resource://" + getPackageName() +"/"+R.drawable.);
                String i;
                i = photoUriUser.toString();
                helper.openDB();
                helper.newRegister(String.valueOf(i);
            }
        });
    }
}
