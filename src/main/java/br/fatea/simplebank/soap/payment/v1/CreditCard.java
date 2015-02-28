//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2015.02.20 às 07:20:00 PM BRST 
//


package br.fatea.simplebank.soap.payment.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de creditCard complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="creditCard">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ownerName" type="{http://fatea.br/simplebank/soap/payment/v1}ownerName"/>
 *         &lt;element name="cardNumber" type="{http://fatea.br/simplebank/soap/payment/v1}cardNumber"/>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="validMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="validYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "creditCard", propOrder = {
    "ownerName",
    "cardNumber",
    "code",
    "validMonth",
    "validYear"
})
public class CreditCard {

    @XmlElement(required = true)
    protected String ownerName;
    @XmlElement(required = true)
    protected String cardNumber;
    protected int code;
    protected int validMonth;
    protected int validYear;

    /**
     * Obtém o valor da propriedade ownerName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Define o valor da propriedade ownerName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerName(String value) {
        this.ownerName = value;
    }

    /**
     * Obtém o valor da propriedade cardNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Define o valor da propriedade cardNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNumber(String value) {
        this.cardNumber = value;
    }

    /**
     * Obtém o valor da propriedade code.
     * 
     */
    public int getCode() {
        return code;
    }

    /**
     * Define o valor da propriedade code.
     * 
     */
    public void setCode(int value) {
        this.code = value;
    }

    /**
     * Obtém o valor da propriedade validMonth.
     * 
     */
    public int getValidMonth() {
        return validMonth;
    }

    /**
     * Define o valor da propriedade validMonth.
     * 
     */
    public void setValidMonth(int value) {
        this.validMonth = value;
    }

    /**
     * Obtém o valor da propriedade validYear.
     * 
     */
    public int getValidYear() {
        return validYear;
    }

    /**
     * Define o valor da propriedade validYear.
     * 
     */
    public void setValidYear(int value) {
        this.validYear = value;
    }

}
