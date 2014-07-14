package org.gwtbootstrap3.client.ui.constants;

/*
 * #%L
 * GwtBootstrap3
 * %%
 * Copyright (C) 2013 - 2014 GwtBootstrap3
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import com.google.gwt.dom.client.Style;
import org.gwtbootstrap3.client.ui.base.helper.EnumHelper;

/**
 * @author Joshua Godi
 */
public enum ListGroupItemType implements Type, Style.HasCssName {
    DEFAULT(""),
    SUCCESS("list-group-item-success"),
    INFO("list-group-item-info"),
    WARNING("list-group-item-warning"),
    DANGER("list-group-item-danger");

    private final String cssClass;

    private ListGroupItemType(final String cssClass) {
        this.cssClass = cssClass;
    }

    public static ListGroupItemType fromStyleName(final String styleName) {
        return EnumHelper.fromStyleName(styleName, ListGroupItemType.class, DEFAULT);
    }

    @Override
    public String getCssName() {
        return cssClass;
    }
}
