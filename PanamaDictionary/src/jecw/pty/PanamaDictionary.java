package jecw.pty;

import android.app.Activity;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class PanamaDictionary extends Activity implements OnClickListener {
	
	Button bAgarrar, bAlla, bArrabalero, bArranque, bArrebatina, bArrepinchoso, bAwebao, bArrecho;
	MediaPlayer agarrar, alla, arrabalero, arranque, arrebatina, arrepinchoso, awebao, arrecho;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
        setContentView(R.layout.main);
        
        bAgarrar = (Button) findViewById(R.id.bAgarrarSound);
        bAgarrar.setOnClickListener(this);
        agarrar = MediaPlayer.create(PanamaDictionary.this, R.raw.agarrar);
        
        bAlla = (Button) findViewById(R.id.bAllaOndeUnoSound);
        bAlla.setOnClickListener(this);
        alla = MediaPlayer.create(PanamaDictionary.this, R.raw.allaondeuno);
        
        bArrabalero = (Button) findViewById(R.id.bArrabaleroSound);
        bArrabalero.setOnClickListener(this);
        arrabalero = MediaPlayer.create(PanamaDictionary.this, R.raw.arrabalero);
        
        bArranque = (Button) findViewById(R.id.bArranqueSound);
        bArranque.setOnClickListener(this);
        arranque = MediaPlayer.create(PanamaDictionary.this, R.raw.arranque);
        
        bArrebatina = (Button) findViewById(R.id.bArrebatinaSound);
        bArrebatina.setOnClickListener(this);
        arrebatina = MediaPlayer.create(PanamaDictionary.this, R.raw.arrebatina);
        
        bArrecho = (Button) findViewById(R.id.bArrechoSound);
        bArrecho.setOnClickListener(this);
        arrecho = MediaPlayer.create(PanamaDictionary.this, R.raw.arrecho1);
        
        bArrepinchoso = (Button) findViewById(R.id.bArrepinchosoSound);
        bArrepinchoso.setOnClickListener(this);
        arrepinchoso = MediaPlayer.create(PanamaDictionary.this, R.raw.arrepinchoso);
        
        
        
        
        bAwebao = (Button) findViewById(R.id.bAwebaoSound);
        bAwebao.setOnClickListener(this);
        awebao = MediaPlayer.create(PanamaDictionary.this, R.raw.awebao);
        
        
    }

	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.bAgarrarSound:
			agarrar.start();
			break;
		case R.id.bAllaOndeUnoSound:
			alla.start();
			break;
		case R.id.bArrabaleroSound:
			arrabalero.start();
			break;
		case R.id.bArranqueSound:
			arranque.start();
			break;
			
			
		case R.id.bAwebaoSound:
			awebao.start();
			break;
		case R.id.bArrechoSound:
			arrecho.start();
			break;	
		}
		
	}
}