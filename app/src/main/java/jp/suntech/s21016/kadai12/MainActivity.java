package jp.suntech.s21016.kadai12;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.DialogFragment;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.btSend);
        Button button1 = findViewById(R.id.btConfirm);
        Button button2 = findViewById(R.id.btClear);

        kadai12 listner = new kadai12();

        button.setOnClickListener(listner);
        button1.setOnClickListener(listner);
        button2.setOnClickListener(listner);
    }

    private class kadai12 implements View.OnClickListener{
        @Override
        public void onClick(View view){
            EditText input = findViewById(R.id.etName);
            EditText input1 = findViewById(R.id.etAddress);
            EditText input2 = findViewById(R.id.etTitle);
            EditText input3 = findViewById(R.id.etComment);
            String inputStr = input.getText().toString();
            String inputStr1 = input1.getText().toString();
            String inputStr2 = input2.getText().toString();
            String inputStr3 = input3.getText().toString();
            String show = "宛先:"+inputStr1+"\n"+inputStr+"さんへ、\n"+inputStr2+"\n"+inputStr3;

            int id = view.getId();

            switch (id) {
                case R.id.btSend:
                    Toast.makeText(MainActivity.this,show,Toast.LENGTH_LONG).show();
                    break;
                case R.id.btConfirm:
                    Dialog DialogFragment = new Dialog();
                    DialogFragment.show(getSupportFragmentManager(),"Dialog");
                    Toast.makeText(MainActivity.this,show,Toast.LENGTH_LONG).show();
                    break;
                case R.id.btClear:

                    input.setText("");
                    input1.setText("");
                    input2.setText("");
                    input3.setText("");
                    break;
            }
        }
    }
}