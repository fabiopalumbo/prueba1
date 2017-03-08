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
public interface DocumentoInterface {

    /**
     * crea un documento
     *
     * @param documento el documento a crear
     */
    public void crearDocumento(Documento documento);

    /**
     * elimina un documento
     *
     * @param documento el documento a eliminar
     */
    public void eliminarDocumento(Documento documento);

    /**
     * busca un documento
     *
     * @param codigo el codigo del documento
     * @return el docuemnto si lo encuentra, de lo contrario null
     */
    public Documento buscarDocumento(int codigo);

}
