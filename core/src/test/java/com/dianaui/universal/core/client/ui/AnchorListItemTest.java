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

import com.dianaui.universal.core.client.ui.constants.IconType;
import com.dianaui.universal.core.client.ui.html.Text;
import com.googlecode.gwt.test.GwtModule;
import com.googlecode.gwt.test.GwtTest;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author <a href='mailto:donbeave@gmail.com'>Alexey Zhokhov</a>
 */
@GwtModule("com.dianaui.universal.core.DianaUICore")
public class AnchorListItemTest extends GwtTest {

    static String TEST_TEXT = "Test";
    static String FA_SITEMAP_HTML = "<i class=\"fa fa-sitemap\"></i>";
    static String BADGE_HTML = "<span class=\"badge\">...</span>";

    static String getHtml(String content) {
        return "<li><a href=\"javascript:;\">" + (content != null ? content : "") + "</a></li>";
    }

    @Test
    public void anchorTextAndHtmlAndIconAndChildren() {
        AnchorListItem item = new AnchorListItem();
        Assert.assertNull(item.getText());
        Assert.assertNull(item.getHTML());
        Assert.assertEquals(getHtml(null), item.getElement().toString());

        item.setText(TEST_TEXT);
        getBrowserSimulator().fireLoopEnd();
        Assert.assertEquals(TEST_TEXT, item.getText());
        Assert.assertNull(item.getHTML());
        Assert.assertEquals(getHtml(TEST_TEXT), item.getElement().toString());

        item.setFontAwesomeIcon(IconType.SITEMAP);
        getBrowserSimulator().fireLoopEnd();
        Assert.assertEquals(getHtml(FA_SITEMAP_HTML + " " + TEST_TEXT), item.getElement().toString());

        item.add(new Text(" "));
        item.add(new Badge("..."));
        Assert.assertEquals(getHtml(FA_SITEMAP_HTML + " " + TEST_TEXT + " " + BADGE_HTML), item.getElement().toString());
    }

}
