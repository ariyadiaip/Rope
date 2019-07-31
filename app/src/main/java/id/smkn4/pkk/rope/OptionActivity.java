package id.smkn4.pkk.rope;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class OptionActivity extends AppCompatActivity {

    Button btn_siswa,btn_guru;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);

        btn_siswa = (Button) findViewById(R.id.btn_siswa);
        btn_guru = (Button) findViewById(R.id.btn_guru);

        btn_siswa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OptionActivity.this , LoginActivity.class));
            }
        });

        btn_guru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OptionActivity.this , LoginActivity.class));
            }
        });

    }
}
