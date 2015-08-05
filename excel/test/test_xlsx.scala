import java.io.FileInputStream
import java.io.IOException
import java.io.InputStream
import java.io.PrintStream

import javax.xml.parsers.ParserConfigurationException
import javax.xml.parsers.SAXParser
import javax.xml.parsers.SAXParserFactory

import org.apache.poi.openxml4j.exceptions.OpenXML4JException
import org.apache.poi.openxml4j.opc.OPCPackage
import org.apache.poi.openxml4j.opc.PackageAccess
import org.apache.poi.ss.usermodel.BuiltinFormats
import org.apache.poi.ss.usermodel.DataFormatter
import org.apache.poi.xssf.model.StylesTable
import org.apache.poi.xssf.usermodel.XSSFCellStyle
import org.apache.poi.xssf.usermodel.XSSFRichTextString

import org.apache.poi.xssf.eventusermodel._
import org.apache.poi.ss.usermodel.Cell
import org.apache.poi.xssf.usermodel.XSSFCell
import org.apache.poi.xssf.usermodel.XSSFRow
import org.apache.poi.xssf.usermodel.XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook
/*
import org.xml.sax.Attributes
import org.xml.sax.ContentHandler
import org.xml.sax.InputSource
import org.xml.sax.SAXException
import org.xml.sax.XMLReader
import org.xml.sax.helpers.DefaultHandler
*/
object Xlsx {

	def readXLSXFile(fileName:String)=
	{
		val ExcelFileToRead:InputStream = new FileInputStream(fileName)
		val wb:XSSFWorkbook = new XSSFWorkbook(ExcelFileToRead)

		val test:XSSFWorkbook = new XSSFWorkbook()

		val sheet:XSSFSheet = wb.getSheetAt(0)

		val rows = sheet.rowIterator()

		while( rows.hasNext() )
		{
			val row = rows.next().asInstanceOf[XSSFRow]
			val cells = row.cellIterator()
			while( cells.hasNext() )
			{
				val cell = cells.next().asInstanceOf[XSSFCell]
		
				cell.getCellType() match {
					case Cell.CELL_TYPE_STRING => print(cell.getStringCellValue()+" ")
					case Cell.CELL_TYPE_NUMERIC => print(cell.getNumericCellValue()+" ")
					case Cell.CELL_TYPE_FORMULA => print(cell.getNumericCellValue()+" ")
					case _=>
				}
			}
			println()
		}
	}

	def main(args:Array[String])
	{
		readXLSXFile("./テスト.xlsx")
	}

}
