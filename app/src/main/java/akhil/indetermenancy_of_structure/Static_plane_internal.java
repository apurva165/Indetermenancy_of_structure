package akhil.indetermenancy_of_structure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Context;
import android.view.View.OnClickListener;
import java.text.DecimalFormat;

public class Static_plane_internal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_static_plane_internal);
        addListenerOnButton();
    }
    private void addListenerOnButton() {
        final Context context = this;

        final Button back_to  = (Button)findViewById(R.id.staticPlaneInternalButton);
        back_to.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, Pin_joint_activity.class);
                startActivity(intent);
            }
        });

        final EditText Mvalue = (EditText) findViewById(R.id.valueOfM);
        final EditText Jvalue = (EditText) findViewById(R.id.valueOfJ);
        final EditText finalResult = (EditText) findViewById(R.id.staticPlaneInternalResult);

        final Button Submit  = (Button)findViewById(R.id.statcPlaneInternalResult);

        Submit.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {

                String str = Mvalue.getText().toString();
                String str1 = Jvalue.getText().toString();
                double M = Double.parseDouble(str);
                double J = Double.parseDouble(str1);
                final double res = M - ((2*J) - 3);
                //final String result = form.format(res).toString();
                finalResult.setText(String.valueOf(res));
            }
        });

    }


}
