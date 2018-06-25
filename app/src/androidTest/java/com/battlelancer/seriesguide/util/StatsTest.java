package com.battlelancer.seriesguide.util;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import android.content.ContentResolver;
import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.util.SparseIntArray;
import com.battlelancer.seriesguide.ui.stats.StatsLiveData;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.MockitoRule;

@RunWith(MockitoJUnitRunner.class)
public class StatsTest {

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Test
    public void testSerieProgress() {
        Context context = mock(Context.class);
        StatsLiveData.StatsTask statsTask = mock(StatsLiveData.StatsTask.class);
        StatsLiveData.Stats stats = mock(StatsLiveData.Stats.class);
        ContentResolver resolver = context.getContentResolver();
        SparseIntArray sparseIntArray = mock(SparseIntArray.class);

        when(statsTask.processShows(resolver, stats)).thenReturn(sparseIntArray);

        statsTask.processShows(resolver, stats);

        verify(statsTask).processShows(resolver, stats);
    }
}

