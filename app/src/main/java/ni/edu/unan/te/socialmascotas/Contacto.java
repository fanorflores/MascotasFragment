package ni.edu.unan.te.socialmascotas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import ni.edu.unan.te.socialmascotas.mail.SendMail;

public class Contacto extends AppCompatActivity {

    TextView tvNombre;
    TextView tvCorreo;
    TextView tvCometarios;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);
        Toolbar action_bar = (Toolbar) findViewById(R.id.action_bar);
        setSupportActionBar(action_bar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tvNombre = (TextView) findViewById(R.id.tvNombre);
        tvCorreo = (TextView) findViewById(R.id.tvCorreo);
        tvCometarios = (TextView) findViewById(R.id.tvComentarios);
        Button btnEnviar = (Button) findViewById(R.id.btEnviar);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               enviarCorreo();
            }
        });
    }

    private void enviarCorreo()
    {
        String email = tvCorreo.getText().toString().trim();
        String subject = tvNombre.getText().toString().trim();
        String message = tvCometarios.getText().toString().trim();

        SendMail sm = new SendMail(this, email, subject, message);
        sm.execute();
    }
}
