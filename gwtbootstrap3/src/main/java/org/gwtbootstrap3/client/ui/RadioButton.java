package org.gwtbootstrap3.client.ui;

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

import com.google.gwt.user.client.ui.Widget;
import org.gwtbootstrap3.client.ui.base.AbstractButtonGroup;
import org.gwtbootstrap3.client.ui.base.button.AbstractLabelButton;
import org.gwtbootstrap3.client.ui.constants.Toggle;
import org.gwtbootstrap3.client.ui.constants.TypeAttrType;

/**
 * Button representing a radio box.
 * Used within a {@link ButtonGroup} that
 * has toggle set to {@code Toogle.BUTTONS}.
 *
 * @author Sven Jacobs
 */
public class RadioButton extends AbstractLabelButton {

    public RadioButton() {
        super(TypeAttrType.RADIO);
    }

    public RadioButton(final String label) {
        super(TypeAttrType.RADIO, label);
    }

    @Override
    public void setValue(final Boolean value, final boolean fireEvents) {
        if (getParent() instanceof AbstractButtonGroup) {
            Toggle toggle = ((AbstractButtonGroup) getParent()).getToggle();

            if (toggle != null && toggle == Toggle.BUTTONS) {
                for (int i = 0; i < ((AbstractButtonGroup) getParent()).getWidgetCount(); i++) {
                    Widget widget = ((AbstractButtonGroup) getParent()).getWidget(i);

                    if (widget instanceof RadioButton) {
                        ((RadioButton) widget).changeValue(false, fireEvents);
                    }
                }
            }
        }

        super.setValue(value, fireEvents);
    }

}
