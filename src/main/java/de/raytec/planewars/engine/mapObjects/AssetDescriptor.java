/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.raytec.planewars.engine.mapObjects;

import de.raytec.planewars.engine.mapObjects.assetDescriptor.StructureDescriptor;
import java.util.List;
import java.util.Map;

/**
 *
 * @author raymoon
 */
public abstract class AssetDescriptor {

    public static class RessourceDescription {
        private float maxValue;
        private float selfGenerationPerSecond;
    }

   
    private String typeName;
    private Map<AssetResourceType, RessourceDescription> assetResources;
    private Weaponry weapons;
    private float generatedControlRange;
    private float travelDistancePerSecond;
}
