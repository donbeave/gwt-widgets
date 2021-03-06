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

import com.dianaui.universal.core.client.ui.base.HasSize;
import com.dianaui.universal.core.client.ui.gwt.RichTextArea;
import com.dianaui.universal.core.client.ui.constants.ButtonGroupSize;
import com.dianaui.universal.core.client.ui.html.Div;
import com.google.gwt.editor.client.LeafValueEditor;
import com.google.gwt.event.logical.shared.HasValueChangeHandlers;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.TakesValue;
import com.google.gwt.user.client.ui.HasValue;

/**
 * @author <a href='mailto:donbeave@gmail.com'>Alexey Zhokhov</a>
 */
public class WYSIWYGEditor extends Div implements HasValueChangeHandlers<String>, HasValue<String>, TakesValue<String>,
        LeafValueEditor<String>, HasSize<ButtonGroupSize> {

    private RichTextToolbar toolbar;
    private RichTextArea textArea;

    public WYSIWYGEditor() {
        textArea = new RichTextArea();
        toolbar = new RichTextToolbar(textArea);

        add(toolbar);
        add(textArea);
    }

    public RichTextToolbar getToolbar() {
        return toolbar;
    }

    public RichTextArea getTextArea() {
        return textArea;
    }

    @Override
    public String getValue() {
        return textArea.getValue();
    }

    @Override
    public void setValue(String value) {
        textArea.setValue(value);
    }

    @Override
    public void setValue(String value, boolean fireEvents) {
        textArea.setValue(value, fireEvents);
    }

    @Override
    public HandlerRegistration addValueChangeHandler(final ValueChangeHandler<String> handler) {
        return textArea.addValueChangeHandler(handler);
    }

    @Override
    public ButtonGroupSize getSize() {
        return toolbar.group1.getSize();
    }

    @Override
    public void setSize(ButtonGroupSize size) {
        toolbar.group1.setSize(size);
        toolbar.group2.setSize(size);
        toolbar.group3.setSize(size);
        toolbar.group4.setSize(size);
    }

}
