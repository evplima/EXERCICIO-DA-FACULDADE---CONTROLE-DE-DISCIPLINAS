/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author evert
 */
public class notaInvalidaException extends Exception {
    public notaInvalidaException(String msg){
        super(msg);
    }

    // contrói um objeto NumeroNegativoException com mensagem e a causa dessa exceção, utilizado para encadear exceptions
    public notaInvalidaException(String msg, Throwable cause){
        super(msg, cause);
    }
}

