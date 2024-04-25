package com.umiitkose.structural.composite.graphic;

import java.util.*;

public interface CompositeGraphic{	
	
	public void addGraphic(Graphic graphic);
	
	public void removeGraphic(Graphic graphic);
	
	public Collection<Graphic> getGraphics();
	
	public void listGraphic();
}
