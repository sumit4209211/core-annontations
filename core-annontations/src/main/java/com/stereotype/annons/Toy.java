package com.stereotype.annons;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("toy1")
@Lazy
//@Scope("prototype")
public class Toy {

	public Toy() {
		System.out.println("Toy()");
	}

	public void play() {
		System.out.println("playing...");
	}
}
