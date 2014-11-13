package pk.edu.iba.anamta.ibagraphics;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

public class DrawingTheBubble extends View {

	private Bitmap bbBall;
	int x,y,speedX,speedY;

	public DrawingTheBubble(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		bbBall=BitmapFactory.decodeResource(getResources(), R.drawable.b128);
		x=0;
		y=0;
		speedX=4;
		speedY=4;
		
	}

	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);
		Rect ourRect = new Rect();
		ourRect.set(0, 0, canvas.getWidth(), canvas.getHeight()/2);
		Paint blue = new Paint();
		blue.setColor(Color.BLUE);
		canvas.drawRect(ourRect, blue);
		if (x<0 || x>canvas.getWidth()) {
			speedX= speedX*-1;
		}
		if (y<0 || y>canvas.getHeight()) {
			speedY= speedY*-1;
		}
		x+=speedX;
		y+=speedY;
		canvas.drawBitmap(bbBall, x, y, new Paint());
		invalidate();
	}
	
	

}
