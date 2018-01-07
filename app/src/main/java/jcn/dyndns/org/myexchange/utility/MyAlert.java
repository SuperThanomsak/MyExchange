package jcn.dyndns.org.myexchange.utility;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;

import jcn.dyndns.org.myexchange.R;

/**
 * Created by Thanomsak-NB on 07/01/2561.
 */

public class MyAlert {
    //    Explicit
    private Context context;

    public MyAlert(Context context) {
        this.context = context;

    }


    public void normalDialog(String titleString, String messageString) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setCancelable(false);
        builder.setIcon(R.drawable.ic_action_alert);
        builder.setTitle(titleString);
        builder.setMessage(messageString);
        builder.setPositiveButton("OK Thank", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        builder.show();
    }

}   // Main Class
