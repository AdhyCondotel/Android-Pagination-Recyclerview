package com.suleiman.pagination.api;

import com.suleiman.pagination.models.ResponseGetList;

import retrofit2.http.GET;
import retrofit2.http.Path;
import io.reactivex.Observable;

public interface RequestAPI {
        //get data channel
    @GET("/{token_refresh}/m/listacaratv1/p/{page}")
    Observable<ResponseGetList> getListData(@Path("token_refresh") String TokenDevice,
                                            @Path("page") int pagination);
}
