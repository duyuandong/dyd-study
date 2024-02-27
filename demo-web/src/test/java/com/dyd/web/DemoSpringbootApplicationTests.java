package com.dyd.web;

import org.junit.jupiter.api.Test;
import org.springframework.asm.ClassReader;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

@SpringBootTest
class DemoSpringbootApplicationTests {

    @Test
    void contextLoads() throws IOException {
        ClassReader classReader = new ClassReader(new FileInputStream("D:\\dyd-work\\project\\parking\\car-parking\\target\\classes\\com\\segi\\uhomecp\\carparking\\parkingvisitor\\controller\\ParkingVisitorController.class"));
        String superName = classReader.getSuperName();
        String className = classReader.getClassName();
    }

}
