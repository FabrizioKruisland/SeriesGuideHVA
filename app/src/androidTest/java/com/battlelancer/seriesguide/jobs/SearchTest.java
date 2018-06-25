package com.battlelancer.seriesguide.jobs;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import android.widget.AutoCompleteTextView;
import com.battlelancer.seriesguide.ui.SearchActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.MockitoRule;

@RunWith(MockitoJUnitRunner.class)
public class SearchTest {

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Test
    public void testSearch() {
        SearchActivity searchActivity = mock(SearchActivity.class);
        AutoCompleteTextView autoCompleteTextView = mock(AutoCompleteTextView.class);

        when(searchActivity.getSearchView()).thenReturn(autoCompleteTextView);

        searchActivity.getSearchView().setText("");
        searchActivity.triggerTvdbSearch();

        verify(searchActivity).triggerTvdbSearch();
    }
}
