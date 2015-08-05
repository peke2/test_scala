//import org.apache.poi.hssf.extractor.ExcelExtractor
//import org.apache.poi.xssf.extractor.XSSFExcelExtractor
import java.io.FileInputStream
import java.util.Date
import org.apache.poi.hssf.usermodel._
import org.apache.poi.ss.usermodel._
import org.apache.poi.poifs.filesystem.POIFSFileSystem
import org.apache.poi.xssf._


object TestPoi
{
	def main(args:Array[String])
	{
		println("Hello")

		//val filein:POIFSFileSystem = new POIFSFileSystem(new FileInputStream("個人スキル表(阿部).xls"))
		val filein:POIFSFileSystem = new POIFSFileSystem(new FileInputStream("テスト.xlsx"))
		val wb:HSSFWorkbook = new HSSFWorkbook(filein)

		//val sheet:HSSFSheet = wb.getSheet("サクセス個人スキル表")
		val sheet:HSSFSheet = wb.getSheet("sheet1")

		for(i<-0 to 5){
			val row:HSSFRow = sheet.getRow(i)

			//println(row.getCell(2))
			for(j<-0 to 5){
				val cell = row.getCell(j)

				print(cell+" ")

				cell.getCellType() match{
					case Cell.CELL_TYPE_STRING => println("string")
					case Cell.CELL_TYPE_NUMERIC => println("numeric")
					case Cell.CELL_TYPE_BOOLEAN => println("boolean")
					case Cell.CELL_TYPE_FORMULA => println("formula")
					case _=> println("other")
				}
            }

			println("")
		}
	}
}
