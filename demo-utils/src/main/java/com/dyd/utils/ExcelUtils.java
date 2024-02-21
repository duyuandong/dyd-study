package com.dyd.utils;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.utils.ExcelUtils
 * @date ：Created in 2023/4/18 10:28
 * @description：
 * @modified By：
 * @version:
 */
public class ExcelUtils {
  /**
   * 计算formula
   *
   * @param offset 偏移量，如果给0，表示从A列开始，1，就是从B列
   * @param rowId 第几行
   * @param colCount 一共多少列
   * @return 如果给入参 1,1,10. 表示从B1-K1。最终返回 $B$1:$K$1
   */
  public static String getRange(int offset, int rowId, int colCount) {
    char start = (char) ('A' + offset);
    if (colCount <= 25) {
      char end = (char) (start + colCount - 1);
      return "$" + start + "$" + rowId + ":$" + end + "$" + rowId;
    } else {
      char endPrefix = 'A';
      char endSuffix = 'A';
      if ((colCount - 25) / 26 == 0 || colCount == 51) { // 26-51之间，包括边界（仅两次字母表计算）
        if ((colCount - 25) % 26 == 0) { // 边界值
          endSuffix = (char) ('A' + 25);
        } else {
          endSuffix = (char) ('A' + (colCount - 25) % 26 - 1);
        }
      } else { // 51以上
        if ((colCount - 25) % 26 == 0) {
          endSuffix = (char) ('A' + 25);
          endPrefix = (char) (endPrefix + (colCount - 25) / 26 - 1);
        } else {
          endSuffix = (char) ('A' + (colCount - 25) % 26 - 1);
          endPrefix = (char) (endPrefix + (colCount - 25) / 26);
        }
      }
      return "$" + start + "$" + rowId + ":$" + endPrefix + endSuffix + "$" + rowId;
    }
  }

  /**
   * 名称数据行列计算表达式
   *
   * @param order
   * @param size
   * @param cascadeFlag
   * @return
   */
  public static String creatExcelNameList(int order, int size, boolean cascadeFlag) {
    char start = 'A';
    if (cascadeFlag) {
      start = 'B';
      if (size <= 25) {
        char end = (char) (start + size - 1);
        return "$" + start + "$" + order + ":$" + end + "$" + order;
      } else {
        //                char endPrefix = 'A';
        //                char endSuffix = 'A';
        //                if((size-25)/26==0||size==51){//26-51之间，包括边界（仅两次字母表计算）
        //                    if((size-25)%26==0){//边界值
        //                        endSuffix = (char)('A'+25);
        //                    }else{
        //                        endSuffix = (char)('A'+(size-25)%26-1);
        //                    }
        //                }else{//51以上
        //                    if((size-25)%26==0){
        //                        endSuffix = (char)('A'+25);
        //                        endPrefix = (char)(endPrefix + (size-25)/26 - 1);
        //                    }else{
        //                        endSuffix = (char)('A'+(size-25)%26-1);
        //                        endPrefix = (char)(endPrefix + (size-25)/26);
        //                    }
        //                }
        return "$" + start + "$" + order + ":$" + getCorrespondingLabel(size) + "$" + order;
      }
    } else {
      if (size <= 26) {
        char end = (char) (start + size - 1);
        return "$" + start + "$" + order + ":$" + end + "$" + order;
      } else {
        //                char endPrefix = 'A';
        //                char endSuffix = 'A';
        //                if(size%26==0){
        //                    endSuffix = (char)('A'+25);
        //                    if(size>52&&size/26>0){
        //                        endPrefix = (char)(endPrefix + size/26-2);
        //                    }
        //                }else{
        //                    endSuffix = (char)('A'+size%26-1);
        //                    if(size>52&&size/26>0){
        //                        endPrefix = (char)(endPrefix + size/26-1);
        //                    }
        //                }
        return "$" + start + "$" + order + ":$" + getCorrespondingLabel(size) + "$" + order;
      }
    }
  }

  public static String getCorrespondingLabel(int columnNo) {
    if (columnNo < 1
    /** ||columnNo>16384* */
    ) throw new IllegalArgumentException();
    String[] sources =
        new String[] {
          "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
          "S", "T", "U", "V", "W", "X", "Y", "Z"
        };
    StringBuilder sb = new StringBuilder(5);
    int remainder = columnNo % 26; // 求最右边的字母
    if (remainder == 0) { // 说明(num_n-1)=26，第26个字母是Z
      sb.append("Z");
      remainder = 26; // 因为接下来W-(num_n-1)也就是columnNo-remainder,所以需要把remainder赋值回26
    } else { // 如果最右边字母不是Z的话，就去sources数组相应的位置取字母，remainder不用变
      sb.append(sources[remainder - 1]);
    }
    columnNo = (columnNo - remainder) / 26 - 1; // 用来判断接下来是否还有其他字母

    // 当 当前循环是求最后一个字母时（从右往左），(columnNo-remainder)/26就会是0，再减1也就是-1。
    // 因此通过判断(columnNo-remainder)/26-1是否大于-1来判断结束
    while (columnNo > -1) {
      remainder = columnNo % 26;
      sb.append(sources[remainder]);
      columnNo = (columnNo - remainder) / 26 - 1;
    }

    return sb.reverse().toString(); // 因为是从右往左解析的 所以需要反转
  }

  public static void main(String[] args) {
    //
    System.out.println(getRange(1, 2, 1));

    System.out.println(creatExcelNameList(2, 1, true));
  }
}
