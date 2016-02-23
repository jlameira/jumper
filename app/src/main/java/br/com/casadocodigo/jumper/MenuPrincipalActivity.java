package br.com.casadocodigo.jumper;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.TextView;

public class MenuPrincipalActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);

        TextView jogar = (TextView) findViewById(R.id.menu_principal_jogar);
        jogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main = new Intent(MenuPrincipalActivity.this,MainActivity.class);
                startActivity(main);


            }
        });
    }

}
