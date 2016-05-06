package com.example.arieldarealeza.check_in;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private EditText editTextPesquisar;
    private EditText editTextNome;
    private EditText editTextTelefone;
    private EditText editTexCpf;
    private EditText editTextEmail;
    private EditText editTextConta;
    private EditText editTextEntrada;
    private EditText editTextSaida;
    private EditText editTextSuites;
    private EditText editTextResultado;
    private EditText editTextLogin;
    private EditText editTextpassoword;
    private Switch switchFirebase;
    private HashMap<String, String> loginSenha = new HashMap<String, String>();
    private String login;
    private String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextPesquisar = (EditText) findViewById(R.id.editTextPesquisar);
    }

    public void passaTela(View view) {
        setContentView(R.layout.localizacao);
    }

    public void passatela2(View View) {
        setContentView(R.layout.tela2);
    }

    public void passatela3(View View) {
        setContentView(R.layout.tela3);
    }

    public void okClick(View View) {
        editTextEntrada = (EditText) findViewById(R.id.editTextEntrada);
        editTextSaida = (EditText) findViewById(R.id.editTextSaida);
        editTextSuites = (EditText) findViewById(R.id.editTextSuites);
        editTextResultado = (EditText) findViewById(R.id.editTextResultado);

        String S_Entrada = editTextEntrada.getText().toString();
        String S_saida = editTextSaida.getText().toString();
        String s_suites = editTextSuites.getText().toString();

        Date entrada = new Date(S_Entrada);
        Date saida = new Date(S_saida);
        int suites = Integer.parseInt(s_suites);

        double num_dias = saida.compareTo(entrada);
        double ims = 0;
        if (suites == 1) {
            ims = num_dias * 300;
        } else if (suites == 2) {
            ims = num_dias * 500;
        }
        editTextResultado.setText(ims + "");
    }

    public void passatela4(View View) {
        setContentView(R.layout.cadcliente);

        editTextNome=(EditText) findViewById(R.id.editTextNome);
        editTextTelefone=(EditText) findViewById(R.id.editTextTelefone);
        editTexCpf=(EditText) findViewById(R.id.editTexCpf);
        editTextEmail=(EditText)findViewById(R.id.editTextEmail);
        editTextConta=(EditText) findViewById(R.id.editTextConta);

    }
    public void passatela5 (View View){setContentView(R.layout.tela4);

    editTextLogin=(EditText) findViewById(R.id.editTextLogin);
    editTextpassoword=(EditText) findViewById(R.id.editTextPassword);
    }
    public void passatela6 (View View){setContentView(R.layout.agradecimento);}
}

