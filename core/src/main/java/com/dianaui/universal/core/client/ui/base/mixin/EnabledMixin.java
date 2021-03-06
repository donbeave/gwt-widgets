/*
 * #%L
 * Diana UI Core
 * %%
 * Copyright (C) 2014 Diana UI
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
package com.dianaui.universal.core.client.ui.base.mixin;

import com.dianaui.universal.core.client.ui.constants.Styles;
import com.google.gwt.user.client.ui.UIObject;

/**
 * @author Joshua Godi
 * @author <a href='mailto:donbeave@gmail.com'>Alexey Zhokhov</a>
 */
public class EnabledMixin {

    private static final String DISABLED = "disabled";

    public static boolean isEnabled(final UIObject uiObject) {
        return !uiObject.getElement().hasAttribute(DISABLED);
    }

    public static void setEnabled(final UIObject uiObject, final boolean enabled) {
        if (enabled) {
            uiObject.removeStyleName(Styles.DISABLED);
            uiObject.getElement().removeAttribute(DISABLED);
        } else {
            uiObject.addStyleName(Styles.DISABLED);
            uiObject.getElement().setAttribute(DISABLED, "");
        }
    }

}
