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

import com.dianaui.universal.core.client.ui.base.AbstractTextWidget;
import com.dianaui.universal.core.client.ui.base.helper.SourceCodeHelper;
import com.dianaui.universal.core.client.ui.constants.Styles;
import com.google.gwt.dom.client.Document;

/**
 * Simple {@code <pre>} element for multi-line code blocks.
 *
 * @author Sven Jacobs
 * @see Code
 */
public class Pre extends AbstractTextWidget {

    public Pre() {
        super(Document.get().createPreElement());
    }

    /**
     * Sets HTML contents.
     * If HTML contains "\n" it will be replaced by a {@code <br>} element
     * and "\s" will be replaced by a whitespace.
     *
     * @param html HTML contents
     */
    @Override
    public void setHTML(final String html) {
        getElement().setInnerHTML(SourceCodeHelper.parseCode(html).asString());
    }

    /**
     * Sets a max-height of 350px and provides a y-axis scrollbar
     *
     * @param scrollable If true sets a max-height of 350px and provides a y-axis scrollbar
     */
    public void setScrollable(final boolean scrollable) {
        if (scrollable) {
            addStyleName(Styles.PRE_SCROLLABLE);
        } else {
            removeStyleName(Styles.PRE_SCROLLABLE);
        }
    }

}
