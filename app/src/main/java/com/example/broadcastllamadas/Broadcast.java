package com.example.broadcastllamadas;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.widget.Toast;

public class Broadcast extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        try {

            String state = intent.getStringExtra(TelephonyManager.EXTRA_STATE);
            if (state.equals(TelephonyManager.EXTRA_STATE_RINGING))
            {
                Toast.makeText(context, "Sonando", Toast.LENGTH_LONG).show();}
        }catch (Exception e){

            Toast.makeText(context, "Error", Toast.LENGTH_SHORT).show();

        }


        // Sacamos información del intent
      /*  Toast.makeText(context, "Onreceive", Toast.LENGTH_SHORT).show();
        String estado = "", numero = "";

        Bundle extras = intent.getExtras();

        if(extras != null) {

            estado = extras.getString(TelephonyManager.EXTRA_STATE);

            if(estado.equals(TelephonyManager.EXTRA_STATE_OFFHOOK)) {

                numero = extras.getString( TelephonyManager.EXTRA_INCOMING_NUMBER);

                Toast.makeText(context, "Contesto", Toast.LENGTH_SHORT).show();
            }

        }

        String info = estado + " "+ numero;

        Toast.makeText(context, info, Toast.LENGTH_SHORT).show();
*/
    }
    }

