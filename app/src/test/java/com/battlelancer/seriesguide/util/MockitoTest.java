package com.battlelancer.seriesguide.util;

import static org.mockito.Mockito.mock;

import android.content.Context;
import com.battlelancer.seriesguide.SgApp;
import com.uwetrottmann.trakt5.entities.ShowIds;
import com.uwetrottmann.trakt5.entities.SyncItems;
import com.uwetrottmann.trakt5.entities.SyncResponse;
import com.uwetrottmann.trakt5.entities.SyncShow;
import com.uwetrottmann.trakt5.services.Sync;
import java.io.IOException;
import org.junit.Test;
import retrofit2.Response;

/**
 * Created by FabrizioKruisland on 29/05/2018.
 *
 * @version 0.1
 */
public class MockitoTest {

    @Test
    public void testShowAdded() {
        Context context = mock(Context.class);

        SyncItems items = new SyncItems().shows(new SyncShow().id(ShowIds.tvdb(1)));
        Sync traktSync = SgApp.getServicesComponent(context).traktSync();
        Response<SyncResponse> response = null;

        try {
            response = traktSync.addItemsToWatchlist(items).execute();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
