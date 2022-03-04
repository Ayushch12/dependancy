package com.naww.springAnno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component("samsung") //it will make Samsung to samsung
public class Samsung {

	 @Autowired
	 @Qualifier("snapdragon")
	MobileProcessor cpu;
	
	
	public MobileProcessor getCpu() {
		return cpu;
	}


	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}


	public void config() {
		
		System.out.println("Octa core, 4 gb RAMm12 mp camera");
		cpu.process();
	}
}

