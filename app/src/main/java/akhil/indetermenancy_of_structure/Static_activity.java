package akhil.indetermenancy_of_structure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;

public class Static_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_static_activity);
        addListenerOnButton();
    }
    private void addListenerOnButton() {
        final Context context = this;

        final Button backto_static_ind = (Button)findViewById(R.id.button);
        final Button to_hybrid = (Button)findViewById(R.id.button5);
        final Button to_rigid = (Button)findViewById(R.id.button4);
        final Button to_pin_joint = (Button)findViewById(R.id.button3);

        backto_static_ind.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, HomeActivity.class);
                startActivity(intent);
            }
        });
        to_hybrid.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, Hybrid_activity.class);
                startActivity(intent);
            }
        });
        to_rigid.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, Rigid_joint_activity.class);
                startActivity(intent);
            }
        });
        to_pin_joint.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, Pin_joint_activity.class);
                startActivity(intent);
            }
        });
    }
}
