package bt3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    void testIsTriangle(){
        String kq="tam giac vuong";
        String r=TriangleClassifier.loaiTamgiac(3,4,5);
        assertEquals(kq,r);
    }
    @Test
    void testIsTriangle1(){
        String kq="tam giac deu";
        String r=TriangleClassifier.loaiTamgiac(3,3,3);
        assertEquals(kq,r);
    }
    @Test
    void testIsTriangle12(){
        String kq="khong phai la tam giac";
        String r=TriangleClassifier.loaiTamgiac(1,13,3);
        assertEquals(kq,r);
    }

}