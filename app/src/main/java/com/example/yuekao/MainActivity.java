package com.example.yuekao;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.yuekao.presetener.Rvpretsener;
import com.example.yuekao.view.Mainview;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, Mainview {

    private TextView tv_toobar;
    private Toolbar toobar;
    private RecyclerView rv;
    private Button bt_exit;
    private ArrayList<Bean.DataBean.DatasBean> list;
    private Rvadapter rvadapter;
    private Rvpretsener rvpretsener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvpretsener = new Rvpretsener(this);
        initView();
        initdata();
    }

    private void initdata() {
        rvpretsener.getdtaa();
    }

    private void initView() {
        //找控件
        tv_toobar = (TextView) findViewById(R.id.tv_toobar);
        toobar = (Toolbar) findViewById(R.id.toobar);
        rv = (RecyclerView) findViewById(R.id.rv);
        bt_exit = (Button) findViewById(R.id.bt_exit);

        bt_exit.setOnClickListener(this);
        //设置toobar
        toobar.setTitle("");
        tv_toobar.setText("首页");
        //设置布局
        setSupportActionBar(toobar);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
        //初始化数据源
        list = new ArrayList<>();
        rvadapter = new Rvadapter(list, this);
        //绑定适配器
        rv.setAdapter(rvadapter);
        //接口回调的点击事件
        rvadapter.setOnItemClickListener(new Rvadapter.OnItemClickListener() {
            @Override
            public void OnItemClick(int position) {
                //调转页面，并把链接传递过去
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("link",list.get(position).getLink());
                startActivity(intent);
            }
        });


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_exit:

                break;
        }
    }

    @Override
    public void Onsuccess(Bean bean) {
        List<Bean.DataBean.DatasBean> datas = bean.getData().getDatas();
        list.addAll(datas);
        rvadapter.notifyDataSetChanged();

    }
}
