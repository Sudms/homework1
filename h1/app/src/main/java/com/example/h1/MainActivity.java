
package com.example.h1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.h1.R;

public class MainActivity extends AppCompatActivity {
    Button bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt0, btCard, btAst;
    TextView text;
    ImageButton call, delete;
    public static final String EXTRA_TEXT= "com.example.teclado.EXTRA_TEXT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView) findViewById(R.id.textView);
        bt0 = (Button) findViewById(R.id.zero);
        bt1 = (Button) findViewById(R.id.um);
        bt2 = (Button) findViewById(R.id.dois);
        bt3 = (Button) findViewById(R.id.tres);
        bt4 = (Button) findViewById(R.id.quatro);
        bt5 = (Button) findViewById(R.id.cinco);
        bt6 = (Button) findViewById(R.id.seis);
        bt7 = (Button) findViewById(R.id.sete);
        bt8 = (Button) findViewById(R.id.oito);
        bt9 = (Button) findViewById(R.id.nove);
        btCard = (Button) findViewById(R.id.card);
        btAst = (Button) findViewById(R.id.ast);
        call = (ImageButton) findViewById(R.id.call);
        delete = (ImageButton) findViewById(R.id.delete);

        Intent intent = getIntent();
        String number = intent.getStringExtra(MainActivity.EXTRA_TEXT);
        text.setText(number);


        //long click
        bt2.setOnLongClickListener(new View.OnLongClickListener(){
            @Override
            public boolean onLongClick(View v){
                text.append("+");
                return true;
            }
        });

        bt0.setOnLongClickListener(new View.OnLongClickListener(){
            @Override
            public boolean onLongClick(View v){
                text.append("+");
                return true;
            }
        });
        //little click
        bt1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                text.append("1");
            }
        });

        bt2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                text.append("2");
            }
        });

        bt3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                text.append("3");
            }
        });

        bt4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                text.append("4");
            }
        });

        bt5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                text.append("5");
            }
        });

        bt6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                text.append("6");
            }
        });

        bt7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                text.append("7");
            }
        });

        bt8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                text.append("8");
            }
        });

        bt9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                text.append("9");
            }
        });

        bt0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                text.append("0");
            }
        });

        btCard.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                text.append("#");
            }
        });

        btAst.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                text.append("*");
            }
        });

        delete.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String txtTmp = text.getText().toString();
                if(text.length()>0){
                    text.setText(txtTmp.substring(0, txtTmp.length()-1));
                }
            }
        });

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone_number = text.getText().toString();
                dialPhoneNumber(phone_number);
            }
        });



        bt1.setOnLongClickListener(new View.OnLongClickListener(){
            @Override
            public boolean onLongClick(View v){
                return true;
            }
        });

        bt2.setOnLongClickListener(new View.OnLongClickListener(){
            @Override
            public boolean onLongClick(View v){
                return true;
            }
        });

        bt3.setOnLongClickListener(new View.OnLongClickListener(){
            @Override
            public boolean onLongClick(View v){
                return true;
            }
        });
    }

    private void dialPhoneNumber(String phone_number) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + phone_number));
        startActivity(intent);
    }

}