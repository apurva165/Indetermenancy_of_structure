package akhil.indetermenancy_of_structure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    private void addListenerOnButton() {
        final Context context = this;

        final Button static_ind = (Button)findViewById(R.id.button1);
        final Button kinematic_ind = (Button)findViewById(R.id.button2);
        static_ind.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, Static_activity.class);
                startActivity(intent);
            }
        });
        kinematic_ind.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, Kinematic_activity.class);
                startActivity(intent);
            }
        });
    }

}
