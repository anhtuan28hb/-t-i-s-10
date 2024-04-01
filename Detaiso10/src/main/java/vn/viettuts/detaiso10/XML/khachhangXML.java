/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vn.viettuts.detaiso10.XML;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import vn.viettuts.detaiso10.entity.Customer;

/**
 *
 * @author Bui Anh Tuan
 */
public class khachhangXML {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.newDocument();
            
            Customer kh1 = new Customer("Bui Anh Tuan", "1/4/2024", "0123456789", "naaaa");
            Customer kh2 = new Customer("Bui Anh Tuan", "7/4/2024", "0123456789", "naaaa");
    
            Element khachhang = doc.createElement("khachhang");
            themkhachhang(doc, khachhang, kh1);
            themkhachhang(doc, khachhang, kh2);
            doc.appendChild(khachhang);
            
            TransformerFactory tff = TransformerFactory.newInstance();
            try {
                Transformer tf = tff.newTransformer();
                tf.setOutputProperty(OutputKeys.INDENT, "yes" );
                tf.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "3");
                DOMSource source = new DOMSource(doc);
                StreamResult result = new StreamResult("C:\\Users\\Bui Anh Tuan\\OneDrive\\Documents\\New WinRAR archive\\Detaiso10\\src\\main\\java\\XML\\khachhang.xml");
                tf.transform(source, result);
                
            } catch (TransformerConfigurationException ex) {
                Logger.getLogger(khachhangXML.class.getName()).log(Level.SEVERE, null, ex);
            } catch (TransformerException ex) {
                Logger.getLogger(khachhangXML.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(khachhangXML.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    static private void themkhachhang(Document doc, Element e, Customer kh){
        Element khachhang = doc.createElement("khachhang");
        Element tenkhachhang = doc.createElement("tenkhachhang");
        tenkhachhang.setTextContent(kh.getTenkhachhang());
        Element sodienthoai = doc.createElement("sodienthoai");
        sodienthoai.setTextContent(kh.getSodienthoai());
        Element ngaymua = doc.createElement("ngaymua");
        ngaymua.setTextContent(kh.getNgaymua());
        Element sanpham = doc.createElement("sanpham");
        sanpham.setTextContent(kh.getSanphammua());

        khachhang.appendChild(tenkhachhang);
        khachhang.appendChild(sodienthoai);
        khachhang.appendChild(ngaymua);
        khachhang.appendChild(sanpham);
        e.appendChild(khachhang);
    }
}
