package com.suleiman.pagination;

import android.util.Log;

import com.suleiman.pagination.api.NetworkClient;
import com.suleiman.pagination.api.RequestAPI;
import com.suleiman.pagination.models.ResponseGetList;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;

import static android.content.ContentValues.TAG;

public class chaPresenter {
    private chaView view;
    private CompositeDisposable mCompositeDisposable;

    public chaPresenter(chaView view) {
        this.view = view;
    }

    public void getData(String Refresh, int currentPage) {
        RequestAPI requestAPI = NetworkClient.getRetrofit().create(RequestAPI.class);
        if (mCompositeDisposable == null) mCompositeDisposable = new CompositeDisposable();
        mCompositeDisposable.add(requestAPI.getListData(Refresh, currentPage)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(
                        responseAuth -> combineSuccessObserver(responseAuth),
                        throwable -> combineErrorObserverToken(throwable)
                )
        );
    }

    private void combineSuccessObserver(ResponseGetList responseAuth) {
        view.handleSuccess(responseAuth);
        Log.d("Presenter Success ", responseAuth.getMessage().toString());
    }

    private void combineErrorObserverToken(Throwable throwable) {
        view.handleError(throwable);
        Log.d("Presenter Error ", throwable.getMessage().toString());
    }
}
