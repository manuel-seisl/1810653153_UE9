package at.ac.fh_kufstein.xml;

import at.ac.fh_kufstein.weather.Weather;

import javax.swing.*;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.IOException;

public class XML
{

    // Wetter-XML - Datei

    private static final String WEATHER_XML = "weather.xml";

    // Wetterdaten in XML speichern

    public static void marshalling(Weather currWeather) throws JAXBException, IOException {

        File file = new File(WEATHER_XML);

        if (!file.exists()){
            file.createNewFile();
        }

        try {

            JAXBContext context = JAXBContext.newInstance(Weather.class);
            Marshaller m = context.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            m.marshal(currWeather, new File(WEATHER_XML));

            // Meldung anzeigen

            JOptionPane.showMessageDialog(null, "XML Datei erfolgreich angelegt!", "Meldung", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception ex){
            ex.printStackTrace();
        }

    }

}
