package com.dyd.pojo;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ContentFontStyle;
import com.alibaba.excel.annotation.write.style.ContentStyle;
import com.alibaba.excel.annotation.write.style.HeadFontStyle;
import com.alibaba.excel.annotation.write.style.HeadStyle;
import com.alibaba.excel.enums.poi.BorderStyleEnum;
import com.alibaba.excel.enums.poi.FillPatternTypeEnum;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.pojo.DownDemoExcel
 * @date ：Created in 2023/2/20 14:17
 * @description：
 * @modified By：
 * @version:
 */
@Getter
@Setter
@EqualsAndHashCode
public class ParkingExcelPlate {
  // 头背景设置成红色 IndexedColors.RED.getIndex()
  @HeadStyle(fillPatternType = FillPatternTypeEnum.SOLID_FOREGROUND, fillForegroundColor = 42)
  // 头字体设置成20
  @HeadFontStyle(fontHeightInPoints = 11)
  // 内容的背景设置成绿色 IndexedColors.GREEN.getIndex()
  @ContentStyle(
      fillPatternType = FillPatternTypeEnum.SOLID_FOREGROUND,
      fillForegroundColor = 42,
      borderBottom = BorderStyleEnum.THIN,
      borderLeft = BorderStyleEnum.THIN,
      borderRight = BorderStyleEnum.THIN,
      borderTop = BorderStyleEnum.THIN)
  // 内容字体设置成20
  @ContentFontStyle(fontHeightInPoints = 11)
  @ExcelProperty(value = "*车位类型（0:临时,1:固定,2:产权）", index = 0)
  private Integer parkingType;

  // 头背景设置成红色 IndexedColors.RED.getIndex()
  @HeadStyle(fillPatternType = FillPatternTypeEnum.SOLID_FOREGROUND, fillForegroundColor = 42)
  // 头字体设置成20
  @HeadFontStyle(fontHeightInPoints = 11)
  // 内容的背景设置成绿色 IndexedColors.GREEN.getIndex()
  @ContentStyle(
      fillPatternType = FillPatternTypeEnum.SOLID_FOREGROUND,
      fillForegroundColor = 42,
      borderBottom = BorderStyleEnum.THIN,
      borderLeft = BorderStyleEnum.THIN,
      borderRight = BorderStyleEnum.THIN,
      borderTop = BorderStyleEnum.THIN)
  // 内容字体设置成20
  @ContentFontStyle(fontHeightInPoints = 11)
  @ExcelProperty(value = "*车位编号", index = 1)
  private String parkingCode;

  // 头背景设置成红色 IndexedColors.RED.getIndex()
  @HeadStyle(fillPatternType = FillPatternTypeEnum.SOLID_FOREGROUND, fillForegroundColor = 42)
  // 头字体设置成20
  @HeadFontStyle(fontHeightInPoints = 11)
  // 内容的背景设置成绿色 IndexedColors.GREEN.getIndex()
  @ContentStyle(
      fillPatternType = FillPatternTypeEnum.SOLID_FOREGROUND,
      fillForegroundColor = 42,
      borderBottom = BorderStyleEnum.THIN,
      borderLeft = BorderStyleEnum.THIN,
      borderRight = BorderStyleEnum.THIN,
      borderTop = BorderStyleEnum.THIN)
  // 内容字体设置成20
  @ContentFontStyle(fontHeightInPoints = 11)
  @ExcelProperty(value = "车位名称", index = 2)
  private String parkingName;

  // 头背景设置成红色 IndexedColors.RED.getIndex()
  @HeadStyle(fillPatternType = FillPatternTypeEnum.SOLID_FOREGROUND, fillForegroundColor = 42)
  // 头字体设置成20
  @HeadFontStyle(fontHeightInPoints = 11)
  // 内容的背景设置成绿色 IndexedColors.GREEN.getIndex()
  @ContentStyle(
      fillPatternType = FillPatternTypeEnum.SOLID_FOREGROUND,
      fillForegroundColor = 42,
      borderBottom = BorderStyleEnum.THIN,
      borderLeft = BorderStyleEnum.THIN,
      borderRight = BorderStyleEnum.THIN,
      borderTop = BorderStyleEnum.THIN)
  // 内容字体设置成20
  @ContentFontStyle(fontHeightInPoints = 11)
  @ExcelProperty(value = "车位类别", index = 3)
  private String parkingT;

