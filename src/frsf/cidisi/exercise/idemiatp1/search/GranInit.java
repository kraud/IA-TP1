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
		
		aristas.add(new Arco("PL-0-1",'v',pl0,pl1,1.5));
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
		
		aristas.add(new Arco("PT-0-1",'h',pt0,pt1,3.5));
		aristas.add(new Arco("PT-1-2",'h',pt1,pt2,2.0));
		aristas.add(new Arco("PT-2-3",'h',pt2,pt3,3.0));
		aristas.add(new Arco("PT-3-4",'h',pt3,pt4,3.5));
		aristas.add(new Arco("PT-4-5",'h',pt4,pt5,3.5));
		aristas.add(new Arco("PT-5-6",'h',pt5,pt6,2.5));
		aristas.add(new Arco("PT-6-7",'h',pt6,pt7,3.5));
		aristas.add(new Arco("PT-7-8",'h',pt7,pt8,3.5));
		aristas.add(new Arco("PT-3-8",'h',pt3,pt8,2.5));
		aristas.add(new Arco("PT-4-7",'h',pt4,pt7,2.5));
		
		
		//union PD con Garage
		
		aristas.add(new Arco("PD-7-G-5",'h',pd7,g5,2.5));
		aristas.add(new Arco("PD-8-G-O",'h',pd8,g0,3.0));
		
		//aristas G
		
		aristas.add(new Arco("G-0-1",'h',g0,g1,2.5));
		aristas.add(new Arco("G-1-2",'v',g1,g2,2.5));
		aristas.add(new Arco("G-2-3",'v',g2,g3,2.5));
		aristas.add(new Arco("G-3-4",'h',g3,g4,3.0));
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
		
		aristas.add(new Arco("HR-0-1",'h',hr0,hr1,2.0));
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
		
		aristas.add(new Arco("BC-0-1",'h',bc0,bc1,1.5));
		aristas.add(new Arco("BC-1-2",'v',bc1,bc2,1.5));
		aristas.add(new Arco("BC-0-3",'v',bc0,bc3,1.0));
		
		//union corredor con HG
		
		aristas.add(new Arco("C-5-HG-0",'h',c5,hg0,2.0));
		
		//aristas HG
		
		aristas.add(new Arco("HG-0-1",'v',hg0,hg1,2.0));
		aristas.add(new Arco("HG-1-2",'h',hg1,hg2,3.5));
		aristas.add(new Arco("HG-2-3",'v',hg2,hg3,3.0));
		aristas.add(new Arco("HG-3-4",'h',hg3,hg4,3.5));
		aristas.add(new Arco("HG-0-4",'h',hg0,hg4,1.0));
		
		//union HG con BG
		
		aristas.add(new Arco("HG-4-BG-0",'h',hg4,bg0,1.0));
		
		//aristas BG
		
		aristas.add(new Arco("BG-0-1",'h',bg0,bg1,1.0));
		aristas.add(new Arco("BG-0-3",'v',bg0,bg3,1.5));
		aristas.add(new Arco("BG-2-3",'h',bg2,bg3,0.5));
		aristas.add(new Arco("BG-3-4",'h',bg3,bg4,1.0));
		
		
		this.mapa.setNodos(nodos);
		this.mapa.setAristas(aristas);
	}
}
