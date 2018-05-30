package com.higg.buffer;

import com.higg.until.Var;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class TestMarkAndReset {
    public static void main(String[] args) throws IOException {
        File file = new File(Var.URL_FILE_TEST);
        FileChannel fileChannel = null;
        FileInputStream fileInputStream = null;
        ByteBuffer byteBuffer = null;
        try {
            fileInputStream = new FileInputStream(file);// chuyền file vào
            fileChannel = fileInputStream.getChannel();// get về một channel
            byteBuffer = ByteBuffer.allocate((int) fileChannel.size());// tạo buffter với tổng dung lượng của file
            int result = fileChannel.read(byteBuffer);// đọc dữ liệu vào bộ nhớ đệm

            byteBuffer.flip();  //làm buffter sẵn sàn để đọc
            byteBuffer.mark();

            System.out.println(String.valueOf(byteBuffer.get())); //đọc 1 type dữ liệu 1 lần đọc.

            byteBuffer.reset();

            System.out.println(String.valueOf(byteBuffer.get())); //đọc 1 type dữ liệu 1 lần đọc.


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            fileChannel.close();
            fileInputStream.close();
        }
    }
}