  // 头背景设置成红色 IndexedColors.RED.getIndex()
  @HeadStyle(fillPatternType = FillPatternTypeEnum.SOLID_FOREGROUND, fillForegroundColor = 42)
  // 头字体设置成20
  @HeadFontStyle(fontHeightInPoints = 11)
  // 内容的背景设置成绿色 IndexedColors.GREEN.getIndex()
  @ContentStyle(
      fillPatternType = FillPatternTypeEnum.SOLID_FOREGROUND,
      fillForegroundColor = 42,
      borderBottom = BorderStyleEnum.THIN,
      borderLeft = BorderStyleEnum.THIN,
      borderRight = BorderStyleEnum.THIN,
      borderTop = BorderStyleEnum.THIN)
  // 内容字体设置成20
  @ContentFontStyle(fontHeightInPoints = 11)
  @ExcelProperty(value = "车位状态（类型为0或1时,0:闲置,1:使用;类型为2时,状态参考sheet2）", index = 4)
  private Integer parkingStatus;

  // 头背景设置成红色 IndexedColors.RED.getIndex()
  @HeadStyle(fillPatternType = FillPatternTypeEnum.SOLID_FOREGROUND, fillForegroundColor = 42)
  // 头字体设置成20
  @HeadFontStyle(fontHeightInPoints = 11)
  // 内容的背景设置成绿色 IndexedColors.GREEN.getIndex()
  @ContentStyle(
      fillPatternType = FillPatternTypeEnum.SOLID_FOREGROUND,
      fillForegroundColor = 42,
      borderBottom = BorderStyleEnum.THIN,
      borderLeft = BorderStyleEnum.THIN,
      borderRight = BorderStyleEnum.THIN,
      borderTop = BorderStyleEnum.THIN)
  // 内容字体设置成20
  @ContentFontStyle(fontHeightInPoints = 11)
  @ExcelProperty(value = "产权面积单位", index = 5)
  private String propertyAreaUnit;

  // 头背景设置成红色 IndexedColors.RED.getIndex()
  @HeadStyle(fillPatternType = FillPatternTypeEnum.SOLID_FOREGROUND, fillForegroundColor = 42)
  // 头字体设置成20
  @HeadFontStyle(fontHeightInPoints = 11)
  // 内容的背景设置成绿色 IndexedColors.GREEN.getIndex()
  @ContentStyle(
      fillPatternType = FillPatternTypeEnum.SOLID_FOREGROUND,
      fillForegroundColor = 42,
      borderBottom = BorderStyleEnum.THIN,
      borderLeft = BorderStyleEnum.THIN,
      borderRight = BorderStyleEnum.THIN,
      borderTop = BorderStyleEnum.THIN)
  // 内容字体设置成20
  @ContentFontStyle(fontHeightInPoints = 11)
  @ExcelProperty(value = "产权面积", index = 6)
  private String propertyArea;

  // 头背景设置成红色 IndexedColors.RED.getIndex()
  @HeadStyle(fillPatternType = FillPatternTypeEnum.SOLID_FOREGROUND, fillForegroundColor = 42)
  // 头字体设置成20
  @HeadFontStyle(fontHeightInPoints = 11)
  // 内容的背景设置成绿色 IndexedColors.GREEN.getIndex()
  @ContentStyle(
      fillPatternType = FillPatternTypeEnum.SOLID_FOREGROUND,
      fillForegroundColor = 42,
      borderBottom = BorderStyleEnum.THIN,
      borderLeft = BorderStyleEnum.THIN,
      borderRight = BorderStyleEnum.THIN,
      borderTop = BorderStyleEnum.THIN)
  // 内容字体设置成20
  @ContentFontStyle(fontHeightInPoints = 11)
  @ExcelProperty(value = "*生效时间", index = 7)
  private String effDate;

  // 头背景设置成红色 IndexedColors.RED.getIndex()
  @HeadStyle(fillPatternType = FillPatternTypeEnum.SOLID_FOREGROUND, fillForegroundColor = 42)
  // 头字体设置成20
  @HeadFontStyle(fontHeightInPoints = 11)
  // 内容的背景设置成绿色 IndexedColors.GREEN.getIndex()
  @ContentStyle(
      fillPatternType = FillPatternTypeEnum.SOLID_FOREGROUND,
      fillForegroundColor = 42,
      borderBottom = BorderStyleEnum.THIN,
      borderLeft = BorderStyleEnum.THIN,
      borderRight = BorderStyleEnum.THIN,
      borderTop = BorderStyleEnum.THIN)
  // 内容字体设置成20
  @ContentFontStyle(fontHeightInPoints = 11)
  @ExcelProperty(value = "*失效时间", index = 8)
  private String expDate;

