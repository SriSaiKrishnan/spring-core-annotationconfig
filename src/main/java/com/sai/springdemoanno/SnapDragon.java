/**
 * 
 */
package com.sai.springdemoanno;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author sv
 *
 */

@Component
//@Primary
public class SnapDragon implements MobileProcessor {

	public void processor() {
		// TODO Auto-generated method stub
		System.out.println("Best Processor");
	}

}
