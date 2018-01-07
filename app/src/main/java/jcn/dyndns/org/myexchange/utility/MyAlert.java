package jcn.dyndns.org.myexchange.utility;

import android.content.Context;
import android.support.v7.app.AlertDialog;

/**
 * Created by Thanomsak-NB on 07/01/2561.
 */

public class MyAlert{
    //    Explicit
    private Context context;

    public MyAlert(Context context) {
        this.context = context;

    }


    public  void normalDialog(String titleString, String messageString) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setCancelable(false);

    }

}   // Main Class
