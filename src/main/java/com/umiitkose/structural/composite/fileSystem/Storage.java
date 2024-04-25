
package com.umiitkose.structural.composite.fileSystem;

/**
 * @author akin
 *
 */
public interface Storage {
	
	public void rename(String newName);
	
	public void save();
	
	public void delete();

	public Storage copy();

	public void move(Directory target);
}
