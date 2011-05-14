package rru.somchai.sms;

import android.app.Activity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class smsTest extends Activity {
    /** Called when the activity is first created. */
	public static EditText et1,et2;
	Button bt1;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        et1=(EditText)findViewById(R.id.EditText01);
        et2=(EditText)findViewById(R.id.EditText02);
        bt1=(Button)findViewById(R.id.Button01);
        // 1= et1.toString();
       // 2 = String.valueOf(et2);
        // 3 = int i=100;
        // 3 = String j=i+"";
        bt1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			//	sendSMS("0861126627","SOMCHAI");
				sendSMS(et1.getText().toString(),et2.getText().toString());
				Toast t=new Toast(smsTest.this);
				t.setText("Sent Completel");
				t.setDuration(20);
				t.show();
				
			}
        });
    }
          private void sendSMS(String phoneNumber, String message)
        {                 
            SmsManager sms = SmsManager.getDefault();
            sms.sendTextMessage(phoneNumber, null, message,null, null);        
        }
        }
