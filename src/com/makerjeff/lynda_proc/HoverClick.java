package com.makerjeff.lynda_proc;

import com.jogamp.newt.event.KeyEvent;

import processing.core.*;


public class HoverClick extends PApplet{
	
	int[] palette = {
			color(195,204,200), 
			color(68,36,18), 
			color(71,93,28), 
			color(133,147,86), 
			color(185,150,28) 
			};
	
	int bgColor = palette[0];
	int lf = palette[2];
	int rf = palette[2];
	int obj_size = 120;


	public static void main(String[] args) {
		PApplet.main("com.makerjeff.lynda_proc.HoverClick");
	}
	
	public void settings() {
		size(600, 200);
	}
	public void setup() {
		background(bgColor);
		smooth();
		rectMode(CENTER);
		strokeWeight(5.0f);
	}
	
	public void draw() {
		background(palette[0]);
		
		//draw circle
		fill(lf);
		ellipse(width/3, height/2, obj_size, obj_size);
		
		//draw square
		fill(rf);
		rect(width*2/3, height/2, obj_size, obj_size);
		
		//DETECT HOVER STATES
		if(dist(width/3, height/2, mouseX, mouseY) < obj_size/2) {
			lf = (palette[4]);
		}
		else {
			lf = (palette[2]);
		}
		
		CheckRect();	//check collision on rect
		CheckKeys();
	}
	
	//METHODS
	private void CheckRect(){
		if((mouseX > width*2/3-obj_size/2) && (mouseX < width*2/3+obj_size/2) && (mouseY > height/2-obj_size/2) && (mouseY < height/2+obj_size+2)) {
			rf = palette[4];
		}
		else {
			rf = palette[2];
		}
	}
	//detect if keys are pressed
	private void CheckKeys() {
		if(keyPressed == true) {
			if(key == CODED) {
				if(keyCode == UP) {
					print("L key pressed!\r\n");
				}
				else if(keyCode == DOWN) {
					print("R key pressed!\r\n");
				}
				else if(key == 'r') {
					rf = palette[4];
				}

			}
			
		}
	}

}
