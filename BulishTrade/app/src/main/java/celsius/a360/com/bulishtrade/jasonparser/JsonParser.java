package celsius.a360.com.bulishtrade.jasonparser;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import celsius.a360.com.bulishtrade.datamodels.DataMotelTopMarkets;
import celsius.a360.com.bulishtrade.datamodels.DataModelMostActive;

public class JsonParser {

    public JsonParser() {

    }

    public ArrayList<DataMotelTopMarkets> getTopMarketsDataModelFromJson(String apiRequestResponce){

        JSONObject reader = null;
        JSONObject statusJSONObject = null;
        ArrayList<DataMotelTopMarkets> dataMotelTopMarketsList = new ArrayList<>();

        try {
            reader = new JSONObject(apiRequestResponce);

        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }


        return dataMotelTopMarketsList;

    }


    public ArrayList<DataModelMostActive> getMostActiveDataModelFromJson(String apiRequestResponce){

        JSONArray reader = null;
        ArrayList<DataModelMostActive> dataMotelMostActiveList = new ArrayList<>();

        try {
            reader = new JSONArray(apiRequestResponce);
            for (int i=0;i<reader.length();i++){
                JSONObject jsonObject = reader.getJSONObject(i);
                DataModelMostActive dataModelMostActive = new DataModelMostActive();

                dataModelMostActive.setSymbol(String.valueOf(jsonObject.get("symbol")));
                dataModelMostActive.setCompanyName(String.valueOf(jsonObject.get("companyName")));
                dataModelMostActive.setPrimaryExchange(String.valueOf(jsonObject.get("primaryExchange")));
                dataModelMostActive.setSector(String.valueOf(jsonObject.get("sector")));
                dataModelMostActive.setCalculationPrice(String.valueOf(jsonObject.get("calculationPrice")));
                dataModelMostActive.setOpen(String.valueOf(jsonObject.get("open")));
                dataModelMostActive.setOpenTime(String.valueOf(jsonObject.get("openTime")));
                dataModelMostActive.setClose(String.valueOf(jsonObject.get("close")));
                dataModelMostActive.setCloseTime(String.valueOf(jsonObject.get("closeTime")));
                dataModelMostActive.setHigh(String.valueOf(jsonObject.get("high")));
                dataModelMostActive.setLow(String.valueOf(jsonObject.get("low")));
                dataModelMostActive.setLatestPrice(String.valueOf(jsonObject.get("latestPrice")));
                dataModelMostActive.setLatestSource(String.valueOf(jsonObject.get("latestSource")));
                dataModelMostActive.setLatestTime(String.valueOf(jsonObject.get("latestTime")));
                dataModelMostActive.setLatestUpdate(String.valueOf(jsonObject.get("latestUpdate")));
                dataModelMostActive.setLatestVolume(String.valueOf(jsonObject.get("latestVolume")));
                dataModelMostActive.setIexRealtimePrice(String.valueOf(jsonObject.get("iexRealtimePrice")));
                dataModelMostActive.setIexRealtimeSize(String.valueOf(jsonObject.get("iexRealtimeSize")));
                dataModelMostActive.setIexLastUpdated(String.valueOf(jsonObject.get("iexLastUpdated")));
                dataModelMostActive.setDelayedPrice(String.valueOf(jsonObject.get("delayedPrice")));
                dataModelMostActive.setDelayedPriceTime(String.valueOf(jsonObject.get("delayedPriceTime")));
                dataModelMostActive.setExtendedPrice(String.valueOf(jsonObject.get("extendedPrice")));
                dataModelMostActive.setExtendedChange(String.valueOf(jsonObject.get("extendedChange")));
                dataModelMostActive.setExtendedChangePercent(String.valueOf(jsonObject.get("extendedChangePercent")));
                dataModelMostActive.setExtendedPriceTime(String.valueOf(jsonObject.get("extendedPriceTime")));
                dataModelMostActive.setPreviousClose(String.valueOf(jsonObject.get("previousClose")));
                dataModelMostActive.setChange(String.valueOf(jsonObject.get("change")));
                dataModelMostActive.setChangePercent(String.valueOf(jsonObject.get("changePercent")));
                dataModelMostActive.setIexMarketPercent(String.valueOf(jsonObject.get("iexMarketPercent")));
                dataModelMostActive.setIexVolume(String.valueOf(jsonObject.get("iexVolume")));
                dataModelMostActive.setAvgTotalVolume(String.valueOf(jsonObject.get("avgTotalVolume")));
                dataModelMostActive.setIexBidPrice(String.valueOf(jsonObject.get("iexBidPrice")));
                dataModelMostActive.setIexBidSize(String.valueOf(jsonObject.get("iexBidSize")));
                dataModelMostActive.setIexAskPrice(String.valueOf(jsonObject.get("iexAskPrice")));
                dataModelMostActive.setIexAskSize(String.valueOf(jsonObject.get("iexAskSize")));
                dataModelMostActive.setMarketCap(String.valueOf(jsonObject.get("marketCap")));
                dataModelMostActive.setPeRatio(String.valueOf(jsonObject.get("peRatio")));
                dataModelMostActive.setWeek52High(String.valueOf(jsonObject.get("week52High")));
                dataModelMostActive.setWeek52Low(String.valueOf(jsonObject.get("week52Low")));
                dataModelMostActive.setYtdChange(String.valueOf(jsonObject.get("ytdChange")));

                dataMotelMostActiveList.add(dataModelMostActive);

            }

        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }


        return dataMotelMostActiveList;

    }

}
