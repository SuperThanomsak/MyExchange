package jcn.dyndns.org.myexchange.utility;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

/**
 * Created by Thanomsak-NB on 07/01/2561.
 */



public class MyGetRateFromAPI extends AsyncTask<String,Void,String>{

    private Context context;

    public MyGetRateFromAPI(Context context) {
        this.context = context;



    } // MyGetRate

    @Override
    protected String doInBackground(String... strings) {
        try {

            OkHttpClient okHttpClient = new OkHttpClient();
            Request.Builder builder = new Request.Builder();
            Request request = builder.url(strings[0]).build();
            Response response = okHttpClient.newCall(request).execute();
            return response.body().string();

        } catch (Exception e) {
            Log.d("7JanV1", "e=" + e.toString());
            return null;
        }
    }

} // Main Class
