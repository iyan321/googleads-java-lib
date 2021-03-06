// Copyright 2019 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.


package com.google.api.ads.admanager.jaxws.v201905;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Performs an action on {@link ExchangeRate} objects that satisfy the given
 *             {@link Statement#query}. The following fields are supported for filtering:
 *             
 *             <table>
 *             <tr>
 *             <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
 *             </tr>
 *             <tr>
 *             <td>{@code id}</td>
 *             <td>{@link ExchangeRate#id}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code currencyCode}</td>
 *             <td>{@link ExchangeRate#currencyCode}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code refreshRate}</td>
 *             <td>{@link ExchangeRate#refreshRate}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code direction}</td>
 *             <td>{@link ExchangeRate#direction}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code exchangeRate}</td>
 *             <td>{@link ExchangeRate#exchangeRate}</td>
 *             </tr>
 *             </table>
 *             
 *             @param exchangeRateAction the action to perform
 *             @param filterStatement a Publisher Query Language statement used to filter
 *             a set of exchange rates
 *             @return the result of the action performed
 *           
 * 
 * <p>Java class for performExchangeRateAction element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="performExchangeRateAction">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="exchangeRateAction" type="{https://www.google.com/apis/ads/publisher/v201905}ExchangeRateAction" minOccurs="0"/>
 *           &lt;element name="filterStatement" type="{https://www.google.com/apis/ads/publisher/v201905}Statement" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "exchangeRateAction",
    "filterStatement"
})
@XmlRootElement(name = "performExchangeRateAction")
public class ExchangeRateServiceInterfaceperformExchangeRateAction {

    protected ExchangeRateAction exchangeRateAction;
    protected Statement filterStatement;

    /**
     * Gets the value of the exchangeRateAction property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeRateAction }
     *     
     */
    public ExchangeRateAction getExchangeRateAction() {
        return exchangeRateAction;
    }

    /**
     * Sets the value of the exchangeRateAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeRateAction }
     *     
     */
    public void setExchangeRateAction(ExchangeRateAction value) {
        this.exchangeRateAction = value;
    }

    /**
     * Gets the value of the filterStatement property.
     * 
     * @return
     *     possible object is
     *     {@link Statement }
     *     
     */
    public Statement getFilterStatement() {
        return filterStatement;
    }

    /**
     * Sets the value of the filterStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Statement }
     *     
     */
    public void setFilterStatement(Statement value) {
        this.filterStatement = value;
    }

}
