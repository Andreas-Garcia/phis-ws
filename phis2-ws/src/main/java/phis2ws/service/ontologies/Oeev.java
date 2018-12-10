//******************************************************************************
//                                  Oeev.java
// SILEX-PHIS
// Copyright © INRA 2018
// Creation date: 14 nov. 2018
// Contact: andreas.garcia@inra.fr, anne.tireau@inra.fr, pascal.neveu@inra.fr
//******************************************************************************
package phis2ws.service.ontologies;

/**
 * The elements of the oeev ontology used in the ws
 * @author Andréas Garcia <andreas.garcia@inra.fr>
 */
public enum Oeev {
    NAMESPACE {
        @Override
        public String toString() {
            return "http://www.phenome-fppn.fr/vocabulary/2018/oeev#";
        }
    },
    
    CONCEPT_EVENT {
        @Override
        public String toString() {
            return NAMESPACE.toString() + "Event";
        }
    }
}