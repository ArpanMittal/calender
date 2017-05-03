package com.example.android.calender.apiclient;

import com.example.android.calender.AsynchronousActivity;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by Raquib-ul-Alam Kanak on 1/3/16.
 * Website: http://alamkanak.github.io
 */
public interface MyJsonService {

    @GET("/1kpjf")
    void listEvents(AsynchronousActivity eventsCallback);

}
