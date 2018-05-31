package co.edu.udea.ubiu.Controller;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class SQLite_OpenHelper extends SQLiteOpenHelper{

    public SQLite_OpenHelper(Context context, String name,
                             SQLiteDatabase.CursorFactory factory,
                             int version) {

        super(context, name, factory, version);

    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        String query="create table dependencies(_ID integer primary key autoincrement, " +
                "Coord txt, Number text, Name text);";
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

    public void newRegister(String coordinate, String officeNumber, String officeName){

        ContentValues values = new ContentValues();
        values.put("Coordinate", coordinate);
        values.put("OfficeNumber", officeNumber);
        values.put("OfficeName", officeName);
        this.getWritableDatabase().insert("dependencies", null, values);

    }

    public Cursor consultarUsuPass(String usu, String pass) throws SQLException {

        Cursor mcursor = null;
        mcursor = this.getReadableDatabase().query("users",
                new String[]{ "_ID", "photo", "Name", "Email", "Password" },
                "Email like '" + usu + "' " + "and Password like '" + pass + "'",
                null, null, null, null);
        return mcursor;

    }

}