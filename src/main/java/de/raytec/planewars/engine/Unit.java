/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.raytec.planewars.engine;

import java.util.Map;

/**
 *
 * @author raymoon
 */
public abstract class Unit {

    private UnitType type;
    
    private Coordinate location;
    private Coordinate destination;
    
    private Map<UnitRessourse, Float> ressourceLevel;
    private Time lastFired;
}
