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
		List<Double> pd0Coord = Arrays.asList(1.0, 15.0);
		Casillero pd0 = new Casillero("PD0",0.5,false,0,pd0Coord);
		nodos.add(pd0);
		
		List<Double> pd1Coord = Arrays.asList(1.0, 12.0);
		Casillero pd1 = new Casillero("PD1",0.5,false,0,pd1Coord);
		nodos.add(pd1);
		
		List<Double> pd2Coord = Arrays.asList(1.0, 8.0);
		Casillero pd2 = new Casillero("PD2",1,false,0,pd2Coord);
		nodos.add(pd2);
		
		List<Double> pd3Coord = Arrays.asList(1.0, 5.5);
		Casillero pd3 = new Casillero("PD3",1,false,0,pd3Coord);
		nodos.add(pd3);
		
		List<Double> pd4Coord = Arrays.asList(1.0, 1.0);
		Casillero pd4 = new Casillero("PD4",0.5,false,0,pd4Coord);
		nodos.add(pd4);
		
		List<Double> pd5Coord = Arrays.asList(3.0, 12.0);
		Casillero pd5 = new Casillero("PD5",1,false,0,pd5Coord);
		nodos.add(pd5);
		
		List<Double> pd6Coord = Arrays.asList(3.0, 8.0);
		Casillero pd6 = new Casillero("PD6",1,false,0,pd6Coord);
		nodos.add(pd6);
		
		List<Double> pd7Coord = Arrays.asList(3.0, 5.5);
		Casillero pd7 = new Casillero("PD7",1,false,0,pd7Coord);
		nodos.add(pd7);
		
		List<Double> pd8Coord = Arrays.asList(3.0, 3.0);
		Casillero pd8 = new Casillero("PD8",1,false,0,pd8Coord);
		nodos.add(pd8);
		
		// nodos patio right
		
		List<Double> pr0Coord = Arrays.asList(5.5, 1.0);
		Casillero pr0 = new Casillero("PR0",1,false,0,pr0Coord);
		nodos.add(pr0);
		
		List<Double> pr1Coord = Arrays.asList(10.0, 1.0);
		Casillero pr1 = new Casillero("PR1",1,false,0,pr1Coord);
		nodos.add(pr1);
		
		List<Double> pr2Coord = Arrays.asList(14.5, 1.0);
		Casillero pr2 = new Casillero("PR2",1,false,0,pr2Coord);
		nodos.add(pr2);
		
		List<Double> pr3Coord = Arrays.asList(19.0, 1.0);
		Casillero pr3 = new Casillero("PR3",1,false,0,pr3Coord);
		nodos.add(pr3);
		
		List<Double> pr4Coord = Arrays.asList(24.0, 1.0);
		Casillero pr4 = new Casillero("PR4",1,false,0,pr4Coord);
		nodos.add(pr4);
		
		//nodos patio left
		
		List<Double> pl0Coord = Arrays.asList(6.5, 15.0);
		Casillero pl0 = new Casillero("PL0",0.5,false,0,pl0Coord);
		nodos.add(pl0);
		
		List<Double> pl1Coord = Arrays.asList(6.5, 16.5);
		Casillero pl1 = new Casillero("PL1",0.5,false,0,pl1Coord);
		nodos.add(pl1);

		List<Double> pl2Coord = Arrays.asList(14.0, 16.5);
		Casillero pl2 = new Casillero("PL2",0.5,false,0,pl2Coord);
		nodos.add(pl2);
		
		List<Double> pl3Coord = Arrays.asList(19.5, 16.5);
		Casillero pl3 = new Casillero("PL3",0.5,false,0,pl3Coord);
		nodos.add(pl3);
		
		List<Double> pl4Coord = Arrays.asList(24.0, 16.5);
		Casillero pl4 = new Casillero("PL4",0.5,false,0,pl4Coord);
		nodos.add(pl4);
		
		//nodos patio trasero
		
		List<Double> pt0Coord = Arrays.asList(29.5, 16.5);
		Casillero pt0 = new Casillero("PT0",0.5,false,0,pt0Coord);
		nodos.add(pt0);
		
		List<Double> pt1Coord = Arrays.asList(29.5, 13.0);
		Casillero pt1 = new Casillero("PT1",0.5,false,0,pt1Coord);
		nodos.add(pt1);
		
		List<Double> pt2Coord = Arrays.asList(29.5, 11.0);
		Casillero pt2 = new Casillero("PT2",0.5,false,0,pt2Coord);
		nodos.add(pt2);
		
		List<Double> pt3Coord = Arrays.asList(29.5, 8.0);
		Casillero pt3 = new Casillero("PT3",0.5,false,0,pt3Coord);
		nodos.add(pt3);
		
		List<Double> pt4Coord = Arrays.asList(29.5, 4.5);
		Casillero pt4 = new Casillero("PT4",0.5,false,0,pt4Coord);
		nodos.add(pt4);
		
		List<Double> pt5Coord = Arrays.asList(29.5, 1.0);
		Casillero pt5 = new Casillero("PT5",0.5,false,0,pt5Coord);
		nodos.add(pt5);
		
		List<Double> pt6Coord = Arrays.asList(27.0, 1.0);
		Casillero pt6 = new Casillero("PT6",0.5,false,0,pt6Coord);
		nodos.add(pt6);
		
		List<Double> pt7Coord = Arrays.asList(27.0, 4.5);
		Casillero pt7 = new Casillero("PT7",0.5,false,0,pt7Coord);
		nodos.add(pt7);
		
		List<Double> pt8Coord = Arrays.asList(27.0, 8.0);
		Casillero pt8 = new Casillero("PT8",0.5,false,0,pt8Coord);
		nodos.add(pt8);
		
        //nodos garage
		
		List<Double> g0Coord = Arrays.asList(6.0, 3.0);
		Casillero g0 = new Casillero("G0",1.0,false,0,g0Coord);
		nodos.add(g0);
		
		List<Double> g1Coord = Arrays.asList(8.5, 3.0);
		Casillero g1 = new Casillero("G1",1.0,false,0,g1Coord);
		nodos.add(g1);
		
		List<Double> g2Coord = Arrays.asList(8.5, 5.5);
		Casillero g2 = new Casillero("G2",1.0,false,0,g2Coord);
		nodos.add(g2);
		
		List<Double> g3Coord = Arrays.asList(8.5, 8.0);
		Casillero g3 = new Casillero("G3",1.0,false,0,g3Coord);
		nodos.add(g3);
		
		List<Double> g4Coord = Arrays.asList(5.5, 8.0);
		Casillero g4 = new Casillero("G4",1.0,false,0,g4Coord);
		nodos.add(g4);
		
		List<Double> g5Coord = Arrays.asList(5.5, 5.5);
		Casillero g5 = new Casillero("G5",1.0,false,0,g5Coord);
		nodos.add(g5);
		
		//nodos corredor
		
		List<Double> c0Coord = Arrays.asList(10.5, 5.5);
		Casillero c0 = new Casillero("C0",1.0,false,0,c0Coord);
		nodos.add(c0);
		
		List<Double> c1Coord = Arrays.asList(13.0, 5.5);
		Casillero c1 = new Casillero("C1",1.0,false,0,c1Coord);
		nodos.add(c1);
		
		List<Double> c2Coord = Arrays.asList(14.0, 5.5);
		Casillero c2 = new Casillero("C2",1.0,false,0,c2Coord);
		nodos.add(c2);
		
		List<Double> c3Coord = Arrays.asList(15.0, 5.5);
		Casillero c3 = new Casillero("C3",1.0,false,0,c3Coord);
		nodos.add(c3);
		
		List<Double> c4Coord = Arrays.asList(16.0, 5.5);
		Casillero c4 = new Casillero("C4",1.0,false,0,c4Coord);
		nodos.add(c4);
		
		List<Double> c5Coord = Arrays.asList(19.0, 5.5);
		Casillero c5 = new Casillero("C5",1.0,false,0,c5Coord);
		nodos.add(c5);
		
		//NODO STEP CORREDOR SC
		
		List<Double> scCoord = Arrays.asList(17.5, 5.5);
		Casillero sc = new Casillero("SC",0.5,false,0,scCoord);
		nodos.add(sc);
		
		// nodo lavadero W
		List<Double> wCoord = Arrays.asList(10.5, 3.0);
		Casillero w = new Casillero("W0",1.0,false,0,wCoord);
		nodos.add(w);
		
		//nodos habitacion r HR
		
		List<Double> hr0Coord = Arrays.asList(13.0, 4.0);
		Casillero hr0 = new Casillero("HR0",0.5,false,0,hr0Coord);
		nodos.add(hr0);
		
		List<Double> hr1Coord = Arrays.asList(11.0, 4.0);
		Casillero hr1 = new Casillero("HR1",0.5,false,0,hr1Coord);
		nodos.add(hr1);
		
		List<Double> hr2Coord = Arrays.asList(11.0, 2.5);
		Casillero hr2 = new Casillero("HR2",0.5,false,0,hr2Coord);
		nodos.add(hr2);
		
		List<Double> hr3Coord = Arrays.asList(13.0, 2.5);
		Casillero hr3 = new Casillero("HR3",0.5,false,0,hr3Coord);
		nodos.add(hr3);
		
		//nodos habitacion l HL
		
		List<Double> hl0Coord = Arrays.asList(16.0, 4.0);
		Casillero hl0 = new Casillero("HL0",0.5,false,0,hl0Coord);
		nodos.add(hl0);
		
		List<Double> hl1Coord = Arrays.asList(18.0, 4.0);
		Casillero hl1 = new Casillero("HL1",0.5,false,0,hl1Coord);
		nodos.add(hl1);
		
		List<Double> hl2Coord = Arrays.asList(18.0, 2.5);
		Casillero hl2 = new Casillero("HL2",0.5,false,0,hl2Coord);
		nodos.add(hl2);
		
		List<Double> hl3Coord = Arrays.asList(16.0, 2.5);
		Casillero hl3 = new Casillero("HL3",0.5,false,0,hl3Coord);
		nodos.add(hl3);
		
		//nodos BAÑO CORREDOR BC
		
		List<Double> bc0Coord = Arrays.asList(16.0, 4.0);
		Casillero bc0 = new Casillero("BC0",1.0,false,0,bc0Coord);
		nodos.add(bc0);
		
		List<Double> bc1Coord = Arrays.asList(18.0, 4.0);
		Casillero bc1 = new Casillero("BC1",1.0,false,0,bc1Coord);
		nodos.add(bc1);
		
		List<Double> bc2Coord = Arrays.asList(18.0, 2.5);
		Casillero bc2 = new Casillero("BC2",1.0,false,0,bc2Coord);
		nodos.add(bc2);
		
		List<Double> bc3Coord = Arrays.asList(16.0, 2.5);
		Casillero bc3 = new Casillero("BC3",1.0,false,0,bc3Coord);
		nodos.add(bc3);
		
		//nodos habitacion grande HG
		
		List<Double> hg0Coord = Arrays.asList(21.0, 5.5);
		Casillero hg0 = new Casillero("HG0",0.5,false,0,hg0Coord);
		nodos.add(hg0);
		
		List<Double> hg1Coord = Arrays.asList(21.0, 7.5);
		Casillero hg1 = new Casillero("HG1",0.5,false,0,hg1Coord);
		nodos.add(hg1);
		
		List<Double> hg2Coord = Arrays.asList(24.5, 7.5);
		Casillero hg2 = new Casillero("HG2",0.5,false,0,hg2Coord);
		nodos.add(hg2);
		
		List<Double> hg3Coord = Arrays.asList(24.5, 4.5);
		Casillero hg3 = new Casillero("HG3",0.5,false,0,hg3Coord);
		nodos.add(hg3);
		
		List<Double> hg4Coord = Arrays.asList(21.0, 4.5);
		Casillero hg4 = new Casillero("HG4",0.5,false,0,hg4Coord);
		nodos.add(hg4);
		
		
		//nodos baño grande BG
		
		List<Double> bg0Coord = Arrays.asList(20.0, 4.5);
		Casillero bg0 = new Casillero("BG0",1.0,false,0,bg0Coord);
		nodos.add(bg0);
		
		List<Double> bg1Coord = Arrays.asList(19.0, 4.5);
		Casillero bg1 = new Casillero("BG1",1.0,false,0,bg1Coord);
		nodos.add(bg1);
		
		List<Double> bg2Coord = Arrays.asList(19.5, 3.0);
		Casillero bg2 = new Casillero("BG2",1.0,false,0,bg2Coord);
		nodos.add(bg2);
		
		List<Double> bg3Coord = Arrays.asList(20.0, 3.0);
		Casillero bg3 = new Casillero("BG3",1.0,false,0,bg3Coord);
		nodos.add(bg3);
		
		List<Double> bg4Coord = Arrays.asList(21.0, 3.0);
		Casillero bg4 = new Casillero("BG4",1.0,false,0,bg4Coord);
		nodos.add(bg4);
		
		//nodos cocina K
		
		List<Double> k0Coord = Arrays.asList(12.5, 12.0);
		Casillero k0 = new Casillero("K0",1.0,false,0,k0Coord);
		nodos.add(k0);
		
		List<Double> k1Coord = Arrays.asList(12.5, 11.0);
		Casillero k1 = new Casillero("K1",1.0,false,0,k1Coord);
		nodos.add(k1);
		
		List<Double> k2Coord = Arrays.asList(11.0, 11.0);
		Casillero k2 = new Casillero("K2",1.0,false,0,k2Coord);
		nodos.add(k2);
		
		List<Double> k3Coord = Arrays.asList(11.0, 7.0);
		Casillero k3 = new Casillero("K3",1.0,false,0,k3Coord);
		nodos.add(k3);
		
		List<Double> k4Coord = Arrays.asList(12.5, 7.0);
		Casillero k4 = new Casillero("K4",1.0,false,0,k4Coord);
		nodos.add(k4);
		
		List<Double> k5Coord = Arrays.asList(12.5, 9.5);
		Casillero k5 = new Casillero("K5",1.0,false,0,k5Coord);
		nodos.add(k5);
		
		List<Double> k6Coord = Arrays.asList(14.0, 7.0);
		Casillero k6 = new Casillero("K6",1.0,false,0,k6Coord);
		nodos.add(k6);
		
		List<Double> k7Coord = Arrays.asList(16.0, 7.0);
		Casillero k7 = new Casillero("K7",1.0,false,0,k7Coord);
		nodos.add(k7);
		
		List<Double> k8Coord = Arrays.asList(16.0, 9.5);
		Casillero k8 = new Casillero("K8",1.0,false,0,k8Coord);
		nodos.add(k8);
		
		List<Double> k9Coord = Arrays.asList(14.0, 9.5);
		Casillero k9 = new Casillero("K9",1.0,false,0,k9Coord);
		nodos.add(k9);
		
		List<Double> k10Coord = Arrays.asList(14.0, 11.0);
		Casillero k10 = new Casillero("K10",1.0,false,0,k10Coord);
		nodos.add(k10);
		
		//NODO STEP Cocina SK
		
		List<Double> skCoord = Arrays.asList(15.0, 11.0);
		Casillero sk = new Casillero("SK",0.5,false,0,skCoord);
		nodos.add(sk);
		
		//nodos living L
		
		List<Double> l0Coord = Arrays.asList(21.0, 5.5);
		Casillero l0 = new Casillero("L0",1.0,false,0,l0Coord);
		nodos.add(l0);
		
		List<Double> l1Coord = Arrays.asList(21.0, 7.5);
		Casillero l1 = new Casillero("L1",1.0,false,0,l1Coord);
		nodos.add(l1);
		
		List<Double> l2Coord = Arrays.asList(24.5, 7.5);
		Casillero l2 = new Casillero("L2",1.0,false,0,l2Coord);
		nodos.add(l2);
		
		List<Double> l3Coord = Arrays.asList(24.5, 4.5);
		Casillero l3 = new Casillero("L3",1.0,false,0,l3Coord);
		nodos.add(l3);
		
		List<Double> l4Coord = Arrays.asList(21.0, 4.5);
		Casillero l4 = new Casillero("L4",1.0,false,0,l4Coord);
		nodos.add(l4);
		
		//nodos media M
		
		List<Double> m0Coord = Arrays.asList(12.5, 13.5);
		Casillero m0 = new Casillero("M0",0.5,false,0,m0Coord);
		nodos.add(m0);
		
		List<Double> m1Coord = Arrays.asList(13.5, 13.5);
		Casillero m1 = new Casillero("M1",0.5,false,0,m1Coord);
		nodos.add(l1);
		
		List<Double> m2Coord = Arrays.asList(13.5, 12.5);
		Casillero m2 = new Casillero("M2",0.5,false,0,m2Coord);
		nodos.add(m2);
		
		List<Double> m3Coord = Arrays.asList(15.5, 12.5);
		Casillero m3 = new Casillero("M3",0.5,false,0,m3Coord);
		nodos.add(m3);
		
		List<Double> m4Coord = Arrays.asList(15.5, 14.5);
		Casillero m4 = new Casillero("M4",0.5,false,0,m4Coord);
		nodos.add(m4);
		
		List<Double> m5Coord = Arrays.asList(11.5, 13.5);
		Casillero m5 = new Casillero("M5",0.5,false,0,m5Coord);
		nodos.add(m5);
		
		
		// nodos entrada E
		
		List<Double> e0Coord = Arrays.asList(6.5, 12.0);
		Casillero e0 = new Casillero("E0",1.0,false,0,e0Coord);
		nodos.add(e0);
		
		List<Double> e1Coord = Arrays.asList(8.0, 12.0);
		Casillero e1 = new Casillero("E1",1.0,false,0,e1Coord);
		nodos.add(e1);
		
		List<Double> e2Coord = Arrays.asList(10.0, 12.0);
		Casillero e2 = new Casillero("E2",1.0,false,0,e2Coord);
		nodos.add(e2);
		
		// nodo Office
		
		List<Double> oCoord = Arrays.asList(10.0, 13.0);
		Casillero o = new Casillero("O",1.0,false,0,oCoord);
		nodos.add(o);
		
		//nodos Habitacion de Servicio HS
		List<Double> hs0Coord = Arrays.asList(8.0, 10.5);
		Casillero hs0 = new Casillero("HS0",0.5,false,0,hs0Coord);
		nodos.add(hs0);
		
		List<Double> hs1Coord = Arrays.asList(8.0, 10.0);
		Casillero hs1 = new Casillero("HS1",0.5,false,0,hs1Coord);
		nodos.add(hs1);
		
		List<Double> hs2Coord = Arrays.asList(5.5, 10.5);
		Casillero hs2 = new Casillero("HS2",0.5,false,0,hs2Coord);
		nodos.add(hs2);
		
		List<Double> hs3Coord = Arrays.asList(5.5, 9.5);
		Casillero hs3 = new Casillero("HS3",0.5,false,0,hs3Coord);
		nodos.add(hs3);
		
		//nodos Baño Servicio BS
		List<Double> bs0Coord = Arrays.asList(9.0, 10.0);
		Casillero bs0 = new Casillero("BS0",1.0,false,0,bs0Coord);
		nodos.add(bs0);
		
		List<Double> bs1Coord = Arrays.asList(9.0, 10.5);
		Casillero bs1 = new Casillero("BS1",1.0,false,0,bs1Coord);
		nodos.add(bs1);
		
		//nodos deck 
		List<Double> d0Coord = Arrays.asList(21.5, 9.5);
		Casillero d0 = new Casillero("D0",1.0,false,0,d0Coord);
		nodos.add(d0);
		
		List<Double> d1Coord = Arrays.asList(21.5, 11.0);
		Casillero d1 = new Casillero("D1",1.0,false,0,d1Coord);
		nodos.add(d1);
		
		List<Double> d2Coord = Arrays.asList(21.5, 12.5);
		Casillero d2 = new Casillero("D2",1.0,false,0,d2Coord);
		nodos.add(d2);
		
		List<Double> d3Coord = Arrays.asList(20.5, 12.5);
		Casillero d3 = new Casillero("D3",1.0,false,0,d3Coord);
		nodos.add(d3);
		
		List<Double> d4Coord = Arrays.asList(17.0, 12.5);
		Casillero d4 = new Casillero("D4",1.0,false,0,d4Coord);
		nodos.add(d4);
		
		List<Double> d5Coord = Arrays.asList(17.0, 14.0);
		Casillero d5 = new Casillero("D5",1.0,false,0,d5Coord);
		nodos.add(d5);
		
		List<Double> d6Coord = Arrays.asList(20.0, 14.0);
		Casillero d6 = new Casillero("D6",1.0,false,0,d6Coord);
		nodos.add(d6);
		
		List<Double> d7Coord = Arrays.asList(21.5, 14.0);
		Casillero d7 = new Casillero("D7",1.0,false,0,d7Coord);
		nodos.add(d7);
		
		List<Double> d8Coord = Arrays.asList(23.0, 14.0);
		Casillero d8 = new Casillero("D8",1.0,false,0,d8Coord);
		nodos.add(d8);
		
		List<Double> d9Coord = Arrays.asList(23.0, 12.5);
		Casillero d9 = new Casillero("D9",1.0,false,0,d9Coord);
		nodos.add(d9);
		
		List<Double> d10Coord = Arrays.asList(23.0, 9.5);
		Casillero d10 = new Casillero("D10",1.0,false,0,d10Coord);
		nodos.add(d10);
		
		List<Double> d11Coord = Arrays.asList(24.5, 9.5);
		Casillero d11 = new Casillero("D11",1.0,false,0,d11Coord);
		nodos.add(d11);
		
		List<Double> d12Coord = Arrays.asList(24.5, 12.5);
		Casillero d12 = new Casillero("D12",1.0,false,0,d12Coord);
		nodos.add(d12);
		
		List<Double> d13Coord = Arrays.asList(24.5, 15.0);
		Casillero d13 = new Casillero("D13",1.0,false,0,d13Coord);
		nodos.add(d13);
		
		List<Double> d14Coord = Arrays.asList(25.0, 15.0);
		Casillero d14 = new Casillero("D14",1.0,false,0,d14Coord);
		nodos.add(d14);
		
		List<Double> d15Coord = Arrays.asList(27.5, 15.0);
		Casillero d15 = new Casillero("D15",1.0,false,0,d15Coord);
		nodos.add(d15);
		
		List<Double> d16Coord = Arrays.asList(27.5, 13.0);
		Casillero d16 = new Casillero("D16",1.0,false,0,d16Coord);
		nodos.add(d16);
		
		List<Double> d17Coord = Arrays.asList(27.5, 11.0);
		Casillero d17 = new Casillero("D17",1.0,false,0,d17Coord);
		nodos.add(d17);
		
		List<Double> d18Coord = Arrays.asList(25.0, 11.0);
		Casillero d18 = new Casillero("D18",1.0,false,0,d18Coord);
		nodos.add(d18);
		
		List<Double> d19Coord = Arrays.asList(25.0, 12.5);
		Casillero d19 = new Casillero("D19",1.0,false,0,d19Coord);
		nodos.add(d19);
		
		//step deck SD
		
		List<Double> sdCoord = Arrays.asList(24.5, 13.5);
		Casillero sd = new Casillero("SD",0.5,false,0,sdCoord);
		nodos.add(sd);
		
		
		
		
		
		
		
		// Se cargan todas las aristas
		//aristas.add(new Arco("a1",'h',n1,n2,2.0));
		
		//aristas PD
		aristas.add(new Arco("PD-0-1",'v',pd0,pd1,3.0));
		aristas.add(new Arco("PD-1-2",'v',pd1,pd2,4.0));
		aristas.add(new Arco("PD-2-3",'v',pd2,pd3,2.5));
		aristas.add(new Arco("PD-3-4",'v',pd3,pd4,4.5));
		aristas.add(new Arco("PD-5-6",'v',pd5,pd6,4.0));
		aristas.add(new Arco("PD-6-7",'v',pd6,pd7,2.5));
		aristas.add(new Arco("PD-7-8",'v',pd7,pd8,2.5));
		aristas.add(new Arco("PD-1-5",'h',pd1,pd5,2.0));
		aristas.add(new Arco("PD-2-6",'h',pd2,pd6,2.0));
		aristas.add(new Arco("PD-3-7",'h',pd3,pd7,2.0));
		
		//union patio delantero PD con lateral izq (PL)
		
		aristas.add(new Arco("PD-0-PL-0",'h',pd0,pl0,4.5));

		//aristas PL
		
		aristas.add(new Arco("PL-0-1",'v',pl1,pl0,1.5));
		aristas.add(new Arco("PL-1-2",'h',pl1,pl2,7.5));
		aristas.add(new Arco("PL-2-3",'h',pl2,pl3,5.5));
		aristas.add(new Arco("PL-3-4",'h',pl3,pl4,4.5));
		
		//union patio delantero PD con lateral der (PR)
		
		aristas.add(new Arco("PD-4-PR-0",'h',pd4,pr0,4.5));

		//aristas PR
		
		aristas.add(new Arco("PR-0-1",'h',pr0,pr1,1.5));
		aristas.add(new Arco("PR-1-2",'h',pr1,pr2,7.5));
		aristas.add(new Arco("PR-2-3",'h',pr2,pr3,5.5));
		aristas.add(new Arco("PR-3-4",'h',pr3,pr4,4.5));
		
		//union PL y PR con Patio Trasero
		
		aristas.add(new Arco("PL-4-PT-0",'h',pl4,pt0,5.5));
		aristas.add(new Arco("PR-4-PT-6",'h',pr4,pt6,3.0));
		
		//aristas PT
		
		aristas.add(new Arco("PT-0-1",'v',pt0,pt1,3.5));
		aristas.add(new Arco("PT-1-2",'v',pt1,pt2,2.0));
		aristas.add(new Arco("PT-2-3",'v',pt2,pt3,3.0));
		aristas.add(new Arco("PT-3-4",'v',pt3,pt4,3.5));
		aristas.add(new Arco("PT-4-5",'v',pt4,pt5,3.5));
		aristas.add(new Arco("PT-5-6",'h',pt6,pt5,2.5));
		aristas.add(new Arco("PT-6-7",'v',pt7,pt6,3.5));
		aristas.add(new Arco("PT-7-8",'v',pt8,pt7,3.5));
		aristas.add(new Arco("PT-3-8",'h',pt8,pt3,2.5));
		aristas.add(new Arco("PT-4-7",'h',pt7,pt4,2.5));
		
		
		//union PD con Garage
		
		aristas.add(new Arco("PD-7-G-5",'h',pd7,g5,2.5));
		aristas.add(new Arco("PD-8-G-O",'h',pd8,g0,3.0));
		
		//aristas G
		
		aristas.add(new Arco("G-0-1",'h',g0,g1,2.5));
		aristas.add(new Arco("G-1-2",'v',g2,g1,2.5));
		aristas.add(new Arco("G-2-3",'v',g3,g2,2.5));
		aristas.add(new Arco("G-3-4",'h',g4,g3,3.0));
		aristas.add(new Arco("G-4-5",'v',g4,g5,2.5));
		aristas.add(new Arco("G-5-2",'h',g5,g2,3.0));
		
		//union Garage con corredor
		
		aristas.add(new Arco("G-2-C-0",'h',g2,c0,2.0));
		
		//aristas Corredor C
		
		aristas.add(new Arco("C-0-1",'h',c0,g1,2.5));
		aristas.add(new Arco("C-1-2",'h',c1,g2,1.0));
		aristas.add(new Arco("C-2-3",'h',c2,g3,1.0));
		aristas.add(new Arco("C-3-4",'h',c3,g4,1.0));
		aristas.add(new Arco("C-4-SC",'h',c4,sc,1.5));
		aristas.add(new Arco("SC-C-5",'h',sc,c5,1.5));
		
		// union corredor con W
		aristas.add(new Arco("C-0-W",'v',c0,w,2.5));
		
		//union Corredor con HR
		
		aristas.add(new Arco("C-1-HR-0",'v',c1,hr0,1.5));
		
		//aristas HR
		
		aristas.add(new Arco("HR-0-1",'h',hr1,hr0,2.0));
		aristas.add(new Arco("HR-1-2",'v',hr1,hr2,1.5));
		aristas.add(new Arco("HR-0-3",'v',hr0,hr3,1.5));
	
		//union Corredor con HL
		
		aristas.add(new Arco("C-5-HL-0",'v',c4,hl0,1.5));
		
		//aristas HL
		
		aristas.add(new Arco("HL-0-1",'h',hl0,hl1,2.0));
		aristas.add(new Arco("HL-1-2",'v',hl1,hl2,1.5));
		aristas.add(new Arco("HL-0-3",'v',hl0,hl3,1.5));
		
		//union Corredor con BC
		
		aristas.add(new Arco("C-3-BC-0",'v',c3,bc0,1.0));
		
		//aristas BC
		
		aristas.add(new Arco("BC-0-1",'h',bc1,bc0,0.5));
		aristas.add(new Arco("BC-0-2",'v',bc0,bc2,1.5));
		aristas.add(new Arco("BC-2-3",'h',bc3,bc2,1.0));
		
		//union corredor con HG
		
		aristas.add(new Arco("C-5-HG-0",'h',c5,hg0,2.0));
		
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
		
		aristas.add(new Arco("C-2-K-6",'v',k6,c2,1.5));
		
		//aristas cocina K
		aristas.add(new Arco("k-0-1",'v',k0,k1,1.0));
		aristas.add(new Arco("k-1-2",'h',k2,k1,1.5));
		aristas.add(new Arco("k-2-3",'v',k2,k3,4.0));
		aristas.add(new Arco("k-3-4",'h',k3,k4,1.5));
		aristas.add(new Arco("k-4-5",'v',k5,k4,2.5));
		aristas.add(new Arco("k-5-1",'v',k1,k5,1.5));
		aristas.add(new Arco("k-4-6",'h',k4,k6,1.5));
		aristas.add(new Arco("k-6-7",'h',k6,k7,2.0));
		aristas.add(new Arco("k-7-8",'v',k8,k7,1.5));
		aristas.add(new Arco("k-5-1",'h',k1,k5,1.5));
		aristas.add(new Arco("k-8-9",'h',k9,k8,2.0));
		aristas.add(new Arco("k-9-10",'v',k10,k9,1.5));
		aristas.add(new Arco("k-5-9",'h',k5,k9,1.5));
		aristas.add(new Arco("k-1-10",'h',k1,k10,1.5));
		aristas.add(new Arco("k-10-SK",'h',k10,sk,1.0));
		
		//union SK con L
		
		aristas.add(new Arco("SK-L-0",'h',sk,l0,1.0));
		
		//aristas living
		
		aristas.add(new Arco("L-0-1",'h',l0,l1,3.0));
		aristas.add(new Arco("L-1-2",'v',l1,l2,1.5));
		aristas.add(new Arco("L-2-3",'v',l2,l3,2.0));
		aristas.add(new Arco("L-3-4",'h',l4,l3,2.0));
		
		//union k con M
		
		aristas.add(new Arco("K-0-M-0",'v',m0,k0,1.5));
		
		//aristas living
		
		aristas.add(new Arco("M-0-1",'h',m0,m1,1.0));
		aristas.add(new Arco("M-1-2",'v',m1,m2,1.0));
		aristas.add(new Arco("M-2-3",'h',m2,m3,2.0));
		aristas.add(new Arco("M-3-4",'v',m4,m3,2.0));
		aristas.add(new Arco("M-0-5",'h',m0,m5,1.0));
		
		
		//union PD con E y E con K
		
		aristas.add(new Arco("PD-5-E-0",'h',pd5,e0,3.5));
		aristas.add(new Arco("E-2-K-0",'h',e2,k0,2.5));
		
		// aristas E
		aristas.add(new Arco("E-0-E-1",'h',e0,e1,1.5));
		aristas.add(new Arco("E-1-E-2",'h',e1,e2,2.0));
		
		//union E con O
		aristas.add(new Arco("E-2-O",'v',o,e2,1.0));
		
		//union E con Habitacion de Servicio
		aristas.add(new Arco("E-1-HS-0",'v',e1,hs0,1.0));
		
		//aristas HS
		aristas.add(new Arco("HS-0-HS-1",'v',hs0,hs1,0.5));
		aristas.add(new Arco("HS-2-HS-0",'h',hs2,hs0,2.5));
		aristas.add(new Arco("HS-2-HS-3",'v',hs2,hs3,1.0));
		
		//union HS con Baño Servicio BS
		aristas.add(new Arco("HS-1-BS-0",'h',hs1,bs0,1.0));
		
		//aristas BS
		aristas.add(new Arco("BS-0-BS-1",'v',bs1,bs0,0.5));
		
		//union deck patio trasero
		
		aristas.add(new Arco("D-16-PT-1",'h',d16,pt1,2.0));
		
		//union deck con living
		
		aristas.add(new Arco("L-0-D-4",'v',d4,l0,1.5));
		aristas.add(new Arco("L-1-D-3",'v',d3,l1,1.5));
		aristas.add(new Arco("L-1-D-1",'h',l1,d1,1.5));
		aristas.add(new Arco("L-2-D-0",'h',l2,d0,1.5));
		
		//aristas deck superior
		aristas.add(new Arco("D-0-D-1",'v',d1,d0,1.5));
		aristas.add(new Arco("D-2-D-1",'v',d2,d1,1.5));
		aristas.add(new Arco("D-7-D-2",'v',d7,d2,1.5));
		aristas.add(new Arco("D-6-D-3",'v',d6,d3,1.5));
		aristas.add(new Arco("D-5-D-4",'v',d5,d4,1.5));
		aristas.add(new Arco("D-8-D-9",'v',d8,d9,1.5));
		aristas.add(new Arco("D-3-D-2",'h',d3,d2,1.5));
		aristas.add(new Arco("D-6-D-7",'h',d6,d7,1.5));
		aristas.add(new Arco("D-7-D-8",'h',d7,d8,1.5));
		aristas.add(new Arco("D-2-D-9",'h',d2,d9,1.5));
		aristas.add(new Arco("D-9-D-12",'h',d9,d12,1.5));
		aristas.add(new Arco("D-10-D-11",'v',d10,d11,1.5));
		aristas.add(new Arco("D-0-D-10",'v',d0,d10,1.5));
		aristas.add(new Arco("D-5-D-6",'h',d5,d6,3.0));		
		aristas.add(new Arco("D-4-D-3",'h',d4,d3,3.0));
		aristas.add(new Arco("D-9-D-10",'v',d9,d10,3.0));
		aristas.add(new Arco("D-12-D-11",'v',d12,d11,3.0));
		
		// union con escalera deck SD
		
		aristas.add(new Arco("D-12-SD",'v',sd,d12,1.0));
		aristas.add(new Arco("D-13-SD",'v',d13,sd,1.5));
		
		//nodos deck pileta
		
		aristas.add(new Arco("D-13-14",'h',d13,d14,0.5));
		aristas.add(new Arco("D-14-15",'h',d14,d15,2.5));
		aristas.add(new Arco("D-15-16",'v',d15,d16,2.0));
		aristas.add(new Arco("D-16-17",'v',d16,d17,2.0));
		aristas.add(new Arco("D-17-18",'h',d18,d17,2.5));
		aristas.add(new Arco("D-19-18",'v',d19,d18,1.5));
		aristas.add(new Arco("D-19-14",'v',d14,d19,2.5));
		
		
		
		
		this.mapa.setNodos(nodos);
		this.mapa.setAristas(aristas);
	}
}
