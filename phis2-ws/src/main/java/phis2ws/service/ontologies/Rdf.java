//******************************************************************************
//                                       Rdf.java
// SILEX-PHIS
// Copyright © INRA 2018
// Creation date: 11 sept. 2018
// Contact: morgane.vidal@inra.fr, anne.tireau@inra.fr, pascal.neveu@inra.fr
//******************************************************************************
package phis2ws.service.ontologies;

/**
 * The elements of the ontology rdf used.
 * @see https://www.w3.org/1999/02/22-rdf-syntax-ns
 * @author Morgane Vidal <morgane.vidal@inra.fr>
 */
public enum Rdf {
    NAMESPACE {
        @Override
        public String toString() {
            return "http://www.w3.org/1999/02/22-rdf-syntax-ns#";
        }
    },
    
    RELATION_FIRST {
        @Override
        public String toString() {
            return NAMESPACE.toString() + "first";
        }
    },
    RELATION_REST {
        @Override
        public String toString() {
            return NAMESPACE.toString() + "rest";
        }
    },
    RELATION_TYPE {
        @Override
        public String toString() {
            return NAMESPACE.toString() + "type";
        }
    }
}
