//PanamaDictionary.java

package jecw.pty;

import android.app.Activity;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class PanamaDictionary extends Activity implements OnClickListener {

	Button bAhuevao, bAhuevason, bAtorrancia, bAyala, bBate, bBerraco, bBerrinche, bBiencuidao, bBirria, bBochinche, bBotar, bBote, bBrujo, bBuco, bBueno, bBurundanga, bCamaron, bChantin, bChenchen, bChequear, bChicha, bChichi, bChifear, bChilin, bChinguear, bChiva, bChiwi, bCholo, bChombo, bChota, bChotear, bChuleta, bChupar, bChuzo, bCompa, bConflei, bCool, bCoscorron, bCuara, bCulantro, bCulei, bDain, bDatien, bDiabloRojo, bFocop, bFren, bFulo, bFundillo, bGallo, bGarnaton, bGrajo, bGrubear, bGuachiman, bGuacho, bGuaro, bGuial, bHuevear, bJoder, bJuegaVivo, bLaope, bLevante, bLimpio, bLiquipeiper, bLleca, bLoco, bMachoemonte, bMafa, bMaleante, bMan, bManzanillo, bMeValeVerga, bMeña, bMili, bNevera, bNoFitin, bNoMeParece, bOfi, bOmbe, bPaciero, bPalante, bParkin, bParquear, bPatacon, bPatatus, bPay, bPerro, bPeso, bPicando, bPiedrero, bPilar, bPinta, bPlena, bPonchera, bPrakaPraka, bPriti, bQueXopa, bQueloquee, bQuemado, bRakataca, bRantan, bReal, bRilax, bRispect, bSalado, bSarao, bSolido, bTaBien, bTarrantan, bTatai, bTinaco, bVaina, bValeCebo, bViolinista, bYeye;
	MediaPlayer ahuevao, ahuevason, atorrancia, ayala, bate, berraco, berrinche, biencuidao, birria, bochinche, botar, bote, brujo, buco, bueno, burundanga, camaron, chantin, chenchen, chequear, chicha, chichi, chifear, chilin, chinguear, chiva, chiwi, cholo, chombo, chota, chotear, chuleta, chupar, chuzo, compa, conflei, cool, coscorron, cuara, culantro, culei, dain, datien, diabloRojo, focop, fren, fulo, fundillo, gallo, garnaton, grajo, grubear, guachiman, guacho, guaro, guial, huevear, joder, juegaVivo, laope, levante, limpio, liquipeiper, lleca, loco, machoemonte, mafa, maleante, man, manzanillo, meValeVerga, meña, mili, nevera, noFitin, noMeParece, ofi, ombe, paciero, palante, parkin, parquear, patacon, patatus, pay, perro, peso, picando, piedrero, pilar, pinta, plena, ponchera, prakaPraka, priti, queXopa, queloquee, quemado, rakataca, rantan, real, rilax, rispect, salado, sarao, solido, taBien, tarrantan, tatai, tinaco, vaina, valeCebo, violinista, yeye;

	// Called when the activity is first created.
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
		setContentView(R.layout.main);

		bAhuevao = (Button) findViewById(R.id.bAhuevaoSound);
		bAhuevao.setOnClickListener(this);
		ahuevao = MediaPlayer.create(PanamaDictionary.this, R.raw.ahuevao);

		bAhuevason = (Button) findViewById(R.id.bAhuevasonSound);
		bAhuevason.setOnClickListener(this);
		ahuevason = MediaPlayer.create(PanamaDictionary.this, R.raw.ahuevason);

		bAtorrancia = (Button) findViewById(R.id.bAtorranciaSound);
		bAtorrancia.setOnClickListener(this);
		atorrancia = MediaPlayer.create(PanamaDictionary.this, R.raw.atorrancia);

		bAyala = (Button) findViewById(R.id.bAyalaSound);
		bAyala.setOnClickListener(this);
		ayala = MediaPlayer.create(PanamaDictionary.this, R.raw.ayala);

		bBate = (Button) findViewById(R.id.bBateSound);
		bBate.setOnClickListener(this);
		bate = MediaPlayer.create(PanamaDictionary.this, R.raw.bate);

		bBerraco = (Button) findViewById(R.id.bBerracoSound);
		bBerraco.setOnClickListener(this);
		berraco = MediaPlayer.create(PanamaDictionary.this, R.raw.berraco);

		bBerrinche = (Button) findViewById(R.id.bBerrincheSound);
		bBerrinche.setOnClickListener(this);
		berrinche = MediaPlayer.create(PanamaDictionary.this, R.raw.berrinche);

		bBiencuidao = (Button) findViewById(R.id.bBiencuidaoSound);
		bBiencuidao.setOnClickListener(this);
		biencuidao = MediaPlayer.create(PanamaDictionary.this, R.raw.biencuidao);

		bBirria = (Button) findViewById(R.id.bBirriaSound);
		bBirria.setOnClickListener(this);
		birria = MediaPlayer.create(PanamaDictionary.this, R.raw.birria);

		bBochinche = (Button) findViewById(R.id.bBochincheSound);
		bBochinche.setOnClickListener(this);
		bochinche = MediaPlayer.create(PanamaDictionary.this, R.raw.bochinche);

		bBotar = (Button) findViewById(R.id.bBotarSound);
		bBotar.setOnClickListener(this);
		botar = MediaPlayer.create(PanamaDictionary.this, R.raw.botar);

		bBote = (Button) findViewById(R.id.bBoteSound);
		bBote.setOnClickListener(this);
		bote = MediaPlayer.create(PanamaDictionary.this, R.raw.bote);

		bBrujo = (Button) findViewById(R.id.bBrujoSound);
		bBrujo.setOnClickListener(this);
		brujo = MediaPlayer.create(PanamaDictionary.this, R.raw.brujo);

		bBuco = (Button) findViewById(R.id.bBucoSound);
		bBuco.setOnClickListener(this);
		buco = MediaPlayer.create(PanamaDictionary.this, R.raw.buco);

		bBueno = (Button) findViewById(R.id.bBuenoSound);
		bBueno.setOnClickListener(this);
		bueno = MediaPlayer.create(PanamaDictionary.this, R.raw.bueno);

		bBurundanga = (Button) findViewById(R.id.bBurundangaSound);
		bBurundanga.setOnClickListener(this);
		burundanga = MediaPlayer.create(PanamaDictionary.this, R.raw.burundanga);

		bCamaron = (Button) findViewById(R.id.bCamaronSound);
		bCamaron.setOnClickListener(this);
		camaron = MediaPlayer.create(PanamaDictionary.this, R.raw.camaron);

		bChantin = (Button) findViewById(R.id.bChantinSound);
		bChantin.setOnClickListener(this);
		chantin = MediaPlayer.create(PanamaDictionary.this, R.raw.chantin);

		bChenchen = (Button) findViewById(R.id.bChenchenSound);
		bChenchen.setOnClickListener(this);
		chenchen = MediaPlayer.create(PanamaDictionary.this, R.raw.chenchen);

		bChequear = (Button) findViewById(R.id.bChequearSound);
		bChequear.setOnClickListener(this);
		chequear = MediaPlayer.create(PanamaDictionary.this, R.raw.chequear);

		bChicha = (Button) findViewById(R.id.bChichaSound);
		bChicha.setOnClickListener(this);
		chicha = MediaPlayer.create(PanamaDictionary.this, R.raw.chicha);

		bChichi = (Button) findViewById(R.id.bChichiSound);
		bChichi.setOnClickListener(this);
		chichi = MediaPlayer.create(PanamaDictionary.this, R.raw.chichi);

		bChifear = (Button) findViewById(R.id.bChifearSound);
		bChifear.setOnClickListener(this);
		chifear = MediaPlayer.create(PanamaDictionary.this, R.raw.chifear);

		bChilin = (Button) findViewById(R.id.bChilinSound);
		bChilin.setOnClickListener(this);
		chilin = MediaPlayer.create(PanamaDictionary.this, R.raw.chilin);

		bChinguear = (Button) findViewById(R.id.bChinguearSound);
		bChinguear.setOnClickListener(this);
		chinguear = MediaPlayer.create(PanamaDictionary.this, R.raw.chinguear);

		bChiva = (Button) findViewById(R.id.bChivaSound);
		bChiva.setOnClickListener(this);
		chiva = MediaPlayer.create(PanamaDictionary.this, R.raw.chiva);

		bChiwi = (Button) findViewById(R.id.bChiwiSound);
		bChiwi.setOnClickListener(this);
		chiwi = MediaPlayer.create(PanamaDictionary.this, R.raw.chiwi);

		bCholo = (Button) findViewById(R.id.bCholoSound);
		bCholo.setOnClickListener(this);
		cholo = MediaPlayer.create(PanamaDictionary.this, R.raw.cholo);

		bChombo = (Button) findViewById(R.id.bChomboSound);
		bChombo.setOnClickListener(this);
		chombo = MediaPlayer.create(PanamaDictionary.this, R.raw.chombo);

		bChota = (Button) findViewById(R.id.bChotaSound);
		bChota.setOnClickListener(this);
		chota = MediaPlayer.create(PanamaDictionary.this, R.raw.chota);

		bChotear = (Button) findViewById(R.id.bChotearSound);
		bChotear.setOnClickListener(this);
		chotear = MediaPlayer.create(PanamaDictionary.this, R.raw.chotear);

		bChuleta = (Button) findViewById(R.id.bChuletaSound);
		bChuleta.setOnClickListener(this);
		chuleta = MediaPlayer.create(PanamaDictionary.this, R.raw.chuleta);

		bChupar = (Button) findViewById(R.id.bChuparSound);
		bChupar.setOnClickListener(this);
		chupar = MediaPlayer.create(PanamaDictionary.this, R.raw.chupar);

		bChuzo = (Button) findViewById(R.id.bChuzoSound);
		bChuzo.setOnClickListener(this);
		chuzo = MediaPlayer.create(PanamaDictionary.this, R.raw.chuzo);

		bCompa = (Button) findViewById(R.id.bCompaSound);
		bCompa.setOnClickListener(this);
		compa = MediaPlayer.create(PanamaDictionary.this, R.raw.compa);

		bConflei = (Button) findViewById(R.id.bConfleiSound);
		bConflei.setOnClickListener(this);
		conflei = MediaPlayer.create(PanamaDictionary.this, R.raw.conflei);

		bCool = (Button) findViewById(R.id.bCoolSound);
		bCool.setOnClickListener(this);
		cool = MediaPlayer.create(PanamaDictionary.this, R.raw.cool);

		bCoscorron = (Button) findViewById(R.id.bCoscorronSound);
		bCoscorron.setOnClickListener(this);
		coscorron = MediaPlayer.create(PanamaDictionary.this, R.raw.coscorron);

		bCuara = (Button) findViewById(R.id.bCuaraSound);
		bCuara.setOnClickListener(this);
		cuara = MediaPlayer.create(PanamaDictionary.this, R.raw.cuara);

		bCulantro = (Button) findViewById(R.id.bCulantroSound);
		bCulantro.setOnClickListener(this);
		culantro = MediaPlayer.create(PanamaDictionary.this, R.raw.culantro);

		bCulei = (Button) findViewById(R.id.bCuleiSound);
		bCulei.setOnClickListener(this);
		culei = MediaPlayer.create(PanamaDictionary.this, R.raw.culei);

		bDain = (Button) findViewById(R.id.bDainSound);
		bDain.setOnClickListener(this);
		dain = MediaPlayer.create(PanamaDictionary.this, R.raw.dain);

		bDatien = (Button) findViewById(R.id.bDatienSound);
		bDatien.setOnClickListener(this);
		datien = MediaPlayer.create(PanamaDictionary.this, R.raw.datien);

		bDiabloRojo = (Button) findViewById(R.id.bDiabloRojoSound);
		bDiabloRojo.setOnClickListener(this);
		diabloRojo = MediaPlayer.create(PanamaDictionary.this, R.raw.diabloRojo);

		bFocop = (Button) findViewById(R.id.bFocopSound);
		bFocop.setOnClickListener(this);
		focop = MediaPlayer.create(PanamaDictionary.this, R.raw.focop);

		bFren = (Button) findViewById(R.id.bFrenSound);
		bFren.setOnClickListener(this);
		fren = MediaPlayer.create(PanamaDictionary.this, R.raw.fren);

		bFulo = (Button) findViewById(R.id.bFuloSound);
		bFulo.setOnClickListener(this);
		fulo = MediaPlayer.create(PanamaDictionary.this, R.raw.fulo);

		bFundillo = (Button) findViewById(R.id.bFundilloSound);
		bFundillo.setOnClickListener(this);
		fundillo = MediaPlayer.create(PanamaDictionary.this, R.raw.fundillo);

		bGallo = (Button) findViewById(R.id.bGalloSound);
		bGallo.setOnClickListener(this);
		gallo = MediaPlayer.create(PanamaDictionary.this, R.raw.gallo);

		bGarnaton = (Button) findViewById(R.id.bGarnatonSound);
		bGarnaton.setOnClickListener(this);
		garnaton = MediaPlayer.create(PanamaDictionary.this, R.raw.garnaton);

		bGrajo = (Button) findViewById(R.id.bGrajoSound);
		bGrajo.setOnClickListener(this);
		grajo = MediaPlayer.create(PanamaDictionary.this, R.raw.grajo);

		bGrubear = (Button) findViewById(R.id.bGrubearSound);
		bGrubear.setOnClickListener(this);
		grubear = MediaPlayer.create(PanamaDictionary.this, R.raw.grubear);

		bGuachiman = (Button) findViewById(R.id.bGuachimanSound);
		bGuachiman.setOnClickListener(this);
		guachiman = MediaPlayer.create(PanamaDictionary.this, R.raw.guachiman);

		bGuacho = (Button) findViewById(R.id.bGuachoSound);
		bGuacho.setOnClickListener(this);
		guacho = MediaPlayer.create(PanamaDictionary.this, R.raw.guacho);

		bGuaro = (Button) findViewById(R.id.bGuaroSound);
		bGuaro.setOnClickListener(this);
		guaro = MediaPlayer.create(PanamaDictionary.this, R.raw.guaro);

		bGuial = (Button) findViewById(R.id.bGuialSound);
		bGuial.setOnClickListener(this);
		guial = MediaPlayer.create(PanamaDictionary.this, R.raw.guial);

		bHuevear = (Button) findViewById(R.id.bHuevearSound);
		bHuevear.setOnClickListener(this);
		huevear = MediaPlayer.create(PanamaDictionary.this, R.raw.huevear);

		bJoder = (Button) findViewById(R.id.bJoderSound);
		bJoder.setOnClickListener(this);
		joder = MediaPlayer.create(PanamaDictionary.this, R.raw.joder);

		bJuegaVivo = (Button) findViewById(R.id.bJuegaVivoSound);
		bJuegaVivo.setOnClickListener(this);
		juegaVivo = MediaPlayer.create(PanamaDictionary.this, R.raw.juegaVivo);

		bLaope = (Button) findViewById(R.id.bLaopeSound);
		bLaope.setOnClickListener(this);
		laope = MediaPlayer.create(PanamaDictionary.this, R.raw.laope);

		bLevante = (Button) findViewById(R.id.bLevanteSound);
		bLevante.setOnClickListener(this);
		levante = MediaPlayer.create(PanamaDictionary.this, R.raw.levante);

		bLimpio = (Button) findViewById(R.id.bLimpioSound);
		bLimpio.setOnClickListener(this);
		limpio = MediaPlayer.create(PanamaDictionary.this, R.raw.limpio);

		bLiquipeiper = (Button) findViewById(R.id.bLiquipeiperSound);
		bLiquipeiper.setOnClickListener(this);
		liquipeiper = MediaPlayer.create(PanamaDictionary.this, R.raw.liquipeiper);

		bLleca = (Button) findViewById(R.id.bLlecaSound);
		bLleca.setOnClickListener(this);
		lleca = MediaPlayer.create(PanamaDictionary.this, R.raw.lleca);

		bLoco = (Button) findViewById(R.id.bLocoSound);
		bLoco.setOnClickListener(this);
		loco = MediaPlayer.create(PanamaDictionary.this, R.raw.loco);

		bMachoemonte = (Button) findViewById(R.id.bMachoemonteSound);
		bMachoemonte.setOnClickListener(this);
		machoemonte = MediaPlayer.create(PanamaDictionary.this, R.raw.machoemonte);

		bMafa = (Button) findViewById(R.id.bMafaSound);
		bMafa.setOnClickListener(this);
		mafa = MediaPlayer.create(PanamaDictionary.this, R.raw.mafa);

		bMaleante = (Button) findViewById(R.id.bMaleanteSound);
		bMaleante.setOnClickListener(this);
		maleante = MediaPlayer.create(PanamaDictionary.this, R.raw.maleante);

		bMan = (Button) findViewById(R.id.bManSound);
		bMan.setOnClickListener(this);
		man = MediaPlayer.create(PanamaDictionary.this, R.raw.man);

		bManzanillo = (Button) findViewById(R.id.bManzanilloSound);
		bManzanillo.setOnClickListener(this);
		manzanillo = MediaPlayer.create(PanamaDictionary.this, R.raw.manzanillo);

		bMeValeVerga = (Button) findViewById(R.id.bMeValeVergaSound);
		bMeValeVerga.setOnClickListener(this);
		meValeVerga = MediaPlayer.create(PanamaDictionary.this, R.raw.meValeVerga);

		bMeña = (Button) findViewById(R.id.bMeñaSound);
		bMeña.setOnClickListener(this);
		meña = MediaPlayer.create(PanamaDictionary.this, R.raw.meña);

		bMili = (Button) findViewById(R.id.bMiliSound);
		bMili.setOnClickListener(this);
		mili = MediaPlayer.create(PanamaDictionary.this, R.raw.mili);

		bNevera = (Button) findViewById(R.id.bNeveraSound);
		bNevera.setOnClickListener(this);
		nevera = MediaPlayer.create(PanamaDictionary.this, R.raw.nevera);

		bNoFitin = (Button) findViewById(R.id.bNoFitinSound);
		bNoFitin.setOnClickListener(this);
		noFitin = MediaPlayer.create(PanamaDictionary.this, R.raw.noFitin);

		bNoMeParece = (Button) findViewById(R.id.bNoMePareceSound);
		bNoMeParece.setOnClickListener(this);
		noMeParece = MediaPlayer.create(PanamaDictionary.this, R.raw.noMeParece);

		bOfi = (Button) findViewById(R.id.bOfiSound);
		bOfi.setOnClickListener(this);
		ofi = MediaPlayer.create(PanamaDictionary.this, R.raw.ofi);

		bOmbe = (Button) findViewById(R.id.bOmbeSound);
		bOmbe.setOnClickListener(this);
		ombe = MediaPlayer.create(PanamaDictionary.this, R.raw.ombe);

		bPaciero = (Button) findViewById(R.id.bPacieroSound);
		bPaciero.setOnClickListener(this);
		paciero = MediaPlayer.create(PanamaDictionary.this, R.raw.paciero);

		bPalante = (Button) findViewById(R.id.bPalanteSound);
		bPalante.setOnClickListener(this);
		palante = MediaPlayer.create(PanamaDictionary.this, R.raw.palante);

		bParkin = (Button) findViewById(R.id.bParkinSound);
		bParkin.setOnClickListener(this);
		parkin = MediaPlayer.create(PanamaDictionary.this, R.raw.parkin);

		bParquear = (Button) findViewById(R.id.bParquearSound);
		bParquear.setOnClickListener(this);
		parquear = MediaPlayer.create(PanamaDictionary.this, R.raw.parquear);

		bPatacon = (Button) findViewById(R.id.bPataconSound);
		bPatacon.setOnClickListener(this);
		patacon = MediaPlayer.create(PanamaDictionary.this, R.raw.patacon);

		bPatatus = (Button) findViewById(R.id.bPatatusSound);
		bPatatus.setOnClickListener(this);
		patatus = MediaPlayer.create(PanamaDictionary.this, R.raw.patatus);

		bPay = (Button) findViewById(R.id.bPaySound);
		bPay.setOnClickListener(this);
		pay = MediaPlayer.create(PanamaDictionary.this, R.raw.pay);

		bPerro = (Button) findViewById(R.id.bPerroSound);
		bPerro.setOnClickListener(this);
		perro = MediaPlayer.create(PanamaDictionary.this, R.raw.perro);

		bPeso = (Button) findViewById(R.id.bPesoSound);
		bPeso.setOnClickListener(this);
		peso = MediaPlayer.create(PanamaDictionary.this, R.raw.peso);

		bPicando = (Button) findViewById(R.id.bPicandoSound);
		bPicando.setOnClickListener(this);
		picando = MediaPlayer.create(PanamaDictionary.this, R.raw.picando);

		bPiedrero = (Button) findViewById(R.id.bPiedreroSound);
		bPiedrero.setOnClickListener(this);
		piedrero = MediaPlayer.create(PanamaDictionary.this, R.raw.piedrero);

		bPilar = (Button) findViewById(R.id.bPilarSound);
		bPilar.setOnClickListener(this);
		pilar = MediaPlayer.create(PanamaDictionary.this, R.raw.pilar);

		bPinta = (Button) findViewById(R.id.bPintaSound);
		bPinta.setOnClickListener(this);
		pinta = MediaPlayer.create(PanamaDictionary.this, R.raw.pinta);

		bPlena = (Button) findViewById(R.id.bPlenaSound);
		bPlena.setOnClickListener(this);
		plena = MediaPlayer.create(PanamaDictionary.this, R.raw.plena);

		bPonchera = (Button) findViewById(R.id.bPoncheraSound);
		bPonchera.setOnClickListener(this);
		ponchera = MediaPlayer.create(PanamaDictionary.this, R.raw.ponchera);

		bPrakaPraka = (Button) findViewById(R.id.bPrakaPrakaSound);
		bPrakaPraka.setOnClickListener(this);
		prakaPraka = MediaPlayer.create(PanamaDictionary.this, R.raw.prakaPraka);

		bPriti = (Button) findViewById(R.id.bPritiSound);
		bPriti.setOnClickListener(this);
		priti = MediaPlayer.create(PanamaDictionary.this, R.raw.priti);

		bQueXopa = (Button) findViewById(R.id.bQueXopaSound);
		bQueXopa.setOnClickListener(this);
		queXopa = MediaPlayer.create(PanamaDictionary.this, R.raw.queXopa);

		bQueloquee = (Button) findViewById(R.id.bQueloqueeSound);
		bQueloquee.setOnClickListener(this);
		queloquee = MediaPlayer.create(PanamaDictionary.this, R.raw.queloquee);

		bQuemado = (Button) findViewById(R.id.bQuemadoSound);
		bQuemado.setOnClickListener(this);
		quemado = MediaPlayer.create(PanamaDictionary.this, R.raw.quemado);

		bRakataca = (Button) findViewById(R.id.bRakatacaSound);
		bRakataca.setOnClickListener(this);
		rakataca = MediaPlayer.create(PanamaDictionary.this, R.raw.rakataca);

		bRantan = (Button) findViewById(R.id.bRantanSound);
		bRantan.setOnClickListener(this);
		rantan = MediaPlayer.create(PanamaDictionary.this, R.raw.rantan);

		bReal = (Button) findViewById(R.id.bRealSound);
		bReal.setOnClickListener(this);
		real = MediaPlayer.create(PanamaDictionary.this, R.raw.real);

		bRilax = (Button) findViewById(R.id.bRilaxSound);
		bRilax.setOnClickListener(this);
		rilax = MediaPlayer.create(PanamaDictionary.this, R.raw.rilax);

		bRispect = (Button) findViewById(R.id.bRispectSound);
		bRispect.setOnClickListener(this);
		rispect = MediaPlayer.create(PanamaDictionary.this, R.raw.rispect);

		bSalado = (Button) findViewById(R.id.bSaladoSound);
		bSalado.setOnClickListener(this);
		salado = MediaPlayer.create(PanamaDictionary.this, R.raw.salado);

		bSarao = (Button) findViewById(R.id.bSaraoSound);
		bSarao.setOnClickListener(this);
		sarao = MediaPlayer.create(PanamaDictionary.this, R.raw.sarao);

		bSolido = (Button) findViewById(R.id.bSolidoSound);
		bSolido.setOnClickListener(this);
		solido = MediaPlayer.create(PanamaDictionary.this, R.raw.solido);

		bTaBien = (Button) findViewById(R.id.bTaBienSound);
		bTaBien.setOnClickListener(this);
		taBien = MediaPlayer.create(PanamaDictionary.this, R.raw.taBien);

		bTarrantan = (Button) findViewById(R.id.bTarrantanSound);
		bTarrantan.setOnClickListener(this);
		tarrantan = MediaPlayer.create(PanamaDictionary.this, R.raw.tarrantan);

		bTatai = (Button) findViewById(R.id.bTataiSound);
		bTatai.setOnClickListener(this);
		tatai = MediaPlayer.create(PanamaDictionary.this, R.raw.tatai);

		bTinaco = (Button) findViewById(R.id.bTinacoSound);
		bTinaco.setOnClickListener(this);
		tinaco = MediaPlayer.create(PanamaDictionary.this, R.raw.tinaco);

		bVaina = (Button) findViewById(R.id.bVainaSound);
		bVaina.setOnClickListener(this);
		vaina = MediaPlayer.create(PanamaDictionary.this, R.raw.vaina);

		bValeCebo = (Button) findViewById(R.id.bValeCeboSound);
		bValeCebo.setOnClickListener(this);
		valeCebo = MediaPlayer.create(PanamaDictionary.this, R.raw.valeCebo);

		bViolinista = (Button) findViewById(R.id.bViolinistaSound);
		bViolinista.setOnClickListener(this);
		violinista = MediaPlayer.create(PanamaDictionary.this, R.raw.violinista);

		bYeye = (Button) findViewById(R.id.bYeyeSound);
		bYeye.setOnClickListener(this);
		yeye = MediaPlayer.create(PanamaDictionary.this, R.raw.yeye);

	}

	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.bAhuevaoSound:
			ahuevao.start();
			break;
		case R.id.bAhuevasonSound:
			ahuevason.start();
			break;
		case R.id.bAtorranciaSound:
			atorrancia.start();
			break;
		case R.id.bAyalaSound:
			ayala.start();
			break;
		case R.id.bBateSound:
			bate.start();
			break;
		case R.id.bBerracoSound:
			berraco.start();
			break;
		case R.id.bBerrincheSound:
			berrinche.start();
			break;
		case R.id.bBiencuidaoSound:
			biencuidao.start();
			break;
		case R.id.bBirriaSound:
			birria.start();
			break;
		case R.id.bBochincheSound:
			bochinche.start();
			break;
		case R.id.bBotarSound:
			botar.start();
			break;
		case R.id.bBoteSound:
			bote.start();
			break;
		case R.id.bBrujoSound:
			brujo.start();
			break;
		case R.id.bBucoSound:
			buco.start();
			break;
		case R.id.bBuenoSound:
			bueno.start();
			break;
		case R.id.bBurundangaSound:
			burundanga.start();
			break;
		case R.id.bCamaronSound:
			camaron.start();
			break;
		case R.id.bChantinSound:
			chantin.start();
			break;
		case R.id.bChenchenSound:
			chenchen.start();
			break;
		case R.id.bChequearSound:
			chequear.start();
			break;
		case R.id.bChichaSound:
			chicha.start();
			break;
		case R.id.bChichiSound:
			chichi.start();
			break;
		case R.id.bChifearSound:
			chifear.start();
			break;
		case R.id.bChilinSound:
			chilin.start();
			break;
		case R.id.bChinguearSound:
			chinguear.start();
			break;
		case R.id.bChivaSound:
			chiva.start();
			break;
		case R.id.bChiwiSound:
			chiwi.start();
			break;
		case R.id.bCholoSound:
			cholo.start();
			break;
		case R.id.bChomboSound:
			chombo.start();
			break;
		case R.id.bChotaSound:
			chota.start();
			break;
		case R.id.bChotearSound:
			chotear.start();
			break;
		case R.id.bChuletaSound:
			chuleta.start();
			break;
		case R.id.bChuparSound:
			chupar.start();
			break;
		case R.id.bChuzoSound:
			chuzo.start();
			break;
		case R.id.bCompaSound:
			compa.start();
			break;
		case R.id.bConfleiSound:
			conflei.start();
			break;
		case R.id.bCoolSound:
			cool.start();
			break;
		case R.id.bCoscorronSound:
			coscorron.start();
			break;
		case R.id.bCuaraSound:
			cuara.start();
			break;
		case R.id.bCulantroSound:
			culantro.start();
			break;
		case R.id.bCuleiSound:
			culei.start();
			break;
		case R.id.bDainSound:
			dain.start();
			break;
		case R.id.bDatienSound:
			datien.start();
			break;
		case R.id.bDiabloRojoSound:
			diabloRojo.start();
			break;
		case R.id.bFocopSound:
			focop.start();
			break;
		case R.id.bFrenSound:
			fren.start();
			break;
		case R.id.bFuloSound:
			fulo.start();
			break;
		case R.id.bFundilloSound:
			fundillo.start();
			break;
		case R.id.bGalloSound:
			gallo.start();
			break;
		case R.id.bGarnatonSound:
			garnaton.start();
			break;
		case R.id.bGrajoSound:
			grajo.start();
			break;
		case R.id.bGrubearSound:
			grubear.start();
			break;
		case R.id.bGuachimanSound:
			guachiman.start();
			break;
		case R.id.bGuachoSound:
			guacho.start();
			break;
		case R.id.bGuaroSound:
			guaro.start();
			break;
		case R.id.bGuialSound:
			guial.start();
			break;
		case R.id.bHuevearSound:
			huevear.start();
			break;
		case R.id.bJoderSound:
			joder.start();
			break;
		case R.id.bJuegaVivoSound:
			juegaVivo.start();
			break;
		case R.id.bLaopeSound:
			laope.start();
			break;
		case R.id.bLevanteSound:
			levante.start();
			break;
		case R.id.bLimpioSound:
			limpio.start();
			break;
		case R.id.bLiquipeiperSound:
			liquipeiper.start();
			break;
		case R.id.bLlecaSound:
			lleca.start();
			break;
		case R.id.bLocoSound:
			loco.start();
			break;
		case R.id.bMachoemonteSound:
			machoemonte.start();
			break;
		case R.id.bMafaSound:
			mafa.start();
			break;
		case R.id.bMaleanteSound:
			maleante.start();
			break;
		case R.id.bManSound:
			man.start();
			break;
		case R.id.bManzanilloSound:
			manzanillo.start();
			break;
		case R.id.bMeValeVergaSound:
			meValeVerga.start();
			break;
		case R.id.bMeñaSound:
			meña.start();
			break;
		case R.id.bMiliSound:
			mili.start();
			break;
		case R.id.bNeveraSound:
			nevera.start();
			break;
		case R.id.bNoFitinSound:
			noFitin.start();
			break;
		case R.id.bNoMePareceSound:
			noMeParece.start();
			break;
		case R.id.bOfiSound:
			ofi.start();
			break;
		case R.id.bOmbeSound:
			ombe.start();
			break;
		case R.id.bPacieroSound:
			paciero.start();
			break;
		case R.id.bPalanteSound:
			palante.start();
			break;
		case R.id.bParkinSound:
			parkin.start();
			break;
		case R.id.bParquearSound:
			parquear.start();
			break;
		case R.id.bPataconSound:
			patacon.start();
			break;
		case R.id.bPatatusSound:
			patatus.start();
			break;
		case R.id.bPaySound:
			pay.start();
			break;
		case R.id.bPerroSound:
			perro.start();
			break;
		case R.id.bPesoSound:
			peso.start();
			break;
		case R.id.bPicandoSound:
			picando.start();
			break;
		case R.id.bPiedreroSound:
			piedrero.start();
			break;
		case R.id.bPilarSound:
			pilar.start();
			break;
		case R.id.bPintaSound:
			pinta.start();
			break;
		case R.id.bPlenaSound:
			plena.start();
			break;
		case R.id.bPoncheraSound:
			ponchera.start();
			break;
		case R.id.bPrakaPrakaSound:
			prakaPraka.start();
			break;
		case R.id.bPritiSound:
			priti.start();
			break;
		case R.id.bQueXopaSound:
			queXopa.start();
			break;
		case R.id.bQueloqueeSound:
			queloquee.start();
			break;
		case R.id.bQuemadoSound:
			quemado.start();
			break;
		case R.id.bRakatacaSound:
			rakataca.start();
			break;
		case R.id.bRantanSound:
			rantan.start();
			break;
		case R.id.bRealSound:
			real.start();
			break;
		case R.id.bRilaxSound:
			rilax.start();
			break;
		case R.id.bRispectSound:
			rispect.start();
			break;
		case R.id.bSaladoSound:
			salado.start();
			break;
		case R.id.bSaraoSound:
			sarao.start();
			break;
		case R.id.bSolidoSound:
			solido.start();
			break;
		case R.id.bTaBienSound:
			taBien.start();
			break;
		case R.id.bTarrantanSound:
			tarrantan.start();
			break;
		case R.id.bTataiSound:
			tatai.start();
			break;
		case R.id.bTinacoSound:
			tinaco.start();
			break;
		case R.id.bVainaSound:
			vaina.start();
			break;
		case R.id.bValeCeboSound:
			valeCebo.start();
			break;
		case R.id.bViolinistaSound:
			violinista.start();
			break;
		case R.id.bYeyeSound:
			yeye.start();
			break;
		}
	}
}
