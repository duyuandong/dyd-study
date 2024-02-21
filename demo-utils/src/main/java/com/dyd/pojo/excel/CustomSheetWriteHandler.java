package com.dyd.pojo.excel;

import com.alibaba.excel.write.handler.SheetWriteHandler;
import com.alibaba.excel.write.handler.context.SheetWriteHandlerContext;
import org.apache.poi.ss.usermodel.DataValidation;
import org.apache.poi.ss.usermodel.DataValidationConstraint;
import org.apache.poi.ss.usermodel.DataValidationHelper;
import org.apache.poi.ss.util.CellRangeAddressList;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.pojo.excel.CustomSheetWriteHandler
 * @date ：Created in 2023/2/20 16:03
 * @description：
 * @modified By：
 * @version:
 */
public class CustomSheetWriteHandler implements SheetWriteHandler {
  @Override
  public void afterSheetCreate(SheetWriteHandlerContext context) {
    CellRangeAddressList cellRangeAddressList = new CellRangeAddressList(1, 3000, 0, 0);
    CellRangeAddressList cellRangeAddressList2 = new CellRangeAddressList(1, 3000, 4, 4);
    DataValidationHelper helper =
        context.getWriteSheetHolder().getSheet().getDataValidationHelper();
    DataValidationConstraint constraint =
        helper.createExplicitListConstraint(new String[] {"0", "1", "2"});
    DataValidation dataValidation = helper.createValidation(constraint, cellRangeAddressList);
    DataValidation dataValidation2 = helper.createValidation(constraint, cellRangeAddressList2);
    context.getWriteSheetHolder().getSheet().addValidationData(dataValidation);
    context.getWriteSheetHolder().getSheet().addValidationData(dataValidation2);
  }
}
