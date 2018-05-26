package celsius.a360.com.bulishtrade.jasonparser;

import org.json.JSONException;
import org.json.JSONObject;

import celsius.a360.com.bulishtrade.datamodels.DataMotelTopMarkets;
import celsius.a360.com.bulishtrade.datamodels.DataModelMostActive;

public class JsonParser {

    public JsonParser() {

    }

    public DataMotelTopMarkets getTopMarketsDataModelFromJson(String apiRequestResponce){

        JSONObject reader = null;
        JSONObject statusJSONObject = null;
        DataMotelTopMarkets dataMotelTopMarkets = new DataMotelTopMarkets();

        try {
            reader = new JSONObject(apiRequestResponce);

        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }


        return dataMotelTopMarkets;

    }


    public DataModelMostActive getMostActiveDataModelFromJson(String apiRequestResponce){

        JSONObject reader = null;
        JSONObject statusJSONObject = null;
        DataModelMostActive dataMotelMOstActive = new DataModelMostActive();

        try {
            reader = new JSONObject(apiRequestResponce);

        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }


        return dataMotelMOstActive;

    }

}
