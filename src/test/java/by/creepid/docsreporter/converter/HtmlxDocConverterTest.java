/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.creepid.docsreporter.converter;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rusakovich
 */
public class HtmlxDocConverterTest {

    private DocConverter converter;

    public HtmlxDocConverterTest() {
        converter = new HtmlxDocConverter();
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getTargetFormat method, of class HtmlxDocConverter.
     */
    @Test
    public void testGetTargetFormat() {
        System.out.println(converter.getSourceFormat());
        System.out.println(converter.getTargetFormat());
        try {
            converter.convert("src/test/resources/DocxProjectWithVelocity.docx", "src/test/resources/DocxProjectWithVelocity.htm");
        } catch (Exception ex) {
            Logger.getLogger(PdfDocConverterTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}