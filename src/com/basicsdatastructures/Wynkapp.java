package com.basicsdatastructures;

public  class Wynkapp implements Mediaplayer{

	
		public void play() {
		System.out.println("naa jaa");
		// TODO Auto-generated method stub
		

	}
		public void pause() {
			System.out.println(" na jaa pause");
		}
public static void main(String[] args) {
	
	Wynkapp ww=new Wynkapp();
	ww.play();
	ww.pause();
	Cdroom cc=new Cdroom();
	cc.play();
	cc.pause();
}}
