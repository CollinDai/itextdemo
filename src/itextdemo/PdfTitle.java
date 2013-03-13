package itextdemo;


import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph; 
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BaseFont;

/**
 * PdfTitle.java
 * 
 * @author Peike Dai
 * Date: 2012/06/07
 * Platform: MyEclipse Java 8.6， Windows7 Ultimate
 * 
 * Version
 * =======
 * 1.0 - 2012/06/07
 * 
 * Module Operation
 * ================
 * 
 * Public Interface
 * ================
 * PdfTitle();									// constructor
 * PdfTitle(String title);						// constructor
 * PdfTitle(String title, boolean isJapanese);	// constructor
 * 
 * setTitle(String text);						// set the title text
 *
 */
public class PdfTitle extends PdfElement {
	private Paragraph text;
	private Font font;
	

	public PdfTitle(){
		this("", 0);
	}
	public PdfTitle(String title){
		this(title, 0);
	}
	
	public PdfTitle(String _title, int fontstyle) {
		text = new Paragraph();
		text.setAlignment(Element.ALIGN_CENTER);
		switch (fontstyle) {
		default:
			font = new Font(baseFontJp, 22);
			break;
		case 1:
			font = this.setFontMin(22);
			break;
		case 2:
			font = this.setFontMaruGo(22);
			break;
		case 3:
			font = this.setFontKaisho(22);
			break;
		}
		text.setFont(font);
		text.add(_title);
	}
	
	public PdfTitle setTitle(String title){
		text.add(title);
		return this;
	}
	
	public PdfTitle setMarginTop(float margintop) {
		text.setLeading(margintop);
		return this;
	}

	/**
	 * set the font size of title. Default is 22
	 * @param _size
	 */
	public PdfTitle setFontSize(float _size) {
		try {
			font = text.getFont();
			font.setSize(_size);
			text.setFont(font);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	public PdfTitle setBold() {
		font.setStyle(Font.BOLD);
		this.text.setFont(font);
		return this;
	}
	
	/**
	 * Added date:2012/07/13
	 * Used for 講座ポップ
	 * @param pagewidth
	 * @return
	 */
	public PdfTitle adaptPaper(float pagewidth) {
		while (getTextWidth(text) >= (pagewidth - 72)) {
			font.setSize(font.getSize() - 1);
		}
		return this;
	}

	private float getTextWidth(Paragraph text){
		BaseFont bf_font = font.getCalculatedBaseFont(false);
		String content = text.getContent();
		float fontsize = text.getFont().getSize();
		if (fontsize == -1f) {
			fontsize = 12f;
		}
		float width_string = bf_font.getWidthPointKerned(content, fontsize);
		return width_string;
	}
	/**
	 * @override
	 */
	public Phrase getPhrase(){
		return text;
	}

	protected Element getPdfElement() {
		return text;
	}
	

	/**
	 * Return the title as type string
	 * 
	 * @param no
	 *            arg
	 * @return String
	 */
	public String toString() {
		return text.toString();
	}
}
