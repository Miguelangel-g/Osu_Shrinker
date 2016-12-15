/*
    [Osu!Shrinker]
    Copyright (C) 2016  NewKey

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.

*/


package OsuShrinker;

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JOptionPane;

public class RunIt{

    public static boolean find=false,pause=false;
    public static boolean Astd=false,Ataiko=false,Amania=false,Afruts=false;
    public static List<String> alertFiles = new ArrayList<>();
    public static File folder;
    public static Runnable runnable = new Runnable() {
	    @Override
	    public void run() {
	    }
	};
   public static Thread Thread= new Thread();



    public static void Run() {
	Runnable runnable = new Runnable() {
	    public void run() {
		do{
		alertFiles = new ArrayList<>();
		List<String> songs = Folder(folder);
		List<String> files = Files(songs);
		Osu(files);
		List<String> pareF = pare(files,alertFiles);
		//
		
		int respon = JOptionPane.showConfirmDialog(null, "We found for: \n"+
			("-------------------- \n")
			+
			((!Window.C_STD.isSelected())? Window.N_STD.getText()+": Osu!Standard Map's Songs. \n" : "")
			+
			((!Window.C_Taiko.isSelected())? Window.N_Taiko.getText()+": Osu!Taiko Map's Songs. \n" : "")
			+
			((!Window.C_CTB.isSelected())? Window.N_CTB.getText()+": Osu! Catch the Beat Map's Songs. \n" : "")
			+
			((!Window.C_Mania.isSelected())? Window.N_Mania.getText()+": Osu!mania Songs. \n": "")
			+
			("-------------------- \n")
			+
			("Are you sure to delete PERMANENTLY those maps? \n")
				, "ALERT",
			JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		    if (respon == JOptionPane.YES_OPTION) {
			delete(pareF,files,songs);
			aux("END");
		    }
		    if (respon == JOptionPane.NO_OPTION) {
			Window.Clean();
		    }
		}while(pause);
	    }
	};
	Thread = new Thread(runnable);
        Thread.start();
	
    }
    

    public static void Stop(){
	Thread.stop();
    }
    
     public static void Pause(){
	    pause=true;
    }
     
     public static void Resume(){
	pause=false;
    }

    public static List<String> Folder(File Ruta){
	List<String> route = new ArrayList<>();
	for (File file : Ruta.listFiles()) 
	    if (file.isDirectory()) {
		    route.add(file.getAbsolutePath());
		}
	return route;
    }//Folder
    
    public static List<String> Files(List<String> songs){
	List<String> files = new ArrayList<>();
	aux("Indexing Folders.");
	for(int i=0;i<songs.size();i++){
	    File[] song = new File(songs.get(i)).listFiles();
	    for (File song1 : song) {
		files.add(song1.getAbsolutePath());
	    }
	}
	return files;
    }
    
   public static void Osu(List<String> osu){
       aux("Analyzing songs and maps.");
       Window.ProgressBar.setMaximum(osu.size());
       Window.L_max.setText(osu.size()+"");
       for(int i=0;i<osu.size();i++){
	    if(osu.get(i).contains(".osu") && osu.get(i).contains("")){
		alertFiles=readOsu(osu.get(i));
		Window.ProgressBar.setValue(i+1);
		Window.L_i.setText(i+"");
	    }
	}
       Window.ProgressBar.setValue(osu.size());
       Window.L_max.setText(osu.size()+"");
   }
   
   public static void delete(List<String> pareF, List<String> files,List<String> songs){
	List<String> del = new ArrayList<>(pareF);
	aux("Deleting files.");	
	try {
	   for (int i=0;i<del.size();i++) {
	       File fil = new File(del.get(i));
	       if (fil.isFile()) {
		   fil.delete();
	       }
	       if (fil.isDirectory()) {
		   del(fil);
	       }
	   }
       } catch (IOException iOException) {}
	aux("Deleting empty folders.");
	for(int i=0; i<songs.size();i++) {
		 File fil = new File(songs.get(i));
		 if(fil.isDirectory()){
		     if(fil.listFiles().length==0){
			 fil.delete();
		     }
		 }
	}
   }
   
   public static void del(File f) throws IOException {
	if (f.isDirectory()) {
	  for (File c : f.listFiles())
	    del(c);
	}
	if (!f.delete())
	  aux("Failed to delete file: " + f);
    }
   
   public static String mode(String osuRoute){
	File file = new File(osuRoute);
	FileInputStream fis = null;
	BufferedInputStream bis = null;
	DataInputStream dis = null;
	String mode="";
	try {
	  fis = new FileInputStream(file);
	  bis = new BufferedInputStream(fis);
	  dis = new DataInputStream(bis);
          boolean notfind = false;
          boolean modefind = false;
	  while (dis.available() != 0) {
	      String Line=dis.readLine();
            if(Line.contains("v1")||Line.contains("v2")||Line.contains("v3")||Line.contains("v4")||Line.contains("v5")){
                mode="0";
                modefind=true;
            }else{ 
                if(Line.contains("Mode:")){
                    modefind=true;
                    mode=Line.substring(Line.indexOf(":")+1, Line.length());
                    notfind=false;
                    
                }else{
                    if(Line.contains("[General]") && modefind==false){
                        modefind=false;
                        notfind=true;
                    }
                }
            }
	    if(Line.contains("[Metadata]")){
		break;
	    }
	  }
          if(notfind)
              mode="0";

	  fis.close();
	  bis.close();
	  dis.close();
	  return mode.trim();
	} catch (FileNotFoundException e) {
	  e.printStackTrace();
	   return null;
	} catch (IOException e) {
	  e.printStackTrace();
	  return null;
	}
   }
   
   public static List<String> pare(List<String> files,List<String> alertFiles){
       aux("Almost done, wait.");
        List<String> forSave = new ArrayList<>();
        files.removeAll(alertFiles);
        List<String> del = new ArrayList<>(files);
	Set<String> hs = new HashSet<>();
	hs.addAll(del);
	forSave.clear();
	forSave.addAll(hs);
	List<String> forDell = new ArrayList<>(hs);
        aux("Done.");
       return forDell;
   }
   
   public static void read(String osuRoute){
       do{
        alertFiles.add(osuRoute);
        String route = osuRoute.substring(0,osuRoute.indexOf("\\",osuRoute.indexOf("Songs\\")+7));
	File file = new File(osuRoute);
	FileInputStream fis = null;
	BufferedInputStream bis = null;
	DataInputStream dis = null;
	try {
	  fis = new FileInputStream(file);
	  bis = new BufferedInputStream(fis);
	  dis = new DataInputStream(bis);
	    while (dis.available() != 0) {
	      String Line=dis.readLine();
		if(Line.startsWith("AudioFilename:"))
		    alertFiles.add(route+File.separator+Line.substring(Line.indexOf(":")+2, Line.length()));             
                if(Line.startsWith("0,0,"))
		    alertFiles.add(route+File.separator+Line.substring(Line.indexOf("\"")+1, Line.lastIndexOf("\"")));
		if(Line.contains("[TimingPoints]"))
		    break;
	    }
	    fis.close();
	    bis.close();
	    dis.close();
	    } catch (FileNotFoundException e) {
	      e.printStackTrace();
	    } catch (IOException e) {
	      e.printStackTrace();
	    }
       }while(pause==true);
   }
   
   
    public static List<String> readOsu(String osuRoute){
	String mod = mode(osuRoute);
	if(mod.equals("0"))
	    Window.N_STD.setText((Integer.parseInt(Window.N_STD.getText())+1)+"");
	if(mod.equals("1"))
	    Window.N_Taiko.setText((Integer.parseInt(Window.N_Taiko.getText())+1)+"");
	if(mod.equals("2"))
	    Window.N_CTB.setText((Integer.parseInt(Window.N_CTB.getText())+1)+"");	
	if(mod.equals("3"))
	    Window.N_Mania.setText((Integer.parseInt(Window.N_Mania.getText())+1)+"");		
	if(mod.equals("0") && Astd)
	    read(osuRoute);	
	if(mod.equals("1") && Ataiko)
	    read(osuRoute);
	if(mod.equals("2") && Afruts)
	    read(osuRoute);
	if(mod.equals("3") && Amania)
	    read(osuRoute);	
	return alertFiles;
      }
    

    public static void aux(Object aux){
	Window.T_Area.setText(Window.T_Area.getText()+aux.toString()+"\n");
	int len = Window.T_Area.getDocument().getLength();
	Window.T_Area.setCaretPosition(len);
    }
    /*
static boolean v1=false,v2=false,v3=false,v4=false,v5=false,v6=false,v7=false,v8=false,
                v9=false,v10=false,v11=false,v12=false,v13=false,v14=false,v15=false;

    private static boolean iden(String Line, String osuRoute,boolean notfind) {
        
        if(Line.contains("v1") && v1==false){ 
            copy(osuRoute,"1",false,count); 
            v1=true;
            return true;
	}
        if(Line.contains("v2") && v2==false){ 
            copy(osuRoute,"2",false,count); v2=true;
            return true;
	}
        if(Line.contains("v3") && v3==false){ 
            copy(osuRoute,"3",false,count);  v3=true;
            return true;
	}
        if(Line.contains("v4") && v4==false){ 
            copy(osuRoute,"4",false,count);  v4=true;
            return true;
	}
        if(Line.contains("v5") && v5==false){ 
            copy(osuRoute,"5",false,count);  v5=true;
            return true;
	}
        if(Line.contains("v6") && v6==false){ 
            copy(osuRoute,"6",false,count);  v6=true;
            return true;
	}
        if(Line.contains("v7") && v7==false){ 
            copy(osuRoute,"7",false,count);  v7=true;
            return true;
	}
        if(Line.contains("v8") && v8==false){ 
            copy(osuRoute,"8",false,count);  v8=true;
            return true;
	}
        if(Line.contains("v9") && v9==false){ 
            copy(osuRoute,"9",false,count);  v9=true;
            return true;
	}
        if(Line.contains("v10") && v10==false){ 
            copy(osuRoute,"10",false,count);  v10=true;
            return true;
	}
        if(Line.contains("v11") && v11==false){ 
            copy(osuRoute,"11",false,count);  v11=true;
            return true;
	}
        if(Line.contains("v12") && v2==false){ 
            copy(osuRoute,"12",false,count);  v12=true;
            return true;
	}
        if(Line.contains("v13") && v13==false){ 
            copy(osuRoute,"13",false,count);  v13=true;
            return true;
	}
        if(Line.contains("v14") && v14==false){ 
            copy(osuRoute,"14",false,count);  v14=true;
            return true;
	}
        if(Line.contains("v15") && v15==false){ 
            copy(osuRoute,"15",false,count);  v15=true;
            return true;
	}
        if(notfind==true){
            count++;
            copy(osuRoute," XXXX",true,count); return true;
        }
        return false;
    }

    static int count = 0;
    public static void copy(String osuRoute, String V,boolean x,int c){
        try {
            File destDir = new File("C:\\Users\\miguel\\Desktop\\Songs");
            File srcFile = new File(osuRoute);
            //FileUtils.copyFileToDirectory(srcFile, destDir);
            if(x==true)
                FileUtils.copyFile(srcFile,new File(destDir+File.separator+"VERSION "+V+" "+c));
                else
                    FileUtils.copyFile(srcFile,new File(destDir+File.separator+"VERSION "+V));
        } catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }
*/
}
