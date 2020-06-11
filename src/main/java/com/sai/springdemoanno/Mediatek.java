/**
 * 
 */
package com.sai.springdemoanno;

import org.springframework.stereotype.Component;

/**
 * @author sv
 *
 */

@Component
public class Mediatek implements MobileProcessor {

	public void processor() {
		// TODO Auto-generated method stub
		System.out.println("2nd best processor");
	}

}
