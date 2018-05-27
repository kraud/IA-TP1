package frsf.cidisi.exercise.idemiatp1.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import domain.Arco;
import domain.Casillero;

public class GranInit {
	GrafoCasa mapa = new GrafoCasa();
	
	public GranInit(){
		inicializar();
	}
	
	public GrafoCasa getMapa(){
		return this.mapa;
	}

	private void inicializar() {
		
		// Agregar definiciones para Casilleros de origen y destino del Agente 
		
		
		List<Casillero> nodos = new ArrayList<Casillero>();
		List<Arco> aristas = new ArrayList<Arco>();

		// Se cargan todos los nodos
		
		// EJEMPLOS
		
		
		/*
		  List<Double> aCoord = Arrays.asList(1.0, 3.0);
		Casillero a = new Casillero("A",1.0,false,0,aCoord);
		nodos.add(a);
		  
		List<Double> bCoord = Arrays.asList(1.0, 2.0);
		Casillero b = new Casillero("B",1.0,false,0,bCoord);
		nodos.add(b);
		
		List<Double> cCoord = Arrays.asList(1.0, 1.0);
		Casillero c = new Casillero("C",1.0,false,0,cCoord);
		nodos.add(c);
		
		List<Double> dCoord = Arrays.asList(2.0, 1.0);
		Casillero d = new Casillero("D",1.0,false,0,dCoord);
		nodos.add(d);
		
		List<Double> eCoord = Arrays.asList(2.0, 2.0);
		Casillero e = new Casillero("E",1.0,false,0,eCoord);
		nodos.add(e);
		
		List<Double> fCoord = Arrays.asList(2.0, 3.0);
		Casillero f = new Casillero("F",1.0,false,0,fCoord);
		nodos.add(f);
		
		List<Double> gCoord = Arrays.asList(3.0, 3.0);
		Casillero g = new Casillero("G",1.0,false,0,gCoord);
		nodos.add(g);
		
		List<Double> hCoord = Arrays.asList(3.0, 2.0);
		Casillero h = new Casillero("H",1.0,false,0,hCoord);
		nodos.add(h);
		
		List<Double> iCoord = Arrays.asList(3.0, 1.0);
		Casillero i = new Casillero("I",1.0,false,0,iCoord);
		nodos.add(i);
		
		aristas.add(new Arco("AB",'v',a,b,1.0));
		aristas.add(new Arco("BC",'v',b,c,1.0));
		aristas.add(new Arco("CD",'h',c,d,1.0));
		aristas.add(new Arco("DE",'v',e,d,1.0));
		aristas.add(new Arco("EF",'v',f,e,1.0));
		aristas.add(new Arco("FG",'h',f,g,1.0));
		aristas.add(new Arco("GH",'v',g,h,1.0));
		aristas.add(new Arco("HI",'v',h,i,1.0));
		aristas.add(new Arco("DI",'h',d,i,1.0));
		aristas.add(new Arco("AF",'h',a,f,1.0));
		  
		*/
		 
		
		//List<Double> n1Coord = Arrays.asList(1.38, 2.56);
		//Casillero n1 = new Casillero("n1",0.5,false,0,n1Coord);
		//nodos.add(n1);
		
		//List<Double> n2Coord = Arrays.asList(2.38, 2.56);
		//Casillero n2 = new Casillero("n2",0.5,false,0,n2Coord);
		//nodos.add(n2);
		
		
		// nodos patio delantero:
		List<Double> pd0Coord = Arrays.asList(1.5, 2.5);
		Casillero pd0 = new Casillero("PD0",0.5,false,0,pd0Coord);
		nodos.add(pd0);
		
		List<Double> pd1Coord = Arrays.asList(1.5, 5.5);
		Casillero pd1 = new Casillero("PD1",0.5,false,0,pd1Coord);
		nodos.add(pd1);
		
		List<Double> pd2Coord = Arrays.asList(1.5, 9.0);
		Casillero pd2 = new Casillero("PD2",1.0,false,0,pd2Coord);
		nodos.add(pd2);
		
		List<Double> pd3Coord = Arrays.asList(1.5, 11.5);
		Casillero pd3 = new Casillero("PD3",1.0,false,0,pd3Coord);
		nodos.add(pd3);
		
		List<Double> pd4Coord = Arrays.asList(1.5, 16.0);
		Casillero pd4 = new Casillero("PD4",0.5,false,0,pd4Coord);
		nodos.add(pd4);
		
		List<Double> pd5Coord = Arrays.asList(3.5, 5.5);
		Casillero pd5 = new Casillero("PD5",1.0,false,1,pd5Coord);
		nodos.add(pd5);
		
		List<Double> pd6Coord = Arrays.asList(3.5, 9.0);
		Casillero pd6 = new Casillero("PD6",1.0,false,1,pd6Coord);
		nodos.add(pd6);
		
		List<Double> pd7Coord = Arrays.asList(3.5, 11.5);
		Casillero pd7 = new Casillero("PD7",1.0,false,0,pd7Coord);
		nodos.add(pd7);
		
		List<Double> pd8Coord = Arrays.asList(3.5, 14.0);
		Casillero pd8 = new Casillero("PD8",1.0,false,0,pd8Coord);
		nodos.add(pd8);
		
		// nodos patio right
		
		List<Double> pr0Coord = Arrays.asList(5.5, 16.0);
		Casillero pr0 = new Casillero("PR0",1.0,false,0,pr0Coord);
		nodos.add(pr0);
		
		List<Double> pr1Coord = Arrays.asList(10.0, 16.0);
		Casillero pr1 = new Casillero("PR1",1.0,false,0,pr1Coord);
		nodos.add(pr1);
		
		List<Double> pr2Coord = Arrays.asList(14.5, 16.0);
		Casillero pr2 = new Casillero("PR2",1.0,false,0,pr2Coord);
		nodos.add(pr2);
		
		List<Double> pr3Coord = Arrays.asList(19.0, 16.0);
		Casillero pr3 = new Casillero("PR3",1.0,false,0,pr3Coord);
		nodos.add(pr3);
		
		List<Double> pr4Coord = Arrays.asList(24.0, 16.0);
		Casillero pr4 = new Casillero("PR4",1.0,false,0,pr4Coord);
		nodos.add(pr4);
		
		//nodos patio left
		
		List<Double> pl0Coord = Arrays.asList(6.5, 2.5);
		Casillero pl0 = new Casillero("PL0",0.5,false,0,pl0Coord);
		nodos.add(pl0);
		
		List<Double> pl1Coord = Arrays.asList(6.5, 1.0);
		Casillero pl1 = new Casillero("PL1",0.5,false,0,pl1Coord);
		nodos.add(pl1);

		List<Double> pl2Coord = Arrays.asList(14.0, 1.0);
		Casillero pl2 = new Casillero("PL2",0.5,false,0,pl2Coord);
		nodos.add(pl2);
		
		List<Double> pl3Coord = Arrays.asList(19.5, 1.0);
		Casillero pl3 = new Casillero("PL3",0.5,false,0,pl3Coord);
		nodos.add(pl3);
		
		List<Double> pl4Coord = Arrays.asList(24.0, 1.0);
		Casillero pl4 = new Casillero("PL4",0.5,false,0,pl4Coord);
		nodos.add(pl4);
		
		//nodos patio trasero
		
		List<Double> pt0Coord = Arrays.asList(29.5, 1.0);
		Casillero pt0 = new Casillero("PT0",0.5,false,0,pt0Coord);
		nodos.add(pt0);
		
		List<Double> pt1Coord = Arrays.asList(29.5, 4.5);
		Casillero pt1 = new Casillero("PT1",0.5,false,0,pt1Coord);
		nodos.add(pt1);
		
		List<Double> pt2Coord = Arrays.asList(29.5, 6.5);
		Casillero pt2 = new Casillero("PT2",0.5,false,0,pt2Coord);
		nodos.add(pt2);
		
		List<Double> pt3Coord = Arrays.asList(29.5, 9.0);
		Casillero pt3 = new Casillero("PT3",0.5,false,0,pt3Coord);
		nodos.add(pt3);
		
		List<Double> pt4Coord = Arrays.asList(29.5, 12.5);
		Casillero pt4 = new Casillero("PT4",0.5,false,0,pt4Coord);
		nodos.add(pt4);
		
		List<Double> pt5Coord = Arrays.asList(29.5, 16.0);
		Casillero pt5 = new Casillero("PT5",0.5,false,0,pt5Coord);
		nodos.add(pt5);
		
		List<Double> pt6Coord = Arrays.asList(27.0, 16.0);
		Casillero pt6 = new Casillero("PT6",0.5,false,0,pt6Coord);
		nodos.add(pt6);
		
		List<Double> pt7Coord = Arrays.asList(27.0, 12.5);
		Casillero pt7 = new Casillero("PT7",0.5,false,0,pt7Coord);
		nodos.add(pt7);
		
		List<Double> pt8Coord = Arrays.asList(27.0, 9.0);
		Casillero pt8 = new Casillero("PT8",0.5,false,0,pt8Coord);
		nodos.add(pt8);
		
        //nodos garage
		
		List<Double> ga0Coord = Arrays.asList(6.0, 14.0);
		Casillero ga0 = new Casillero("GA0",1.0,false,0,ga0Coord);
		nodos.add(ga0);
		
		List<Double> ga1Coord = Arrays.asList(8.5, 14.0);
		Casillero ga1 = new Casillero("GA1",1.0,false,0,ga1Coord);
		nodos.add(ga1);
		
		List<Double> ga2Coord = Arrays.asList(8.5, 11.5);
		Casillero ga2 = new Casillero("GA2",1.0,false,0,ga2Coord);
		nodos.add(ga2);
		
		List<Double> ga3Coord = Arrays.asList(8.5, 9.0);
		Casillero ga3 = new Casillero("GA3",1.0,false,0,ga3Coord);
		nodos.add(ga3);
		
		List<Double> ga4Coord = Arrays.asList(5.5, 9.0);
		Casillero ga4 = new Casillero("GA4",1.0,false,0,ga4Coord);
		nodos.add(ga4);
		
		List<Double> ga5Coord = Arrays.asList(5.5, 11.5);
		Casillero ga5 = new Casillero("GA5",1.0,true,0,ga5Coord);
		nodos.add(ga5);
		
		//nodos corredor
		
		List<Double> co0Coord = Arrays.asList(10.5, 11.5);
		Casillero co0 = new Casillero("CO0",1.0,false,0,co0Coord);
		nodos.add(co0);
		
		List<Double> co1Coord = Arrays.asList(13.0, 11.5);
		Casillero co1 = new Casillero("CO1",1.0,false,0,co1Coord);
		nodos.add(co1);
		
		List<Double> co2Coord = Arrays.asList(14.0, 11.5);
		Casillero co2 = new Casillero("CO2",1.0,false,0,co2Coord);
		nodos.add(co2);
		
		List<Double> co3Coord = Arrays.asList(15.0, 11.5);
		Casillero co3 = new Casillero("CO3",1.0,false,0,co3Coord);
		nodos.add(co3);
		
		List<Double> co4Coord = Arrays.asList(16.0, 11.5);
		Casillero co4 = new Casillero("CO4",1.0,false,0,co4Coord);
		nodos.add(co4);
		
		List<Double> co5Coord = Arrays.asList(19.0, 11.5);
		Casillero co5 = new Casillero("CO5",1.0,false,0,co5Coord);
		nodos.add(co5);
		
		//NODO STEP CORREDOR SC
		
		List<Double> scCoord = Arrays.asList(17.5, 11.5);
		Casillero sc = new Casillero("SC",0.5,false,0,scCoord);
		nodos.add(sc);
		
		// nodo lavadero W
		List<Double> wwCoord = Arrays.asList(10.5, 14.0);
		Casillero ww = new Casillero("WW0",1.0,false,0,wwCoord);
		nodos.add(ww);
		
		//nodos habitacion r HR
		
		List<Double> hr0Coord = Arrays.asList(13.0, 13.0);
		Casillero hr0 = new Casillero("HR0",0.5,false,0,hr0Coord);
		nodos.add(hr0);
		
		List<Double> hr1Coord = Arrays.asList(11.0, 13.0);
		Casillero hr1 = new Casillero("HR1",0.5,false,0,hr1Coord);
		nodos.add(hr1);
		
		List<Double> hr2Coord = Arrays.asList(11.0, 14.5);
		Casillero hr2 = new Casillero("HR2",0.5,false,0,hr2Coord);
		nodos.add(hr2);
		
		List<Double> hr3Coord = Arrays.asList(13.0, 14.5);
		Casillero hr3 = new Casillero("HR3",0.5,false,0,hr3Coord);
		nodos.add(hr3);
		
		//nodos habitacion l HL
		
		List<Double> hl0Coord = Arrays.asList(16.0, 13.0);
		Casillero hl0 = new Casillero("HL0",0.5,false,0,hl0Coord);
		nodos.add(hl0);
		
		List<Double> hl1Coord = Arrays.asList(18.0, 13.0);
		Casillero hl1 = new Casillero("HL1",0.5,false,0,hl1Coord);
		nodos.add(hl1);
		
		List<Double> hl2Coord = Arrays.asList(18.0, 14.5);
		Casillero hl2 = new Casillero("HL2",0.5,false,0,hl2Coord);
		nodos.add(hl2);
		
		List<Double> hl3Coord = Arrays.asList(16.0, 14.5);
		Casillero hl3 = new Casillero("HL3",0.5,false,0,hl3Coord);
		nodos.add(hl3);
		
		//nodos BAÑO CORREDOR BC
		
		List<Double> bc0Coord = Arrays.asList(15.0, 12.5);
		Casillero bc0 = new Casillero("BC0",1.0,false,0,bc0Coord);
		nodos.add(bc0);
		
		List<Double> bc1Coord = Arrays.asList(14.5, 12.5);
		Casillero bc1 = new Casillero("BC1",1.0,false,0,bc1Coord);
		nodos.add(bc1);
		
		List<Double> bc2Coord = Arrays.asList(15.0, 14.0);
		Casillero bc2 = new Casillero("BC2",1.0,false,0,bc2Coord);
		nodos.add(bc2);
		
		List<Double> bc3Coord = Arrays.asList(14.0, 14.0);
		Casillero bc3 = new Casillero("BC3",1.0,false,0,bc3Coord);
		nodos.add(bc3);
		
		//nodos habitacion grande HG
		
		List<Double> hg0Coord = Arrays.asList(21.0, 11.5);
		Casillero hg0 = new Casillero("HG0",0.5,false,0,hg0Coord);
		nodos.add(hg0);
		
		List<Double> hg1Coord = Arrays.asList(21.0, 9.5);
		Casillero hg1 = new Casillero("HG1",0.5,false,0,hg1Coord);
		nodos.add(hg1);
		
		List<Double> hg2Coord = Arrays.asList(24.5, 9.5);
		Casillero hg2 = new Casillero("HG2",0.5,false,0,hg2Coord);
		nodos.add(hg2);
		
		List<Double> hg3Coord = Arrays.asList(24.5, 12.5);
		Casillero hg3 = new Casillero("HG3",0.5,false,0,hg3Coord);
		nodos.add(hg3);
		
		List<Double> hg4Coord = Arrays.asList(21.0, 12.5);
		Casillero hg4 = new Casillero("HG4",0.5,false,0,hg4Coord);
		nodos.add(hg4);
		
		
		//nodos baño grande BG
		
		List<Double> bg0Coord = Arrays.asList(20.0, 12.5);
		Casillero bg0 = new Casillero("BG0",1.0,false,0,bg0Coord);
		nodos.add(bg0);
		
		List<Double> bg1Coord = Arrays.asList(19.0, 12.5);
		Casillero bg1 = new Casillero("BG1",1.0,false,0,bg1Coord);
		nodos.add(bg1);
		
		List<Double> bg2Coord = Arrays.asList(19.5, 14.0);
		Casillero bg2 = new Casillero("BG2",1.0,false,0,bg2Coord);
		nodos.add(bg2);
		
		List<Double> bg3Coord = Arrays.asList(20.0, 14.0);
		Casillero bg3 = new Casillero("BG3",1.0,false,0,bg3Coord);
		nodos.add(bg3);
		
		List<Double> bg4Coord = Arrays.asList(21.0, 14.0);
		Casillero bg4 = new Casillero("BG4",1.0,false,0,bg4Coord);
		nodos.add(bg4);
		
		//nodos cocina K
		
		List<Double> ki0Coord = Arrays.asList(12.5, 5.5);
		Casillero ki0 = new Casillero("KI0",1.0,false,0,ki0Coord);
		nodos.add(ki0);
		
		List<Double> ki1Coord = Arrays.asList(12.5, 6.5);
		Casillero ki1 = new Casillero("KI1",1.0,false,0,ki1Coord);
		nodos.add(ki1);
		
		List<Double> ki2Coord = Arrays.asList(11.0, 6.5);
		Casillero ki2 = new Casillero("KI2",1.0,false,0,ki2Coord);
		nodos.add(ki2);
		
		List<Double> ki3Coord = Arrays.asList(11.0, 10.5);
		Casillero ki3 = new Casillero("KI3",1.0,false,0,ki3Coord);
		nodos.add(ki3);
		
		List<Double> ki4Coord = Arrays.asList(12.5, 10.5);
		Casillero ki4 = new Casillero("KI4",1.0,false,0,ki4Coord);
		nodos.add(ki4);
		
		List<Double> ki5Coord = Arrays.asList(12.5, 7.5);
		Casillero ki5 = new Casillero("KI5",1.0,false,0,ki5Coord);
		nodos.add(ki5);
		
		List<Double> ki6Coord = Arrays.asList(14.0, 10.5);
		Casillero ki6 = new Casillero("KI6",1.0,false,0,ki6Coord);
		nodos.add(ki6);
		
		List<Double> ki7Coord = Arrays.asList(16.0, 10.5);
		Casillero ki7 = new Casillero("KI7",1.0,false,0,ki7Coord);
		nodos.add(ki7);
		
		List<Double> ki8Coord = Arrays.asList(16.0, 7.5);
		Casillero ki8 = new Casillero("KI8",1.0,false,0,ki8Coord);
		nodos.add(ki8);
		
		List<Double> ki9Coord = Arrays.asList(14.0, 7.5);
		Casillero ki9 = new Casillero("KI9",1.0,false,0,ki9Coord);
		nodos.add(ki9);
		
		List<Double> ki10Coord = Arrays.asList(14.0, 6.5);
		Casillero ki10 = new Casillero("KI10",1.0,false,0,ki10Coord);
		nodos.add(ki10);
		
		//NODO STEP Cocina SK
		
		List<Double> skCoord = Arrays.asList(15.0, 6.5);
		Casillero sk = new Casillero("SK",0.5,false,0,skCoord);
		nodos.add(sk);
		
		//nodos living L
		
		List<Double> li0Coord = Arrays.asList(17.0, 6.5);
		Casillero li0 = new Casillero("LI0",1.0,false,0,li0Coord);
		nodos.add(li0);
		
		List<Double> li1Coord = Arrays.asList(20.0, 6.5);
		Casillero li1 = new Casillero("LI1",1.0,false,0,li1Coord);
		nodos.add(li1);
		
		List<Double> li2Coord = Arrays.asList(20.0, 8.0);
		Casillero li2 = new Casillero("LI2",1.0,false,0,li2Coord);
		nodos.add(li2);
		
		List<Double> li3Coord = Arrays.asList(20.0, 9.5);
		Casillero li3 = new Casillero("LI3",1.0,false,0,li3Coord);
		nodos.add(li3);
		
		List<Double> li4Coord = Arrays.asList(18.0, 10.0);
		Casillero li4 = new Casillero("LI4",1.0,false,0,li4Coord);
		nodos.add(li4);
		
		//nodos media M
		
		List<Double> me0Coord = Arrays.asList(12.5, 3.0);
		Casillero me0 = new Casillero("ME0",0.5,false,0,me0Coord);
		nodos.add(me0);
		
		List<Double> me1Coord = Arrays.asList(13.5, 3.5);
		Casillero me1 = new Casillero("ME1",0.5,false,0,me1Coord);
		nodos.add(me1);
		
		List<Double> me2Coord = Arrays.asList(13.5, 4.5);
		Casillero me2 = new Casillero("ME2",0.5,false,0,me2Coord);
		nodos.add(me2);
		
		List<Double> me3Coord = Arrays.asList(15.5, 4.5);
		Casillero me3 = new Casillero("ME3",0.5,false,0,me3Coord);
		nodos.add(me3);
		
		List<Double> me4Coord = Arrays.asList(15.5, 3.0);
		Casillero me4 = new Casillero("ME4",0.5,false,0,me4Coord);
		nodos.add(me4);
		
		List<Double> me5Coord = Arrays.asList(11.5, 3.5);
		Casillero me5 = new Casillero("ME5",0.5,false,0,me5Coord);
		nodos.add(me5);
		
		
		// nodos entrada E
		
		List<Double> en0Coord = Arrays.asList(6.5, 5.5);
		Casillero en0 = new Casillero("EN0",1.0,false,0,en0Coord);
		nodos.add(en0);
		
		List<Double> en1Coord = Arrays.asList(8.0, 5.5);
		Casillero en1 = new Casillero("EN1",1.0,false,0,en1Coord);
		nodos.add(en1);
		
		List<Double> en2Coord = Arrays.asList(10.0, 5.5);
		Casillero en2 = new Casillero("EN2",1.0,false,0,en2Coord);
		nodos.add(en2);
		
		// nodo Office
		
		List<Double> ofCoord = Arrays.asList(10.0, 3.5);
		Casillero of = new Casillero("OF",1.0,false,0,ofCoord);
		nodos.add(of);
		
		//nodos Habitacion de Servicio HS
		List<Double> hs0Coord = Arrays.asList(8.0, 6.5);
		Casillero hs0 = new Casillero("HS0",0.5,false,0,hs0Coord);
		nodos.add(hs0);
		
		List<Double> hs1Coord = Arrays.asList(8.0, 7.5);
		Casillero hs1 = new Casillero("HS1",0.5,false,0,hs1Coord);
		nodos.add(hs1);
		
		List<Double> hs2Coord = Arrays.asList(5.5, 6.5);
		Casillero hs2 = new Casillero("HS2",0.5,false,0,hs2Coord);
		nodos.add(hs2);
		
		List<Double> hs3Coord = Arrays.asList(5.5, 8.0);
		Casillero hs3 = new Casillero("HS3",0.5,false,0,hs3Coord);
		nodos.add(hs3);
		
		//nodos Baño Servicio BS
		List<Double> bs0Coord = Arrays.asList(9.0, 7.5);
		Casillero bs0 = new Casillero("BS0",1.0,false,0,bs0Coord);
		nodos.add(bs0);
		
		List<Double> bs1Coord = Arrays.asList(9.0, 6.5);
		Casillero bs1 = new Casillero("BS1",1.0,false,0,bs1Coord);
		nodos.add(bs1);
		
		//nodos deck 
		List<Double> de0Coord = Arrays.asList(21.5, 8.0);
		Casillero de0 = new Casillero("DE0",1.0,false,0,de0Coord);
		nodos.add(de0);
		
		List<Double> de1Coord = Arrays.asList(21.5, 6.5);
		Casillero de1 = new Casillero("DE1",1.0,false,0,de1Coord);
		nodos.add(de1);
		
		List<Double> de2Coord = Arrays.asList(21.5, 5.0);
		Casillero de2 = new Casillero("DE2",1.0,false,0,de2Coord);
		nodos.add(de2);
		
		List<Double> de3Coord = Arrays.asList(20.0, 5.0);
		Casillero de3 = new Casillero("DE3",1.0,false,0,de3Coord);
		nodos.add(de3);
		
		List<Double> de4Coord = Arrays.asList(17.0, 5.0);
		Casillero de4 = new Casillero("DE4",1.0,false,0,de4Coord);
		nodos.add(de4);
		
		List<Double> de5Coord = Arrays.asList(17.0, 3.0);
		Casillero de5 = new Casillero("DE5",1.0,false,0,de5Coord);
		nodos.add(de5);
		
		List<Double> de6Coord = Arrays.asList(20.0, 3.0);
		Casillero de6 = new Casillero("DE6",1.0,false,0,de6Coord);
		nodos.add(de6);
		
		List<Double> de7Coord = Arrays.asList(21.5, 3.0);
		Casillero de7 = new Casillero("DE7",1.0,false,0,de7Coord);
		nodos.add(de7);
		
		List<Double> de8Coord = Arrays.asList(22.5, 3.0);
		Casillero de8 = new Casillero("DE8",1.0,false,0,de8Coord);
		nodos.add(de8);
		
		List<Double> de9Coord = Arrays.asList(22.5, 5.0);
		Casillero de9 = new Casillero("DE9",1.0,false,0,de9Coord);
		nodos.add(de9);
		
		List<Double> de10Coord = Arrays.asList(22.5, 8.0);
		Casillero de10 = new Casillero("DE10",1.0,false,0,de10Coord);
		nodos.add(de10);
		
		List<Double> de11Coord = Arrays.asList(24.0, 8.0);
		Casillero de11 = new Casillero("DE11",1.0,false,0,de11Coord);
		nodos.add(de11);
		
		List<Double> de12Coord = Arrays.asList(24.0, 5.0);
		Casillero de12 = new Casillero("DE12",1.0,false,0,de12Coord);
		nodos.add(de12);
		
		List<Double> de13Coord = Arrays.asList(24.0, 2.5);
		Casillero de13 = new Casillero("DE13",1.0,false,0,de13Coord);
		nodos.add(de13);
		
		List<Double> de14Coord = Arrays.asList(25.0, 2.5);
		Casillero de14 = new Casillero("DE14",1.0,false,0,de14Coord);
		nodos.add(de14);
		
		List<Double> de15Coord = Arrays.asList(27.5, 2.5);
		Casillero de15 = new Casillero("DE15",1.0,false,0,de15Coord);
		nodos.add(de15);
		
		List<Double> de16Coord = Arrays.asList(27.5, 4.5);
		Casillero de16 = new Casillero("DE16",1.0,false,0,de16Coord);
		nodos.add(de16);
		
		List<Double> de17Coord = Arrays.asList(27.5, 6.5);
		Casillero de17 = new Casillero("DE17",1.0,false,0,de17Coord);
		nodos.add(de17);
		
		List<Double> de18Coord = Arrays.asList(25.0, 6.5);
		Casillero de18 = new Casillero("DE18",1.0,false,0,de18Coord);
		nodos.add(de18);
		
		List<Double> de19Coord = Arrays.asList(25.0, 5.0);
		Casillero de19 = new Casillero("DE19",1.0,false,0,de19Coord);
		nodos.add(de19);
		
		//step deck SD
		
		List<Double> sdCoord = Arrays.asList(24.0, 4.0);
		Casillero sd = new Casillero("SD",0.5,false,0,sdCoord);
		nodos.add(sd);
		
		
		
		
		
		
		
		// Se cargan todas las aristas
		//aristas.add(new Arco("a1",'h',n1,n2,2.0));
		
		//aristas PD
		aristas.add(new Arco("PD-0-1",'v',pd0,pd1,3.0));
		aristas.add(new Arco("PD-1-2",'v',pd1,pd2,3.5));
		aristas.add(new Arco("PD-2-3",'v',pd2,pd3,2.5));
		aristas.add(new Arco("PD-3-4",'v',pd3,pd4,4.5));
		aristas.add(new Arco("PD-5-6",'v',pd5,pd6,3.5));
		aristas.add(new Arco("PD-6-7",'v',pd6,pd7,2.5));
		aristas.add(new Arco("PD-7-8",'v',pd7,pd8,2.5));
		aristas.add(new Arco("PD-1-5",'h',pd1,pd5,2.0));
		aristas.add(new Arco("PD-2-6",'h',pd2,pd6,2.0));
		aristas.add(new Arco("PD-3-7",'h',pd3,pd7,2.0));
		
		//union patio delantero PD con lateral izq (PL)
		
		aristas.add(new Arco("PD-0-PL-0",'h',pd0,pl0,5.0));

		//aristas PL
		
		aristas.add(new Arco("PL-0-1",'v',pl1,pl0,1.5));
		aristas.add(new Arco("PL-1-2",'h',pl1,pl2,7.5));
		aristas.add(new Arco("PL-2-3",'h',pl2,pl3,5.5));
		aristas.add(new Arco("PL-3-4",'h',pl3,pl4,4.5));
		
		//union patio delantero PD con lateral der (PR)
		
		aristas.add(new Arco("PD-4-PR-0",'h',pd4,pr0,4.0));

		//aristas PR
		
		aristas.add(new Arco("PR-0-1",'h',pr0,pr1,4.5));
		aristas.add(new Arco("PR-1-2",'h',pr1,pr2,4.5));
		aristas.add(new Arco("PR-2-3",'h',pr2,pr3,4.5));
		aristas.add(new Arco("PR-3-4",'h',pr3,pr4,5.0));
		
		//union PL y PR con Patio Trasero
		
		aristas.add(new Arco("PL-4-PT-0",'h',pl4,pt0,5.5));
		aristas.add(new Arco("PR-4-PT-6",'h',pr4,pt6,3.0));
		
		//aristas PT
		
		aristas.add(new Arco("PT-0-1",'v',pt0,pt1,3.5));
		aristas.add(new Arco("PT-1-2",'v',pt1,pt2,2.0));
		aristas.add(new Arco("PT-2-3",'v',pt2,pt3,2.5));
		aristas.add(new Arco("PT-3-4",'v',pt3,pt4,3.5));
		aristas.add(new Arco("PT-4-5",'v',pt4,pt5,3.5));
		aristas.add(new Arco("PT-5-6",'h',pt6,pt5,2.5));
		aristas.add(new Arco("PT-6-7",'v',pt7,pt6,2.5));
		aristas.add(new Arco("PT-7-8",'v',pt8,pt7,2.5));
		aristas.add(new Arco("PT-3-8",'h',pt8,pt3,2.5));
		aristas.add(new Arco("PT-4-7",'h',pt7,pt4,2.5));
		
		
		//union PD con Garage
		
		aristas.add(new Arco("PD-7-G-5",'h',pd7,ga5,2.0));
		aristas.add(new Arco("PD-8-G-O",'h',pd8,ga0,2.5));
		
		//aristas G
		
		aristas.add(new Arco("G-0-1",'h',ga0,ga1,2.5));
		aristas.add(new Arco("G-1-2",'v',ga2,ga1,2.5));
		aristas.add(new Arco("G-2-3",'v',ga3,ga2,2.5));
		aristas.add(new Arco("G-3-4",'h',ga4,ga3,3.0));
		aristas.add(new Arco("G-4-5",'v',ga4,ga5,2.5));
		aristas.add(new Arco("G-5-2",'h',ga5,ga2,3.0));
		
		//union Garage con corredor
		
		aristas.add(new Arco("G-2-C-0",'h',ga2,co0,2.0));
		
		//aristas Corredor Co
		
		aristas.add(new Arco("C-0-1",'h',co0,co1,2.5));
		aristas.add(new Arco("C-1-2",'h',co1,co2,1.0));
		aristas.add(new Arco("C-2-3",'h',co2,co3,1.0));
		aristas.add(new Arco("C-3-4",'h',co3,co4,1.0));
		aristas.add(new Arco("C-4-SC",'h',co4,sc,1.5));
		aristas.add(new Arco("SC-C-5",'h',sc,co5,1.5));
		
		// union corredor con W
		aristas.add(new Arco("C-0-W",'v',co0,ww,2.5));
		
		//union Corredor con HR
		
		aristas.add(new Arco("C-1-HR-0",'v',co1,hr0,1.5));
		
		//aristas HR
		
		aristas.add(new Arco("HR-0-1",'h',hr1,hr0,2.0));
		aristas.add(new Arco("HR-1-2",'v',hr1,hr2,1.5));
		aristas.add(new Arco("HR-0-3",'v',hr0,hr3,1.5));
	
		//union Corredor con HL
		
		aristas.add(new Arco("C-5-HL-0",'v',co4,hl0,1.5));
		
		//aristas HL
		
		aristas.add(new Arco("HL-0-1",'h',hl0,hl1,2.0));
		aristas.add(new Arco("HL-1-2",'v',hl1,hl2,1.5));
		aristas.add(new Arco("HL-0-3",'v',hl0,hl3,1.5));
		
		//union Corredor con BC
		
		aristas.add(new Arco("C-3-BC-0",'v',co3,bc0,1.0));
		
		//aristas BC
		
		aristas.add(new Arco("BC-0-1",'h',bc1,bc0,0.5));
		aristas.add(new Arco("BC-0-2",'v',bc0,bc2,1.5));
		aristas.add(new Arco("BC-2-3",'h',bc3,bc2,1.0));
		
		//union corredor con HG
		
		aristas.add(new Arco("C-5-HG-0",'h',co5,hg0,2.0));
		
		//aristas HG
		
		aristas.add(new Arco("HG-0-1",'v',hg1,hg0,2.0));
		aristas.add(new Arco("HG-1-2",'h',hg1,hg2,3.5));
		aristas.add(new Arco("HG-2-3",'v',hg2,hg3,3.0));
		aristas.add(new Arco("HG-3-4",'h',hg4,hg3,3.5));
		aristas.add(new Arco("HG-0-4",'v',hg0,hg4,1.0));
		
		//union HG con BG
		
		aristas.add(new Arco("HG-4-BG-0",'h',bg0,hg4,1.0));
		
		//aristas BG
		
		aristas.add(new Arco("BG-0-1",'h',bg1,bg0,1.0));
		aristas.add(new Arco("BG-0-3",'v',bg0,bg3,1.5));
		aristas.add(new Arco("BG-2-3",'h',bg2,bg3,0.5));
		aristas.add(new Arco("BG-3-4",'h',bg3,bg4,1.0));
		
		//union corredor C con cocina K
		
		aristas.add(new Arco("C-2-K-6",'v',ki6,co2,1.0));
		
		//aristas cocina K
		aristas.add(new Arco("k-0-1",'v',ki0,ki1,1.0));
		aristas.add(new Arco("k-1-2",'h',ki2,ki1,1.5));
		aristas.add(new Arco("k-2-3",'v',ki2,ki3,4.0));
		aristas.add(new Arco("k-3-4",'h',ki3,ki4,1.5));
		aristas.add(new Arco("k-4-5",'v',ki5,ki4,3.0));
		aristas.add(new Arco("k-5-1",'v',ki1,ki5,1.0));
		aristas.add(new Arco("k-4-6",'h',ki4,ki6,1.5));
		aristas.add(new Arco("k-6-7",'h',ki6,ki7,2.0));
		aristas.add(new Arco("k-7-8",'v',ki8,ki7,3.0));
		aristas.add(new Arco("k-8-9",'h',ki9,ki8,2.0));
		aristas.add(new Arco("k-9-10",'v',ki10,ki9,1.0));
		aristas.add(new Arco("k-5-9",'h',ki5,ki9,1.5));
		aristas.add(new Arco("k-6-9",'v',ki9,ki6,3.0));
		aristas.add(new Arco("k-1-10",'h',ki1,ki10,1.5));
		aristas.add(new Arco("k-10-SK",'h',ki10,sk,1.0));
		
		//union SK con L
		
		aristas.add(new Arco("SK-L-0",'h',sk,li0,2.0));
		
		//aristas living
		
		aristas.add(new Arco("L-0-1",'h',li0,li1,3.0));
		aristas.add(new Arco("L-1-2",'v',li1,li2,1.5));
		aristas.add(new Arco("L-2-3",'v',li2,li3,1.5));
		aristas.add(new Arco("L-3-4",'h',li4,li3,2.0));
		
		//union k con M
		
		aristas.add(new Arco("K-0-M-0",'v',me0,ki0,2.0));
		
		//aristas media
		
		aristas.add(new Arco("M-0-1",'h',me0,me1,1.0));
		aristas.add(new Arco("M-1-2",'v',me1,me2,1.0));
		aristas.add(new Arco("M-2-3",'h',me2,me3,2.0));
		aristas.add(new Arco("M-3-4",'v',me4,me3,1.5));
		aristas.add(new Arco("M-0-5",'h',me5,me0,1.0));
		
		
		//union PD con E , PL con E y E con K
		
		aristas.add(new Arco("PD-5-E-0",'v',pl0,en0,3.0));
		aristas.add(new Arco("PD-5-E-0",'h',pd5,en0,3.0));
		aristas.add(new Arco("E-2-K-0",'h',en2,ki0,2.5));
		
		// aristas E
		aristas.add(new Arco("E-0-E-1",'h',en0,en1,1.5));
		aristas.add(new Arco("E-1-E-2",'h',en1,en2,2.0));
		
		//union E con O
		aristas.add(new Arco("E-2-O",'v',of,en2,2.0));
		
		//union E con Habitacion de Servicio
		aristas.add(new Arco("E-1-HS-0",'v',en1,hs0,1.0));
		
		//aristas HS
		aristas.add(new Arco("HS-0-HS-1",'v',hs0,hs1,1.0));
		aristas.add(new Arco("HS-2-HS-0",'h',hs2,hs0,2.5));
		aristas.add(new Arco("HS-2-HS-3",'v',hs2,hs3,1.5));
		
		//union HS con Baño Servicio BS
		aristas.add(new Arco("HS-1-BS-0",'h',hs1,bs0,1.0));
		
		//aristas BS
		aristas.add(new Arco("BS-0-BS-1",'v',bs1,bs0,1.0));
		
		//union deck patio trasero
		
		aristas.add(new Arco("D-16-PT-1",'h',de16,pt1,2.0));
		
		//union deck con living
		
		aristas.add(new Arco("L-0-D-4",'v',de4,li0,1.5));
		aristas.add(new Arco("L-1-D-3",'v',de3,li1,1.5));
		aristas.add(new Arco("L-1-D-1",'h',li1,de1,1.5));
		aristas.add(new Arco("L-2-D-0",'h',li2,de0,1.5));
		
		//aristas deck superior
		aristas.add(new Arco("D-0-D-1",'v',de1,de0,1.5));
		aristas.add(new Arco("D-2-D-1",'v',de2,de1,1.5));
		aristas.add(new Arco("D-7-D-2",'v',de7,de2,2.0));
		aristas.add(new Arco("D-6-D-3",'v',de6,de3,2.0));
		aristas.add(new Arco("D-5-D-4",'v',de5,de4,2.0));
		aristas.add(new Arco("D-8-D-9",'v',de8,de9,2.0));
		aristas.add(new Arco("D-3-D-2",'h',de3,de2,1.5));
		aristas.add(new Arco("D-6-D-7",'h',de6,de7,1.5));
		aristas.add(new Arco("D-7-D-8",'h',de7,de8,1.0));
		aristas.add(new Arco("D-2-D-9",'h',de2,de9,1.0));
		aristas.add(new Arco("D-9-D-12",'h',de9,de12,1.5));
		aristas.add(new Arco("D-10-D-11",'h',de10,de11,1.5));
		aristas.add(new Arco("D-0-D-10",'h',de0,de10,1.0));
		aristas.add(new Arco("D-5-D-6",'h',de5,de6,3.0));		
		aristas.add(new Arco("D-4-D-3",'h',de4,de3,3.0));
		aristas.add(new Arco("D-9-D-10",'v',de9,de10,3.0));
		aristas.add(new Arco("D-12-D-11",'v',de12,de11,3.0));
		
		// union con escalera deck SD
		
		aristas.add(new Arco("D-12-SD",'v',sd,de12,1.0));
		aristas.add(new Arco("D-13-SD",'v',de13,sd,1.5));
		
		//nodos deck pileta
		
		aristas.add(new Arco("D-13-14",'h',de13,de14,1.0));
		aristas.add(new Arco("D-14-15",'h',de14,de15,2.5));
		aristas.add(new Arco("D-15-16",'v',de15,de16,2.0));
		aristas.add(new Arco("D-16-17",'v',de16,de17,2.0));
		aristas.add(new Arco("D-17-18",'h',de18,de17,2.5));
		aristas.add(new Arco("D-19-18",'v',de19,de18,1.5));
		aristas.add(new Arco("D-19-14",'v',de14,de19,2.5));
		
		
		
		
		this.mapa.setNodos(nodos);
		this.mapa.setAristas(aristas);
	}
}
