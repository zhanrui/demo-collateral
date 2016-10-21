package com.rs.publicuser;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

@ManagedBean
//@SessionScoped
public class SearchView implements Serializable {
    private String words;
    public String onSearch() {
        return "/ui/publicuser/puApp1.xhtml?faces-redirect=true";
    }

    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }
}
