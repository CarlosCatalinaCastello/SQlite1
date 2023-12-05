package carloscatalina.example.sqlite1;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import java.util.ArrayList;

import carloscatalina.example.sqlite1.configuracion.Configuracion;
import carloscatalina.example.sqlite1.databinding.ActivityMainBinding;
import carloscatalina.example.sqlite1.helpers.ProductosHelper;
import carloscatalina.example.sqlite1.modelos.Producto;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private ProductosHelper helper;
    private ArrayList<Producto> productos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);

        helper = new ProductosHelper(this, Configuracion.BD_NAME, null, Configuracion.BD_VERSION);

        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
            }
        });
    }

}