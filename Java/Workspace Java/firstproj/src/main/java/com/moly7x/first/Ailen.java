//
package com.moly7x.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * This class is . 
 * 
 * @author: Tân
 * @create_date: 28/07/2020
 */
@Component
public class Ailen {

	/**
	 * This method is . 
	 * 
	 * @author: Tân
	 * @create_date: 28/07/2020
	 */
	
	@Autowired
	Laptop lap;
	
	public void code() {
		lap.compile();
	}

}
