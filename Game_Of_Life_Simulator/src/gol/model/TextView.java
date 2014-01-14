package gol.model;

import java.awt.*;

/**
 * Write a description of class TextView here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TextView implements SimulatorView{
    private FieldStats stats;

    public TextView(){
        stats = new FieldStats();
    }

    /**
     * Define a color to be used for a given class of animal.
     * @param animalClass The animal's Class object.
     * @param color The color to be used for the given class.
     */
    public void setColor(Class animalClass, Color color){
    }

    /**
     * Determine whether the simulation should continue to run.
     * @return true If there is more than one species alive.
     */
    public boolean isViable(Field field){
        return stats.isViable(field);
    }

    /**
     * Show the current status of the field.
     * @param step Which iteration step it is.
     * @param field The field whose status is to be displayed.
     */
    public void showStatus(int step, Field field)
    {
        stats.reset();
        System.out.println("Stap " + step + " " + stats.getPopulationDetails(field));
    }

    /**
     * Prepare for a new run.
     */
    public void reset(){}
}