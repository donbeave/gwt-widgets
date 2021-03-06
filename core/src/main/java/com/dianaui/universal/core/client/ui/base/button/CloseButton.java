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
package com.dianaui.universal.core.client.ui.base.button;

import com.dianaui.universal.core.client.ui.Alert;
import com.dianaui.universal.core.client.ui.constants.Styles;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Event;

/**
 * Button that represents a close ("x") icon, usually used within an {@link com.dianaui.universal.core.client.ui.Alert}.
 *
 * @author Sven Jacobs
 * @author <a href='mailto:donbeave@gmail.com'>Alexey Zhokhov</a>
 * @see com.dianaui.universal.core.client.ui.Alert
 */
public class CloseButton extends AbstractButton {

    public CloseButton() {
        setStyleName(Styles.CLOSE);
        getElement().setInnerHTML("&times;");

        sinkEvents(Event.ONCLICK);
    }

    @Override
    public void onBrowserEvent(Event event) {
        switch (DOM.eventGetType(event)) {
            case Event.ONCLICK:
                if (getParent() instanceof Alert) {
                    ((Alert) getParent()).close();
                }
                break;
        }

        super.onBrowserEvent(event);
    }

    @Override
    protected Element createElement() {
        return Document.get().createPushButtonElement().cast();
    }

}
