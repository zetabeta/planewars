/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.raytec.planewars.engine.physics;

import de.raytec.planewars.engine.Cooporation;
import de.raytec.planewars.engine.mapObjects.Asset;
import java.util.List;

/**
 *
 * @author raymoon
 */
public interface Plane {
    public List<Asset> getAssetsInArea(Coordinate vertex1, Coordinate vertex2);
    public Asset getClosestOpposingAssetToLocation(Cooporation view, Coordinate location);
    public void addAsset(Asset asset);
    public void removeAsset(Asset asset);
}
