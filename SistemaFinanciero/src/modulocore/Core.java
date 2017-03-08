/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulocore;

import java.util.*;

/**
 *
 */
public class Core implements DocumentoInterface {

    /**
     * lista de documentos
     */
    private List<Documento> documentos;

    /**
     * Default constructor
     */
    public Core() {
        documentos = new ArrayList<>();
    }

    /**
     * crea un documento
     *
     * @param documento el documento a crear
     */
    public void crearDocumento(Documento documento) {
        documentos.add(documento);

    }

    /**
     * elimina un documento
     *
     * @param documento el documento a eliminar
     */
    public void eliminarDocumento(Documento documento) {
        // TODO implement here
        documentos.remove(documento);
    }

    /**
     * busca un documento
     *
     * @param codigo el codigo del documento a buscar
     * @return el documento si lo encuemtra, de lo contrario null
     */
    public Documento buscarDocumento(int codigo) {
        for (int i = 0; i < documentos.size(); i++) {
            if (documentos.get(i).getCodigo() == codigo) {
                return documentos.get(i);
            }
        }
        return null;
    }

    public List<Documento> getDocumentos() {
        return documentos;
    }

}
