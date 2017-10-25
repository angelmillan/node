package es.vcarmen.socialtech;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;
import android.widget.Toast;




public class MainActivity extends AppCompatActivity {
    EditText nombre;
    EditText apellido;
    EditText telefono;
    EditText email;
    Button addContact;
    MultiAutoCompleteTextView formacion;
    Editable seleccion;
    ArrayAdapter <String> adaptador;
    Contactos contactos = new Contactos();
    Contacto contacto;
    TextView numeroDeContactos;
    String[] titulos = {"SMR", "DAM", "DAW", "ASIR", "Ingeniería técnica informática", "Ingeniería Informática", "Grado", "Otros"};


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(savedInstanceState != null)
            contactos = (Contactos) savedInstanceState.getSerializable("listaContactos");

        // carga variables con los objetos creados en xml
        nombre = (EditText) findViewById(R.id.nombre);
        apellido = (EditText) findViewById(R.id.apellido);
        telefono = (EditText) findViewById(R.id.telefono);
        email = (EditText) findViewById(R.id.email);
        formacion = (MultiAutoCompleteTextView) findViewById(R.id.Spinnerformacion);
        addContact = (Button) findViewById(R.id.botonAdd);
        numeroDeContactos = (TextView) findViewById(R.id.numeroContactos);

        // MulticompleteView
        adaptador = new ArrayAdapter<>(this,android.R.layout.simple_dropdown_item_1line,titulos);
        formacion.setAdapter(adaptador);
        formacion.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());




        addContact.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View view) {
                if ((nombre.getText().length() == 0 && telefono.getText().length() == 0 )
                        || (nombre.getText().length() == 0 && email.getText().length() == 0 )) {
                    Toast.makeText(getApplicationContext(), "Faltan datos de Contacto" , Toast.LENGTH_SHORT).show();
                } else {
                    contacto = new Contacto(nombre.getText().toString(), apellido.getText().toString(), telefono.getText().toString(), email.getText().toString(),formacion.getText().toString());
                    contactos.addContacto(contacto);
                    numeroDeContactos.setText(" " + Contacto.contadorDeInstancias + " ");
                    Log.d("contacto", "" + contacto);
                    Log.d("contacto", "" + seleccion);
                }
            }
        });
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putSerializable("listaContactos", contactos);
    }


}
