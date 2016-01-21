/* 
 * Mystfy.java 
 * 
 */

import java.awt.*;
import java.awt.event.*;
import java.lang.Object;

/**
 * This is the basic program for Mystify Screensaver
 *
 * @author Vinay Vasant More
 *
 */

class Mystfy extends Frame implements Runnable
{

	int x1,y1,dx1=1,dy1=1;
	int x2,y2,dx2=1,dy2=1;
	int x3,y3,dx3=1,dy3=1;
	int x4,y4,dx4=1,dy4=1;

	Mystfy()
	{
		x1 = (int) (Math.random()*1280);
		y1 = (int) (Math.random()*800);

		x2 = (int) (Math.random()*1280);
		y2 = (int) (Math.random()*800);

		x3 = (int) (Math.random()*1280);
		y3 = (int) (Math.random()*800);

		x4 = (int) (Math.random()*1280);
		y4 = (int) (Math.random()*800);

    setUndecorated(true);
    setSize(1280,800);
		setVisible(true);
		setBackground(Color.BLACK);
		Thread t = new Thread(this);
		t.start();
	}

	public void run()
	{
			Graphics g=getGraphics();
			while(true)
			{
				x1=x1+dx1;
				y1=y1+dy1;
				if(x1>1280||x1<0)
				dx1=-dx1;
				if(y1>800||y1<0)
				dy1=-dy1;


				x2=x2+dx2;
				y2=y2+dy2;
				if(x2>1280||x2<0)
				dx2=-dx2;
				if(y2>800||y2<0)
				dy2=-dy2;

				x3=x3+dx3;
				y3=y3+dy3;
				if(x3>1280||x3<0)
				dx3=-dx3;
				if(y3>800||y3<0)
				dy3=-dy3;

				x4=x4+dx4;
				y4=y4+dy4;
				if(x4>1280||x4<0)
				dx4=-dx4;
				if(y4>800||y4<0)
				dy4=-dy4;
				
				try
				{
					Thread.sleep(5);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}

				repaint();
			}
	}

	public void paint(Graphics g)
	{
		g.setColor(Color.RED);
		g.drawLine(x1,y1,x2,y2);
		g.setColor(Color.GREEN);
		g.drawLine(x2,y2,x3,y3);
		g.setColor(Color.BLUE);
		g.drawLine(x3,y3,x4,y4);
		g.setColor(Color.YELLOW);
		g.drawLine(x4,y4,x1,y1);
	}

	public static void main(String args[])
	{
		Mystfy m=new Mystfy();
	}

}
