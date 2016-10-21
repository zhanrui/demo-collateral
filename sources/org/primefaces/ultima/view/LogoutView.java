package org.primefaces.ultima.view;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@ManagedBean
public class LogoutView implements Serializable {
    @PostConstruct
    public void init(){
        ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
    }
    public void onLogout()  {
//        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
//        return "/landing.xhtml?faces-redirect=true";
        ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
        ec.invalidateSession();
        try {
            ec.redirect(ec.getRequestContextPath() + "/landing.xhtml");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
