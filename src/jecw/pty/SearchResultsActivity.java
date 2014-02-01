package jecw.pty;

import android.app.ListActivity;
import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SearchResultsActivity extends ListActivity {
	
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setIntent(newIntent);
		
        handleIntent(getIntent());
    }

    @Override
    protected void onNewIntent(Intent intent) {
        handleIntent(intent);
    }
	
	//public void onListItemClick(ListView l, View v, int position, long id) { 
      // call detail activity for clicked entry 
	//}

    private void handleIntent(Intent intent) {	

        if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
            String query = intent.getStringExtra(SearchManager.QUERY);
            //use the query to search your data somehow
			doSearch(query);
        }
    }
	
	private void doSearch(String queryStr) { 
   // get a Cursor, prepare the ListAdapter
   // and set it
		//onSearchRequested();
		Toast.makeText(this, R.string.app_name, Toast.LENGTH_SHORT);
   }
/*
	private void onSearchRequested()
	{
		startSearch();
	}
	
	private void startSearch(String initialQuery, boolean selectInitialQuery, Bundle appSearchData, boolean globalSearch)
	{
		
	}*/

}
