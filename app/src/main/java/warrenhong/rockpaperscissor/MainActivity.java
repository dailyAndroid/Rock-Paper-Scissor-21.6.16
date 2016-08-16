package warrenhong.rockpaperscissor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button rock;
    Button paper;
    Button scissor;
    TextView changingText;
    public void rock() {
        rock = (Button) findViewById(R.id.rock);
        rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                won(1);
            }
        });
    }

    public void paper() {
        paper = (Button) findViewById(R.id.paper);
        paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                won(2);
            }
        });
    }

    public void scissor() {
        scissor = (Button) findViewById(R.id.scissor);
        scissor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                won(3);
            }
        });
    }

    public void won(int i) {
        changingText = (TextView)findViewById(R.id.changingText);

        int myNum = (int) Math.ceil(Math.random()*3);
        if (myNum==i) {
            Toast.makeText(MainActivity.this, "Its a TIE", Toast.LENGTH_SHORT).show();
            if (myNum == 1) {
                changingText.setText("ROCK");
            }
            if (myNum == 2) {
                changingText.setText("PAPER");
            }
            if (myNum == 3) {
                changingText.setText("SCISSOR");
            }
        }
        if (myNum == 1 && i == 2) {
            if (myNum == 1) {
                changingText.setText("ROCK");
            }
            Toast.makeText(MainActivity.this, "YOU WON", Toast.LENGTH_SHORT).show();
        }
        if (myNum == 3 && i == 1) {
            if (myNum == 3) {
                changingText.setText("SCISSOR");
            }
            Toast.makeText(MainActivity.this, "YOU WON", Toast.LENGTH_SHORT).show();
        }
        if (myNum == 2 && i == 3) {
            if (myNum == 2) {
                changingText.setText("PAPER");
            }
            Toast.makeText(MainActivity.this, "YOU WON", Toast.LENGTH_SHORT).show();
        }
        if (myNum == 1 && i == 3) {
            if (myNum == 1) {
                changingText.setText("ROCK");
            }
            Toast.makeText(MainActivity.this, "VOLDEMORT WON", Toast.LENGTH_SHORT).show();
        }
        if (myNum == 2 && i == 1) {
            if (myNum == 2) {
                changingText.setText("PAPER");
            }
            Toast.makeText(MainActivity.this, "VOLDEMORT WON", Toast.LENGTH_SHORT).show();
        }
        if (myNum == 3 && i == 2) {
            if (myNum == 3) {
                changingText.setText("SCISSOR");
            }
            Toast.makeText(MainActivity.this, "VOLDEMORT WON", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rock();
        paper();
        scissor();
    }
}
