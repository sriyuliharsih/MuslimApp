package koding.web.muslimapp;

import android.content.Context;
import android.os.AsyncTask;
import android.view.View;
import android.widget.ProgressBar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class ClientAsyncTaskHalal extends AsyncTask<Void, Void, String> {
    private final int CONNECTION_TIMOUT_MILLISECONDS = 60000;
    private OnPostExecuteListener mPostExecuteListener = null;
    private Context context;
    private ProgressBar progressBar;

    public String base_api_url = "http://api.agusadiyanto.net/halal/";
    public String api = "";

    public static interface OnPostExecuteListener{
        void onPostExecute(String result);
    }

    public void setmProgress(ProgressBar mProgress){
        this.progressBar = mProgress;
    }

    public ClientAsyncTaskHalal(Context mContext, String api_url, OnPostExecuteListener mPostExecuteListener){
        this.mPostExecuteListener = mPostExecuteListener;
        this.context = mContext;
        this.api = api_url;
    }

    @Override
    protected void onPostExecute(String result){
        super.onPostExecute(result);
        if (mPostExecuteListener != null){
            mPostExecuteListener.onPostExecute(result);
            if (progressBar != null){
                progressBar.setVisibility(View.GONE);
            }
        }
    }

    @Override
    protected String doInBackground(Void... voids) {
        String api_url = base_api_url + api;
        HttpURLConnection urlConnection = null;
        try {
            URL url = new URL(api_url);
            urlConnection = (HttpURLConnection)url.openConnection();
            urlConnection.setConnectTimeout(CONNECTION_TIMOUT_MILLISECONDS);
            urlConnection.setReadTimeout(CONNECTION_TIMOUT_MILLISECONDS);
            String inString = streamToString(urlConnection.getInputStream());
            return inString;
        }catch (MalformedURLException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            urlConnection.disconnect();
        }
        return null;
    }

    private String streamToString(InputStream inputStream){
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String line, result = "";
        try {
            do {
                line = bufferedReader.readLine();
                if (line != null){
                    result += line;
                }
            }while (line != null);
        }catch (IOException e){
            e.printStackTrace();
        }
        return result;
    }
}
