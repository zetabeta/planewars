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

    public static class AssetRessourceDescriptor {
        private AssetResourceType type;
        private float maxValue;
        private float selfGenerationPerSecond;
    }

    private String typeName;
    private List<AssetRessourceDescriptor> assetResources;
    private Weaponry weapons;
    private float generatedControlRange;
    private float travelDistancePerSecond;
}
