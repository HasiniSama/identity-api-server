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

package org.wso2.carbon.identity.rest.api.server.email.template.v2.factories;

import org.wso2.carbon.email.mgt.EmailTemplateManager;
import org.wso2.carbon.identity.api.server.email.template.common.EmailTemplatesServiceHolder;
import org.wso2.carbon.identity.rest.api.server.email.template.v2.core.ApplicationEmailTemplatesService;

/**
 * Factory class for ApplicationEmailTemplatesService.
 */
public class ApplicationEmailTemplatesServiceFactory {

    private static final ApplicationEmailTemplatesService SERVICE;

    static {
        EmailTemplateManager emailTemplateManager = EmailTemplatesServiceHolder.getEmailTemplateManager();

        if (emailTemplateManager == null) {
            throw new IllegalStateException("EmailTemplateManager is not available from OSGi context.");
        }

        SERVICE = new ApplicationEmailTemplatesService(emailTemplateManager);
    }

    /**
     * Get ApplicationEmailTemplatesService instance.
     *
     * @return ApplicationEmailTemplatesService.
     */
    public static ApplicationEmailTemplatesService getApplicationEmailTemplatesService() {

        return SERVICE;
    }
}
