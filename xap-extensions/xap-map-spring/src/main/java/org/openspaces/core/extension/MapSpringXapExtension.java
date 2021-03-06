/*
 * Copyright (c) 2008-2016, GigaSpaces Technologies, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openspaces.core.extension;

import com.gigaspaces.internal.extension.XapExtension;

import java.util.logging.Logger;

public class MapSpringXapExtension extends XapExtension {

    private static final Logger logger = Logger.getLogger(MapSpringXapExtension.class.getName());

    @Override
    public void activate() {
        logger.fine("Activating...");
        OpenSpacesExtensions.getInstance().register("map", new org.openspaces.core.config.MapBeanDefinitionParser());
        OpenSpacesExtensions.getInstance().register("local-cache-support", new org.openspaces.core.config.MapLocalCacheSettingsBeanDefinitionParser());
        OpenSpacesExtensions.getInstance().register("giga-map", new org.openspaces.core.config.GigaMapBeanDefinitionParser());
        logger.fine("Activated.");
    }
}
