package com.rs.admin.view;

import com.rs.admin.repository.model.Collateral;
import com.rs.admin.repository.model.Land;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by baiqg on 2016/10/20.
 */
@ManagedBean
@ViewScoped
public class CollateralAction {

    private Collateral data;

    public void selectRecord(Collateral record) {
        data = record;
    }

    public void onDelete(Collateral record) {
//        dataList.remove(record);
    }

    public Collateral getData() {
        return data;
    }

    public void setData(Collateral data) {
        this.data = data;
    }
}
