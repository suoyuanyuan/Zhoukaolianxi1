package test.bwei.zhoukaolianxi1;

import retrofit2.http.GET;
import rx.Observable;
import test.bwei.zhoukaolianxi1.bean.Bean;

/**
 * Created by 大白 on 2017/11/4.
 */

public interface ApiService {

//http://mnews.gw.com.cn/wap/data/news/txs/page_1.json

//http://api.kkmh.com/v1/daily/comic_lists/1487606400?since=0&gender=1


    @GET("daily/comic_lists/1487606400?since=0&gender=0")
    Observable<Bean> getNoParams();

}
