package org.gwtbootstrap3.client.ui.constants;

/*
 * #%L
 * GwtBootstrap3
 * %%
 * Copyright (C) 2013 GwtBootstrap3
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
public enum IconSize implements Style.HasCssName {
    NONE(""),
    LARGE("fa-lg"),
    TIMES2("fa-2x"),
    TIMES3("fa-3x"),
    TIMES4("fa-4x"),
    TIMES5("fa-5x");

    private final String cssClass;

    private IconSize(final String cssClass) {
        this.cssClass = cssClass;
    }

    public static IconSize fromStyleName(final String styleName) {
        return EnumHelper.fromStyleName(styleName, IconSize.class, NONE);
    }

    @Override
    public String getCssName() {
        return cssClass;
    }
}
