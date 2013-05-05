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
public class PlayerGroup {
    private final List<Player> players = new LinkedList<Player>();

    private final List<Unit> controlledUnits = new LinkedList<Unit>();
}
