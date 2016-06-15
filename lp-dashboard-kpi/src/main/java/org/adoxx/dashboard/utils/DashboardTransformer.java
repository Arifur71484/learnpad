package org.adoxx.dashboard.utils;

import java.io.File;
import java.io.OutputStream;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.apache.log4j.Logger;

public class DashboardTransformer {
    
        private static Logger log = Logger.getLogger(DashboardTransformer.class);

        /**
         * 
         * @param xsltRoot
         * @param dataRoot
         * @param businessActorId
         * @param dataOut 
         */
	public static void transform(String xsltRoot, String dataRoot, String businessActorId, OutputStream dataOut) {
		try {
			TransformerFactory tFactory = TransformerFactory.newInstance();
			Transformer transformer = tFactory.newTransformer(new StreamSource(new File(xsltRoot, "cockpittransform.xsl")));
			transformer.transform(new StreamSource(new File(dataRoot, businessActorId+"_cockpit.xml")), new StreamResult(dataOut));
		} catch (TransformerException e) {
			log.error("Failed to transform KPI's for business actor: "+businessActorId, e);
		}
	}

}
