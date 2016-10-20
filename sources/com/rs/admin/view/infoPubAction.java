package com.rs.admin.view;

import javax.faces.bean.ManagedBean;

/**
 * Created by baiqg on 2016/10/20.
 */
@ManagedBean
public class infoPubAction {
    private String assetType;


    public String getAssetType() {
        return assetType;
    }

    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }
}
