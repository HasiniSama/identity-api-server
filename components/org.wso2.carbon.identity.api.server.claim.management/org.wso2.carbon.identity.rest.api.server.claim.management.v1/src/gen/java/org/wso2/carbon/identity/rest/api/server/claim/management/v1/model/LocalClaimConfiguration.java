/*
 * Copyright (c) 2023, WSO2 LLC. (http://www.wso2.com).
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.rest.api.server.claim.management.v1.model;

import org.wso2.carbon.identity.rest.api.server.claim.management.v1.dto.LocalClaimResDTO;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Local claim configuration model.
 **/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "LocalClaimConfiguration")
public class LocalClaimConfiguration extends LocalClaimResDTO implements ClaimConfiguration {

    public LocalClaimConfiguration() {
        super();
    }

    public LocalClaimConfiguration(LocalClaimResDTO localClaimResDTO) {

        this.setId(localClaimResDTO.getId());
        this.setClaimURI(localClaimResDTO.getClaimURI());
        this.setDialectURI(localClaimResDTO.getDialectURI());
        this.setDescription(localClaimResDTO.getDescription());
        this.setDisplayOrder(localClaimResDTO.getDisplayOrder());
        this.setDisplayName(localClaimResDTO.getDisplayName());
        this.setReadOnly(localClaimResDTO.getReadOnly());
        this.setRegEx(localClaimResDTO.getRegEx());
        this.setRequired(localClaimResDTO.getRequired());
        this.setSupportedByDefault(localClaimResDTO.getSupportedByDefault());
        this.setAttributeMapping(localClaimResDTO.getAttributeMapping());
        this.setProperties(localClaimResDTO.getProperties());
    }
}