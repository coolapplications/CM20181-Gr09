package OpenHelper;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by main on 4/7/18.
 */

public class SQLite_OpenHelper extends SQLiteOpenHelper {

    public SQLite_OpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String query="create table users(_ID integer primary key autoincrement, " +
                "Photo text, Name text, Email text, Password text);";
        sqLiteDatabase.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public void openDB(){

        this.getWritableDatabase();
    }

    public void closeDB(){

        this.close();
    }

    public void newRegister(String photo, String name, String mail, String pass){
        ContentValues values = new ContentValues();
        values.put("Photo", photo);
        values.put("Name", name);
        values.put("Email", mail);
        values.put("Password", pass);
        this.getWritableDatabase().insert("users", null, values);
    }


}
