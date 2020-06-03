package main;

import org.apache.cxf.tools.wsdlto.WSDLToJava;

public class CodeGenerator {
	public static void main(String[] args) {
		System.setProperty("javax.xml.accessExternalSchema", "all");
		WSDLToJava.main(new String[] {
				"-server",
				"-d", "src/main",
				"src/main/resources/RandomService.wsdl"
		});
	}
}
