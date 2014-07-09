package com.mscslc.pottercraft.configuration;


import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by mcobb14 on 7/9/2014.
 */
public class ConfigurationHandler {

    public static void init(File configFile) {

        Configuration configuration = new Configuration(configFile);

        try{
            //Load the configuration file
            configuration.load();

            //read the configuration file
        }
        catch (Exception e) {
            //log exception
        }
        finally {
            configuration.save();
        }



    }
}
