package com.example.kalma.tictactoe;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Vibrator;

public class MainActivity extends AppCompatActivity {
    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnReset;
    private String sign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnReset = (Button) findViewById(R.id.btnReset);
        sign = "X";
        btn1.setBackgroundColor(0);
        btn2.setBackgroundColor(-7829368);
        btn3.setBackgroundColor(0);
        btn4.setBackgroundColor(-7829368);
        btn5.setBackgroundColor(0);
        btn6.setBackgroundColor(-7829368);
        btn7.setBackgroundColor(0);
        btn8.setBackgroundColor(-7829368);
        btn9.setBackgroundColor(0);
    }

    public void clickbtn1(View view) {
        if (btn1.getText().toString().equals(""))
            if (sign.equals("X")) {
                btn1.setText("X");
                sign = "O";
            } else if (sign.equals("O")) {
                btn1.setText("O");
                sign = "X";
            }
        win();
    }

    public void clickbtn2(View view) {
        if (btn2.getText().toString().equals(""))
            if (sign.equals("X")) {
                btn2.setText("X");
                sign = "O";
            } else if (sign.equals("O")) {
                btn2.setText("O");
                sign = "X";
            }
        win();
    }

    public void clickbtn3(View view) {
        if (btn3.getText().toString().equals(""))
            if (sign.equals("X")) {
                btn3.setText("X");
                sign = "O";
            } else if (sign.equals("O")) {
                btn3.setText("O");
                sign = "X";
            }
        win();
    }

    public void clickbtn4(View view) {
        if (btn4.getText().toString().equals(""))
            if (sign.equals("X")) {
                btn4.setText("X");
                sign = "O";
            } else if (sign.equals("O")) {
                btn4.setText("O");
                sign = "X";
            }
        win();
    }

    public void clickbtn5(View view) {
        if (btn5.getText().toString().equals(""))
            if (sign.equals("X")) {
                btn5.setText("X");
                sign = "O";
            } else if (sign.equals("O")) {
                btn5.setText("O");
                sign = "X";
            }
        win();
    }

    public void clickbtn6(View view) {
        if (btn6.getText().toString().equals(""))
            if (sign.equals("X")) {
                btn6.setText("X");
                sign = "O";
            } else if (sign.equals("O")) {
                btn6.setText("O");
                sign = "X";
            }
        win();
    }

    public void clickbtn7(View view) {
        if (btn7.getText().toString().equals(""))
            if (sign.equals("X")) {
                btn7.setText("X");
                sign = "O";
            } else if (sign.equals("O")) {
                btn7.setText("O");
                sign = "X";
            }
        win();
    }

    public void clickbtn8(View view) {
        if (btn8.getText().toString().equals(""))
            if (sign.equals("X")) {
                btn8.setText("X");
                sign = "O";
            } else if (sign.equals("O")) {
                btn8.setText("O");
                sign = "X";
            }
        win();
    }

    public void clickbtn9(View view) {
        if (btn9.getText().toString().equals(""))
            if (sign.equals("X")) {
                btn9.setText("X");
                sign = "O";
            } else if (sign.equals("O")) {
                btn9.setText("O");
                sign = "X";
            }
            win();
    }
    public void vibrate(int duration) {
        Vibrator vibs = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibs.vibrate(duration);
    }
    public void win() {
        boolean bool = true;
        String b1, b2, b3, b4, b5, b6, b7, b8, b9;
        b1 = btn1.getText().toString();
        b2 = btn2.getText().toString();
        b3 = btn3.getText().toString();
        b4 = btn4.getText().toString();
        b5 = btn5.getText().toString();
        b6 = btn6.getText().toString();
        b7 = btn7.getText().toString();
        b8 = btn8.getText().toString();
        b9 = btn9.getText().toString();

        if(b1.equals("X")&&b2.equals("X")&&b3.equals("X")) {
            Toast.makeText(MainActivity.this, "The Winner Is X", Toast.LENGTH_LONG).show();
            vibrate(500);
            btn1.setBackgroundColor( -16711681 );
            btn2.setBackgroundColor( -16711681 );
            btn3.setBackgroundColor( -16711681 );
        }
        if(b1.equals("O")&&b2.equals("O")&&b3.equals("O")) {
            Toast.makeText(MainActivity.this, "The Winner Is O", Toast.LENGTH_LONG).show();
            vibrate(500);
            btn1.setBackgroundColor( -16711681 );
            btn2.setBackgroundColor( -16711681 );
            btn3.setBackgroundColor( -16711681 );
        }
        if(b1.equals("X")&&b4.equals("X")&&b7.equals("X")) {
            Toast.makeText(MainActivity.this, "The Winner Is X", Toast.LENGTH_LONG).show();
            vibrate(500);
            btn1.setBackgroundColor( -16711681 );
            btn4.setBackgroundColor( -16711681 );
            btn7.setBackgroundColor( -16711681 );
        }
        if(b1.equals("O")&&b4.equals("O")&&b7.equals("O")) {
            Toast.makeText(MainActivity.this, "The Winner Is O", Toast.LENGTH_LONG).show();
            vibrate(500);
            btn1.setBackgroundColor( -16711681 );
            btn4.setBackgroundColor( -16711681 );
            btn7.setBackgroundColor( -16711681 );
        }
        if(b1.equals("X")&&b5.equals("X")&&b9.equals("X")) {
            Toast.makeText(MainActivity.this, "The Winner Is X", Toast.LENGTH_LONG).show();
            vibrate(500);
            btn1.setBackgroundColor( -16711681 );
            btn5.setBackgroundColor( -16711681 );
            btn9.setBackgroundColor( -16711681 );
        }
        if(b1.equals("O")&&b5.equals("O")&&b9.equals("O")) {
            Toast.makeText(MainActivity.this, "The Winner Is O", Toast.LENGTH_LONG).show();
            vibrate(500);
            btn1.setBackgroundColor( -16711681 );
            btn5.setBackgroundColor( -16711681 );
            btn9.setBackgroundColor( -16711681 );
        }
        if(b2.equals("X")&&b5.equals("X")&&b8.equals("X")) {
            Toast.makeText(MainActivity.this, "The Winner Is X", Toast.LENGTH_LONG).show();
            vibrate(500);
            btn2.setBackgroundColor( -16711681 );
            btn5.setBackgroundColor( -16711681 );
            btn8.setBackgroundColor( -16711681 );
        }
        if(b2.equals("O")&&b5.equals("O")&&b8.equals("O")) {
            Toast.makeText(MainActivity.this, "The Winner Is O", Toast.LENGTH_LONG).show();
            vibrate(500);
            btn2.setBackgroundColor( -16711681 );
            btn5.setBackgroundColor( -16711681 );
            btn8.setBackgroundColor( -16711681 );
        }
        if(b3.equals("X")&&b5.equals("X")&&b7.equals("X")) {
            Toast.makeText(MainActivity.this, "The Winner Is X", Toast.LENGTH_LONG).show();
            vibrate(500);
            btn3.setBackgroundColor( -16711681 );
            btn5.setBackgroundColor( -16711681 );
            btn7.setBackgroundColor( -16711681 );
        }
        if(b3.equals("O")&&b5.equals("O")&&b7.equals("O")) {
            Toast.makeText(MainActivity.this, "The Winner Is O", Toast.LENGTH_LONG).show();
            vibrate(500);
            btn3.setBackgroundColor( -16711681 );
            btn5.setBackgroundColor( -16711681 );
            btn7.setBackgroundColor( -16711681 );
        }
        if(b3.equals("X")&&b6.equals("X")&&b9.equals("X")) {
            Toast.makeText(MainActivity.this, "The Winner Is X", Toast.LENGTH_LONG).show();
            vibrate(500);
            btn3.setBackgroundColor( -16711681 );
            btn6.setBackgroundColor( -16711681 );
            btn9.setBackgroundColor( -16711681 );
        }
        if(b3.equals("O")&&b6.equals("O")&&b9.equals("O")) {
            Toast.makeText(MainActivity.this, "The Winner Is O", Toast.LENGTH_LONG).show();
            vibrate(500);
            btn3.setBackgroundColor( -16711681 );
            btn6.setBackgroundColor( -16711681 );
            btn9.setBackgroundColor( -16711681 );
        }
        if(b7.equals("X")&&b8.equals("X")&&b9.equals("X")) {
            Toast.makeText(MainActivity.this, "The Winner Is X", Toast.LENGTH_LONG).show();
            vibrate(500);
            btn7.setBackgroundColor( -16711681 );
            btn8.setBackgroundColor( -16711681 );
            btn9.setBackgroundColor( -16711681 );
        }
        if(b7.equals("O")&&b8.equals("O")&&b9.equals("O")) {
            Toast.makeText(MainActivity.this, "The Winner Is O", Toast.LENGTH_LONG).show();
            vibrate(500);
            btn7.setBackgroundColor( -16711681 );
            btn8.setBackgroundColor( -16711681 );
            btn9.setBackgroundColor( -16711681 );
        }
        if(b4.equals("X")&&b5.equals("X")&&b6.equals("X")) {
            Toast.makeText(MainActivity.this, "The Winner Is X", Toast.LENGTH_LONG).show();
            vibrate(500);
            btn4.setBackgroundColor( -16711681 );
            btn5.setBackgroundColor( -16711681 );
            btn6.setBackgroundColor( -16711681 );
        }
        if(b4.equals("O")&&b5.equals("O")&&b6.equals("O")) {
            Toast.makeText(MainActivity.this, "The Winner Is O", Toast.LENGTH_LONG).show();
            vibrate(500);
            btn4.setBackgroundColor( -16711681 );
            btn5.setBackgroundColor( -16711681 );
            btn6.setBackgroundColor( -16711681 );
        }
        if(b1.equals("")||b2.equals("")||b1.equals("")||b4.equals("")||b5.equals("")||
                b6.equals("")||b7.equals("")||b8.equals("")||b9.equals(""))bool=false;
        if(bool==true)Toast.makeText(MainActivity.this, "No Winners - Draw", Toast.LENGTH_LONG).show();
    }
    public void clickReset(View view) {
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        btn1.setBackgroundColor(0);
        btn2.setBackgroundColor(-7829368);
        btn3.setBackgroundColor(0);
        btn4.setBackgroundColor(-7829368);
        btn5.setBackgroundColor(0);
        btn6.setBackgroundColor(-7829368);
        btn7.setBackgroundColor(0);
        btn8.setBackgroundColor(-7829368);
        btn9.setBackgroundColor(0);
    }
}
