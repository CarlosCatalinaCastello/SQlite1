package carloscatalina.example.sqlite1.helpers;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.stmt.query.In;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.io.IOException;
import java.sql.SQLException;

import carloscatalina.example.sqlite1.configuracion.Configuracion;
import carloscatalina.example.sqlite1.modelos.Producto;

public class ProductosHelper extends OrmLiteSqliteOpenHelper {
    private Dao<Producto, Integer> daoProductos;

    public ProductosHelper(Context context, String databaseName, SQLiteDatabase.CursorFactory factory, int databaseVersion) {
        super(context, Configuracion.BD_NAME, null, Configuracion.BD_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase database, ConnectionSource connectionSource) {
        try{
            TableUtils.createTable(connectionSource, Producto.class);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase database, ConnectionSource connectionSource, int oldVersion, int newVersion) {

    }

    private Dao<Producto, Integer> getDaoProductos() throws SQLException{
        if (daoProductos == null){
            daoProductos = getDao(Producto.class);
        }
        return daoProductos;
    }
}
