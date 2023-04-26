package ua.javatar;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.StringWriter;

public class XsltTransformation {
    public static void main(String[] args) throws JAXBException, TransformerException {
        // read xml
        JAXBContext jaxbContext = JAXBContext.newInstance(Journal.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        Journal journal = (Journal) jaxbUnmarshaller.unmarshal(XsltTransformation.class.getClassLoader().getResourceAsStream("input.xml"));

        // create node
        var result = new DOMResult();
        JAXBContext.newInstance(Journal.class).createMarshaller().marshal(journal, result);

        var writer = new StringWriter();
        TransformerFactory transformerFactory = TransformerFactory.newInstance();

        // add XSLT in Transformer

        URIResolver resolver = (href, base) -> new StreamSource(XsltTransformation.class.getClassLoader().getResourceAsStream(href));

        transformerFactory.setURIResolver(resolver);
        Transformer transformer = transformerFactory.newTransformer(new StreamSource(XsltTransformation.class.getClassLoader().getResourceAsStream("student.xsl")));

        transformer.transform(new DOMSource(result.getNode()), new StreamResult(writer));

        System.out.println(writer);
    }
}
