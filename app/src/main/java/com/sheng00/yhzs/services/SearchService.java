package com.sheng00.yhzs.services;

import android.content.Context;

import com.sheng00.yhzs.models.SearchResult;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by UC206612 on 2017/1/20.
 */

public class SearchService {

    private Context mContext;

    public SearchService(Context context){
        mContext = context;
    }

    public void test(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://tjyh.sheng00.com")///api/checkcode/李刚
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ISearchService service = retrofit.create(ISearchService.class);
        Call<List<SearchResult>> result = service.search("checkcode","李刚");
        System.out.println(result);

    }

}


interface ISearchService{
    @GET("api/{city}/{code}")
    Call<List<SearchResult>> search(@Path("city") String city,@Path("code") String code);
}
