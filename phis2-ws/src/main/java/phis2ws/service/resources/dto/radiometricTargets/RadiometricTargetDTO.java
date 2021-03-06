//******************************************************************************
//                                       RadiometricTargetDTO.java
// SILEX-PHIS
// Copyright © INRA 2018
// Creation date: 15 oct. 2018
// Contact: vincent.migot@inra.fr, anne.tireau@inra.fr, pascal.neveu@inra.fr
//******************************************************************************
package phis2ws.service.resources.dto.radiometricTargets;

import phis2ws.service.resources.dto.rdfResourceDefinition.RdfResourceDefinitionDTO;
import phis2ws.service.view.model.phis.RadiometricTarget;

/**
 * Represent a radiometric target
 * 
 * @author Vincent Migot <vincent.migot@inra.fr>
 */
public class RadiometricTargetDTO extends RdfResourceDefinitionDTO {
    
    /**
     * Constructor to create DTO from a Radiometric target Model
     * @param radiometricTarget 
     */
    public RadiometricTargetDTO(RadiometricTarget radiometricTarget) {
        super(radiometricTarget);
    }
    
    /**
     * Generates a RadiometricTarget model with the information of this
     * @return the model RadiometricTarget
     */
    public RadiometricTarget createRadiometricTargetFromDTO() {
        RadiometricTarget radiometricTarget = new RadiometricTarget();
        radiometricTarget.setLabel(getLabel());
        radiometricTarget.setUri(getUri());
        
        getProperties().forEach((property) -> {
            radiometricTarget.addProperty(property.createObjectFromDTO());
        });
        
        return radiometricTarget;
    }
}
