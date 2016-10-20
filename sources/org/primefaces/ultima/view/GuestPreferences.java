/*
 * Copyright 2009-2014 PrimeTek.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.primefaces.ultima.view;

import javax.annotation.PostConstruct;
import java.util.Map;
import java.util.HashMap;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class GuestPreferences implements Serializable {
    
    private Map<String,String> themeColors;
    
    private String theme = "indigo";
//    private String theme = "blue-grey";

//    private String menuClass = null;
    private String menuClass = "layout-menu-dark";

    private String profileMode = "inline";
    
    private String menuLayout = "static";
    
    private boolean compact = false;

    private int userType = 0;  //0:公众用户  1：后台用户
    
    @PostConstruct
    public void init() {
        themeColors = new HashMap<String,String>();
        themeColors.put("indigo", "#3F51B5");
        themeColors.put("blue", "#03A9F4");
        themeColors.put("blue-grey", "#607D8B");
        themeColors.put("brown", "#795548");
        themeColors.put("cyan", "#00bcd4");
        themeColors.put("green", "#4CAF50");
        themeColors.put("purple-amber", "#673AB7");
        themeColors.put("purple-cyan", "#673AB7");
        themeColors.put("teal", "#009688");
    }


    public String getMenuClass() {
        return this.menuClass;
    }
    
    public String getProfileMode() {
        return this.profileMode;
    }

	public String getTheme() {		
		return theme;
	}
    
    public String getMenuLayout() {	
        if(this.menuLayout.equals("static"))
            return "menu-layout-static";
        else if(this.menuLayout.equals("overlay"))
            return "menu-layout-overlay";
        else if(this.menuLayout.equals("horizontal"))
            return "menu-layout-static menu-layout-horizontal";
        else
            return "menu-layout-static";
    }

	public void setTheme(String theme) {
		this.theme = theme;
	}
    
    public void setLightMenu() {
        this.menuClass = null;
    }
    
    public void setDarkMenu() {
        this.menuClass = "layout-menu-dark";
    }
    
    public void setProfileMode(String profileMode) {
        this.profileMode = profileMode;
    }
    
    public void setMenuLayout(String menuLayout) {
        this.menuLayout = menuLayout;
    }
    
    public Map getThemeColors() {
        return this.themeColors;
    }
    
    public void setCompact(boolean value) {
        this.compact = value;
    }
    
    public boolean isCompact() {
        return this.compact;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
        if (this.userType == 0) {//personal user
            setTheme("teal");
            setMenuLayout("horizontal");
        } else  {
            setTheme("indigo");
            setMenuLayout("static");
        }
    }
}
