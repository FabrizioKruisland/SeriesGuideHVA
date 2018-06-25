package com.battlelancer.seriesguide.util;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import com.battlelancer.seriesguide.dataliberation.DataLiberationFragment;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.MockitoRule;

@RunWith(MockitoJUnitRunner.class)
public class DataLiberationImportTest {

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Test
    public void testDataLiberationImport() {
        DataLiberationFragment dataLiberationFragment = mock(DataLiberationFragment.class);
        verify(dataLiberationFragment).doDataLiberationAction(2);
    }
}
