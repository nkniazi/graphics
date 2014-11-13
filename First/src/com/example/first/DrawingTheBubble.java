package com.example.first;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

public class DrawingTheBubble extends View{

	private Bitmap bball;
	int x ,y;

	public DrawingTheBubble(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		
		bball=BitmapFactory.decodeResource(getResources(),R.drawable.b128);
		x=0;
		y=0;
		
		
	}

	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);
		Rect ourRect=new  Rect();
		ourRect.set(0,0,canvas.getWidth(),canvas.getHeight()/2);
		
		Paint blue=new Paint();
		blue.setColor(Color.BLUE);
		blue.setStyle(Paint.Style.FILL);
		canvas.drawRect(ourRect, blue);
		if (x <canvas.getWidth()){
		x+=10;}else{
			x=0;
		}
		if (y <canvas.getHeight()){
			y+=10;}else{
				x=0;
			}
		canvas.drawBitmap(bball,x,y,new Paint());
		invalidate();
	}

}
