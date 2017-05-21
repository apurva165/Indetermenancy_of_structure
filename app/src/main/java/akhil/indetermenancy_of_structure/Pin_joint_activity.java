package akhil.indetermenancy_of_structure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;

public class Pin_joint_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pin_joint_activity);
        addListenerOnButton();
    }
    private void addListenerOnButton() {
        final Context context = this;

        final Button back_to  = (Button)findViewById(R.id.button6);
        final Button to_plane_internal = (Button)findViewById(R.id.button7);
        back_to.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, Static_activity.class);
                startActivity(intent);
            }
        });
        to_plane_internal.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, Static_plane_internal.class);
                startActivity(intent);
            }
        });
    }

}
