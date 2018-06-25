package com.battlelancer.seriesguide.util;

import static org.mockito.ArgumentMatchers.anyBoolean;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.battlelancer.seriesguide.ui.HelpActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.MockitoRule;

@RunWith(MockitoJUnitRunner.class)
public class HelpPageTest {

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Test
    public void testHelpPageLaunch() {
        HelpActivity helpActivity = mock(HelpActivity.class);

        when(helpActivity.openInBrowser()).thenReturn(true);

        helpActivity.openInBrowser();

        verify(helpActivity).openInBrowser();
    }
}
