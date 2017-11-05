package test.bwei.zhoukaolianxi1.shuju.model;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import test.bwei.zhoukaolianxi1.ApiService;
import test.bwei.zhoukaolianxi1.api.Api;
import test.bwei.zhoukaolianxi1.bean.Bean;
import test.bwei.zhoukaolianxi1.shuju.FinishListener;

/**
 * Created by 大白 on 2017/11/4.
 */

public class ShowModelSx implements ShowModel {


    @Override
    public void detData(final FinishListener listener) {

        Retrofit retrofit = new Retrofit.Builder().baseUrl(Api.Api_me).addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        ApiService apiService = retrofit.create(ApiService.class);
        Observable<Bean> observable = apiService.getNoParams();
        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Bean>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(Bean bean) {
            listener.Success(bean);
            }
        });

    }


}
