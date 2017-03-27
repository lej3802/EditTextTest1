package emirim0223.kr.hs.emirim.edittexttest1;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.TextView;
        import android.widget.EditText;
        import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    EditText edit1;
    TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit1 = (EditText) findViewById(R.id.edit1); // final을 써주거나 위에 주석처럼 해준다
        Button butOk=(Button)findViewById(R.id.but_ok);
        textResult = (TextView)findViewById(R.id.text_result);

        butOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=edit1.getText().toString();
                textResult.setText("입력한 서명은 "+name+"입니다");
            }
        });
    }

}