package test.bwei.zhoukaolianxi1.adapter;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

import test.bwei.zhoukaolianxi1.R;
import test.bwei.zhoukaolianxi1.bean.Bean;

/**
 * Created by 大白 on 2017/11/4.
 */

public class Myadapter extends RecyclerView.Adapter<Myadapter.MyViewHolder> {

    private List<Bean.DataBean.ComicsBean> list;
    private Context context;

    public Myadapter(List<Bean.DataBean.ComicsBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.adapter_item, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.tv.setText(list.get(position).getTitle());
        Uri uri = Uri.parse(list.get(position).getCover_image_url());
        holder.img.setImageURI(uri);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        private final TextView tv;
        private final SimpleDraweeView img;


        public MyViewHolder(View itemView) {
            super(itemView);
            tv = (TextView) itemView.findViewById(R.id.tv);
            img = (SimpleDraweeView) itemView.findViewById(R.id.img);
        }
    }
}
