package com.makerjeff.lynda_proc;

import processing.core.*;

public class LyndaApp extends PApplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("com.makerjeff.lynda_proc.LyndaApp");	//NEEDS TO BE FULL <package name>.<app name!>
	}
	
	public void settings(){
		size(800, 400);
	}
	public void setup() {
		smooth();
		frameRate(5.0f);
		background(255,255,255);
	}
	public void draw() {
		noStroke();
		fill(220,0,0);
		ellipse(mouseX, mouseY, 10, 10);
		fill(120,120,120);
		ellipse(pmouseX, pmouseY, 10,10);
		stroke(120,120,120);
		line(mouseX, mouseY, pmouseX, pmouseY);
	}
	
	public void mousePressed() {
		background(255);
	}

}
