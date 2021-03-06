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
package com.dianaui.universal.core.client.ui;

import com.dianaui.universal.core.client.ui.base.HasResponsiveness;
import com.dianaui.universal.core.client.ui.base.HasSize;
import com.dianaui.universal.core.client.ui.base.helper.StyleHelper;
import com.dianaui.universal.core.client.ui.constants.Styles;
import com.dianaui.universal.core.client.ui.constants.WellSize;
import com.dianaui.universal.core.client.ui.html.Div;

/**
 * Widget representing the Bootstrap Well
 * <a href="http://getbootstrap.com/components/#wells">Bootstrap Documentation</a>
 * <h3>UiBinder example</h3>
 * <pre>
 * {@code
 *     <b:Well>
 *         ...
 *     </b:Well>
 * }
 * </pre>
 *
 * @author Sven Jacobs
 * @author Joshua Godi
 */
public class Well extends Div implements HasSize<WellSize>, HasResponsiveness {

    /**
     * Creates a Well with the default Bootstrap styling
     */
    public Well() {
        setStyleName(Styles.WELL);
    }

    /**
     * Gets the WellSize of the well
     *
     * @return the well's WellSize
     */
    @Override
    public WellSize getSize() {
        return WellSize.fromStyleName(getStyleName());
    }

    /**
     * Sets the size of the well: SMALL | LARGE | NORMAL
     *
     * @param size desired size of the well
     */
    @Override
    public void setSize(final WellSize size) {
        StyleHelper.addUniqueEnumStyleName(this, WellSize.class, size);
    }

}
