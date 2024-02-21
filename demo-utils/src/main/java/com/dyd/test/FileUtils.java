package com.dyd.test;

import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.IOException;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.test.FileUtils
 * @date ：Created in 2021/12/15 14:54
 * @description：
 * @modified By：
 * @version:
 */
public class FileUtils {

  public static void main(String[] args) {
    String url = "C:\\Users\\Administrator\\Desktop\\导入Rsp.xlsx";
    Cell cell = null;
    try {
      Workbook workbook = WorkbookFactory.create(new File(url));
      Sheet sheet = workbook.getSheetAt(0);
      Row row = sheet.getRow(1);
      cell = row.getCell(9);
      if (cell == null) {
        System.out.println("null");
      }
      /*if (cell == null || cell.getCellType() == Cell.CELL_TYPE_BLANK) {
          System.out.println("");
      }*/
      /*if(cell.getCellType() == Cell.CELL_TYPE_NUMERIC){
          DataFormatter dataFormatter = new DataFormatter();
          System.out.println(dataFormatter.formatCellValue(cell));
      }*/
      System.out.println(cell.getStringCellValue().trim());
    } catch (IOException e) {
      e.printStackTrace();
    } catch (Exception e) {
      DataFormatter dataFormatter = new DataFormatter();
      System.out.println(dataFormatter.formatCellValue(cell));
      e.printStackTrace();
    }
  }
}
