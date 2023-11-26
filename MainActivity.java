package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt = findViewById(R.id.convert);
        Button bt2 = findViewById(R.id.clear);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText editText1 = findViewById(R.id.edittext1);
                EditText editText2 = findViewById(R.id.edittext2);


                if(! editText1.getText().toString().equals("") && editText2.getText().toString().equals(""))
                {
                    int dolarvalue = Integer.parseInt(editText1.getText().toString());
                    int d = 30;
                    int result = dolarvalue * d;

                    editText2.setText(String.valueOf(result));
                }
                else if(!editText2.getText().toString().equals("") && editText1.getText().toString().equals(""))
                {
                    int egyvalue = Integer.parseInt(editText2.getText().toString());
                    int d = 30;
                    int result = egyvalue / d;

                    editText1.setText(String.valueOf(result));
                }
                else
                {
                    Toast.makeText(MainActivity.this, "invalid data", Toast.LENGTH_SHORT).show();
                }

            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText1 = findViewById(R.id.edittext1);
                EditText editText2 = findViewById(R.id.edittext2);

                editText1.getText().clear();
                editText2.getText().clear();
            }
        });
    }
}

/*
package com.example.ass;

        import androidx.appcompat.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


            }
        });
    }

    public class Convert {
        private float num;

        public void setNum(int n) {
            num = n;
        }

        public float getNum() {
            return num;
        }
    }
}
*/