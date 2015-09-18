package br.com.g4it.aula0203;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.content.*;

public class MainActivity extends AppCompatActivity {

    public void validar(View botao)
    {

        EditText login = (EditText)findViewById(R.id.login);
        EditText senha = (EditText)findViewById(R.id.senha);

        String str_login = login.getText().toString();
        String str_senha = senha.getText().toString();

        if (str_login.equals("admin") && str_senha.equals("senha123")) {

            Log.v("Alerta", "Usuário Válido:");
            Toast.makeText(getBaseContext(),"Usuário Válido", Toast.LENGTH_SHORT).show();
        } else {
            Log.v("Aleta", "Usuário Inválido");
            Toast.makeText(getBaseContext(),"Usuário Inválido", Toast.LENGTH_SHORT).show();
        }

    }

    public void abrePrincipal(View botao){
        Intent telaPrincipal = new Intent(getBaseContext(),Principal.class);

        EditText login = (EditText)findViewById(R.id.login);
        String str_login = login.getText().toString();

        telaPrincipal.putExtra("nome",str_login);
        startActivity(telaPrincipal);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void dialPhoneNumber(View v){
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:91555224"));
        if (intent.resolveActivity(getPackageManager()) != null){
            startActivity(intent);
        }

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
