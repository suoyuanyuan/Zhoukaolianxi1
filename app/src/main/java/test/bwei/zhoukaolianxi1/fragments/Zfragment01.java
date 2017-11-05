package test.bwei.zhoukaolianxi1.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jcodecraeer.xrecyclerview.XRecyclerView;

import java.util.List;

import test.bwei.zhoukaolianxi1.R;
import test.bwei.zhoukaolianxi1.adapter.Myadapter;
import test.bwei.zhoukaolianxi1.bean.Bean;
import test.bwei.zhoukaolianxi1.shuju.presenter.ShowPresenter;
import test.bwei.zhoukaolianxi1.shuju.presenter.ShowPresenterSx;
import test.bwei.zhoukaolianxi1.shuju.view.ShowView;

/**
 * Created by 大白 on 2017/11/4.
 */

public class Zfragment01 extends Fragment implements ShowView{


    private View view;
    private XRecyclerView recyclerView;
    private ShowPresenter showPresenter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        view = inflater.inflate(R.layout.zfrag01, null);

        showPresenter = new ShowPresenterSx(this);
        showPresenter.passData();

        initView();

        return view;
    }



    private void initView() {

        recyclerView = (XRecyclerView) view.findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));


    }


    @Override
    public void showView(Bean bean) {

        List<Bean.DataBean.ComicsBean> list = bean.getData().getComics();
          Myadapter adapter = new Myadapter(list,getActivity());
         recyclerView.setAdapter(adapter);

        recyclerView.setLoadingListener(new XRecyclerView.LoadingListener() {
            @Override
            public void onRefresh() {

                showPresenter.passData();
                recyclerView.refreshComplete();
            }

            @Override
            public void onLoadMore() {

              recyclerView.refreshComplete();

            }
        });

    }


}
