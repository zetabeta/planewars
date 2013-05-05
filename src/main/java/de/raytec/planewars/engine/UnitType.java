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
public class UnitType {
    
    public static class RessourceDescription {
        private float maxValue;
        private float selfGenerationPerSecond;
        private float remoteGenerationPerSecond;
    }
    
    private String typeName;
    private Map<UnitRessourse, RessourceDescription> ressources;

    private float attacksPerSecond;
    private float damagePerAttack;
    private float energyCostPerAttack;
    private float generatedControlRange;
    
    private float travelDistancePerSecond;
}
