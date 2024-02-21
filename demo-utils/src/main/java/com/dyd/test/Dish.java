package com.dyd.test;

import com.alibaba.fastjson.JSON;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dish {

  private String name;
  private boolean vegetarian;
  private int calories;
  private String type;

  public static void main(String[] args) {
    List<Dish> menu =
        Arrays.asList(
            new Dish("pork", false, 800, "MEAT"),
            new Dish("beef", false, 700, "MEAT"),
            new Dish("chicken", false, 400, "MEAT"),
            new Dish("french fries", true, 530, "OTHER"),
            new Dish("rice", true, 350, "OTHER"),
            new Dish("season fruit", true, 120, "OTHER"),
            new Dish("pizza", true, 550, "OTHER"),
            new Dish("prawns", false, 300, "FISH"),
            new Dish("salmon", false, 450, "FISH"));

    menu.forEach(i -> i.getName());
    Map<String, String> collect =
        menu.stream()
            .collect(
                Collectors.groupingBy(
                    Dish::getType, Collectors.mapping(Dish::getName, Collectors.joining(","))));

    System.out.println(JSON.toJSONString(collect));
  }
}
