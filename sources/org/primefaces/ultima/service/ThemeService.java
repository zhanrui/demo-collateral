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
package org.primefaces.ultima.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import org.primefaces.ultima.domain.Theme;

@ManagedBean(name="themeService", eager = true)
@ApplicationScoped
public class ThemeService {
    
    private List<Theme> themes;
    
    @PostConstruct
    public void init() {
        themes = new ArrayList<Theme>();
        themes.add(new Theme(0, "交易类别1", "业务类别1"));
        themes.add(new Theme(1, "交易类别2", "业务类别2"));
        themes.add(new Theme(2, "交易类别2", "业务类别2"));
        themes.add(new Theme(3, "交易类别2", "业务类别2"));
        themes.add(new Theme(4, "交易类别2", "业务类别2"));
        themes.add(new Theme(5, "交易类别2", "业务类别2"));
        themes.add(new Theme(6, "交易类别2", "业务类别2"));
        themes.add(new Theme(7, "交易类别2", "业务类别2"));
        themes.add(new Theme(8, "交易类别2", "业务类别2"));
        themes.add(new Theme(9, "交易类别2", "业务类别2"));
    }
    
    public List<Theme> getThemes() {
        return themes;
    } 
}
