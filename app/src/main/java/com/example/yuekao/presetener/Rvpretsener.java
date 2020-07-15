package com.example.yuekao.presetener;

import com.example.yuekao.Bean;
import com.example.yuekao.MainActivity;
import com.example.yuekao.ResultCallback;
import com.example.yuekao.model.Rvmodel;
import com.example.yuekao.view.Mainview;

public class Rvpretsener {
    private Mainview mainview;
    private Rvmodel rvmodel;

    public Rvpretsener(Mainview mainview) {

        this.mainview = mainview;
        rvmodel=new Rvmodel();
    }

    public void getdtaa() {
        rvmodel.getdtata(new ResultCallback<Bean>() {
            @Override
            public void onsuccess(Bean bean) {
                mainview.Onsuccess(bean);
            }
        });
    }
}
