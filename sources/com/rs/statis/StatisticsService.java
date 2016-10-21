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
package com.rs.statis;

import org.primefaces.ultima.domain.Car;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@ManagedBean
@ApplicationScoped
public class StatisticsService {
    
    private final static String[] colors;
	
	private final static String[] brands;
    
    static {
		colors = new String[12];
		colors[0] = "土地";
		colors[1] = "厂房";
		colors[2] = "商务用房";
		colors[3] = "住房";
		colors[4] = "机器设备";
		colors[5] = "机动车";
		colors[6] = "船舶";
		colors[7] = "股权";
		colors[8] = "林权";
		colors[9] = "钢材、有色金属、油品";
		colors[10] = "票据";
		colors[11] = "其它";

		brands = new String[12];
		brands[0] = "业务1";
		brands[1] = "业务1";
		brands[2] = "业务1";
		brands[3] = "业务1";
		brands[4] = "业务1";
		brands[5] = "业务1";
		brands[6] = "业务1";
		brands[7] = "业务1";
		brands[8] = "业务1";
		brands[9] = "业务1";
		brands[10] = "业务1";
		brands[11] = "业务1";
	}
    
    public List<Car> createCars(int size) {
        List<Car> list = new ArrayList<Car>();
		for(int i = 0 ; i < size ; i++) {
			list.add(new Car(colors[i], "" + getRandomPrice(10000), getRandomPrice(100), "" + getRandomPrice(100000), getRandomPrice(100000), getRandomSoldState()));
        }
        
        return list;
    }
    
    private String getRandomId() {
		return UUID.randomUUID().toString().substring(0, 8);
	}
    
    private int getRandomYear() {
		return (int) (Math.random() * 50 + 1960);
	}
	
	private String getRandomColor() {
		return colors[(int) (Math.random() * 10)];
	}
	
	private String getRandomBrand() {
		return brands[(int) (Math.random() * 10)];
	}
    
    private int getRandomPrice() {
		return (int) (Math.random() * 100000);
	}
    private int getRandomPrice(int i) {
		return (int) (Math.random() * i);
	}

    private boolean getRandomSoldState() {
		return (Math.random() > 0.5) ? true: false;
	}
    
    public List<String> getColors() {
        return Arrays.asList(colors);
    }
    
    public List<String> getBrands() {
        return Arrays.asList(brands);
    }
}
