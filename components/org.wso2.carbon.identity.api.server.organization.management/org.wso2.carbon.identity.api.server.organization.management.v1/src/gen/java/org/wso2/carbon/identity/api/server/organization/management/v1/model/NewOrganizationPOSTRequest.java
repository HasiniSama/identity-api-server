/*
 * Copyright (c) 2025, WSO2 LLC. (http://www.wso2.com).
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

package org.wso2.carbon.identity.api.server.organization.management.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;
import javax.validation.Valid;
import javax.xml.bind.annotation.*;

public class NewOrganizationPOSTRequest  implements OrganizationRequest{
  
    private String newOrgName;

    /**
    **/
    public NewOrganizationPOSTRequest newOrgName(String newOrgName) {

        this.newOrgName = newOrgName;
        return this;
    }
    
    @ApiModelProperty(example = "XYZ Builders", required = true, value = "")
    @JsonProperty("newOrgName")
    @Valid
    @NotNull(message = "Property newOrgName cannot be null.")

    public String getNewOrgName() {
        return newOrgName;
    }
    public void setNewOrgName(String newOrgName) {
        this.newOrgName = newOrgName;
    }



    @Override
    public boolean equals(java.lang.Object o) {

        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NewOrganizationPOSTRequest newOrganizationPOSTRequest = (NewOrganizationPOSTRequest) o;
        return Objects.equals(this.newOrgName, newOrganizationPOSTRequest.newOrgName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newOrgName);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("class NewOrganizationPOSTRequest {\n");
        
        sb.append("    newOrgName: ").append(toIndentedString(newOrgName)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
    * Convert the given object to string with each line indented by 4 spaces
    * (except the first line).
    */
    private String toIndentedString(java.lang.Object o) {

        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n");
    }
}

