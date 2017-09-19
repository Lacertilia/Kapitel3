import javax.swing.*;
/*
Rasmus Mattas
Övningar Kaptel 3
19/9-17
*/
public class Kapitel3{
	public static void main(String[] args) {
		char a1 = '\u00E5'; //å
		char a2 = '\u00E4'; //ä
		char o1 = '\u00F6'; //ö
		/*int i = 500.7;
		byte b = 500.7;
		double d = 500.7;
		double pi = 3.1415926536;
		String r = JOptionPane.showInputDialog(null, "Vad " + a2 + "r radien p" + a1 + " cirkeln?");
		double ra = Double.parseDouble(r);
		double O = pi * 2 * ra;
		double A = pi * ra * ra;
		JOptionPane.showMessageDialog(null, "Omkretsen p" + a1 + " den cirkeln " + a2 + "r " + O + "\nArean p" + a1 + " cirkeln " + a2 + "r " + A + ".");*/
		/*String min = JOptionPane.showInputDialog(null, "Ungef" + a2 + "r hur m" + a1 + "nga minuter ringer du per m" + a1 + "nad?");
		String costS = JOptionPane.showInputDialog(null, "Hur mycket kostar det f" + o1 + "r dig att ringa minutvis?");
		double minutes = Double.parseDouble(min);
		double costD = Double.parseDouble(costS);
		double product = minutes * costD;
		JOptionPane.showMessageDialog(null, "Det kostar ungef" + a2 + "r " + product + " kr per m" + a1 + "nad.");*/
		//SFP = String FullPrice
		/*String SFP = JOptionPane.showInputDialog(null, "Hur mycket kostar produkten inklusive moms?");
		int DFP = Integer.parseInt(SFP);
		int moms = DFP/5;
		int Realcost = moms * 4;
		JOptionPane.showMessageDialog(null, "Pris exklusive moms: " + Realcost + "\nMoms: " + moms);*/
		/*nt mins, secs, hours, tid;
		String tidS = JOptionPane.showInputDialog(null, "Hur m" + a1 + "nga sekunder tog det?");
		tid = Integer.parseInt(tidS);
		hours = tid / 3600;
		mins = (tid-hours*3600)/60;
		secs = (tid-hours*3600-mins*60);
		JOptionPane.showMessageDialog(null, "Timmar: " + hours + "\nMinuter: " + mins + "\nSekunder: " + secs);*/
		String d1S = JOptionPane.showInputDialog(null, "V" + a2 + "rme dag 1");
		String d2S = JOptionPane.showInputDialog(null, "V" + a2 + "rme dag 2");
		double d1 = Double.parseDouble(d1S);
		double d2 = Double.parseDouble(d2S);
		double maxTemp = Math.max(d1, d2);
		d2S = JOptionPane.showInputDialog(null, "V" + a2 + "rme dag 3");
		d2 = Double.parseDouble(d2S);
		maxTemp = Math.max(d2, maxTemp);
		d2S = JOptionPane.showInputDialog(null, "V" + a2 + "rme dag 4");
		d2 = Double.parseDouble(d2S);
		maxTemp = Math.max(d2, maxTemp);
		d2S = JOptionPane.showInputDialog(null, "V" + a2 + "rme dag 5");
		d2 = Double.parseDouble(d2S);
		maxTemp = Math.max(d2, maxTemp);
		d2S = JOptionPane.showInputDialog(null, "V" + a2 + "rme dag 6");
		d2 = Double.parseDouble(d2S);
		maxTemp = Math.max(d2, maxTemp);
		d2S = JOptionPane.showInputDialog(null, "V" + a2 + "rme dag 7");
		d2 = Double.parseDouble(d2S);
		maxTemp = Math.max(d2, maxTemp);
		JOptionPane.showMessageDialog(null, "Maxtemperaturen var " + maxTemp);
	}
}