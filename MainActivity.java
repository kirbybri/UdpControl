package udpcontrol.udpcontrol;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendFwdMessage(View view) {
        Thread t = new Thread(new Second("<FWD,1000,0>"));
        t.start();
    }

    public void sendBwdMessage(View view) {
        Thread t = new Thread(new Second("<BWD,1000,0>"));
        t.start();
    }

    public void sendLeftFwdMessage(View view) {
        Thread t = new Thread(new Second("<FWD,1000,1>"));
        t.start();
    }

    public void sendRightFwdMessage(View view) {
        Thread t = new Thread(new Second("<FWD,1000,2>"));
        t.start();
    }

    public void sendSpinMessage(View view) {
        Thread t = new Thread(new Second("<SPIN,1000,0>"));
        t.start();
    }
}