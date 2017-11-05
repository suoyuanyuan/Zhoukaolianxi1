package test.bwei.zhoukaolianxi1.shuju.presenter;

import test.bwei.zhoukaolianxi1.bean.Bean;
import test.bwei.zhoukaolianxi1.shuju.FinishListener;
import test.bwei.zhoukaolianxi1.shuju.model.ShowModel;
import test.bwei.zhoukaolianxi1.shuju.model.ShowModelSx;
import test.bwei.zhoukaolianxi1.shuju.view.ShowView;

/**
 * Created by 大白 on 2017/11/4.
 */

public class ShowPresenterSx implements  ShowPresenter ,FinishListener{


    private ShowView showView;
    private final ShowModel showModel;

    public ShowPresenterSx(ShowView showView) {
        this.showView = showView;
        showModel = new ShowModelSx();
    }

    @Override
    public void passData() {

         showModel.detData(this);

    }


    @Override
    public void Success(Bean bean) {
              showView.showView(bean);
    }
}
