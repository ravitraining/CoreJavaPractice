package logics;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

public class QRCodeGenerator {
@SuppressWarnings("resource")
public static void main(String[] args) throws IOException {
	String raviraj="Hello Raviraj How are you";
	ByteArrayOutputStream out=QRCode.from(raviraj).to(ImageType.JPG).stream();
	File f=new File("D:\\QRCode\\raviraj.jpg");
	FileOutputStream fos=new FileOutputStream(f);
	fos.write(out.toByteArray());
	fos.flush(); 
	System.out.println("QR Code Build Success");
}
}
