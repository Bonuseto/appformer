/*
 * Copyright 2015 JBoss, by Red Hat, Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.uberfire.ext.plugin.type;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.uberfire.ext.plugin.model.PluginType;
import org.uberfire.workbench.category.Category;
import org.uberfire.workbench.category.Others;

@ApplicationScoped
public class DynamicMenuResourceTypeDefinition extends BasePluginResourceTypeDefinition {

    private Category category;

    public DynamicMenuResourceTypeDefinition() {
    }

    @Inject
    public DynamicMenuResourceTypeDefinition(final Others category) {
        this.category = category;
    }

    @Override
    public String getShortName() {
        return "dynamic menu";
    }

    @Override
    public String getDescription() {
        return "Dynamic Menu";
    }

    @Override
    public String getSuffix() {
        return "/" + PluginType.DYNAMIC_MENU.toString().toLowerCase() + ".plugin";
    }

    @Override
    public Category getCategory() {
        return category;
    }
}
