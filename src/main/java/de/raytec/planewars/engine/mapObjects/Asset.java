/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.raytec.planewars.engine.mapObjects;

import de.raytec.planewars.engine.Cooporation;
import de.raytec.planewars.engine.physics.AttackOrder;
import de.raytec.planewars.engine.physics.Coordinate;
import java.util.Map;

/**
 *
 * @author raymoon
 */
public abstract class Asset {
    private AssetDescriptor assetType;
    private Cooporation owner;
    private Coordinate location;
    private Map<AssetResourceType, Float> ressourceLevel;<<<<<
    private AttackOrder attackOrder;
}