  // 头背景设置成红色 IndexedColors.RED.getIndex()
  @HeadStyle(fillPatternType = FillPatternTypeEnum.SOLID_FOREGROUND, fillForegroundColor = 42)
  // 头字体设置成20
  @HeadFontStyle(fontHeightInPoints = 11)
  // 内容的背景设置成绿色 IndexedColors.GREEN.getIndex()
  @ContentStyle(
      fillPatternType = FillPatternTypeEnum.SOLID_FOREGROUND,
      fillForegroundColor = 42,
      borderBottom = BorderStyleEnum.THIN,
      borderLeft = BorderStyleEnum.THIN,
      borderRight = BorderStyleEnum.THIN,
      borderTop = BorderStyleEnum.THIN)
  // 内容字体设置成20
  @ContentFontStyle(fontHeightInPoints = 11)
  @ExcelProperty(value = "描述", index = 9)
  private String desc;

  // 头背景设置成红色 IndexedColors.RED.getIndex()
  @HeadStyle(fillPatternType = FillPatternTypeEnum.SOLID_FOREGROUND, fillForegroundColor = 42)
  // 头字体设置成20
  @HeadFontStyle(fontHeightInPoints = 11)
  // 内容的背景设置成绿色 IndexedColors.GREEN.getIndex()
  @ContentStyle(
      fillPatternType = FillPatternTypeEnum.SOLID_FOREGROUND,
      fillForegroundColor = 42,
      borderBottom = BorderStyleEnum.THIN,
      borderLeft = BorderStyleEnum.THIN,
      borderRight = BorderStyleEnum.THIN,
      borderTop = BorderStyleEnum.THIN)
  // 内容字体设置成20
  @ContentFontStyle(fontHeightInPoints = 11)
  @ExcelProperty(value = "第三方车位ID", index = 10)
  private String parkingIds;

  // 头背景设置成红色 IndexedColors.RED.getIndex()
  @HeadStyle(fillPatternType = FillPatternTypeEnum.SOLID_FOREGROUND, fillForegroundColor = 42)
  // 头字体设置成20
  @HeadFontStyle(fontHeightInPoints = 11)
  // 内容的背景设置成绿色 IndexedColors.GREEN.getIndex()
  @ContentStyle(
      fillPatternType = FillPatternTypeEnum.SOLID_FOREGROUND,
      fillForegroundColor = 42,
      borderBottom = BorderStyleEnum.THIN,
      borderLeft = BorderStyleEnum.THIN,
      borderRight = BorderStyleEnum.THIN,
      borderTop = BorderStyleEnum.THIN)
  // 内容字体设置成20
  @ContentFontStyle(fontHeightInPoints = 11)
  @ExcelProperty(value = "所属房屋", index = 11)
  private String house;

  // 头背景设置成红色 IndexedColors.RED.getIndex()
  @HeadStyle(fillPatternType = FillPatternTypeEnum.SOLID_FOREGROUND, fillForegroundColor = 42)
  // 头字体设置成20
  @HeadFontStyle(fontHeightInPoints = 11)
  // 内容的背景设置成绿色 IndexedColors.GREEN.getIndex()
  @ContentStyle(
      fillPatternType = FillPatternTypeEnum.SOLID_FOREGROUND,
      fillForegroundColor = 42,
      borderBottom = BorderStyleEnum.THIN,
      borderLeft = BorderStyleEnum.THIN,
      borderRight = BorderStyleEnum.THIN,
      borderTop = BorderStyleEnum.THIN)
  // 内容字体设置成20
  @ContentFontStyle(fontHeightInPoints = 11)
  @ExcelProperty(value = "交付时间", index = 12)
  private String dueTime;

  // 字符串的内容字体设置成11 红色
  @ContentFontStyle(fontHeightInPoints = 11, color = 16)
  @ExcelProperty(value = "提示信息", index = 15)
  private String error;
}
