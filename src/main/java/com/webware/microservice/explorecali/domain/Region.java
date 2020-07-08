package com.webware.microservice.explorecali.domain;

public enum Region {
    Central_Coast("Central Coast"), Southern_California("Southern California"), Northern_california("Northern California"), Varies("Varies");

   private String label;
   private Region(String label) {
       this.label = label;
   }
   public static Region findByLabel(String bylabel) {
       for (Region r: Region.values()) {
           if(r.label.equalsIgnoreCase(bylabel))
               return r;
       }

       return null;
   }
}
