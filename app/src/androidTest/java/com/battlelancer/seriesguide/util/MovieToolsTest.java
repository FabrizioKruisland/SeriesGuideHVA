package com.battlelancer.seriesguide.util;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.battlelancer.seriesguide.ui.movies.MovieTools;
import com.uwetrottmann.trakt5.entities.Ratings;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.MockitoRule;

@RunWith(MockitoJUnitRunner.class)
public class MovieToolsTest {

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Test
    public void testRetrieveTraktRatings() {
        MovieTools movieTools = mock(MovieTools.class);
        Ratings ratings = mock(Ratings.class);
        movieTools.loadRatingsFromTrakt(1);

        when(movieTools.loadRatingsFromTrakt(1)).thenReturn(ratings);

        verify(movieTools).loadRatingsFromTrakt(1);
    }
}
