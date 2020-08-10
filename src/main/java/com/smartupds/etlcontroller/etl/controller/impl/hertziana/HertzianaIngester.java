package com.smartupds.etlcontroller.etl.controller.impl.hertziana;

import com.smartupds.etlcontroller.etl.controller.Resources;
import com.smartupds.etlcontroller.etl.controller.Utils;
import com.smartupds.etlcontroller.etl.controller.api.Ingester;
import com.smartupds.etlcontroller.etl.controller.exception.ETLGenericException;
import com.smartupds.etlcontroller.etl.controller.model.TripleStoreConnection;
import gr.forth.ics.isl.timer.Timer;
import java.io.File;
import lombok.extern.log4j.Log4j;

/** This class is responsible for ingesting the transformed resources in a triplestore
 * 
 * @author Yannis Marketakis (marketakis 'at' smartupds 'dot' com)
 */
@Log4j
public class HertzianaIngester implements Ingester{
    private final TripleStoreConnection triplestoreConnection;
    
    private HertzianaIngester(TripleStoreConnection tripleStoreConn){
        this.triplestoreConnection=tripleStoreConn;
    }
    
    @Override
    public void ingestResources() throws ETLGenericException {
        log.info("START: Ingest artworks from Hertziana");
        Timer.start(HertzianaIngester.class+".artworks");
        for(File file: new File(Resources.FOLDER_OUTPUT_TRANSFORMED_HERTZIANA_ARTWORKS).listFiles()){
            Utils.uploadFile(this.triplestoreConnection, file, Resources.GRAPHSPACE_HERTZIANA, true);
        }
        Timer.stop(HertzianaIngester.class+".artworks");
        log.info("FINISH: Ingest artworks from Hertziana in "+Timer.reportHumanFriendly(HertzianaIngester.class+".artworks"));

        log.info("START: Ingest artworks LVL2 from Hertziana");
        Timer.start(HertzianaIngester.class+".artworks-lv2");
        for(File file: new File(Resources.FOLDER_OUTPUT_TRANSFORMED_HERTZIANA_ARTWORKS_LVL2).listFiles()){
            Utils.uploadFile(this.triplestoreConnection, file, Resources.GRAPHSPACE_HERTZIANA, true);
        }
        Timer.stop(HertzianaIngester.class+".artworks-lv2");
        log.info("FINISH: Ingest artworks from Hertziana in "+Timer.reportHumanFriendly(HertzianaIngester.class+".artworks-lv2"));

        log.info("START: Ingest artworks LVL3 from Hertziana");
        Timer.start(HertzianaIngester.class+".artworks-lv3");
        for(File file: new File(Resources.FOLDER_OUTPUT_TRANSFORMED_HERTZIANA_ARTWORKS_LVL3).listFiles()){
            Utils.uploadFile(this.triplestoreConnection, file, Resources.GRAPHSPACE_HERTZIANA, true);
        }
        Timer.stop(HertzianaIngester.class+".artworks-lv3");
        log.info("FINISH: Ingest artworks from Hertziana in "+Timer.reportHumanFriendly(HertzianaIngester.class+".artworks-lv3"));

        log.info("START: Ingest artworks LVL4 from Hertziana");
        Timer.start(HertzianaIngester.class+".artworks-lv4");
        for(File file: new File(Resources.FOLDER_OUTPUT_TRANSFORMED_HERTZIANA_ARTWORKS_LVL4).listFiles()){
            Utils.uploadFile(this.triplestoreConnection, file, Resources.GRAPHSPACE_HERTZIANA, true);
        }
        Timer.stop(HertzianaIngester.class+".artworks-lv4");
        log.info("FINISH: Ingest artworks from Hertziana in "+Timer.reportHumanFriendly(HertzianaIngester.class+".artworks-lv4"));

        log.info("START: Ingest Builtworks from Hertziana");
        Timer.start(HertzianaIngester.class+".builtworks");
        for(File file: new File(Resources.FOLDER_OUTPUT_TRANSFORMED_HERTZIANA_BUILTWORKS).listFiles()){
            Utils.uploadFile(this.triplestoreConnection, file, Resources.GRAPHSPACE_HERTZIANA, true);
        }
        Timer.stop(HertzianaIngester.class+".builtworks");
        log.info("FINISH: Ingest Builtworks from Hertziana in "+Timer.reportHumanFriendly(HertzianaIngester.class+".builtworks"));

        log.info("START: Ingest Builtworks LVL2 from Hertziana");
        Timer.start(HertzianaIngester.class+".builtworks-lv2");
        for(File file: new File(Resources.FOLDER_OUTPUT_TRANSFORMED_HERTZIANA_BUILTWORKS_LVL2).listFiles()){
            Utils.uploadFile(this.triplestoreConnection, file, Resources.GRAPHSPACE_HERTZIANA, true);
        }
        Timer.stop(HertzianaIngester.class+".builtworks-lv2");
        log.info("FINISH: Ingest Builtworks from Hertziana in "+Timer.reportHumanFriendly(HertzianaIngester.class+".builtworks-lv2"));

        log.info("START: Ingest Builtworks LVL3 from Hertziana");
        Timer.start(HertzianaIngester.class+".builtworks-lv3");
        for(File file: new File(Resources.FOLDER_OUTPUT_TRANSFORMED_HERTZIANA_BUILTWORKS_LVL3).listFiles()){
            Utils.uploadFile(this.triplestoreConnection, file, Resources.GRAPHSPACE_HERTZIANA, true);
        }
        Timer.stop(HertzianaIngester.class+".builtworks-lv3");
        log.info("FINISH: Ingest Builtworks from Hertziana in "+Timer.reportHumanFriendly(HertzianaIngester.class+".builtworks-lv3"));

        log.info("START: Ingest Builtworks LVL4 from Hertziana");
        Timer.start(HertzianaIngester.class+".builtworks-lv4");
        for(File file: new File(Resources.FOLDER_OUTPUT_TRANSFORMED_HERTZIANA_BUILTWORKS_LVL4).listFiles()){
            Utils.uploadFile(this.triplestoreConnection, file, Resources.GRAPHSPACE_HERTZIANA, true);
        }
        Timer.stop(HertzianaIngester.class+".builtworks-lv4");
        log.info("FINISH: Ingest Builtworks from Hertziana in "+Timer.reportHumanFriendly(HertzianaIngester.class+".builtworks-lv4"));

        log.info("START: Ingest photographs from Hertziana");
        Timer.start(HertzianaIngester.class+".photographs");
        for(File file: new File(Resources.FOLDER_OUTPUT_TRANSFORMED_HERTZIANA_PHOTOGRAPHS).listFiles()){
            Utils.uploadFile(this.triplestoreConnection, file, Resources.GRAPHSPACE_HERTZIANA, true);
        }
        Timer.stop(HertzianaIngester.class+".photographs");
        log.info("FINISH: Ingest photographs from Hertziana in "+Timer.reportHumanFriendly(HertzianaIngester.class+".photographs"));

        log.info("START: Ingest Actors from Hertziana");
        Timer.start(HertzianaIngester.class+".actors");        
        for(File file: new File(Resources.FOLDER_OUTPUT_TRANSFORMED_HERTZIANA_ACTORS).listFiles()){
            Utils.uploadFile(this.triplestoreConnection, file, Resources.GRAPHSPACE_HERTZIANA, true);
        }
        Timer.stop(HertzianaIngester.class+".actors");
        log.info("FINISH: Ingest Builtworks from Hertziana in "+Timer.reportHumanFriendly(HertzianaIngester.class+".actors"));

        log.info("START: Ingest Photographs using FCs FRs from Hertziana");
        Timer.start(HertzianaIngester.class+".photographs-fc-fr");
        for(File file: new File(Resources.FOLDER_OUTPUT_TRANSFORMED_HERTZIANA_PHOTOGRAPHS_FC_FR).listFiles()){
            Utils.uploadFile(this.triplestoreConnection, file, Resources.GRAPHSPACE_HERTZIANA_FC_FR, false);
        }
        Timer.stop(HertzianaIngester.class+".photographs-fc-fr");
        log.info("FINISH: Ingest Photographs using FCs FRs from Hertziana in "+Timer.reportHumanFriendly(HertzianaIngester.class+".photographs-fc-fr"));

        log.info("START: Ingest Works using FCs FRs from Hertziana");
        Timer.start(HertzianaIngester.class+".works-fc-fr");
        for(File file: new File(Resources.FOLDER_OUTPUT_TRANSFORMED_HERTZIANA_WORKS_FC_FR).listFiles()){
            Utils.uploadFile(this.triplestoreConnection, file, Resources.GRAPHSPACE_HERTZIANA_FC_FR, false);
        }
        Timer.stop(HertzianaIngester.class+".works-fc-fr");
        log.info("FINISH: Ingest Works using FCs FRs from Hertziana in "+Timer.reportHumanFriendly(HertzianaIngester.class+".works-fc-fr"));
        
        log.info("Hertziana Ingest Time: "+Timer.reportHumanFriendly(HertzianaIngester.class.toString()));
    }
    
    public static HertzianaIngester create(TripleStoreConnection triplestoreConnection){
        return new HertzianaIngester(triplestoreConnection);
    }
}