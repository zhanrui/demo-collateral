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
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import org.primefaces.ultima.domain.Car;

@ManagedBean(name = "carService")
@ApplicationScoped
public class CarService {
    
    private final static String[] colors;
	
	private final static String[] brands;
    
    static {
		colors = new String[10];
		colors[0] = "类别1";
		colors[1] = "类别2";
		colors[2] = "类别3";
		colors[3] = "类别3";
		colors[4] = "类别3";
		colors[5] = "类别3";
		colors[6] = "类别3";
		colors[7] = "类别3";
		colors[8] = "类别3";
		colors[9] = "类别3";

		brands = new String[10];
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
	}
    
    public List<Car> createCars(int size) {
        List<Car> list = new ArrayList<Car>();
		for(int i = 0 ; i < size ; i++) {
			list.add(new Car(getRandomId(), getRandomBrand(), getRandomYear(), getRandomColor(), getRandomPrice(), getRandomSoldState()));
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
