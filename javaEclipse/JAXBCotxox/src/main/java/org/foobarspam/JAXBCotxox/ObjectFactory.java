package org.foobarspam.JAXBCotxox;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {

    private final static QName _Estacion_QNAME = new QName("https://api.mobipalma.mobi/docs/", "estacion");
    public ObjectFactory() {
    }
    public Carrera createCarrera() {
        return new Carrera(null);
    }
    @XmlElementDecl(namespace = "https://api.mobipalma.mobi/docs/", name = "carrera")
    public JAXBElement<Carrera> createEstacion(Carrera value) {
        return new JAXBElement<Carrera>(_Estacion_QNAME, Carrera.class, null, value);
    }

}
