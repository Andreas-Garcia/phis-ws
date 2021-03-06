//**********************************************************************************************
//                                       FileInformationDTO.java 
//
// Author(s): Morgane Vidal
// PHIS-SILEX version 1.0
// Copyright © - INRA - 2017
// Creation date: December, 8 2017
// Contact: morgane.vidal@inra.fr, anne.tireau@inra.fr, pascal.neveu@inra.fr
// Last modification date:  December, 8 2017
// Subject: Represents the JSON submitted for the file informations 
//***********************************************************************************************
package phis2ws.service.resources.dto;

import io.swagger.annotations.ApiModelProperty;
import phis2ws.service.documentation.DocumentationAnnotation;
import phis2ws.service.resources.validation.interfaces.Required;
import phis2ws.service.resources.dto.manager.AbstractVerifiedClass;
import phis2ws.service.view.model.phis.FileInformations;

/**
 * corresponds to the submitted JSON for a file information
 * @author Morgane Vidal <morgane.vidal@inra.fr>
 */
public class FileInformationDTO extends AbstractVerifiedClass {

    //the checksum is generated by the md5sum
    private String checksum;
    //the file extension (e.g. PNG)
    private String extension;

    @Override
    public FileInformations createObjectFromDTO() {
        FileInformations fileInformations = new FileInformations();
        fileInformations.setChecksum(checksum);
        fileInformations.setExtension(extension);
        return fileInformations;
    }

    @Required
    @ApiModelProperty(example = DocumentationAnnotation.EXAMPLE_FILE_INFORMATION_CHECKSUM)
    public String getChecksum() {
        return checksum;
    }

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }
    
    @Required
    @ApiModelProperty(example = DocumentationAnnotation.EXAMPLE_FILE_INFORMATION_EXTENSION)
    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }
}
