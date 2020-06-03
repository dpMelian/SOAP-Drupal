package main;

import org.apache.cxf.tools.wsdlto.WSDLToJava;

public class CodeGenerator {
	public static void main(String[] args) {
		System.setProperty("javax.xml.accessExternalSchema", "all");
		WSDLToJava.main(new String[] {
				"-client",
				"-d", "src",
				"file:src/main/resources/RandomService.wsdl"
		});
		System.out.println("ready");
	}
}
