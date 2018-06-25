package com.battlelancer.seriesguide.util;

import static com.battlelancer.seriesguide.settings.DisplaySettings.KEY_LANGUAGE_PREFERRED;
import static com.battlelancer.seriesguide.settings.DisplaySettings.LANGUAGE_EN;
import static junit.framework.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import android.content.Context;
import android.preference.PreferenceManager;
import android.support.test.InstrumentationRegistry;
import com.battlelancer.seriesguide.ui.SeriesGuidePreferences;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.MockitoRule;

@RunWith(MockitoJUnitRunner.class)
public class PreferenceMangerTest {

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Test
    public void testPreferredLanguageChanged() {
        Context context = InstrumentationRegistry.getTargetContext();

        PreferenceManager.getDefaultSharedPreferences(context).edit()
                .putString(KEY_LANGUAGE_PREFERRED, "nl").commit();

        String originalPreferredLanguage = PreferenceManager.getDefaultSharedPreferences(context)
                .getString(KEY_LANGUAGE_PREFERRED, LANGUAGE_EN);

        PreferenceManager.getDefaultSharedPreferences(context).edit()
                .putString(KEY_LANGUAGE_PREFERRED, LANGUAGE_EN).commit();

        String updatedPreferredLanguage = PreferenceManager.getDefaultSharedPreferences(context)
                .getString(KEY_LANGUAGE_PREFERRED, LANGUAGE_EN);


        assertTrue("Failed - Language did not change",
                originalPreferredLanguage.equals(updatedPreferredLanguage));
    }

    @Test
    public void testPreferredThemeChanged() {
        String originalThemeId = "1";
        String updatedThemeId = "2";
        SeriesGuidePreferences seriesGuidePreferences = mock(SeriesGuidePreferences.class);

        SeriesGuidePreferences.THEME = Integer.valueOf(originalThemeId);

        ThemeUtils.updateTheme(updatedThemeId);

        when(seriesGuidePreferences.getPreferredTheme())
                .thenReturn(Integer.valueOf(updatedThemeId));

        verify(seriesGuidePreferences).getPreferredTheme();
    }
}

