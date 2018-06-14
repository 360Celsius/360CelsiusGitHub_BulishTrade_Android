package celsius.a360.com.bulishtrade.jasonparser;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import celsius.a360.com.bulishtrade.datamodels.DataModelGainers;
import celsius.a360.com.bulishtrade.datamodels.DataModelLosers;
import celsius.a360.com.bulishtrade.datamodels.DataMotelTops;
import celsius.a360.com.bulishtrade.datamodels.DataModelMostActive;

public class JsonParser {

    public JsonParser() {

    }

    public ArrayList<DataMotelTops> getTopMarketsDataModelFromJson(String apiRequestResponce){

        JSONObject reader = null;
        JSONObject statusJSONObject = null;
        ArrayList<DataMotelTops> dataMotelTopMarketsList = new ArrayList<>();

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

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }


        return dataMotelMostActiveList;

    }


    public ArrayList<DataMotelTops> getTopsDataModelFromJson(String apiRequestResponce){

        JSONArray reader = null;
        ArrayList<DataMotelTops> dataMotelTopsList = new ArrayList<>();

        try {
            reader = new JSONArray(apiRequestResponce);
            for (int i=0;i<reader.length();i++){
                JSONObject jsonObject = reader.getJSONObject(i);
                DataMotelTops dataModelTops = new DataMotelTops();

                dataModelTops.setSymbol(String.valueOf(jsonObject.get("symbol")));
                dataModelTops.setCompanyName(String.valueOf(jsonObject.get("companyName")));
                dataModelTops.setPrimaryExchange(String.valueOf(jsonObject.get("primaryExchange")));
                dataModelTops.setSector(String.valueOf(jsonObject.get("sector")));
                dataModelTops.setCalculationPrice(String.valueOf(jsonObject.get("calculationPrice")));
                dataModelTops.setOpen(String.valueOf(jsonObject.get("open")));
                dataModelTops.setOpenTime(String.valueOf(jsonObject.get("openTime")));
                dataModelTops.setClose(String.valueOf(jsonObject.get("close")));
                dataModelTops.setCloseTime(String.valueOf(jsonObject.get("closeTime")));
                dataModelTops.setHigh(String.valueOf(jsonObject.get("high")));
                dataModelTops.setLow(String.valueOf(jsonObject.get("low")));
                dataModelTops.setLatestPrice(String.valueOf(jsonObject.get("latestPrice")));
                dataModelTops.setLatestSource(String.valueOf(jsonObject.get("latestSource")));
                dataModelTops.setLatestTime(String.valueOf(jsonObject.get("latestTime")));
                dataModelTops.setLatestUpdate(String.valueOf(jsonObject.get("latestUpdate")));
                dataModelTops.setLatestVolume(String.valueOf(jsonObject.get("latestVolume")));
                dataModelTops.setIexRealtimePrice(String.valueOf(jsonObject.get("iexRealtimePrice")));
                dataModelTops.setIexRealtimeSize(String.valueOf(jsonObject.get("iexRealtimeSize")));
                dataModelTops.setIexLastUpdated(String.valueOf(jsonObject.get("iexLastUpdated")));
                dataModelTops.setDelayedPrice(String.valueOf(jsonObject.get("delayedPrice")));
                dataModelTops.setDelayedPriceTime(String.valueOf(jsonObject.get("delayedPriceTime")));
                dataModelTops.setExtendedPrice(String.valueOf(jsonObject.get("extendedPrice")));
                dataModelTops.setExtendedChange(String.valueOf(jsonObject.get("extendedChange")));
                dataModelTops.setExtendedChangePercent(String.valueOf(jsonObject.get("extendedChangePercent")));
                dataModelTops.setExtendedPriceTime(String.valueOf(jsonObject.get("extendedPriceTime")));
                dataModelTops.setPreviousClose(String.valueOf(jsonObject.get("previousClose")));
                dataModelTops.setChange(String.valueOf(jsonObject.get("change")));
                dataModelTops.setChangePercent(String.valueOf(jsonObject.get("changePercent")));
                dataModelTops.setIexMarketPercent(String.valueOf(jsonObject.get("iexMarketPercent")));
                dataModelTops.setIexVolume(String.valueOf(jsonObject.get("iexVolume")));
                dataModelTops.setAvgTotalVolume(String.valueOf(jsonObject.get("avgTotalVolume")));
                dataModelTops.setIexBidPrice(String.valueOf(jsonObject.get("iexBidPrice")));
                dataModelTops.setIexBidSize(String.valueOf(jsonObject.get("iexBidSize")));
                dataModelTops.setIexAskPrice(String.valueOf(jsonObject.get("iexAskPrice")));
                dataModelTops.setIexAskSize(String.valueOf(jsonObject.get("iexAskSize")));
                dataModelTops.setMarketCap(String.valueOf(jsonObject.get("marketCap")));
                dataModelTops.setPeRatio(String.valueOf(jsonObject.get("peRatio")));
                dataModelTops.setWeek52High(String.valueOf(jsonObject.get("week52High")));
                dataModelTops.setWeek52Low(String.valueOf(jsonObject.get("week52Low")));
                dataModelTops.setYtdChange(String.valueOf(jsonObject.get("ytdChange")));

                dataMotelTopsList.add(dataModelTops);

            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }


        return dataMotelTopsList;

    }


    public ArrayList<DataModelGainers> getGainersDataModelFromJson(String apiRequestResponce){

        JSONArray reader = null;
        ArrayList<DataModelGainers> dataMotelGainersList = new ArrayList<>();

        try {
            reader = new JSONArray(apiRequestResponce);
            for (int i=0;i<reader.length();i++){
                JSONObject jsonObject = reader.getJSONObject(i);
                DataModelGainers dataModelGainers = new DataModelGainers();

                dataModelGainers.setSymbol(String.valueOf(jsonObject.get("symbol")));
                dataModelGainers.setCompanyName(String.valueOf(jsonObject.get("companyName")));
                dataModelGainers.setPrimaryExchange(String.valueOf(jsonObject.get("primaryExchange")));
                dataModelGainers.setSector(String.valueOf(jsonObject.get("sector")));
                dataModelGainers.setCalculationPrice(String.valueOf(jsonObject.get("calculationPrice")));
                dataModelGainers.setOpen(String.valueOf(jsonObject.get("open")));
                dataModelGainers.setOpenTime(String.valueOf(jsonObject.get("openTime")));
                dataModelGainers.setClose(String.valueOf(jsonObject.get("close")));
                dataModelGainers.setCloseTime(String.valueOf(jsonObject.get("closeTime")));
                dataModelGainers.setHigh(String.valueOf(jsonObject.get("high")));
                dataModelGainers.setLow(String.valueOf(jsonObject.get("low")));
                dataModelGainers.setLatestPrice(String.valueOf(jsonObject.get("latestPrice")));
                dataModelGainers.setLatestSource(String.valueOf(jsonObject.get("latestSource")));
                dataModelGainers.setLatestTime(String.valueOf(jsonObject.get("latestTime")));
                dataModelGainers.setLatestUpdate(String.valueOf(jsonObject.get("latestUpdate")));
                dataModelGainers.setLatestVolume(String.valueOf(jsonObject.get("latestVolume")));
                dataModelGainers.setIexRealtimePrice(String.valueOf(jsonObject.get("iexRealtimePrice")));
                dataModelGainers.setIexRealtimeSize(String.valueOf(jsonObject.get("iexRealtimeSize")));
                dataModelGainers.setIexLastUpdated(String.valueOf(jsonObject.get("iexLastUpdated")));
                dataModelGainers.setDelayedPrice(String.valueOf(jsonObject.get("delayedPrice")));
                dataModelGainers.setDelayedPriceTime(String.valueOf(jsonObject.get("delayedPriceTime")));
                dataModelGainers.setExtendedPrice(String.valueOf(jsonObject.get("extendedPrice")));
                dataModelGainers.setExtendedChange(String.valueOf(jsonObject.get("extendedChange")));
                dataModelGainers.setExtendedChangePercent(String.valueOf(jsonObject.get("extendedChangePercent")));
                dataModelGainers.setExtendedPriceTime(String.valueOf(jsonObject.get("extendedPriceTime")));
                dataModelGainers.setPreviousClose(String.valueOf(jsonObject.get("previousClose")));
                dataModelGainers.setChange(String.valueOf(jsonObject.get("change")));
                dataModelGainers.setChangePercent(String.valueOf(jsonObject.get("changePercent")));
                dataModelGainers.setIexMarketPercent(String.valueOf(jsonObject.get("iexMarketPercent")));
                dataModelGainers.setIexVolume(String.valueOf(jsonObject.get("iexVolume")));
                dataModelGainers.setAvgTotalVolume(String.valueOf(jsonObject.get("avgTotalVolume")));
                dataModelGainers.setIexBidPrice(String.valueOf(jsonObject.get("iexBidPrice")));
                dataModelGainers.setIexBidSize(String.valueOf(jsonObject.get("iexBidSize")));
                dataModelGainers.setIexAskPrice(String.valueOf(jsonObject.get("iexAskPrice")));
                dataModelGainers.setIexAskSize(String.valueOf(jsonObject.get("iexAskSize")));
                dataModelGainers.setMarketCap(String.valueOf(jsonObject.get("marketCap")));
                dataModelGainers.setPeRatio(String.valueOf(jsonObject.get("peRatio")));
                dataModelGainers.setWeek52High(String.valueOf(jsonObject.get("week52High")));
                dataModelGainers.setWeek52Low(String.valueOf(jsonObject.get("week52Low")));
                dataModelGainers.setYtdChange(String.valueOf(jsonObject.get("ytdChange")));

                dataMotelGainersList.add(dataModelGainers);

            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }


        return dataMotelGainersList;

    }

    public ArrayList<DataModelLosers> getLosersDataModelFromJson(String apiRequestResponce){

        JSONArray reader = null;
        ArrayList<DataModelLosers> dataMotelLosersList = new ArrayList<>();

        try {
            reader = new JSONArray(apiRequestResponce);
            for (int i=0;i<reader.length();i++){
                JSONObject jsonObject = reader.getJSONObject(i);
                DataModelLosers dataModelLosers = new DataModelLosers();

                dataModelLosers.setSymbol(String.valueOf(jsonObject.get("symbol")));
                dataModelLosers.setCompanyName(String.valueOf(jsonObject.get("companyName")));
                dataModelLosers.setPrimaryExchange(String.valueOf(jsonObject.get("primaryExchange")));
                dataModelLosers.setSector(String.valueOf(jsonObject.get("sector")));
                dataModelLosers.setCalculationPrice(String.valueOf(jsonObject.get("calculationPrice")));
                dataModelLosers.setOpen(String.valueOf(jsonObject.get("open")));
                dataModelLosers.setOpenTime(String.valueOf(jsonObject.get("openTime")));
                dataModelLosers.setClose(String.valueOf(jsonObject.get("close")));
                dataModelLosers.setCloseTime(String.valueOf(jsonObject.get("closeTime")));
                dataModelLosers.setHigh(String.valueOf(jsonObject.get("high")));
                dataModelLosers.setLow(String.valueOf(jsonObject.get("low")));
                dataModelLosers.setLatestPrice(String.valueOf(jsonObject.get("latestPrice")));
                dataModelLosers.setLatestSource(String.valueOf(jsonObject.get("latestSource")));
                dataModelLosers.setLatestTime(String.valueOf(jsonObject.get("latestTime")));
                dataModelLosers.setLatestUpdate(String.valueOf(jsonObject.get("latestUpdate")));
                dataModelLosers.setLatestVolume(String.valueOf(jsonObject.get("latestVolume")));
                dataModelLosers.setIexRealtimePrice(String.valueOf(jsonObject.get("iexRealtimePrice")));
                dataModelLosers.setIexRealtimeSize(String.valueOf(jsonObject.get("iexRealtimeSize")));
                dataModelLosers.setIexLastUpdated(String.valueOf(jsonObject.get("iexLastUpdated")));
                dataModelLosers.setDelayedPrice(String.valueOf(jsonObject.get("delayedPrice")));
                dataModelLosers.setDelayedPriceTime(String.valueOf(jsonObject.get("delayedPriceTime")));
                dataModelLosers.setExtendedPrice(String.valueOf(jsonObject.get("extendedPrice")));
                dataModelLosers.setExtendedChange(String.valueOf(jsonObject.get("extendedChange")));
                dataModelLosers.setExtendedChangePercent(String.valueOf(jsonObject.get("extendedChangePercent")));
                dataModelLosers.setExtendedPriceTime(String.valueOf(jsonObject.get("extendedPriceTime")));
                dataModelLosers.setPreviousClose(String.valueOf(jsonObject.get("previousClose")));
                dataModelLosers.setChange(String.valueOf(jsonObject.get("change")));
                dataModelLosers.setChangePercent(String.valueOf(jsonObject.get("changePercent")));
                dataModelLosers.setIexMarketPercent(String.valueOf(jsonObject.get("iexMarketPercent")));
                dataModelLosers.setIexVolume(String.valueOf(jsonObject.get("iexVolume")));
                dataModelLosers.setAvgTotalVolume(String.valueOf(jsonObject.get("avgTotalVolume")));
                dataModelLosers.setIexBidPrice(String.valueOf(jsonObject.get("iexBidPrice")));
                dataModelLosers.setIexBidSize(String.valueOf(jsonObject.get("iexBidSize")));
                dataModelLosers.setIexAskPrice(String.valueOf(jsonObject.get("iexAskPrice")));
                dataModelLosers.setIexAskSize(String.valueOf(jsonObject.get("iexAskSize")));
                dataModelLosers.setMarketCap(String.valueOf(jsonObject.get("marketCap")));
                dataModelLosers.setPeRatio(String.valueOf(jsonObject.get("peRatio")));
                dataModelLosers.setWeek52High(String.valueOf(jsonObject.get("week52High")));
                dataModelLosers.setWeek52Low(String.valueOf(jsonObject.get("week52Low")));
                dataModelLosers.setYtdChange(String.valueOf(jsonObject.get("ytdChange")));

                dataMotelLosersList.add(dataModelLosers);

            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }


        return dataMotelLosersList;

    }
}
