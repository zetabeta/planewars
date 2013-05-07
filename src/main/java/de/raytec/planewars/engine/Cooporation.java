/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.raytec.planewars.engine;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author raymoon
 */
public class Cooporation {
    public enum CoorporationResourceType {
        POWER, SIMPLE_MATTER, COMPLEX_MATTER
    }
    
    private final List<Player> players = new LinkedList<Player>();
}
