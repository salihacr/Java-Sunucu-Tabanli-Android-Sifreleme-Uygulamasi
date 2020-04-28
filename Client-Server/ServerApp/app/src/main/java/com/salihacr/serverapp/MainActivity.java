package com.salihacr.serverapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
public class MainActivity extends AppCompatActivity {
    TextView textView,txtHostAdress;
    EditText editText;
    Button button;
    Socket socket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.txtGoingData);
        textView = findViewById(R.id.txtComingData);
        button = findViewById(R.id.btnAccessHost);
        txtHostAdress = findViewById(R.id.txtHostAdress);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new DataSendToServer().execute();
            }
        });
    }
    protected class DataSendToServer extends AsyncTask<String, Void, String>{

        String outGoingData;
        String inComingData;
        @SuppressLint("WrongThread")
        @Override
        protected String doInBackground(String... strings) {

            try {

                socket = new Socket(txtHostAdress.getText().toString().trim(),5400);
                outGoingData = editText.getText().toString();
                OutputStream outputStream = socket.getOutputStream();
                DataOutputStream dos = new DataOutputStream(outputStream);
                dos.writeUTF(outGoingData);
                InputStream inputStream = socket.getInputStream();
                DataInputStream dis = new DataInputStream(inputStream);

                inComingData = dis.readUTF();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return inComingData;
        }

        @Override
        protected void onPostExecute(String s) {
            textView.setText(s);
        }
    }
}
