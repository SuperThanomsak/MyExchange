package jcn.dyndns.org.myexchange.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import org.json.JSONArray;
import org.json.JSONObject;

import java.text.Format;

import jcn.dyndns.org.myexchange.R;
import jcn.dyndns.org.myexchange.utility.MyAlert;
import jcn.dyndns.org.myexchange.utility.MyGetRateFromAPI;

/**
 * Created by Thanomsak-NB on 06/01/2561.
 */

public class MainFragment extends Fragment{

    // Explicit
    private double fatorADouble =33.00; // Constance Rate USD --> TH
    private String dateString;


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        Update Factor
        updateFactor();


        // Exchange Controller
        exchangeController();



    } //main Method

    private void updateFactor() {

        String tag = "7JanV1";
        String urlJson = "https://api.fixer.io/latest?symbols=THB&base=USD";

        try {

            MyGetRateFromAPI myGetRateFromAPI = new MyGetRateFromAPI(getActivity());
            myGetRateFromAPI.execute(urlJson);
            String jsonString = myGetRateFromAPI.get();
            jsonString = "[" + jsonString + "]";


            Log.d(tag, " JSON -->"+jsonString);

            JSONArray jsonArray = new JSONArray(jsonString);
            JSONObject jsonObject = jsonArray.getJSONObject(0);

            dateString = jsonObject.getString("date");
            Log.d(tag, "date --> " + dateString);

            String rateString = jsonObject.getString("rates");
            rateString = "[" + rateString + "]";
            Log.d(tag, "rateString -->" + rateString);

            JSONArray jsonArray1 = new JSONArray(rateString);
            JSONObject jsonObject1 =jsonArray1.getJSONObject(0);
            String factorStrin = jsonObject1.getString("THB");
            Log.d(tag, "factor => " + factorStrin);

            fatorADouble = Double.parseDouble(factorStrin);







        } catch (Exception e){
            e.printStackTrace();
        }

    }// update Factor

    private void exchangeController() {
        Button button = getView().findViewById(R.id.btnExchange);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                initial view
             EditText editText = getView().findViewById(R.id.edtMoney);
             String moneyString  = editText.getText().toString().trim();
                if (moneyString.isEmpty()) {
//                    Have SpaceHave
                    MyAlert myAlert = new MyAlert(getActivity());
                    myAlert.normalDialog("Error", " ต้องไม่มีข่องว่าง ");

                } else {
//                    No Space
                    double moneyAdouble = Double.parseDouble(moneyString);
                    double answerAdouble = moneyAdouble / fatorADouble;
// Conver กลับไปเป็น String
                    String myAnswerString = String.format(moneyString,"%,.2f", answerAdouble);

                    String answerString = "Your Dolla--->"+ myAnswerString + " USD";

                    MyAlert myAlert = new MyAlert(getActivity());
                    myAlert.normalDialog("Thai bath "+moneyString+" THB",answerString);


                } // if




            } // onClick
        });
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragement_main,container,false);
        return view;
    }

}// Main Class
