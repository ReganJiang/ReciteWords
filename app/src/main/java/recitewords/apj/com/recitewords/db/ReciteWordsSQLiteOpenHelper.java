package recitewords.apj.com.recitewords.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by CGT on 2016/11/28.
 *
 * 不背单词书库
 *
 * 数据库库打开帮助类
 */
public class ReciteWordsSQLiteOpenHelper extends SQLiteOpenHelper{
    public ReciteWordsSQLiteOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        //创建数据库时，写死数据库名字为ReciteWords.db，版本为1
        super(context, "ReciteWords.db", factory, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
