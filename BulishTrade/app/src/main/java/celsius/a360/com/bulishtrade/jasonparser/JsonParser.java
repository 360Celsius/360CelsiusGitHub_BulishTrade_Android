package celsius.a360.com.bulishtrade.jasonparser;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

import celsius.a360.com.bulishtrade.datamodels.QuoteDataModel;

public class JsonParser {

    public JsonParser() {

    }


    public ArrayList<QuoteDataModel> getMostActiveDataModelFromJson(String apiRequestResponce){

        JSONArray reader = null;
        ArrayList<QuoteDataModel> dataMotelMostActiveList = new ArrayList<>();

        try {
            reader = new JSONArray(apiRequestResponce);
            for (int i=0;i<reader.length();i++){
                JSONObject jsonObject = reader.getJSONObject(i);
                QuoteDataModel dataModelMostActive = new QuoteDataModel();

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


    public ArrayList<QuoteDataModel> getTopsDataModelFromJson(String apiRequestResponce){

        JSONArray reader = null;
        ArrayList<QuoteDataModel> dataMotelTopsList = new ArrayList<>();

        try {
            reader = new JSONArray(apiRequestResponce);
            for (int i=0;i<reader.length();i++){
                JSONObject jsonObject = reader.getJSONObject(i);
                QuoteDataModel dataModelTops = new QuoteDataModel();

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


    public ArrayList<QuoteDataModel> getGainersDataModelFromJson(String apiRequestResponce){

        JSONArray reader = null;
        ArrayList<QuoteDataModel> dataMotelGainersList = new ArrayList<>();

        try {
            reader = new JSONArray(apiRequestResponce);
            for (int i=0;i<reader.length();i++){
                JSONObject jsonObject = reader.getJSONObject(i);
                QuoteDataModel quoteDataModel = new QuoteDataModel();

                quoteDataModel.setSymbol(String.valueOf(jsonObject.get("symbol")));
                quoteDataModel.setCompanyName(String.valueOf(jsonObject.get("companyName")));
                quoteDataModel.setPrimaryExchange(String.valueOf(jsonObject.get("primaryExchange")));
                quoteDataModel.setSector(String.valueOf(jsonObject.get("sector")));
                quoteDataModel.setCalculationPrice(String.valueOf(jsonObject.get("calculationPrice")));
                quoteDataModel.setOpen(String.valueOf(jsonObject.get("open")));
                quoteDataModel.setOpenTime(String.valueOf(jsonObject.get("openTime")));
                quoteDataModel.setClose(String.valueOf(jsonObject.get("close")));
                quoteDataModel.setCloseTime(String.valueOf(jsonObject.get("closeTime")));
                quoteDataModel.setHigh(String.valueOf(jsonObject.get("high")));
                quoteDataModel.setLow(String.valueOf(jsonObject.get("low")));
                quoteDataModel.setLatestPrice(String.valueOf(jsonObject.get("latestPrice")));
                quoteDataModel.setLatestSource(String.valueOf(jsonObject.get("latestSource")));
                quoteDataModel.setLatestTime(String.valueOf(jsonObject.get("latestTime")));
                quoteDataModel.setLatestUpdate(String.valueOf(jsonObject.get("latestUpdate")));
                quoteDataModel.setLatestVolume(String.valueOf(jsonObject.get("latestVolume")));
                quoteDataModel.setIexRealtimePrice(String.valueOf(jsonObject.get("iexRealtimePrice")));
                quoteDataModel.setIexRealtimeSize(String.valueOf(jsonObject.get("iexRealtimeSize")));
                quoteDataModel.setIexLastUpdated(String.valueOf(jsonObject.get("iexLastUpdated")));
                quoteDataModel.setDelayedPrice(String.valueOf(jsonObject.get("delayedPrice")));
                quoteDataModel.setDelayedPriceTime(String.valueOf(jsonObject.get("delayedPriceTime")));
                quoteDataModel.setExtendedPrice(String.valueOf(jsonObject.get("extendedPrice")));
                quoteDataModel.setExtendedChange(String.valueOf(jsonObject.get("extendedChange")));
                quoteDataModel.setExtendedChangePercent(String.valueOf(jsonObject.get("extendedChangePercent")));
                quoteDataModel.setExtendedPriceTime(String.valueOf(jsonObject.get("extendedPriceTime")));
                quoteDataModel.setPreviousClose(String.valueOf(jsonObject.get("previousClose")));
                quoteDataModel.setChange(String.valueOf(jsonObject.get("change")));
                quoteDataModel.setChangePercent(String.valueOf(jsonObject.get("changePercent")));
                quoteDataModel.setIexMarketPercent(String.valueOf(jsonObject.get("iexMarketPercent")));
                quoteDataModel.setIexVolume(String.valueOf(jsonObject.get("iexVolume")));
                quoteDataModel.setAvgTotalVolume(String.valueOf(jsonObject.get("avgTotalVolume")));
                quoteDataModel.setIexBidPrice(String.valueOf(jsonObject.get("iexBidPrice")));
                quoteDataModel.setIexBidSize(String.valueOf(jsonObject.get("iexBidSize")));
                quoteDataModel.setIexAskPrice(String.valueOf(jsonObject.get("iexAskPrice")));
                quoteDataModel.setIexAskSize(String.valueOf(jsonObject.get("iexAskSize")));
                quoteDataModel.setMarketCap(String.valueOf(jsonObject.get("marketCap")));
                quoteDataModel.setPeRatio(String.valueOf(jsonObject.get("peRatio")));
                quoteDataModel.setWeek52High(String.valueOf(jsonObject.get("week52High")));
                quoteDataModel.setWeek52Low(String.valueOf(jsonObject.get("week52Low")));
                quoteDataModel.setYtdChange(String.valueOf(jsonObject.get("ytdChange")));

                dataMotelGainersList.add(quoteDataModel);

            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }


        return dataMotelGainersList;

    }

    public ArrayList<QuoteDataModel> getLosersDataModelFromJson(String apiRequestResponce){

        JSONArray reader = null;
        ArrayList<QuoteDataModel> dataMotelLosersList = new ArrayList<>();

        try {
            reader = new JSONArray(apiRequestResponce);
            for (int i=0;i<reader.length();i++){
                JSONObject jsonObject = reader.getJSONObject(i);
                QuoteDataModel dataModelLosers = new QuoteDataModel();

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
