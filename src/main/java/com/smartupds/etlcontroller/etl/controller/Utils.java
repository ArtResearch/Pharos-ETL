package com.smartupds.etlcontroller.etl.controller;

import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import lombok.extern.log4j.Log4j;

/** Various utility facilities
 * 
 * @author Yannis Marketakis (marketakis 'at' smartupds 'dot' com)
 */
@Log4j
public class Utils {
    
    public static void lineUpdater(File fromFile, File toFile, String initialLine, String finalLine) throws IOException{
        log.info("Updating occurences of \""+initialLine+"\" to\""+finalLine+"\" from file "+fromFile.getAbsolutePath()+" and export to file "+toFile.getAbsolutePath());
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(new FileInputStream(fromFile), "UTF8"));
        BufferedWriter bufferedWriter=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(toFile), "UTF8"));
        String line="";
        int lineCounter=0;
        while((line=bufferedReader.readLine())!=null){
            lineCounter+=1;
            if(line.trim().equals(initialLine.trim())){
                bufferedWriter.append(finalLine).append("\n");
                log.info("Found line for replace in line number "+lineCounter);
            }else{
                bufferedWriter.append(line).append("\n");
            }
        }
        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }
    
    public static void main(String[] args) throws Exception{
        File folder=new File("C:\\Repositories\\Github\\ETL-Controller\\workspace\\3_Output\\1_Transformed\\Marburg\\photographs");
        Model model = ModelFactory.createDefaultModel() ;
        for(File file : folder.listFiles()){
            log.info("File "+file.getName());
            model.read(new FileReader(file), "N3","N3");
        }   
    }
}