//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2015.02.20 �s 07:20:00 PM BRST 
//


package br.fatea.simplebank.soap.payment.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de paymentStatus.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="paymentStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OPENED"/>
 *     &lt;enumeration value="CONFIRMED"/>
 *     &lt;enumeration value="REVERSED"/>
 *     &lt;enumeration value="CANCELED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "paymentStatus")
@XmlEnum
public enum PaymentStatus {

    OPENED,
    CONFIRMED,
    REVERSED,
    CANCELED;

    public String value() {
        return name();
    }

    public static PaymentStatus fromValue(String v) {
        return valueOf(v);
    }

}
