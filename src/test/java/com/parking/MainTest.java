package com.parking;

import static jdk.internal.org.jline.utils.Colors.s;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Judet j = new Judet("GR","Giurgiu","Sudmuntenia",20000,2000);
    @Test
    void NoSurfaceTest(){

        assertThrows(IllegalArgumentException.class, () -> s.setSuprafata(0));
        assertThrows(IllegalArgumentException.class, () -> s.setSuprafata(-1));
    }
    @Test
    void InvalidDataTest(){
        assertThrows(IllegalArgumentException.class, () -> s.setSuprafata(0));
    }
}